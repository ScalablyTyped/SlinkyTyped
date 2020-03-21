package typingsSlinky.next.serverRouterMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var catchAllRoute: Route_ = js.native
  var dynamicRoutes: DynamicRoutes = js.native
  var fsRoutes: js.Array[Route_] = js.native
  var pageChecker: PageChecker = js.native
  var routes: js.Array[Route_] = js.native
  def add(route: Route_): Unit = js.native
  def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
  def setDynamicRoutes(): Unit = js.native
  def setDynamicRoutes(routes: DynamicRoutes): Unit = js.native
}

