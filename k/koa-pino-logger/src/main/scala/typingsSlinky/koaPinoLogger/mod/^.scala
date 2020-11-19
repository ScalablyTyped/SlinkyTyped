package typingsSlinky.koaPinoLogger.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.pino.mod.DestinationStream
import typingsSlinky.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options, stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
  def apply(stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
}
