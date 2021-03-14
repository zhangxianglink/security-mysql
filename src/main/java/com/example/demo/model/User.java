package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private Long id;

    private String username;

    private String phone;

    private String password;

    private Integer enabled;

    private Integer locked;

    private Date createDate;

    private Date updateDate;

}
