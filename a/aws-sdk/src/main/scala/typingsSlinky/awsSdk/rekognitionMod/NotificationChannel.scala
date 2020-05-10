package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationChannel extends js.Object {
  /**
    * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typingsSlinky.awsSdk.rekognitionMod.RoleArn = js.native
  /**
    * The Amazon SNS topic to which Amazon Rekognition to posts the completion status.
    */
  var SNSTopicArn: typingsSlinky.awsSdk.rekognitionMod.SNSTopicArn = js.native
}

object NotificationChannel {
  @scala.inline
  def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
  @scala.inline
  implicit class NotificationChannelOps[Self <: NotificationChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSNSTopicArn(value: SNSTopicArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

