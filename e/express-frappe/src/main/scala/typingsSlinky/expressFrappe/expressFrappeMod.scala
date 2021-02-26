package typingsSlinky.expressFrappe

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cors.mod.CorsOptions
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressFrappe.anon.Json
import typingsSlinky.expressFrappe.anon.Options
import typingsSlinky.expressFrappe.anon.PartialuseioServersocketS
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfig
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfigAlternative
import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressFrappeMod {
  
  @JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
  @js.native
  class ExpressFrappe protected () extends StObject {
    def this(config: ExpressFrappeConfig) = this()
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var server: Server = js.native
  }
  
  @js.native
  trait ExpressFrappeConfig extends StObject {
    
    var bodyParser: js.UndefOr[Boolean | Json] = js.native
    
    var cors: js.UndefOr[Boolean | CorsOptions] = js.native
    
    var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.native
    
    var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary, _, _, Query]]] = js.native
    
    var morgan: js.UndefOr[Boolean] = js.native
    
    var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.native
    
    var static: js.UndefOr[String | Options] = js.native
  }
  object ExpressFrappeConfig {
    
    @scala.inline
    def apply(): ExpressFrappeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressFrappeConfig]
    }
    
    @scala.inline
    implicit class ExpressFrappeConfigMutableBuilder[Self <: ExpressFrappeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyParser(value: Boolean | Json): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      @scala.inline
      def setCors(value: Boolean | CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setErrorHandler(
        value: (/* err */ js.Any, /* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "errorHandler", js.Any.fromFunction4(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setIo(value: ExpressFrappeSocketIOConfig): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      @scala.inline
      def setMiddleware(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      @scala.inline
      def setMiddlewareVarargs(value: (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])*): Self = StObject.set(x, "middleware", js.Array(value :_*))
      
      @scala.inline
      def setMorgan(value: Boolean): Self = StObject.set(x, "morgan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorganUndefined: Self = StObject.set(x, "morgan", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[RouteConfig] | RouteConfigAlternative): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStatic(value: String | Options): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  type ExpressFrappeSocketIOConfig = StringDictionary[PartialuseioServersocketS]
}
