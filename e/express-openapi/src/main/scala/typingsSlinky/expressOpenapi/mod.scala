package typingsSlinky.expressOpenapi

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.openapiFramework.mod.default
import typingsSlinky.openapiFramework.typesMod.OpenAPIFrameworkArgs
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-openapi", "initialize")
  @js.native
  def initialize(args: ExpressOpenAPIArgs): default = js.native
  
  @js.native
  trait ExpressOpenAPIArgs extends OpenAPIFrameworkArgs {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Application_ = js.native
    
    var consumesMiddleware: js.UndefOr[StringDictionary[RequestHandler[ParamsDictionary, _, _, Query]]] = js.native
    
    var docsPath: js.UndefOr[String] = js.native
    
    var errorMiddleware: js.UndefOr[ErrorRequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var exposeApiDocs: js.UndefOr[Boolean] = js.native
    
    var promiseMode: js.UndefOr[Boolean] = js.native
    
    var securityFilter: js.UndefOr[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressOpenapi.mod.OperationFunction
    - typingsSlinky.expressOpenapi.mod.OperationHandlerArray
  */
  trait Operation extends StObject
  
  @js.native
  trait OperationFunction
    extends typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
       with Operation {
    
    /* InferMemberOverrides */
    override def apply(
      T0: /* req */ Request[ParamsDictionary, js.Any, js.Any, Query],
      T1: /* res */ Response[js.Any, Double],
      T2: /* next */ NextFunction
    ): js.Any = js.native
    
    var apiDoc: js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Operation] = js.native
  }
  
  @js.native
  trait OperationHandlerArray
    extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]]
       with Operation {
    
    var apiDoc: js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Operation] = js.native
  }
  object OperationHandlerArray {
    
    @scala.inline
    def apply(): OperationHandlerArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationHandlerArray]
    }
    
    @scala.inline
    implicit class OperationHandlerArrayMutableBuilder[Self <: OperationHandlerArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiDoc(value: typingsSlinky.openapiTypes.mod.OpenAPI.Operation): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDocUndefined: Self = StObject.set(x, "apiDoc", js.undefined)
    }
  }
}
