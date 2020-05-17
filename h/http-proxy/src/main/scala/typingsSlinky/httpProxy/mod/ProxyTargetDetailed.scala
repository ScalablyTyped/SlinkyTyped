package typingsSlinky.httpProxy.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyTargetDetailed extends ProxyTarget {
  var ca: js.UndefOr[String] = js.native
  var cert: js.UndefOr[String] = js.native
  var ciphers: js.UndefOr[String] = js.native
  var host: String = js.native
  var hostname: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[Buffer | String] = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[String] = js.native
  var secureProtocol: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
}

object ProxyTargetDetailed {
  @scala.inline
  def apply(host: String, port: Double): ProxyTargetDetailed = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyTargetDetailed]
  }
  @scala.inline
  implicit class ProxyTargetDetailedOps[Self <: ProxyTargetDetailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
  }
  
}

