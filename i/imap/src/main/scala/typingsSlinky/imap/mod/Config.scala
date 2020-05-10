package typingsSlinky.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /** Number of milliseconds to wait to be authenticated after a connection has been established. Default: 5000 */
  var authTimeout: js.UndefOr[Double] = js.native
  /** Set to 'always' to always attempt connection upgrades via STARTTLS, 'required' only if upgrading is required, or 'never' to never attempt upgrading. Default: 'never' */
  var autotls: js.UndefOr[String] = js.native
  /** Number of milliseconds to wait for a connection to be established. Default: 10000 */
  var connTimeout: js.UndefOr[Double] = js.native
    /* boolean|KeepAlive */ /** If set, the function will be called with one argument, a string containing some debug info Default: (no debug output) */
  var debug: js.UndefOr[js.Function] = js.native
  /** Hostname or IP address of the IMAP server. Default: "localhost" */
  var host: js.UndefOr[String] = js.native
  /** Configures the keepalive mechanism. Set to true to enable keepalive with defaults or set to object to enable and configure keepalive behavior: Default: true */
  var keepalive: js.UndefOr[js.Any] = js.native
  /** Password for plain-text authentication. */
  var password: String = js.native
  /** Port number of the IMAP server. Default: 143 */
  var port: js.UndefOr[Double] = js.native
  /** Perform implicit TLS connection? Default: false */
  var tls: js.UndefOr[Boolean] = js.native
  /** Options object to pass to tls.connect() Default: (none) */
  var tlsOptions: js.UndefOr[js.Object] = js.native
  /** Username for plain-text authentication. */
  var user: String = js.native
  /** Base64-encoded OAuth token for OAuth authentication for servers that support it (See Andris Reinman's xoauth.js module to help generate this string). */
  var xoauth: js.UndefOr[String] = js.native
  /** Base64-encoded OAuth2 token for The SASL XOAUTH2 Mechanism for servers that support it (See Andris Reinman's xoauth2 module to help generate this string). */
  var xoauth2: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(password: String, user: String): Config = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAutotls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutotls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotls")(js.undefined)
        ret
    }
    @scala.inline
    def withConnTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
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
    def withKeepalive(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(js.undefined)
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
    def withTls(value: Boolean): Self = {
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
    def withTlsOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withXoauth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoauth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXoauth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoauth")(js.undefined)
        ret
    }
    @scala.inline
    def withXoauth2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXoauth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoauth2")(js.undefined)
        ret
    }
  }
  
}

