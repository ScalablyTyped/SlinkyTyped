package typingsSlinky.cypress.anon

import org.scalajs.dom.experimental.Request
import typingsSlinky.cypress.cypressMod.Cypress.HttpMethod
import typingsSlinky.cypress.cypressMod.Cypress.RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ServerOptions> */
@js.native
trait PartialServerOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var force404: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var method: js.UndefOr[HttpMethod] = js.native
  var onAbort: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onAnyAbort: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.native
  var onAnyRequest: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.native
  var onAnyResponse: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.native
  var onRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onResponse: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var response: js.UndefOr[js.Any] = js.native
  var status: js.UndefOr[Double] = js.native
  var urlMatchingOptions: js.UndefOr[js.Object] = js.native
  var whitelist: js.UndefOr[js.Function1[/* xhr */ Request, Unit]] = js.native
}

object PartialServerOptions {
  @scala.inline
  def apply(): PartialServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerOptions]
  }
  @scala.inline
  implicit class PartialServerOptionsOps[Self <: PartialServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withForce404(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force404")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce404: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force404")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnyAbort(value: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyAbort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAnyAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnyRequest(value: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAnyRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnyResponse(value: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAnyResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequest(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponse(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlMatchingOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatchingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlMatchingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatchingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: /* xhr */ Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

