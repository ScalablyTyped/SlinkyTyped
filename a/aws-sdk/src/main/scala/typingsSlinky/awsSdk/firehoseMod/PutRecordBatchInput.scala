package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * One or more records.
    */
  var Records: PutRecordBatchRequestEntryList = js.native
}

object PutRecordBatchInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchInput]
  }
  @scala.inline
  implicit class PutRecordBatchInputOps[Self <: PutRecordBatchInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: PutRecordBatchRequestEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

