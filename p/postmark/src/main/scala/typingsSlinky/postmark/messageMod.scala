package typingsSlinky.postmark

import typingsSlinky.postmark.defaultResponseMod.DefaultResponse
import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.Header
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("postmark/dist/client/models/message/Message", "Message")
  @js.native
  class Message protected () extends StObject {
    def this(
      From: String,
      Subject: String,
      HtmlBody: js.UndefOr[String],
      TextBody: js.UndefOr[String],
      To: js.UndefOr[String],
      Cc: js.UndefOr[String],
      Bcc: js.UndefOr[String],
      ReplyTo: js.UndefOr[String],
      Tag: js.UndefOr[String],
      TrackOpens: js.UndefOr[Boolean],
      TrackLinks: js.UndefOr[LinkTrackingOptions],
      Headers: js.UndefOr[js.Array[Header]],
      Attachments: js.UndefOr[js.Array[Attachment]],
      Metadata: js.UndefOr[Hash[String]]
    ) = this()
    
    var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
    
    var Bcc: js.UndefOr[String] = js.native
    
    var Cc: js.UndefOr[String] = js.native
    
    var From: String = js.native
    
    var Headers: js.UndefOr[js.Array[Header]] = js.native
    
    var HtmlBody: js.UndefOr[String] = js.native
    
    var MessageStream: js.UndefOr[String] = js.native
    
    var Metadata: js.UndefOr[Hash[String]] = js.native
    
    var ReplyTo: js.UndefOr[String] = js.native
    
    var Subject: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var TextBody: js.UndefOr[String] = js.native
    
    var To: js.UndefOr[String] = js.native
    
    var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
    
    var TrackOpens: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait MessageSendingResponse extends DefaultResponse {
    
    var Bcc: js.UndefOr[String] = js.native
    
    var Cc: js.UndefOr[String] = js.native
    
    var MessageID: js.UndefOr[String] = js.native
    
    var SubmittedAt: String = js.native
    
    var To: js.UndefOr[String] = js.native
  }
  object MessageSendingResponse {
    
    @scala.inline
    def apply(ErrorCode: Double, Message: String, SubmittedAt: String): MessageSendingResponse = {
      val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageSendingResponse]
    }
    
    @scala.inline
    implicit class MessageSendingResponseMutableBuilder[Self <: MessageSendingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBcc(value: String): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "Bcc", js.undefined)
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "Cc", js.undefined)
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIDUndefined: Self = StObject.set(x, "MessageID", js.undefined)
      
      @scala.inline
      def setSubmittedAt(value: String): Self = StObject.set(x, "SubmittedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "To", js.undefined)
    }
  }
}
