package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseTransformationEventRecord extends js.Object {
  var approximateArrivalTimestamp: Double = js.native
  /** Base64 encoded */
  var data: String = js.native
  var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
  var recordId: String = js.native
}

object FirehoseTransformationEventRecord {
  @scala.inline
  def apply(approximateArrivalTimestamp: Double, data: String, recordId: String): FirehoseTransformationEventRecord = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationEventRecord]
  }
  @scala.inline
  implicit class FirehoseTransformationEventRecordOps[Self <: FirehoseTransformationEventRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateArrivalTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateArrivalTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinesisRecordMetadata(value: FirehoseRecordMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisRecordMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisRecordMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisRecordMetadata")(js.undefined)
        ret
    }
  }
  
}

