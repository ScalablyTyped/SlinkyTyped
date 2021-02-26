package typingsSlinky.expressRouters

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Router
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressRoutersMod {
  
  @JSImport("express-routers/dist/express-routers", "createRouter")
  @js.native
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  @JSImport("express-routers/dist/express-routers", "createRouter")
  @js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
  
  @js.native
  trait RouteConfig extends StObject {
    
    var handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) = js.native
    
    var method: RouteConfigMethod = js.native
    
    var path: String = js.native
  }
  object RouteConfig {
    
    @scala.inline
    def apply(
      handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]),
      method: RouteConfigMethod,
      path: String
    ): RouteConfig = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteConfig]
    }
    
    @scala.inline
    implicit class RouteConfigMutableBuilder[Self <: RouteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(
        value: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
      ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerFunction3(
        value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandlerVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = StObject.set(x, "handler", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: RouteConfigMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteConfigAlternative = StringDictionary[
    (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]])
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressRouters.expressRoutersStrings.GET
    - typingsSlinky.expressRouters.expressRoutersStrings.POST
    - typingsSlinky.expressRouters.expressRoutersStrings.PUT
    - typingsSlinky.expressRouters.expressRoutersStrings.PATCH
    - typingsSlinky.expressRouters.expressRoutersStrings.DELETE
  */
  trait RouteConfigMethod extends StObject
  object RouteConfigMethod {
    
    @scala.inline
    def DELETE: typingsSlinky.expressRouters.expressRoutersStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.expressRouters.expressRoutersStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.expressRouters.expressRoutersStrings.GET = "GET".asInstanceOf[typingsSlinky.expressRouters.expressRoutersStrings.GET]
    
    @scala.inline
    def PATCH: typingsSlinky.expressRouters.expressRoutersStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.expressRouters.expressRoutersStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.expressRouters.expressRoutersStrings.POST = "POST".asInstanceOf[typingsSlinky.expressRouters.expressRoutersStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.expressRouters.expressRoutersStrings.PUT = "PUT".asInstanceOf[typingsSlinky.expressRouters.expressRoutersStrings.PUT]
  }
}
