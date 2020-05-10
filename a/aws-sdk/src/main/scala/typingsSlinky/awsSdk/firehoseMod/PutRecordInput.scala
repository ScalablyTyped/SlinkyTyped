package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The record.
    */
  var Record: typingsSlinky.awsSdk.firehoseMod.Record = js.native
}

object PutRecordInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Record: Record): PutRecordInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordInput]
  }
  @scala.inline
  implicit class PutRecordInputOps[Self <: PutRecordInput] (val x: Self) extends AnyVal {
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
    def withRecord(value: Record): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Record")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

