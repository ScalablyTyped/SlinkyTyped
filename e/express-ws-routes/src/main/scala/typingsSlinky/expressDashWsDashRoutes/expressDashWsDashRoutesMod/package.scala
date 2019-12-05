package typingsSlinky.expressDashWsDashRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsDashRoutesMod {
  import typingsSlinky.express.expressMod.NextFunction

  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  type WebSocketHandler = js.Function1[/* socket */ typingsSlinky.ws.wsMod.^, Unit]
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
