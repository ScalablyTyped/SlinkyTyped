package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutCompositeAlarmInput extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The default is TRUE.
    */
  var ActionsEnabled: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The description for the composite alarm.
    */
  var AlarmDescription: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name for the composite alarm. This name must be unique within your AWS account.
    */
  var AlarmName: typingsSlinky.awsSdk.cloudwatchMod.AlarmName = js.native
  /**
    * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple functions in a single expression. You can use parenthesis to logically group the functions in your expression. You can use either alarm names or ARNs to reference the other alarms that are to be evaluated. Functions can include the following:    ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.    OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.    INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in INSUFFICIENT_DATA state.    TRUE always evaluates to TRUE.    FALSE always evaluates to FALSE.   TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your alarm actions. Alarm names specified in AlarmRule can be surrounded with double-quotes ("), but do not have to be. The following are some examples of AlarmRule:    ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh) specifies that the composite alarm goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.    ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress) specifies that the alarm goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This example reduces alarm noise during a known deployment window.    (ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh) goes into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.   The AlarmRule can specify as many as 100 "children" alarms. The AlarmRule expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
    */
  var AlarmRule: typingsSlinky.awsSdk.cloudwatchMod.AlarmRule = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an alarm. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object PutCompositeAlarmInput {
  @scala.inline
  def apply(AlarmName: AlarmName, AlarmRule: AlarmRule): PutCompositeAlarmInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], AlarmRule = AlarmRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCompositeAlarmInput]
  }
  @scala.inline
  implicit class PutCompositeAlarmInputOps[Self <: PutCompositeAlarmInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlarmRule(value: AlarmRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionsEnabled(value: ActionsEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmDescription(value: AlarmDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withInsufficientDataActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientDataActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsufficientDataActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientDataActions")(js.undefined)
        ret
    }
    @scala.inline
    def withOKActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOKActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

