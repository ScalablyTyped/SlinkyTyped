package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamSourceDescription extends js.Object {
  /**
    * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
    */
  var DeliveryStartTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.KinesisStreamARN] = js.native
  /**
    * The ARN of the role used by the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RoleARN] = js.native
}

object KinesisStreamSourceDescription {
  @scala.inline
  def apply(): KinesisStreamSourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamSourceDescription]
  }
  @scala.inline
  implicit class KinesisStreamSourceDescriptionOps[Self <: KinesisStreamSourceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStartTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStartTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamARN(value: KinesisStreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
  }
  
}

