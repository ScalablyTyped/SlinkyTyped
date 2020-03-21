package typingsSlinky.nextServer.serverRouterMod

import typingsSlinky.nextServer.nextServerBooleans.`false`
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route_ extends js.Object {
  var `match`: RouteMatch
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit,
    `match`: /* pathname */ js.UndefOr[String] => `false` | Params
  ): Route_ = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route_]
  }
}

