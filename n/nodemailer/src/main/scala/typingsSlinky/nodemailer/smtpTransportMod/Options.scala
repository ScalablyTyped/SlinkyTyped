package typingsSlinky.nodemailer.smtpTransportMod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.ConnectionOptions
import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.sharedMod.Logger
import typingsSlinky.nodemailer.smtpConnectionMod.CustomAuthenticationHandlers
import typingsSlinky.nodemailer.smtpConnectionMod.ms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.nodemailer.smtpConnectionMod.Options because var conflicts: auth. Inlined host, port, secure, ignoreTLS, requireTLS, opportunisticTLS, name, localAddress, connectionTimeout, greetingTimeout, socketTimeout, logger, transactionLog, debug, authMethod, tls, socket, connection, customAuth */ @js.native
trait Options
  extends MailOptions
     with TransportOptions {
  /** defines preferred authentication method, e.g. ‘PLAIN’ */
  var authMethod: js.UndefOr[String] = js.native
  /** connected socket to use instead of creating and connecting a new one. If secure option is true, then socket is upgraded from plaintext to ciphertext */
  var connection: js.UndefOr[Socket] = js.native
  /** how many milliseconds to wait for the connection to establish */
  var connectionTimeout: js.UndefOr[ms] = js.native
  var customAuth: js.UndefOr[CustomAuthenticationHandlers] = js.native
  /** if set to true, then logs SMTP traffic and message content, otherwise logs only transaction events */
  var debug: js.UndefOr[Boolean] = js.native
  var getSocket: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  /** how many milliseconds to wait for the greeting after connection is established */
  var greetingTimeout: js.UndefOr[ms] = js.native
  /** the hostname or IP address to connect to (defaults to ‘localhost’) */
  var host: js.UndefOr[String] = js.native
  /** turns off STARTTLS support if true */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  /** the local interface to bind to for network connections */
  var localAddress: js.UndefOr[String] = js.native
  /** optional bunyan compatible logger instance. If set to true then logs to console. If value is not set or is false then nothing is logged */
  var logger: js.UndefOr[Logger | Boolean] = js.native
  /** optional hostname of the client, used for identifying to the server */
  var name: js.UndefOr[String] = js.native
  /** tries to use STARTTLS and continues normally if it fails */
  var opportunisticTLS: js.UndefOr[Boolean] = js.native
  /** the port to connect to (defaults to 25 or 465) */
  var port: js.UndefOr[Double] = js.native
  /** forces the client to use STARTTLS. Returns an error if upgrading the connection is not possible or fails. */
  var requireTLS: js.UndefOr[Boolean] = js.native
  /** defines if the connection should use SSL (if true) or not (if false) */
  var secure: js.UndefOr[Boolean] = js.native
  var service: js.UndefOr[String] = js.native
  /** initialized socket to use instead of creating a new one */
  var socket: js.UndefOr[Socket] = js.native
  /** how many milliseconds of inactivity to allow */
  var socketTimeout: js.UndefOr[ms] = js.native
  /** defines additional options to be passed to the socket constructor, e.g. {rejectUnauthorized: true} */
  var tls: js.UndefOr[ConnectionOptions] = js.native
  /** if set to true, then logs SMTP traffic without message content */
  var transactionLog: js.UndefOr[Boolean] = js.native
   // TODO http.ClientRequest?
  var url: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConnection(value: Socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: ms): Self = {
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
    def withCustomAuth(value: CustomAuthenticationHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(js.undefined)
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
    def withGetSocket(
      value: (Options, /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSocket")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withGreetingTimeout(value: ms): Self = {
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
    def withLogger(value: Logger | Boolean): Self = {
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
    def withOpportunisticTLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opportunisticTLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpportunisticTLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opportunisticTLS")(js.undefined)
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
    def withSocket(value: Socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketTimeout(value: ms): Self = {
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
    @scala.inline
    def withTransactionLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionLog")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

