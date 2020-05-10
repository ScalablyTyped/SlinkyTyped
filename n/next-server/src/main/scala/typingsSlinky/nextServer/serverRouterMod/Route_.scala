package typingsSlinky.nextServer.serverRouterMod

import typingsSlinky.nextServer.nextServerBooleans.`false`
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route_ extends js.Object {
  var `match`: RouteMatch = js.native
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit = js.native
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
  @scala.inline
  implicit class Route_Ops[Self <: Route_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(value: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMatch(value: /* pathname */ js.UndefOr[String] => `false` | Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

