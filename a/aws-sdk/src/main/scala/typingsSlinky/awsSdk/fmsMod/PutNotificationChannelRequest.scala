package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutNotificationChannelRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity. 
    */
  var SnsRoleName: ResourceArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
    */
  var SnsTopicArn: ResourceArn = js.native
}

object PutNotificationChannelRequest {
  @scala.inline
  def apply(SnsRoleName: ResourceArn, SnsTopicArn: ResourceArn): PutNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(SnsRoleName = SnsRoleName.asInstanceOf[js.Any], SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationChannelRequest]
  }
  @scala.inline
  implicit class PutNotificationChannelRequestOps[Self <: PutNotificationChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnsRoleName(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

