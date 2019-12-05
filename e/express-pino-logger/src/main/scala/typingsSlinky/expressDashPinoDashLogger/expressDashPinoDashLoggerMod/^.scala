package typingsSlinky.expressDashPinoDashLogger.expressDashPinoDashLoggerMod

import typingsSlinky.pino.pinoMod.DestinationStream
import typingsSlinky.pinoDashHttp.pinoDashHttpMod.HttpLogger
import typingsSlinky.pinoDashHttp.pinoDashHttpMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}

