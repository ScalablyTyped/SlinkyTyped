package typingsSlinky.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServerOptions extends js.Object {
  /**
    * If present, this should contain a key/cert combo representing a certificate
    * authority that your client trusts. See these instructions for how to
    * generate these files. You'll then need to configure your client to use this
    * proxy for https in addition to http. Once you've got all of that set up,
    * Hoxy will generate fake keys/cert combos for every hostname you visit,
    * caching them in memory for subsequent visits, thus allowing the proxy to
    * handle https requests as cleartext
    */
  var certAuthority: js.UndefOr[CertificateParams] = js.native
  /**
    *  If present, this proxy will run as a reverse proxy for the given server.
    *  This allows you to point your client directly at the proxy, instead of
    *  configuring it in the client's proxy settings.
    *  This value should take the form scheme://host:port.
    */
  var reverse: js.UndefOr[String] = js.native
  /**
    * Latency emulation
    */
  var slow: js.UndefOr[Slow] = js.native
  /**
    * Should only be used in combination with reverse. If present, causes Hoxy to
    * run as an https server. Passed as opts to https.createServer(opts, function)
    */
  var tls: js.UndefOr[CertificateParams] = js.native
  /**
    * If present, this proxy will in turn use another proxy.
    * This allows Hoxy to play well with other proxies.
    * This value should take the form host:port
    */
  var upstreamProxy: js.UndefOr[String] = js.native
}

object CreateServerOptions {
  @scala.inline
  def apply(): CreateServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerOptions]
  }
  @scala.inline
  implicit class CreateServerOptionsOps[Self <: CreateServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertAuthority(value: CertificateParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certAuthority")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSlow(value: Slow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: CertificateParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withUpstreamProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upstreamProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpstreamProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upstreamProxy")(js.undefined)
        ret
    }
  }
  
}

