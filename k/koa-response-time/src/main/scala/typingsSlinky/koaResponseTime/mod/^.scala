package typingsSlinky.koaResponseTime.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-response-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Add X-Response-Time header field.
    * @param options options dictionary. { hrtime }
    *
    *        hrtime: boolean.
    *          `true` to use time in nanoseconds.
    *          `false` to use time in milliseconds.
    *          Default is `false` to keep back compatible.
    * @api public
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: KoaResponseTimeOptions): Middleware[DefaultState, DefaultContext] = js.native
}
