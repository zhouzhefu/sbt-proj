package com.jeff.sbtstudy.com.jeff.sbtstudy.caseclasses

abstract class Term

case class Var(name: String) extends Term

case class Fun(arg: String, body: Term) extends Term

case class App(f: Term, v: Term) extends Term