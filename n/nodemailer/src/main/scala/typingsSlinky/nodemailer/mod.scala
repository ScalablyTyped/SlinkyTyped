package typingsSlinky.nodemailer

import typingsSlinky.nodemailer.anon.Host
import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.smtpTransportMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer", "createTestAccount")
  @js.native
  def createTestAccount(): js.Promise[TestAccount] = js.native
  @JSImport("nodemailer", "createTestAccount")
  @js.native
  def createTestAccount(apiUrl: String): js.Promise[TestAccount] = js.native
  @JSImport("nodemailer", "createTestAccount")
  @js.native
  def createTestAccount(
    apiUrl: String,
    callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]
  ): Unit = js.native
  @JSImport("nodemailer", "createTestAccount")
  @js.native
  def createTestAccount(callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]): Unit = js.native
  
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: js.UndefOr[scala.Nothing], defaults: Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: String): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: String, defaults: Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.jsonTransportMod.Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.jsonTransportMod.Options,
    defaults: typingsSlinky.nodemailer.jsonTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.jsonTransportMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.jsonTransportMod.^,
    defaults: typingsSlinky.nodemailer.jsonTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: Transport): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: TransportOptions): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: TransportOptions, defaults: TransportOptions): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: Transport, defaults: TransportOptions): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.sendmailTransportMod.Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.sendmailTransportMod.Options,
    defaults: typingsSlinky.nodemailer.sendmailTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.sendmailTransportMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.sendmailTransportMod.^,
    defaults: typingsSlinky.nodemailer.sendmailTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.sesTransportMod.Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.sesTransportMod.Options,
    defaults: typingsSlinky.nodemailer.sesTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.sesTransportMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.sesTransportMod.^,
    defaults: typingsSlinky.nodemailer.sesTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.smtpPoolMod.Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.smtpPoolMod.Options,
    defaults: typingsSlinky.nodemailer.smtpPoolMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.smtpPoolMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.smtpPoolMod.^,
    defaults: typingsSlinky.nodemailer.smtpPoolMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: Options, defaults: Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.smtpTransportMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.smtpTransportMod.^, defaults: Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.streamTransportMod.Options): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.streamTransportMod.Options,
    defaults: typingsSlinky.nodemailer.streamTransportMod.Options
  ): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(transport: typingsSlinky.nodemailer.streamTransportMod.^): ^ = js.native
  @JSImport("nodemailer", "createTransport")
  @js.native
  def createTransport(
    transport: typingsSlinky.nodemailer.streamTransportMod.^,
    defaults: typingsSlinky.nodemailer.streamTransportMod.Options
  ): ^ = js.native
  
  @JSImport("nodemailer", "getTestMessageUrl")
  @js.native
  def getTestMessageUrl(info: typingsSlinky.nodemailer.sesTransportMod.SentMessageInfo): String | `false` = js.native
  @JSImport("nodemailer", "getTestMessageUrl")
  @js.native
  def getTestMessageUrl(info: typingsSlinky.nodemailer.smtpTransportMod.SentMessageInfo): String | `false` = js.native
  
  type SendMailOptions = typingsSlinky.nodemailer.mailerMod.Options
  
  type SentMessageInfo = js.Any
  
  @js.native
  trait TestAccount extends StObject {
    
    var imap: Host = js.native
    
    var pass: String = js.native
    
    var pop3: Host = js.native
    
    var smtp: Host = js.native
    
    var user: String = js.native
    
    var web: String = js.native
  }
  object TestAccount {
    
    @scala.inline
    def apply(imap: Host, pass: String, pop3: Host, smtp: Host, user: String, web: String): TestAccount = {
      val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestAccount]
    }
    
    @scala.inline
    implicit class TestAccountMutableBuilder[Self <: TestAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImap(value: Host): Self = StObject.set(x, "imap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPop3(value: Host): Self = StObject.set(x, "pop3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtp(value: Host): Self = StObject.set(x, "smtp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb(value: String): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transport extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var mailer: js.UndefOr[^] = js.native
    
    var name: String = js.native
    
    def send(
      mail: typingsSlinky.nodemailer.mailMessageMod.^,
      callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
    ): Unit = js.native
    
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
      ]) with js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
    
    var version: String = js.native
  }
  object Transport {
    
    @scala.inline
    def apply(
      name: String,
      send: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) with js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): Transport = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transport]
    }
    
    @scala.inline
    implicit class TransportMutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setMailer(value: ^): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailerUndefined: Self = StObject.set(x, "mailer", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend(
        value: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Unit
      ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVerify(
        value: (js.UndefOr[
              js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
            ]) with js.UndefOr[js.Function0[js.Promise[`true`]]]
      ): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransportOptions extends StObject {
    
    var component: js.UndefOr[String] = js.native
  }
  object TransportOptions {
    
    @scala.inline
    def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit class TransportOptionsMutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type Transporter = ^
}
