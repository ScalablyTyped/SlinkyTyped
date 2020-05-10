package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * A map of the attributes requested in  ReceiveMessage  to their respective values. Supported attributes:    ApproximateReceiveCount     ApproximateFirstReceiveTimestamp     MessageDeduplicationId     MessageGroupId     SenderId     SentTimestamp     SequenceNumber     ApproximateFirstReceiveTimestamp and SentTimestamp are each returned as an integer representing the epoch time in milliseconds.
    */
  var Attributes: js.UndefOr[MessageSystemAttributeMap] = js.native
  /**
    * The message's contents (not URL-encoded).
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * An MD5 digest of the non-URL-encoded message body string.
    */
  var MD5OfBody: js.UndefOr[String] = js.native
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.native
  /**
    * A unique identifier for the message. A MessageIdis considered unique across all AWS accounts for an extended period of time.
    */
  var MessageId: js.UndefOr[String] = js.native
  /**
    * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MessageSystemAttributeMap): Self = {
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
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withMD5OfBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5OfBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMD5OfBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5OfBody")(js.undefined)
        ret
    }
    @scala.inline
    def withMD5OfMessageAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5OfMessageAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMD5OfMessageAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5OfMessageAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAttributes(value: MessageBodyAttributeMap): Self = {
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
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiptHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiptHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiptHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiptHandle")(js.undefined)
        ret
    }
  }
  
}

