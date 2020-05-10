package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.experimental.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
@js.native
trait ServerOptions extends js.Object {
  var delay: Double = js.native
  var enable: Boolean = js.native
  var force404: Boolean = js.native
  var headers: js.Object = js.native
  var method: HttpMethod = js.native
  var response: js.Any = js.native
  var status: Double = js.native
  var urlMatchingOptions: js.Object = js.native
  def onAbort(args: js.Any*): Unit = js.native
  def onAnyAbort(route: RouteOptions, proxy: js.Any): Unit = js.native
  def onAnyRequest(route: RouteOptions, proxy: js.Any): Unit = js.native
  def onAnyResponse(route: RouteOptions, proxy: js.Any): Unit = js.native
  def onRequest(args: js.Any*): Unit = js.native
  def onResponse(args: js.Any*): Unit = js.native
  def whitelist(xhr: Request): Unit = js.native
}

object ServerOptions {
  @scala.inline
  def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    headers: js.Object,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Unit,
    onAnyAbort: (RouteOptions, js.Any) => Unit,
    onAnyRequest: (RouteOptions, js.Any) => Unit,
    onAnyResponse: (RouteOptions, js.Any) => Unit,
    onRequest: /* repeated */ js.Any => Unit,
    onResponse: /* repeated */ js.Any => Unit,
    response: js.Any,
    status: Double,
    urlMatchingOptions: js.Object,
    whitelist: Request => Unit
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onAnyAbort = js.Any.fromFunction2(onAnyAbort), onAnyRequest = js.Any.fromFunction2(onAnyRequest), onAnyResponse = js.Any.fromFunction2(onAnyResponse), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], urlMatchingOptions = urlMatchingOptions.asInstanceOf[js.Any], whitelist = js.Any.fromFunction1(whitelist))
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce404(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force404")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAbort(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAnyAbort(value: (RouteOptions, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyAbort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnAnyRequest(value: (RouteOptions, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnAnyResponse(value: (RouteOptions, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnRequest(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResponse(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlMatchingOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatchingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitelist(value: Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

