package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobHistoryResult extends ResultStatus {
  var alerts: js.Array[AgentAlertInfo] = js.native
  var histories: js.Array[AgentJobHistoryInfo] = js.native
  var schedules: js.Array[AgentJobScheduleInfo] = js.native
  var steps: js.Array[AgentJobStepInfo] = js.native
}

object AgentJobHistoryResult {
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    errorMessage: String,
    histories: js.Array[AgentJobHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentJobHistoryResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobHistoryResult]
  }
  @scala.inline
  implicit class AgentJobHistoryResultOps[Self <: AgentJobHistoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlerts(value: js.Array[AgentAlertInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistories(value: js.Array[AgentJobHistoryInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedules(value: js.Array[AgentJobScheduleInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[AgentJobStepInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

