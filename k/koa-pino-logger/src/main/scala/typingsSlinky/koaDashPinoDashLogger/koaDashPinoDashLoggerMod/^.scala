package typingsSlinky.koaDashPinoDashLogger.koaDashPinoDashLoggerMod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.koa.koaMod.Middleware
import typingsSlinky.pino.pinoMod.DestinationStream
import typingsSlinky.pinoDashHttp.pinoDashHttpMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options, stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
  def apply(stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
}

