package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobHistoryInfo extends js.Object {
  var instanceId: Double = js.native
  var jobId: String = js.native
  var jobName: String = js.native
  var message: String = js.native
  var operatorEmailed: String = js.native
  var operatorNetsent: String = js.native
  var operatorPaged: String = js.native
  var retriesAttempted: String = js.native
  var runDate: String = js.native
  var runDuration: String = js.native
  var runStatus: Double = js.native
  var server: String = js.native
  var sqlMessageId: String = js.native
  var sqlSeverity: String = js.native
  var stepId: String = js.native
  var stepName: String = js.native
  var steps: js.Array[AgentJobStep] = js.native
}

object AgentJobHistoryInfo {
  @scala.inline
  def apply(
    instanceId: Double,
    jobId: String,
    jobName: String,
    message: String,
    operatorEmailed: String,
    operatorNetsent: String,
    operatorPaged: String,
    retriesAttempted: String,
    runDate: String,
    runDuration: String,
    runStatus: Double,
    server: String,
    sqlMessageId: String,
    sqlSeverity: String,
    stepId: String,
    stepName: String,
    steps: js.Array[AgentJobStep]
  ): AgentJobHistoryInfo = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operatorEmailed = operatorEmailed.asInstanceOf[js.Any], operatorNetsent = operatorNetsent.asInstanceOf[js.Any], operatorPaged = operatorPaged.asInstanceOf[js.Any], retriesAttempted = retriesAttempted.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runDuration = runDuration.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sqlMessageId = sqlMessageId.asInstanceOf[js.Any], sqlSeverity = sqlSeverity.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobHistoryInfo]
  }
  @scala.inline
  implicit class AgentJobHistoryInfoOps[Self <: AgentJobHistoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorEmailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorEmailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorNetsent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorNetsent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorPaged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorPaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetriesAttempted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retriesAttempted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlSeverity")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSteps(value: js.Array[AgentJobStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

