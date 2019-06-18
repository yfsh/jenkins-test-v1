package com.yfsh.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "mytest";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "myindex test";
    }
}
