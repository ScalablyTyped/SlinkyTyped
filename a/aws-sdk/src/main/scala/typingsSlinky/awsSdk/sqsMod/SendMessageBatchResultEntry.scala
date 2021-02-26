package typingsSlinky.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageBatchResultEntry extends StObject {
  
  /**
    * An identifier for the message in this batch.
    */
  var Id: String = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageBody: String = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message system attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageSystemAttributes: js.UndefOr[String] = js.native
  
  /**
    * An identifier for the message.
    */
  var MessageId: String = js.native
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The large, non-consecutive number that Amazon SQS assigns to each message. The length of SequenceNumber is 128 bits. As SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.native
}
object SendMessageBatchResultEntry {
  
  @scala.inline
  def apply(Id: String, MD5OfMessageBody: String, MessageId: String): SendMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MD5OfMessageBody = MD5OfMessageBody.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchResultEntry]
  }
  
  @scala.inline
  implicit class SendMessageBatchResultEntryMutableBuilder[Self <: SendMessageBatchResultEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
    
    @scala.inline
    def setMD5OfMessageBody(value: String): Self = StObject.set(x, "MD5OfMessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageSystemAttributes(value: String): Self = StObject.set(x, "MD5OfMessageSystemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5OfMessageSystemAttributesUndefined: Self = StObject.set(x, "MD5OfMessageSystemAttributes", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
  }
}
