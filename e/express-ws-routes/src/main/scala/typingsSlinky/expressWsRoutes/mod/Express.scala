package typingsSlinky.expressWsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express
  extends typingsSlinky.expressServeStaticCore.mod.Express {
  def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
}

