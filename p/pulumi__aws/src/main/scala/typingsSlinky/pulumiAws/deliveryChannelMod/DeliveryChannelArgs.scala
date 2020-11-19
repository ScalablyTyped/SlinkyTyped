package typingsSlinky.pulumiAws.deliveryChannelMod

import typingsSlinky.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryChannelArgs extends js.Object {
  
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: Input[String] = js.native
  
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
object DeliveryChannelArgs {
  
  @scala.inline
  def apply(s3BucketName: Input[String]): DeliveryChannelArgs = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryChannelArgs]
  }
  
  @scala.inline
  implicit class DeliveryChannelArgsOps[Self <: DeliveryChannelArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3BucketName(value: Input[String]): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: Input[String]): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnapshotDeliveryProperties(value: Input[DeliveryChannelSnapshotDeliveryProperties]): Self = this.set("snapshotDeliveryProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotDeliveryProperties: Self = this.set("snapshotDeliveryProperties", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
  }
}
