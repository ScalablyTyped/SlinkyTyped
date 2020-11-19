package typingsSlinky.koaBunyanLogger.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-bunyan-logger", "requestLogger")
@js.native
object requestLogger extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: RequestLoggerOptions): Middleware[DefaultState, DefaultContext] = js.native
}
