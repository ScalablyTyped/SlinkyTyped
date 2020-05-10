package typingsSlinky.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* proxy types */
/** An object which describes proxy settings. */
@js.native
trait ProxyConfig extends js.Object {
  /** A URL to use to configure the proxy. */
  var autoConfigUrl: js.UndefOr[String] = js.native
  /** Do not prompt for authentication if password is saved. */
  var autoLogin: js.UndefOr[Boolean] = js.native
  /** The address of the ftp proxy, can include a port. */
  var ftp: js.UndefOr[String] = js.native
  /** The address of the http proxy, can include a port. */
  var http: js.UndefOr[String] = js.native
  /** Use the http proxy server for all protocols. */
  var httpProxyAll: js.UndefOr[Boolean] = js.native
  /** A list of hosts which should not be proxied. */
  var passthrough: js.UndefOr[String] = js.native
  /** Proxy DNS when using SOCKS v5. */
  var proxyDNS: js.UndefOr[Boolean] = js.native
  /** The type of proxy to use. */
  var proxyType: js.UndefOr[ProxyConfigProxyType] = js.native
  /** The address of the socks proxy, can include a port. */
  var socks: js.UndefOr[String] = js.native
  /** The version of the socks proxy. */
  var socksVersion: js.UndefOr[Double] = js.native
  /** The address of the ssl proxy, can include a port. */
  var ssl: js.UndefOr[String] = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(): ProxyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConfigUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfigUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConfigUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfigUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withFtp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftp")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpProxyAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxyAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpProxyAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxyAll")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthrough(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyDNS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyDNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyDNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyDNS")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyType(value: ProxyConfigProxyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(js.undefined)
        ret
    }
    @scala.inline
    def withSocks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socks")(js.undefined)
        ret
    }
    @scala.inline
    def withSocksVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: String): Self = {
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
  }
  
}

