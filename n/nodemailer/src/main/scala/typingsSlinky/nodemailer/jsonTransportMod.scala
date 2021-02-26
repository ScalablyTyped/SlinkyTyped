package typingsSlinky.nodemailer

import typingsSlinky.nodemailer.mimeNodeMod.Envelope
import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.sharedMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonTransportMod {
  
  @JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
  @js.native
  class ^ protected () extends JSONTransport {
    def this(options: Options) = this()
  }
  
  @js.native
  trait JSONTransport extends Transport {
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_JSONTransport: typingsSlinky.nodemailer.mailerMod.^ = js.native
    
    var options: Options = js.native
  }
  object JSONTransport {
    
    @scala.inline
    def apply(
      logger: Logger,
      mailer: typingsSlinky.nodemailer.mailerMod.^,
      name: String,
      options: Options,
      send: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[
          /* err */ js.Error | Null, 
          /* info */ typingsSlinky.nodemailer.mod.SentMessageInfo, 
          Unit
        ]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) with js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): JSONTransport = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONTransport]
    }
    
    @scala.inline
    implicit class JSONTransportMutableBuilder[Self <: JSONTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailer(value: typingsSlinky.nodemailer.mailerMod.^): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type MailOptions = typingsSlinky.nodemailer.mailerMod.Options
  
  @js.native
  trait Options
    extends typingsSlinky.nodemailer.mailerMod.Options
       with TransportOptions {
    
    var jsonTransport: `true` = js.native
    
    var skipEncoding: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(jsonTransport: `true`): Options = {
      val __obj = js.Dynamic.literal(jsonTransport = jsonTransport.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonTransport(value: `true`): Self = StObject.set(x, "jsonTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  @js.native
  trait SentMessageInfo extends StObject {
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope = js.native
    
    /** JSON string */
    var message: String = js.native
    
    /** the Message-ID header value */
    var messageId: String = js.native
  }
  object SentMessageInfo {
    
    @scala.inline
    def apply(envelope: Envelope, message: String, messageId: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit class SentMessageInfoMutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
}
