package typingsSlinky.nodemailerSmtpTransport.mod

import typingsSlinky.node.tlsMod.ConnectionOptions
import typingsSlinky.nodemailerSmtpTransport.AnonMaxConnections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpOptions extends js.Object {
  /**
    * defines authentication data (see authentication section below)
    */
  var auth: js.UndefOr[AuthOptions] = js.native
  /**
    * defines preferred authentication method, eg. 'PLAIN'
    */
  var authMethod: js.UndefOr[String] = js.native
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * if true, then does not allow to use files as content. Use it when you want to use JSON data from untrusted source as the email. If an attachment or message node tries to fetch something from a file the sending returns an error
    */
  var disableFileAccess: js.UndefOr[Boolean] = js.native
  /**
    *  if true, then does not allow to use Urls as content
    */
  var disableUrlAccess: js.UndefOr[Boolean] = js.native
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[Double] = js.native
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[String] = js.native
  /**
    * if this is true and secure is false then TLS is not used even if the server supports STARTTLS extension
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[Boolean] = js.native
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.native
  /**
    * see Pooled SMTP for details about connection pooling
    */
  var pool: js.UndefOr[AnonMaxConnections] = js.native
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[Double] = js.native
  /**
    *  a proxy URL
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * if this is true and secure is false then Nodemailer tries to use STARTTLS even if the server does not advertise support for it. If the connection can not be encrypted then message is not sent
    */
  var requireTLS: js.UndefOr[Boolean] = js.native
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Fills in certain SMTP configurations options (e.g. 'host', 'port', and 'secure') for
    * well-known services. Possible values:
    *   - '1und1'
    *   - 'AOL'
    *   - 'DebugMail.io'
    *   - 'DynectEmail'
    *   - 'FastMail'
    *   - 'GandiMail'
    *   - 'Gmail'
    *   - 'Godaddy'
    *   - 'GodaddyAsia'
    *   - 'GodaddyEurope'
    *   - 'hot.ee'
    *   - 'Hotmail'
    *   - 'iCloud'
    *   - 'mail.ee'
    *   - 'Mail.ru'
    *   - 'Mailgun'
    *   - 'Mailjet'
    *   - 'Mandrill'
    *   - 'Naver'
    *   - 'Postmark'
    *   - 'QQ'
    *   - 'QQex'
    *   - 'SendCloud'
    *   - 'SendGrid'
    *   - 'SES'
    *   - 'Sparkpost'
    *   - 'Yahoo'
    *   - 'Yandex'
    *   - 'Zoho'
    */
  var service: js.UndefOr[String] = js.native
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[Double] = js.native
  /**
    * defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[ConnectionOptions] = js.native
}

object SmtpOptions {
  @scala.inline
  def apply(): SmtpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpOptions]
  }
  @scala.inline
  implicit class SmtpOptionsOps[Self <: SmtpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AuthOptions): Self = {
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
    def withAuthMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
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
    def withDisableFileAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFileAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFileAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFileAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableUrlAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUrlAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableUrlAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUrlAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withGreetingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greetingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreetingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greetingTimeout")(js.undefined)
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
    def withIgnoreTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTLS")(js.undefined)
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
    def withLogger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: AnonMaxConnections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
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
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTLS")(js.undefined)
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
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: ConnectionOptions): Self = {
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
  }
  
}

