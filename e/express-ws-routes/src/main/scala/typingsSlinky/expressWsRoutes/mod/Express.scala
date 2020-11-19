package typingsSlinky.expressWsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Express
  extends typingsSlinky.expressServeStaticCore.mod.Express {
  
  def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
}
