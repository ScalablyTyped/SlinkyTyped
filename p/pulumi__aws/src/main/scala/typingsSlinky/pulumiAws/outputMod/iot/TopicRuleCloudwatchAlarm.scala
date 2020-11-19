package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleCloudwatchAlarm extends js.Object {
  
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: String = js.native
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmName(value: String): Self = this.set("alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: String): Self = this.set("stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: String): Self = this.set("stateValue", value.asInstanceOf[js.Any])
  }
}
