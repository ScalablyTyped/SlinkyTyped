package typingsSlinky.koaJsonError.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-json-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Error handler for pure Koa 2.0.0+ JSON apps
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: JSONErrorOptions): Middleware[DefaultState, DefaultContext] = js.native
}
