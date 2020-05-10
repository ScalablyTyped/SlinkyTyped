package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleCloudwatchAlarm extends js.Object {
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: String = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  /**
    * The reason for the alarm change.
    */
  var stateReason: String = js.native
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: String = js.native
}

object TopicRuleCloudwatchAlarm {
  @scala.inline
  def apply(alarmName: String, roleArn: String, stateReason: String, stateValue: String): TopicRuleCloudwatchAlarm = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleCloudwatchAlarm]
  }
  @scala.inline
  implicit class TopicRuleCloudwatchAlarmOps[Self <: TopicRuleCloudwatchAlarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

