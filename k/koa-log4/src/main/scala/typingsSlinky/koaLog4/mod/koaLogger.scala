package typingsSlinky.koaLog4.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log4", "koaLogger")
@js.native
object koaLogger extends js.Object {
  def apply(logger4js: typingsSlinky.log4js.mod.Logger): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typingsSlinky.log4js.mod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typingsSlinky.log4js.mod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = js.native
}

