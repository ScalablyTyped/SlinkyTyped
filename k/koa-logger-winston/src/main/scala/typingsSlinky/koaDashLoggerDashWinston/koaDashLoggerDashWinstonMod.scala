package typingsSlinky.koaDashLoggerDashWinston

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import typingsSlinky.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-logger-winston", JSImport.Namespace)
@js.native
object koaDashLoggerDashWinstonMod extends js.Object {
  def apply(logger: Logger): Middleware[DefaultState, DefaultContext] = js.native
}

