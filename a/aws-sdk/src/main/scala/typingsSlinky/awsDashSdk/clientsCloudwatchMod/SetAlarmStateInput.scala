package typingsSlinky.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAlarmStateInput extends js.Object {
  /**
    * The name for the alarm. This name must be unique within the AWS account. The maximum length is 255 characters.
    */
  var AlarmName: typingsSlinky.awsDashSdk.clientsCloudwatchMod.AlarmName = js.native
  /**
    * The reason that this alarm is set to this specific state, in text format.
    */
  var StateReason: typingsSlinky.awsDashSdk.clientsCloudwatchMod.StateReason = js.native
  /**
    * The reason that this alarm is set to this specific state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudwatchMod.StateReasonData] = js.native
  /**
    * The value of the state.
    */
  var StateValue: typingsSlinky.awsDashSdk.clientsCloudwatchMod.StateValue = js.native
}

object SetAlarmStateInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName,
    StateReason: StateReason,
    StateValue: StateValue,
    StateReasonData: StateReasonData = null
  ): SetAlarmStateInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], StateReason = StateReason.asInstanceOf[js.Any], StateValue = StateValue.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAlarmStateInput]
  }
}

