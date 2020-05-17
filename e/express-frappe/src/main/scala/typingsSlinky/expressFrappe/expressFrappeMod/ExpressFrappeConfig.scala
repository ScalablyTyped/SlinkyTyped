package typingsSlinky.expressFrappe.expressFrappeMod

import typingsSlinky.cors.mod.CorsOptions
import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressFrappe.anon.Json
import typingsSlinky.expressFrappe.anon.Options
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfig
import typingsSlinky.expressRouters.expressRoutersMod.RouteConfigAlternative
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[Boolean | Json] = js.native
  var cors: js.UndefOr[Boolean | CorsOptions] = js.native
  var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary, _, _, Query]] = js.native
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.native
  var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary, _, _, Query]]] = js.native
  var morgan: js.UndefOr[Boolean] = js.native
  var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.native
  var static: js.UndefOr[String | Options] = js.native
}

object ExpressFrappeConfig {
  @scala.inline
  def apply(): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
  @scala.inline
  implicit class ExpressFrappeConfigOps[Self <: ExpressFrappeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyParser(value: Boolean | Json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: Boolean | CorsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(
      value: (/* err */ js.Any, /* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withIo(value: ExpressFrappeSocketIOConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("io")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("io")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleware(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
        ret
    }
    @scala.inline
    def withMorgan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morgan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMorgan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morgan")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[RouteConfig] | RouteConfigAlternative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: String | Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

