package typingsSlinky.httpProxy.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.httpProxy.httpProxyBooleans.`false`
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  /** Object to be passed to http(s).request. */
  var agent: js.UndefOr[js.Any] = js.native
  /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
  var auth: js.UndefOr[String] = js.native
  /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
  var autoRewrite: js.UndefOr[Boolean] = js.native
  /** Buffer */
  var buffer: js.UndefOr[Stream] = js.native
  /** Changes the origin of the host header to the target URL. */
  var changeOrigin: js.UndefOr[Boolean] = js.native
  /** rewrites domain of set-cookie headers. */
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  /** rewrites path of set-cookie headers. Default: false */
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  /** Specify whether you want to follow redirects. Default: false */
  var followRedirects: js.UndefOr[Boolean] = js.native
  /** URL string to be parsed with the url module. */
  var forward: js.UndefOr[ProxyTargetUrl] = js.native
  /** object with extra headers to be added to target requests. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
  var hostRewrite: js.UndefOr[String] = js.native
  /** Specify whether you want to ignore the proxy path of the incoming request. */
  var ignorePath: js.UndefOr[Boolean] = js.native
  /** Local interface string to bind for outgoing connections. */
  var localAddress: js.UndefOr[String] = js.native
  /** Specify whether you want to prepend the target's path to the proxy path. */
  var prependPath: js.UndefOr[Boolean] = js.native
  /** specify whether you want to keep letter case of response header key */
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
  /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
  var protocolRewrite: js.UndefOr[String] = js.native
  /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
  var proxyTimeout: js.UndefOr[Double] = js.native
  /** Verify SSL certificate. */
  var secure: js.UndefOr[Boolean] = js.native
  /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
  var selfHandleResponse: js.UndefOr[Boolean] = js.native
  /** Object to be passed to https.createServer(). */
  var ssl: js.UndefOr[js.Any] = js.native
  /** URL string to be parsed with the url module. */
  var target: js.UndefOr[ProxyTarget] = js.native
  /** Timeout (in milliseconds) for incoming requests */
  var timeout: js.UndefOr[Double] = js.native
  /** Explicitly specify if we are proxying to another proxy. */
  var toProxy: js.UndefOr[Boolean] = js.native
  /** If you want to proxy websockets. */
  var ws: js.UndefOr[Boolean] = js.native
  /** Adds x- forward headers. */
  var xfwd: js.UndefOr[Boolean] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: js.Any): Self = {
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
    def withBuffer(value: Stream): Self = {
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
    def withForward(value: ProxyTargetUrl): Self = {
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
    def withSsl(value: js.Any): Self = {
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
    def withTarget(value: ProxyTarget): Self = {
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

