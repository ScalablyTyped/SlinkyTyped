package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobStep extends js.Object {
  var jobId: String = js.native
  var message: String = js.native
  var runDate: String = js.native
  var runStatus: Double = js.native
  var stepDetails: AgentJobStepInfo = js.native
  var stepId: String = js.native
  var stepName: String = js.native
}

object AgentJobStep {
  @scala.inline
  def apply(
    jobId: String,
    message: String,
    runDate: String,
    runStatus: Double,
    stepDetails: AgentJobStepInfo,
    stepId: String,
    stepName: String
  ): AgentJobStep = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], stepDetails = stepDetails.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobStep]
  }
  @scala.inline
  implicit class AgentJobStepOps[Self <: AgentJobStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDetails(value: AgentJobStepInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

