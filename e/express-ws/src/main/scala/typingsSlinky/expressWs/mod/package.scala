package typingsSlinky.expressWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Application = typingsSlinky.express.mod.Application_ with typingsSlinky.expressWs.mod.WithWebsocketMethod
  
  type Router = typingsSlinky.express.mod.Router with typingsSlinky.expressWs.mod.WithWebsocketMethod
  
  type WebsocketMethod[T] = js.Function2[
    /* route */ typingsSlinky.expressServeStaticCore.mod.PathParams, 
    /* repeated */ typingsSlinky.expressWs.mod.WebsocketRequestHandler, 
    T
  ]
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typingsSlinky.ws.mod.^, 
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    scala.Unit
  ]
}
