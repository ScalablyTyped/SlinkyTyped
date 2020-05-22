package typingsSlinky.nextServer.serverRouterMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/router", JSImport.Default)
@js.native
class default () extends Router {
  def this(routes: js.Array[Route_]) = this()
  /* CompleteClass */
  override var routes: js.Array[Route_] = js.native
  /* CompleteClass */
  override def add(route: Route_): Unit = js.native
  /* CompleteClass */
  override def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]] = js.native
}

