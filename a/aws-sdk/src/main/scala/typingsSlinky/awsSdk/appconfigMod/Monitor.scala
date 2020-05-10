package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitor extends js.Object {
  /**
    * ARN of the Amazon CloudWatch alarm.
    */
  var AlarmArn: js.UndefOr[Arn] = js.native
  /**
    * ARN of an IAM role for AppConfig to monitor AlarmArn.
    */
  var AlarmRoleArn: js.UndefOr[Arn] = js.native
}

object Monitor {
  @scala.inline
  def apply(): Monitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitor]
  }
  @scala.inline
  implicit class MonitorOps[Self <: Monitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmRoleArn")(js.undefined)
        ret
    }
  }
  
}

