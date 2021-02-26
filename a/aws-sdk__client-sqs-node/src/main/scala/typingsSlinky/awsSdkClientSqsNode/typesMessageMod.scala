package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateFirstReceiveTimestamp
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateReceiveCount
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageDeduplicationId
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageGroupId
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SenderId
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SentTimestamp
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SequenceNumber
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings._Message
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings._UnmarshalledMessage
import typingsSlinky.awsSdkClientSqsNode.typesMessageAttributeValueMod.MessageAttributeValue
import typingsSlinky.awsSdkClientSqsNode.typesMessageAttributeValueMod.UnmarshalledMessageAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageMod {
  
  @js.native
  trait Message extends StObject {
    
    /**
      * <p>A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported attributes:</p> <ul> <li> <p> <code>ApproximateReceiveCount</code> </p> </li> <li> <p> <code>ApproximateFirstReceiveTimestamp</code> </p> </li> <li> <p> <code>MessageDeduplicationId</code> </p> </li> <li> <p> <code>MessageGroupId</code> </p> </li> <li> <p> <code>SenderId</code> </p> </li> <li> <p> <code>SentTimestamp</code> </p> </li> <li> <p> <code>SequenceNumber</code> </p> </li> </ul> <p> <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
      */
    var Attributes: js.UndefOr[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
      */ _Message with TopLevel[js.Any]) | (js.Iterable[
          js.Tuple2[
            SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
            String
          ]
        ])
      ] = js.native
    
    /**
      * <p>The message's contents (not URL-encoded).</p>
      */
    var Body: js.UndefOr[String] = js.native
    
    /**
      * <p>An MD5 digest of the non-URL-encoded message body string.</p>
      */
    var MD5OfBody: js.UndefOr[String] = js.native
    
    /**
      * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
      */
    var MD5OfMessageAttributes: js.UndefOr[String] = js.native
    
    /**
      * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    var MessageAttributes: js.UndefOr[
        StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
      ] = js.native
    
    /**
      * <p>A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an extended period of time.</p>
      */
    var MessageId: js.UndefOr[String] = js.native
    
    /**
      * <p>An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.</p>
      */
    var ReceiptHandle: js.UndefOr[String] = js.native
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(
        value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
        */ _Message with TopLevel[js.Any]) | (js.Iterable[
              js.Tuple2[
                SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
                String
              ]
            ])
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesIterable(
        value: js.Iterable[
              js.Tuple2[
                SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
                String
              ]
            ]
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setMD5OfBody(value: String): Self = StObject.set(x, "MD5OfBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMD5OfBodyUndefined: Self = StObject.set(x, "MD5OfBody", js.undefined)
      
      @scala.inline
      def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
      
      @scala.inline
      def setMessageAttributes(
        value: StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
      ): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributesIterable(value: js.Iterable[js.Tuple2[String, MessageAttributeValue]]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
      
      @scala.inline
      def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMessage extends Message {
    
    /**
      * <p>A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported attributes:</p> <ul> <li> <p> <code>ApproximateReceiveCount</code> </p> </li> <li> <p> <code>ApproximateFirstReceiveTimestamp</code> </p> </li> <li> <p> <code>MessageDeduplicationId</code> </p> </li> <li> <p> <code>MessageGroupId</code> </p> </li> <li> <p> <code>SenderId</code> </p> </li> <li> <p> <code>SentTimestamp</code> </p> </li> <li> <p> <code>SequenceNumber</code> </p> </li> </ul> <p> <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledMessage: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
      */ _UnmarshalledMessage with TopLevel[js.Any]
      ] = js.native
    
    /**
      * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    @JSName("MessageAttributes")
    var MessageAttributes_UnmarshalledMessage: js.UndefOr[StringDictionary[UnmarshalledMessageAttributeValue]] = js.native
  }
  object UnmarshalledMessage {
    
    @scala.inline
    def apply(): UnmarshalledMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledMessageMutableBuilder[Self <: UnmarshalledMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
        */ _UnmarshalledMessage with TopLevel[js.Any]
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setMessageAttributes(value: StringDictionary[UnmarshalledMessageAttributeValue]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    }
  }
}
