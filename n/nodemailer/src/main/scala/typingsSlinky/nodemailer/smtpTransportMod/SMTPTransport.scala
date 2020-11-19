package typingsSlinky.nodemailer.smtpTransportMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.nodemailerStrings.close
import typingsSlinky.nodemailer.nodemailerStrings.error
import typingsSlinky.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
