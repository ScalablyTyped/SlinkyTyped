package typingsSlinky.browserSync.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.native
  var middleware: js.UndefOr[MiddlewareHandler] = js.native
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
  ] = js.native
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.native
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.native
  var target: js.UndefOr[String] = js.native
  var ws: js.UndefOr[Boolean] = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleware(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReqFunction1(value: /* res */ IncomingMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProxyReq(
      value: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReq")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyResFunction3(
      value: (/* proxyRes */ ServerResponse | IncomingMessage, /* res */ ServerResponse, /* req */ IncomingMessage) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProxyRes(value: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRes")(js.undefined)
        ret
    }
    @scala.inline
    def withReqHeaders(value: /* config */ js.Object => Hash[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReqHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withWs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(js.undefined)
        ret
    }
  }
  
}

