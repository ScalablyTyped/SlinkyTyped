package typingsSlinky.expressWsRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CbHandler = js.Function1[
    /* connectHandler */ typingsSlinky.expressWsRoutes.mod.WebSocketHandler | scala.Boolean, 
    scala.Unit
  ]
  
  type WebSocketHandler = js.Function1[/* socket */ typingsSlinky.ws.mod.^, scala.Unit]
  
  type WebSocketRouteHandler = js.Function3[
    /* info */ typingsSlinky.expressWsRoutes.mod.ClientInfo, 
    /* cb */ typingsSlinky.expressWsRoutes.mod.CbHandler, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    scala.Unit
  ]
}
