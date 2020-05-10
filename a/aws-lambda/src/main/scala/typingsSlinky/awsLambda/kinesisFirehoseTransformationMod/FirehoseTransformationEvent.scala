package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseTransformationEvent extends js.Object {
  var deliveryStreamArn: String = js.native
  var invocationId: String = js.native
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
  var region: String = js.native
}

object FirehoseTransformationEvent {
  @scala.inline
  def apply(
    deliveryStreamArn: String,
    invocationId: String,
    records: js.Array[FirehoseTransformationEventRecord],
    region: String
  ): FirehoseTransformationEvent = {
    val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn.asInstanceOf[js.Any], invocationId = invocationId.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationEvent]
  }
  @scala.inline
  implicit class FirehoseTransformationEventOps[Self <: FirehoseTransformationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: js.Array[FirehoseTransformationEventRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

