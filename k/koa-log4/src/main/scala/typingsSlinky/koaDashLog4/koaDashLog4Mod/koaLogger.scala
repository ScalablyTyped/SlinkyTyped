package typingsSlinky.koaDashLog4.koaDashLog4Mod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log4", "koaLogger")
@js.native
object koaLogger extends js.Object {
  def apply(logger4js: typingsSlinky.log4js.log4jsMod.Logger): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typingsSlinky.log4js.log4jsMod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typingsSlinky.log4js.log4jsMod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = js.native
}

