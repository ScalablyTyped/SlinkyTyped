package typingsSlinky.koaDashJsonDashError.koaDashJsonDashErrorMod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-json-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Error handler for pure Koa 2.0.0+ JSON apps
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: JSONErrorOptions): Middleware[DefaultState, DefaultContext] = js.native
}

