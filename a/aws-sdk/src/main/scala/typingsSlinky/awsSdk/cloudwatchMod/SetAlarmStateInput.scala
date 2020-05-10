package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAlarmStateInput extends js.Object {
  /**
    * The name for the alarm. This name must be unique within the AWS account. The maximum length is 255 characters.
    */
  var AlarmName: typingsSlinky.awsSdk.cloudwatchMod.AlarmName = js.native
  /**
    * The reason that this alarm is set to this specific state, in text format.
    */
  var StateReason: typingsSlinky.awsSdk.cloudwatchMod.StateReason = js.native
  /**
    * The reason that this alarm is set to this specific state, in JSON format. For SNS or EC2 alarm actions, this is just informational. But for EC2 Auto Scaling or application Auto Scaling alarm actions, the Auto Scaling policy uses the information in this field to take the correct action.
    */
  var StateReasonData: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The value of the state.
    */
  var StateValue: typingsSlinky.awsSdk.cloudwatchMod.StateValue = js.native
}

object SetAlarmStateInput {
  @scala.inline
  def apply(AlarmName: AlarmName, StateReason: StateReason, StateValue: StateValue): SetAlarmStateInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], StateReason = StateReason.asInstanceOf[js.Any], StateValue = StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAlarmStateInput]
  }
  @scala.inline
  implicit class SetAlarmStateInputOps[Self <: SetAlarmStateInput] (val x: Self) extends AnyVal {
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
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateValue(value: StateValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(value.asInstanceOf[js.Any])
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
  }
  
}

