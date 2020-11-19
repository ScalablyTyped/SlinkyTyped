package typingsSlinky.koaLoggerWinston

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-logger-winston", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(logger: Logger): Middleware[DefaultState, DefaultContext] = js.native
}
