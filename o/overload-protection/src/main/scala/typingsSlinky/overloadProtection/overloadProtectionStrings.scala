package typingsSlinky.overloadProtection

import typingsSlinky.overloadProtection.mod.HttpFrameworkSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overloadProtectionStrings {
  
  @scala.inline
  def express: express = "express".asInstanceOf[express]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def koa: koa = "koa".asInstanceOf[koa]
  
  @scala.inline
  def restify: restify = "restify".asInstanceOf[restify]
  
  @js.native
  sealed trait express extends HttpFrameworkSelection
  
  @js.native
  sealed trait http extends HttpFrameworkSelection
  
  @js.native
  sealed trait koa extends js.Object
  
  @js.native
  sealed trait restify extends HttpFrameworkSelection
}
