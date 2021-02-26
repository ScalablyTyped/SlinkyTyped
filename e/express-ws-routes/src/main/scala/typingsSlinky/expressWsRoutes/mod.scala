package typingsSlinky.expressWsRoutes

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.IRouter
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-ws-routes", JSImport.Namespace)
  @js.native
  def apply(): Express = js.native
  
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  
  @js.native
  trait ClientInfo extends StObject {
    
    var origin: String = js.native
    
    var req: Request_[ParamsDictionary, _, _, Query] = js.native
    
    var secure: Boolean = js.native
  }
  object ClientInfo {
    
    @scala.inline
    def apply(origin: String, req: Request_[ParamsDictionary, _, _, Query], secure: Boolean): ClientInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfo]
    }
    
    @scala.inline
    implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Express
    extends typingsSlinky.expressServeStaticCore.mod.Express {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
  }
  
  @js.native
  trait Router extends IRouter {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Router = js.native
  }
  
  @js.native
  trait Server
    extends typingsSlinky.node.httpMod.Server {
    
    var wsServer: typingsSlinky.ws.mod.Server = js.native
  }
  
  type WebSocketHandler = js.Function1[/* socket */ ^, Unit]
  
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
