package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobScheduleInfo extends js.Object {
  var activeEndDate: String = js.native
  var activeEndTimeOfDay: String = js.native
  var activeStartDate: String = js.native
  var activeStartTimeOfDay: String = js.native
  var dateCreated: String = js.native
  var description: String = js.native
  var frequencyInterval: Double = js.native
  var frequencyRecurrenceFactor: Double = js.native
  var frequencyRelativeIntervals: FrequencyRelativeIntervals = js.native
  var frequencySubDayInterval: Double = js.native
  var frequencySubDayTypes: FrequencySubDayTypes = js.native
  var frequencyTypes: FrequencyTypes = js.native
  var id: Double = js.native
  var isEnabled: Boolean = js.native
  var jobCount: Double = js.native
  var jobName: String = js.native
  var name: String = js.native
  var scheduleUid: String = js.native
}

object AgentJobScheduleInfo {
  @scala.inline
  def apply(
    activeEndDate: String,
    activeEndTimeOfDay: String,
    activeStartDate: String,
    activeStartTimeOfDay: String,
    dateCreated: String,
    description: String,
    frequencyInterval: Double,
    frequencyRecurrenceFactor: Double,
    frequencyRelativeIntervals: FrequencyRelativeIntervals,
    frequencySubDayInterval: Double,
    frequencySubDayTypes: FrequencySubDayTypes,
    frequencyTypes: FrequencyTypes,
    id: Double,
    isEnabled: Boolean,
    jobCount: Double,
    jobName: String,
    name: String,
    scheduleUid: String
  ): AgentJobScheduleInfo = {
    val __obj = js.Dynamic.literal(activeEndDate = activeEndDate.asInstanceOf[js.Any], activeEndTimeOfDay = activeEndTimeOfDay.asInstanceOf[js.Any], activeStartDate = activeStartDate.asInstanceOf[js.Any], activeStartTimeOfDay = activeStartTimeOfDay.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], frequencyInterval = frequencyInterval.asInstanceOf[js.Any], frequencyRecurrenceFactor = frequencyRecurrenceFactor.asInstanceOf[js.Any], frequencyRelativeIntervals = frequencyRelativeIntervals.asInstanceOf[js.Any], frequencySubDayInterval = frequencySubDayInterval.asInstanceOf[js.Any], frequencySubDayTypes = frequencySubDayTypes.asInstanceOf[js.Any], frequencyTypes = frequencyTypes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], jobCount = jobCount.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scheduleUid = scheduleUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobScheduleInfo]
  }
  @scala.inline
  implicit class AgentJobScheduleInfoOps[Self <: AgentJobScheduleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveEndTimeOfDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeEndTimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveStartTimeOfDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartTimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyRecurrenceFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyRecurrenceFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyRelativeIntervals(value: FrequencyRelativeIntervals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyRelativeIntervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencySubDayInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencySubDayInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencySubDayTypes(value: FrequencySubDayTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencySubDayTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyTypes(value: FrequencyTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleUid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

