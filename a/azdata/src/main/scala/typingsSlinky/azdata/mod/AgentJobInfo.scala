package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobInfo extends js.Object {
  var alerts: js.Array[AgentAlertInfo] = js.native
  var category: String = js.native
  var categoryId: Double = js.native
  var categoryType: Double = js.native
  var currentExecutionStatus: Double = js.native
  var currentExecutionStep: String = js.native
  var deleteLevel: JobCompletionActionCondition = js.native
  var description: String = js.native
  var emailLevel: JobCompletionActionCondition = js.native
  var enabled: Boolean = js.native
  var eventLogLevel: JobCompletionActionCondition = js.native
  var hasSchedule: Boolean = js.native
  var hasStep: Boolean = js.native
  var hasTarget: Boolean = js.native
  var jobId: String = js.native
  var jobSchedules: js.Array[AgentJobScheduleInfo] = js.native
  var jobSteps: js.Array[AgentJobStepInfo] = js.native
  var lastRun: String = js.native
  var lastRunOutcome: Double = js.native
  var name: String = js.native
  var nextRun: String = js.native
  var operatorToEmail: String = js.native
  var operatorToPage: String = js.native
  var owner: String = js.native
  var pageLevel: JobCompletionActionCondition = js.native
  var runnable: Boolean = js.native
  var startStepId: Double = js.native
}

object AgentJobInfo {
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    category: String,
    categoryId: Double,
    categoryType: Double,
    currentExecutionStatus: Double,
    currentExecutionStep: String,
    deleteLevel: JobCompletionActionCondition,
    description: String,
    emailLevel: JobCompletionActionCondition,
    enabled: Boolean,
    eventLogLevel: JobCompletionActionCondition,
    hasSchedule: Boolean,
    hasStep: Boolean,
    hasTarget: Boolean,
    jobId: String,
    jobSchedules: js.Array[AgentJobScheduleInfo],
    jobSteps: js.Array[AgentJobStepInfo],
    lastRun: String,
    lastRunOutcome: Double,
    name: String,
    nextRun: String,
    operatorToEmail: String,
    operatorToPage: String,
    owner: String,
    pageLevel: JobCompletionActionCondition,
    runnable: Boolean,
    startStepId: Double
  ): AgentJobInfo = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryId = categoryId.asInstanceOf[js.Any], categoryType = categoryType.asInstanceOf[js.Any], currentExecutionStatus = currentExecutionStatus.asInstanceOf[js.Any], currentExecutionStep = currentExecutionStep.asInstanceOf[js.Any], deleteLevel = deleteLevel.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emailLevel = emailLevel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventLogLevel = eventLogLevel.asInstanceOf[js.Any], hasSchedule = hasSchedule.asInstanceOf[js.Any], hasStep = hasStep.asInstanceOf[js.Any], hasTarget = hasTarget.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobSchedules = jobSchedules.asInstanceOf[js.Any], jobSteps = jobSteps.asInstanceOf[js.Any], lastRun = lastRun.asInstanceOf[js.Any], lastRunOutcome = lastRunOutcome.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextRun = nextRun.asInstanceOf[js.Any], operatorToEmail = operatorToEmail.asInstanceOf[js.Any], operatorToPage = operatorToPage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pageLevel = pageLevel.asInstanceOf[js.Any], runnable = runnable.asInstanceOf[js.Any], startStepId = startStepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobInfo]
  }
  @scala.inline
  implicit class AgentJobInfoOps[Self <: AgentJobInfo] (val x: Self) extends AnyVal {
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
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentExecutionStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentExecutionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentExecutionStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentExecutionStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteLevel(value: JobCompletionActionCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailLevel(value: JobCompletionActionCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventLogLevel(value: JobCompletionActionCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSchedule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobSchedules(value: js.Array[AgentJobScheduleInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobSchedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobSteps(value: js.Array[AgentJobStepInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRunOutcome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRunOutcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextRun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorToEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorToEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorToPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLevel(value: JobCompletionActionCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartStepId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStepId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

