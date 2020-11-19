package typingsSlinky.next.serverRouterMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends js.Object {
  
  def addFsRoute(fsRoute: Route_): Unit = js.native
  
  var basePath: String = js.native
  
  var catchAllRoute: Route_ = js.native
  
  var dynamicRoutes: DynamicRoutes = js.native
  
  def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
  
  var fsRoutes: js.Array[Route_] = js.native
  
  var headers: js.Array[Route_] = js.native
  
  var pageChecker: PageChecker = js.native
  
  var redirects: js.Array[Route_] = js.native
  
  var rewrites: js.Array[Route_] = js.native
  
  def setDynamicRoutes(): Unit = js.native
  def setDynamicRoutes(routes: DynamicRoutes): Unit = js.native
  
  var useFileSystemPublicRoutes: Boolean = js.native
}
