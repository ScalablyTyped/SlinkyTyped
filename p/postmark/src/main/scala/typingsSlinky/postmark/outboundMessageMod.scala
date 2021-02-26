package typingsSlinky.postmark

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.outboundMessageEventsMod.MessageEvent
import typingsSlinky.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageMod {
  
  @js.native
  trait OutboundMessage extends StObject {
    
    var Attachments: js.Array[Attachment] = js.native
    
    var Bcc: js.Array[Recipient] = js.native
    
    var Cc: js.Array[Recipient] = js.native
    
    var From: String = js.native
    
    var MessageID: String = js.native
    
    var MessageStream: String = js.native
    
    var Metadata: Hash[String] = js.native
    
    var ReceivedAt: String = js.native
    
    var Recipients: js.Array[String] = js.native
    
    var Status: String = js.native
    
    var Subject: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var To: js.Array[Recipient] = js.native
    
    var TrackLinks: LinkTrackingOptions = js.native
    
    var TrackOpens: Boolean = js.native
  }
  object OutboundMessage {
    
    @scala.inline
    def apply(
      Attachments: js.Array[Attachment],
      Bcc: js.Array[Recipient],
      Cc: js.Array[Recipient],
      From: String,
      MessageID: String,
      MessageStream: String,
      Metadata: Hash[String],
      ReceivedAt: String,
      Recipients: js.Array[String],
      Status: String,
      Subject: String,
      To: js.Array[Recipient],
      TrackLinks: LinkTrackingOptions,
      TrackOpens: Boolean
    ): OutboundMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessage]
    }
    
    @scala.inline
    implicit class OutboundMessageMutableBuilder[Self <: OutboundMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: js.Array[Recipient]): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccVarargs(value: Recipient*): Self = StObject.set(x, "Bcc", js.Array(value :_*))
      
      @scala.inline
      def setCc(value: js.Array[Recipient]): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcVarargs(value: Recipient*): Self = StObject.set(x, "Cc", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Hash[String]): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: js.Array[String]): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsVarargs(value: String*): Self = StObject.set(x, "Recipients", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTo(value: js.Array[Recipient]): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: Recipient*): Self = StObject.set(x, "To", js.Array(value :_*))
      
      @scala.inline
      def setTrackLinks(value: LinkTrackingOptions): Self = StObject.set(x, "TrackLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackOpens(value: Boolean): Self = StObject.set(x, "TrackOpens", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutboundMessageDetails extends OutboundMessage {
    
    var Body: String = js.native
    
    var HtmlBody: js.UndefOr[String] = js.native
    
    var MessageEvents: js.Array[MessageEvent] = js.native
    
    var TextBody: js.UndefOr[String] = js.native
  }
  object OutboundMessageDetails {
    
    @scala.inline
    def apply(
      Attachments: js.Array[Attachment],
      Bcc: js.Array[Recipient],
      Body: String,
      Cc: js.Array[Recipient],
      From: String,
      MessageEvents: js.Array[MessageEvent],
      MessageID: String,
      MessageStream: String,
      Metadata: Hash[String],
      ReceivedAt: String,
      Recipients: js.Array[String],
      Status: String,
      Subject: String,
      To: js.Array[Recipient],
      TrackLinks: LinkTrackingOptions,
      TrackOpens: Boolean
    ): OutboundMessageDetails = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageEvents = MessageEvents.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageDetails]
    }
    
    @scala.inline
    implicit class OutboundMessageDetailsMutableBuilder[Self <: OutboundMessageDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
      
      @scala.inline
      def setMessageEvents(value: js.Array[MessageEvent]): Self = StObject.set(x, "MessageEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageEventsVarargs(value: MessageEvent*): Self = StObject.set(x, "MessageEvents", js.Array(value :_*))
      
      @scala.inline
      def setTextBody(value: String): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBodyUndefined: Self = StObject.set(x, "TextBody", js.undefined)
    }
  }
  
  @js.native
  trait OutboundMessageDump extends StObject {
    
    var Body: String = js.native
  }
  object OutboundMessageDump {
    
    @scala.inline
    def apply(Body: String): OutboundMessageDump = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageDump]
    }
    
    @scala.inline
    implicit class OutboundMessageDumpMutableBuilder[Self <: OutboundMessageDump] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutboundMessages extends StObject {
    
    var Messages: js.Array[OutboundMessage] = js.native
    
    var TotalCount: String = js.native
  }
  object OutboundMessages {
    
    @scala.inline
    def apply(Messages: js.Array[OutboundMessage], TotalCount: String): OutboundMessages = {
      val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessages]
    }
    
    @scala.inline
    implicit class OutboundMessagesMutableBuilder[Self <: OutboundMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessages(value: js.Array[OutboundMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: OutboundMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: String): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Recipient extends StObject {
    
    var Email: String = js.native
    
    var Name: String = js.native
  }
  object Recipient {
    
    @scala.inline
    def apply(Email: String, Name: String): Recipient = {
      val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recipient]
    }
    
    @scala.inline
    implicit class RecipientMutableBuilder[Self <: Recipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
}
