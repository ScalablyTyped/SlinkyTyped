package typingsSlinky.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmppOptions extends js.Object {
   // Dictionary (optional) - TLS or SSL key and certificate credentials
  var actAs: js.UndefOr[String] = js.native
  var autostart: js.UndefOr[Boolean] = js.native
   // Preferred SASL mechanism to use
  var bosh: js.UndefOr[Bosh] = js.native
   // connect to the legacy SSL port, requires at least the host to be specified
  var credentials: js.UndefOr[js.Any] = js.native
   // if admin user act on behalf of another user (just user)
  var disallowTLS: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var jid: String = js.native
   // register account before authentication
  var legacySSL: js.UndefOr[Boolean] = js.native
  var password: String = js.native
  var port: js.UndefOr[Double] = js.native
   // prevent upgrading the connection to a secure one via TLS
  var preferred: js.UndefOr[String] = js.native
  var reconnect: js.UndefOr[Boolean] = js.native
   // if we start connecting to a given port
  var register: js.UndefOr[Boolean] = js.native
}

object XmppOptions {
  @scala.inline
  def apply(jid: String, password: String): XmppOptions = {
    val __obj = js.Dynamic.literal(jid = jid.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmppOptions]
  }
  @scala.inline
  implicit class XmppOptionsOps[Self <: XmppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actAs")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(js.undefined)
        ret
    }
    @scala.inline
    def withBosh(value: Bosh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bosh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBosh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bosh")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowTLS")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacySSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacySSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacySSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacySSL")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
  }
  
}

