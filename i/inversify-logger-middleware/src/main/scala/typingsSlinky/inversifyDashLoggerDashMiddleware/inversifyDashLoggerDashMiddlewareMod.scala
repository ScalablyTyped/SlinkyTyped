package typingsSlinky.inversifyDashLoggerDashMiddleware

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Middleware
import typingsSlinky.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfaces.LogEntry
import typingsSlinky.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfaces.LoggerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-logger-middleware", JSImport.Namespace)
@js.native
object inversifyDashLoggerDashMiddlewareMod extends js.Object {
  def makeLoggerMiddleware(): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = js.native
  def textSerializer(entry: LogEntry): String = js.native
}

