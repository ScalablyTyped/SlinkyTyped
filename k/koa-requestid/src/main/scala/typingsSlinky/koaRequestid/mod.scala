package typingsSlinky.koaRequestid

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaRequestid.anon.Expose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-requestid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Expose): Middleware[DefaultState, DefaultContext] = js.native
}
