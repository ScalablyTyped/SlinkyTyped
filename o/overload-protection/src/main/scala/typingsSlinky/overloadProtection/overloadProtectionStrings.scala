package typingsSlinky.overloadProtection

import typingsSlinky.overloadProtection.mod.HttpFrameworkSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overloadProtectionStrings {
  
  @js.native
  sealed trait express extends HttpFrameworkSelection
  @scala.inline
  def express: express = "express".asInstanceOf[express]
  
  @js.native
  sealed trait http extends HttpFrameworkSelection
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait koa extends StObject
  @scala.inline
  def koa: koa = "koa".asInstanceOf[koa]
  
  @js.native
  sealed trait restify extends HttpFrameworkSelection
  @scala.inline
  def restify: restify = "restify".asInstanceOf[restify]
}
