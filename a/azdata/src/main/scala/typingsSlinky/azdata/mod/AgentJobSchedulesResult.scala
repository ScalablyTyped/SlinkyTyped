package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobSchedulesResult extends ResultStatus {
  var schedules: js.Array[AgentJobScheduleInfo] = js.native
}

object AgentJobSchedulesResult {
  @scala.inline
  def apply(errorMessage: String, schedules: js.Array[AgentJobScheduleInfo], success: Boolean): AgentJobSchedulesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobSchedulesResult]
  }
  @scala.inline
  implicit class AgentJobSchedulesResultOps[Self <: AgentJobSchedulesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchedules(value: js.Array[AgentJobScheduleInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

