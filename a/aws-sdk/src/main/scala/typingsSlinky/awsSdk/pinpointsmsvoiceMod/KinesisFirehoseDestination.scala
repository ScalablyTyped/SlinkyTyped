package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
    */
  var DeliveryStreamArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
}

object KinesisFirehoseDestination {
  @scala.inline
  def apply(): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  @scala.inline
  implicit class KinesisFirehoseDestinationOps[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
  }
  
}

