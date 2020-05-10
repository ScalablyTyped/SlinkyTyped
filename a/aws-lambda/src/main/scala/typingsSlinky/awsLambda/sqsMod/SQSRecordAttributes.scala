package typingsSlinky.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQSRecordAttributes extends js.Object {
  var AWSTraceHeader: js.UndefOr[String] = js.native
  var ApproximateFirstReceiveTimestamp: String = js.native
  var ApproximateReceiveCount: String = js.native
  var SenderId: String = js.native
  var SentTimestamp: String = js.native
}

object SQSRecordAttributes {
  @scala.inline
  def apply(
    ApproximateFirstReceiveTimestamp: String,
    ApproximateReceiveCount: String,
    SenderId: String,
    SentTimestamp: String
  ): SQSRecordAttributes = {
    val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQSRecordAttributes]
  }
  @scala.inline
  implicit class SQSRecordAttributesOps[Self <: SQSRecordAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateFirstReceiveTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateFirstReceiveTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApproximateReceiveCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateReceiveCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAWSTraceHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSTraceHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSTraceHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSTraceHeader")(js.undefined)
        ret
    }
  }
  
}

