package typingsSlinky.httpProxyMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.httpProxy.mod.ServerOptions
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareBooleans.`false`
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.debug
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.error
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.info
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.silent
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.warn
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var agent: js.UndefOr[Agent] = js.native
  var auth: js.UndefOr[String] = js.native
  var autoRewrite: js.UndefOr[Boolean] = js.native
  var buffer: js.UndefOr[Readable] = js.native
  var changeOrigin: js.UndefOr[Boolean] = js.native
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var forward: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var hostRewrite: js.UndefOr[String] = js.native
  var ignorePath: js.UndefOr[Boolean] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.native
  var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.native
  var onClose: js.UndefOr[
    js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
  ] = js.native
  var onError: js.UndefOr[
    js.Function3[/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.native
  var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.native
  var onProxyReq: js.UndefOr[
    js.Function3[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.native
  var onProxyReqWs: js.UndefOr[
    js.Function5[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* socket */ Socket, 
      /* options */ ServerOptions, 
      /* head */ js.Any, 
      Unit
    ]
  ] = js.native
  var onProxyRes: js.UndefOr[
    js.Function3[
      /* proxyRes */ IncomingMessage, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.native
  var pathRewrite: js.UndefOr[
    StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
  ] = js.native
  var prependPath: js.UndefOr[Boolean] = js.native
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
  var protocolRewrite: js.UndefOr[String] = js.native
  /**
    * @deprecated
    */
  var proxyHost: js.UndefOr[js.Any] = js.native
  /**
    * @deprecated
    */
  var proxyTable: js.UndefOr[js.Any] = js.native
  var proxyTimeout: js.UndefOr[Double] = js.native
  var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var selfHandleResponse: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[TlsOptions] = js.native
  var target: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var toProxy: js.UndefOr[Boolean] = js.native
  var ws: js.UndefOr[Boolean] = js.native
  var xfwd: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRewrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomainRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieDomainRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomainRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePathRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiePathRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePathRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
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
    def withHostRewrite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: debug | info | warn | error | silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogProvider(value: /* provider */ LogProvider => LogProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* proxySocket */ Socket => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProxyReq(value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyReq")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnProxyReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyReq")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProxyReqWs(
      value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ ServerOptions, /* head */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyReqWs")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnProxyReqWs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyReqWs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProxyRes(
      value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyRes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnProxyRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyRes")(js.undefined)
        ret
    }
    @scala.inline
    def withPathRewriteFunction2(value: (/* path */ String, /* req */ IncomingMessage) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRewrite")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPathRewrite(
      value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveHeaderKeyCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHeaderKeyCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveHeaderKeyCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHeaderKeyCase")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolRewrite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyHost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHost")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTable")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRouterFunction1(value: /* req */ IncomingMessage => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRouter(value: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfHandleResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfHandleResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfHandleResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfHandleResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: TlsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withToProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toProxy")(js.undefined)
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
    @scala.inline
    def withXfwd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXfwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfwd")(js.undefined)
        ret
    }
  }
  
}

