package typingsSlinky.nextServer.serverRouterMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var routes: js.Array[Route_] = js.native
  def add(route: Route_): Unit = js.native
  def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]] = js.native
}

object Router {
  @scala.inline
  def apply(
    add: Route_ => Unit,
    `match`: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]],
    routes: js.Array[Route_]
  ): Router = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
    __obj.asInstanceOf[Router]
  }
  @scala.inline
  implicit class RouterOps[Self <: Router] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Route_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch(value: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[Route_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

