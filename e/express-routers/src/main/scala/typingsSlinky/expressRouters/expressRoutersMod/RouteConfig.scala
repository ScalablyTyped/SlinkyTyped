package typingsSlinky.expressRouters.expressRoutersMod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteConfig extends js.Object {
  var handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) = js.native
  var method: RouteConfigMethod = js.native
  var path: String = js.native
}

object RouteConfig {
  @scala.inline
  def apply(
    handler: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]]),
    method: RouteConfigMethod,
    path: String
  ): RouteConfig = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  @scala.inline
  implicit class RouteConfigOps[Self <: RouteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerFunction3(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandler(
      value: (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: RouteConfigMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

