package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeAlarm extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmArn] = js.native
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The rule that this alarm uses to evaluate its alarm state.
    */
  var AlarmRule: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmRule] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateReason] = js.native
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateValue] = js.native
}

object CompositeAlarm {
  @scala.inline
  def apply(): CompositeAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeAlarm]
  }
  @scala.inline
  implicit class CompositeAlarmOps[Self <: CompositeAlarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAlarmArn(value: AlarmArn): Self = {
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
    def withAlarmConfigurationUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmConfigurationUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmConfigurationUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmConfigurationUpdatedTimestamp")(js.undefined)
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
    def withAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmRule(value: AlarmRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmRule")(js.undefined)
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
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReasonData(value: StateReasonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReasonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonData")(js.undefined)
        ret
    }
    @scala.inline
    def withStateUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStateValue(value: StateValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(js.undefined)
        ret
    }
  }
  
}

