package typingsSlinky.awsSdkClientSqsNode.typesMessageMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings._UnmarshalledMessage
import typingsSlinky.awsSdkClientSqsNode.typesMessageAttributeValueMod.UnmarshalledMessageAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class UnmarshalledMessageOps[Self <: UnmarshalledMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
      */ _UnmarshalledMessage with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAttributes(value: StringDictionary[UnmarshalledMessageAttributeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageAttributes")(js.undefined)
        ret
    }
  }
  
}

