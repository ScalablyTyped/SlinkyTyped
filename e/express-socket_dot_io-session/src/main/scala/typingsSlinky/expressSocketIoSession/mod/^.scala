package typingsSlinky.expressSocketIoSession.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-socket.io-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query]): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    cookieParserMiddleware: RequestHandler[ParamsDictionary, _, _, Query]
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    cookieParserMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
}

