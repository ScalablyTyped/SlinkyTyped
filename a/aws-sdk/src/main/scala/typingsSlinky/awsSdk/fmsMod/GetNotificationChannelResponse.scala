package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNotificationChannelResponse extends js.Object {
  /**
    * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
    */
  var SnsRoleName: js.UndefOr[ResourceArn] = js.native
  /**
    * The SNS topic that records AWS Firewall Manager activity. 
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.native
}

object GetNotificationChannelResponse {
  @scala.inline
  def apply(): GetNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationChannelResponse]
  }
  @scala.inline
  implicit class GetNotificationChannelResponseOps[Self <: GetNotificationChannelResponse] (val x: Self) extends AnyVal {
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
    def withoutSnsRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(js.undefined)
        ret
    }
  }
  
}

