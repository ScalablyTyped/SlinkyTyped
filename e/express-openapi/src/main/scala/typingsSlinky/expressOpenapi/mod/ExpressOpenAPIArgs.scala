package typingsSlinky.expressOpenapi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.openapiFramework.typesMod.OpenAPIFrameworkArgs
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressOpenAPIArgs extends OpenAPIFrameworkArgs {
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
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
