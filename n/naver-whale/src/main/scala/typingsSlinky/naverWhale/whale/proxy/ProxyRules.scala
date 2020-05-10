package typingsSlinky.naverWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyRules extends js.Object {
  /** Optional. List of servers to connect to without a proxy server. */
  var bypassList: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
  var fallbackProxy: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyServer] = js.native
  /** Optional. The proxy server to be used for FTP requests. */
  var proxyForFtp: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyServer] = js.native
  /** Optional. The proxy server to be used for HTTP requests. */
  var proxyForHttp: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyServer] = js.native
  /** Optional. The proxy server to be used for HTTPS requests. */
  var proxyForHttps: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyServer] = js.native
  /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
  var singleProxy: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyServer] = js.native
}

object ProxyRules {
  @scala.inline
  def apply(): ProxyRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyRules]
  }
  @scala.inline
  implicit class ProxyRulesOps[Self <: ProxyRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBypassList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassList")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackProxy(value: typingsSlinky.chrome.chrome.proxy.ProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyForFtp(value: typingsSlinky.chrome.chrome.proxy.ProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForFtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyForFtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForFtp")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyForHttp(value: typingsSlinky.chrome.chrome.proxy.ProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyForHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyForHttps(value: typingsSlinky.chrome.chrome.proxy.ProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyForHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyForHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleProxy(value: typingsSlinky.chrome.chrome.proxy.ProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleProxy")(js.undefined)
        ret
    }
  }
  
}

