package typingsSlinky.inversifyLoggerMiddleware

import typingsSlinky.inversify.interfacesMod.interfaces.Middleware
import typingsSlinky.inversifyLoggerMiddleware.interfacesMod.interfaces.LogEntry
import typingsSlinky.inversifyLoggerMiddleware.interfacesMod.interfaces.LoggerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-logger-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def makeLoggerMiddleware(): Middleware = js.native
  def makeLoggerMiddleware(settings: js.UndefOr[scala.Nothing], renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = js.native
  
  def textSerializer(entry: LogEntry): String = js.native
}
