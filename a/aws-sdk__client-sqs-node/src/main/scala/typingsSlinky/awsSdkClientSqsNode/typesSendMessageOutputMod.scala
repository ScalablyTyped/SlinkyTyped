package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageOutputMod {
  
  @js.native
  trait SendMessageOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
      */
    var MD5OfMessageAttributes: js.UndefOr[String] = js.native
    
    /**
      * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
      */
    var MD5OfMessageBody: js.UndefOr[String] = js.native
    
    /**
      * <p>An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html">Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p>
      */
    var MessageId: js.UndefOr[String] = js.native
    
    /**
      * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The large, non-consecutive number that Amazon SQS assigns to each message.</p> <p>The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a particular <code>MessageGroupId</code>.</p>
      */
    var SequenceNumber: js.UndefOr[String] = js.native
  }
  object SendMessageOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): SendMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageOutput]
    }
    
    @scala.inline
    implicit class SendMessageOutputMutableBuilder[Self <: SendMessageOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
      
      @scala.inline
      def setMD5OfMessageBody(value: String): Self = StObject.set(x, "MD5OfMessageBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMD5OfMessageBodyUndefined: Self = StObject.set(x, "MD5OfMessageBody", js.undefined)
      
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
}
