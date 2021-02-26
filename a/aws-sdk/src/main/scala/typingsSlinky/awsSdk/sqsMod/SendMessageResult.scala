package typingsSlinky.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageResult extends StObject {
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageBody: js.UndefOr[String] = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message system attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest.
    */
  var MD5OfMessageSystemAttributes: js.UndefOr[String] = js.native
  
  /**
    * An attribute containing the MessageId of the message sent to the queue. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. 
    */
  var MessageId: js.UndefOr[String] = js.native
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The large, non-consecutive number that Amazon SQS assigns to each message. The length of SequenceNumber is 128 bits. SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.native
}
object SendMessageResult {
  
  @scala.inline
  def apply(): SendMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageResult]
  }
  
  @scala.inline
  implicit class SendMessageResultMutableBuilder[Self <: SendMessageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
    
    @scala.inline
    def setMD5OfMessageBody(value: String): Self = StObject.set(x, "MD5OfMessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageBodyUndefined: Self = StObject.set(x, "MD5OfMessageBody", js.undefined)
    
    @scala.inline
    def setMD5OfMessageSystemAttributes(value: String): Self = StObject.set(x, "MD5OfMessageSystemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageSystemAttributesUndefined: Self = StObject.set(x, "MD5OfMessageSystemAttributes", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
  }
}
