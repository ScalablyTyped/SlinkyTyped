package typingsSlinky.pulumiAws.sqsMixinsMod

import typingsSlinky.pulumiAws.AnonApproximateFirstReceiveTimestamp
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueRecord extends js.Object {
  var attributes: AnonApproximateFirstReceiveTimestamp = js.native
  var awsRegion: String = js.native
  var body: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var md5OfBody: String = js.native
  var messageAttributes: Record[String, _] = js.native
  var messageId: String = js.native
  var receiptHandle: String = js.native
}

object QueueRecord {
  @scala.inline
  def apply(
    attributes: AnonApproximateFirstReceiveTimestamp,
    awsRegion: String,
    body: String,
    eventSource: String,
    eventSourceARN: String,
    md5OfBody: String,
    messageAttributes: Record[String, _],
    messageId: String,
    receiptHandle: String
  ): QueueRecord = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], md5OfBody = md5OfBody.asInstanceOf[js.Any], messageAttributes = messageAttributes.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueRecord]
  }
  @scala.inline
  implicit class QueueRecordOps[Self <: QueueRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AnonApproximateFirstReceiveTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSourceARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5OfBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5OfBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageAttributes(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiptHandle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

