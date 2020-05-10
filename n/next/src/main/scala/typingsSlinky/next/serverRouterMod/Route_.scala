package typingsSlinky.next.serverRouterMod

import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route_ extends js.Object {
  var check: js.UndefOr[Boolean] = js.native
  var `match`: RouteMatch = js.native
  var name: String = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var `type`: String = js.native
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): js.Promise[RouteResult] | RouteResult = js.native
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult,
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params,
    name: String,
    `type`: String
  ): Route_ = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route_]
  }
  @scala.inline
  implicit class Route_Ops[Self <: Route_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(
      value: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMatch(value: /* pathname */ js.UndefOr[String | Null] => `false` | Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

