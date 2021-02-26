package typingsSlinky.nodemailer

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.ConnectionOptions
import typingsSlinky.nodemailer.mimeNodeMod.Envelope
import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.nodemailerStrings.CUSTOM
import typingsSlinky.nodemailer.nodemailerStrings.LOGIN
import typingsSlinky.nodemailer.nodemailerStrings.OAUTH2
import typingsSlinky.nodemailer.nodemailerStrings.XOAUTH2
import typingsSlinky.nodemailer.nodemailerStrings.close
import typingsSlinky.nodemailer.nodemailerStrings.error
import typingsSlinky.nodemailer.sharedMod.Logger
import typingsSlinky.nodemailer.smtpConnectionMod.Credentials
import typingsSlinky.nodemailer.smtpConnectionMod.CustomAuthenticationHandlers
import typingsSlinky.nodemailer.smtpConnectionMod.DSNOptions
import typingsSlinky.nodemailer.smtpConnectionMod.ms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smtpTransportMod {
  
  @JSImport("nodemailer/lib/smtp-transport", JSImport.Namespace)
  @js.native
  class ^ protected () extends SMTPTransport {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeLogin
    - typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2
  */
  trait AuthenticationType extends StObject
  object AuthenticationType {
    
    @scala.inline
    def AuthenticationTypeLogin(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeLogin = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeLogin]
    }
    
    @scala.inline
    def AuthenticationTypeOAuth2(method: XOAUTH2, oauth2: typingsSlinky.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2 = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2]
    }
  }
  
  @js.native
  trait AuthenticationTypeCustom extends Credentials {
    
    var method: String = js.native
    
    var `type`: CUSTOM = js.native
  }
  object AuthenticationTypeCustom {
    
    @scala.inline
    def apply(method: String, pass: String, `type`: CUSTOM, user: String): AuthenticationTypeCustom = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationTypeCustom]
    }
    
    @scala.inline
    implicit class AuthenticationTypeCustomMutableBuilder[Self <: AuthenticationTypeCustom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CUSTOM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthenticationTypeLogin extends AuthenticationType {
    
    var credentials: Credentials = js.native
    
    var method: String | `false` = js.native
    
    var `type`: LOGIN = js.native
    
    var user: String = js.native
  }
  object AuthenticationTypeLogin {
    
    @scala.inline
    def apply(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): AuthenticationTypeLogin = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationTypeLogin]
    }
    
    @scala.inline
    implicit class AuthenticationTypeLoginMutableBuilder[Self <: AuthenticationTypeLogin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String | `false`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LOGIN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthenticationTypeOAuth2 extends AuthenticationType {
    
    var method: XOAUTH2 = js.native
    
    var oauth2: typingsSlinky.nodemailer.xoauth2Mod.^ = js.native
    
    var `type`: OAUTH2 = js.native
    
    var user: String = js.native
  }
  object AuthenticationTypeOAuth2 {
    
    @scala.inline
    def apply(method: XOAUTH2, oauth2: typingsSlinky.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationTypeOAuth2 = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationTypeOAuth2]
    }
    
    @scala.inline
    implicit class AuthenticationTypeOAuth2MutableBuilder[Self <: AuthenticationTypeOAuth2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: XOAUTH2): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth2(value: typingsSlinky.nodemailer.xoauth2Mod.^): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: OAUTH2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailOptions
    extends typingsSlinky.nodemailer.mailerMod.Options {
    
    var auth: js.UndefOr[typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationType] = js.native
    
    var dsn: js.UndefOr[DSNOptions] = js.native
  }
  object MailOptions {
    
    @scala.inline
    def apply(): MailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailOptions]
    }
    
    @scala.inline
    implicit class MailOptionsMutableBuilder[Self <: MailOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationType): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setDsn(value: DSNOptions): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    }
  }
  
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
      
      @scala.inline
      def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeout(value: ms): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setCustomAuth(value: CustomAuthenticationHandlers): Self = StObject.set(x, "customAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAuthUndefined: Self = StObject.set(x, "customAuth", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGetSocket(
        value: (Options, /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "getSocket", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSocketUndefined: Self = StObject.set(x, "getSocket", js.undefined)
      
      @scala.inline
      def setGreetingTimeout(value: ms): Self = StObject.set(x, "greetingTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreetingTimeoutUndefined: Self = StObject.set(x, "greetingTimeout", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpportunisticTLS(value: Boolean): Self = StObject.set(x, "opportunisticTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpportunisticTLSUndefined: Self = StObject.set(x, "opportunisticTLS", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRequireTLS(value: Boolean): Self = StObject.set(x, "requireTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireTLSUndefined: Self = StObject.set(x, "requireTLS", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeout(value: ms): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setTransactionLog(value: Boolean): Self = StObject.set(x, "transactionLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionLogUndefined: Self = StObject.set(x, "transactionLog", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait SMTPTransport
    extends EventEmitter
       with Transport {
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var auth: AuthenticationType = js.native
    
    /** Releases resources */
    @JSName("close")
    def close_MSMTPTransport(): Unit = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: js.Error): Boolean = js.native
    
    def getAuth(authOpts: typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeLogin): AuthenticationType = js.native
    def getAuth(authOpts: typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2): AuthenticationType = js.native
    
    /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
    def getSocket(
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.Object, Unit]
    ): Unit = js.native
    
    @JSName("listeners")
    def listeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_SMTPTransport: typingsSlinky.nodemailer.mailerMod.^ = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var options: Options = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("verify")
    def verify_MSMTPTransport(): js.Promise[`true`] = js.native
    /** Verifies SMTP configuration */
    @JSName("verify")
    def verify_true(callback: js.Function2[/* err */ js.Error | Null, `true`, Unit]): Unit = js.native
  }
  
  @js.native
  trait SentMessageInfo extends StObject {
    
    /** includes the envelope object for the message */
    var envelope: Envelope = js.native
    
    /** most transports should return the final Message-Id value used with this property */
    var messageId: String = js.native
  }
  object SentMessageInfo {
    
    @scala.inline
    def apply(envelope: Envelope, messageId: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit class SentMessageInfoMutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
}
