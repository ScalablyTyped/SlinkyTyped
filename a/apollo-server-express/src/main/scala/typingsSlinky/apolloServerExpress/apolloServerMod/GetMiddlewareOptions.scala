package typingsSlinky.apolloServerExpress.apolloServerMod

import typingsSlinky.bodyParser.mod.OptionsJson
import typingsSlinky.cors.mod.CorsOptions
import typingsSlinky.cors.mod.CorsOptionsDelegate
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.native
  var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate | Boolean] = js.native
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.native
  var path: js.UndefOr[String] = js.native
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
  @scala.inline
  implicit class GetMiddlewareOptionsOps[Self <: GetMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyParserConfig(value: OptionsJson | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParserConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyParserConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParserConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCorsFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCors(value: CorsOptions | CorsOptionsDelegate | Boolean): Self = {
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
    def withDisableHealthCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHealthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHealthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHealthCheck(value: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHealthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

