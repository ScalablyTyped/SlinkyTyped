package typingsSlinky.pulumiAws.deliveryChannelMod

import typingsSlinky.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelState extends js.Object {
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: js.UndefOr[Input[String]] = js.native
  /**
    * The prefix for the specified S3 bucket.
    */
  val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Options for how AWS Config delivers configuration snapshots. See below
    */
  val snapshotDeliveryProperties: js.UndefOr[Input[DeliveryChannelSnapshotDeliveryProperties]] = js.native
  /**
    * The ARN of the SNS topic that AWS Config delivers notifications to.
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
}

object DeliveryChannelState {
  @scala.inline
  def apply(): DeliveryChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannelState]
  }
  @scala.inline
  implicit class DeliveryChannelStateOps[Self <: DeliveryChannelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotDeliveryProperties(value: Input[DeliveryChannelSnapshotDeliveryProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotDeliveryProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotDeliveryProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotDeliveryProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(js.undefined)
        ret
    }
  }
  
}

