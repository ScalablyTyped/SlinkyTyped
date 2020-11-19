package typingsSlinky.koaCacheControl

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaCacheControl.anon.MaxAge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-cache-control", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: MaxAge): Middleware[DefaultState, DefaultContext] = js.native
}
