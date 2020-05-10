package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobStepInfo extends js.Object {
  var appendLogToTable: Boolean = js.native
  var appendToLogFile: Boolean = js.native
  var appendToStepHist: Boolean = js.native
  var command: String = js.native
  var commandExecutionSuccessCode: Double = js.native
  var databaseName: String = js.native
  var databaseUserName: String = js.native
  var failStepId: Double = js.native
  var failureAction: StepCompletionAction = js.native
  var id: Double = js.native
  var jobId: String = js.native
  var jobName: String = js.native
  var outputFileName: String = js.native
  var proxyName: String = js.native
  var retryAttempts: Double = js.native
  var retryInterval: Double = js.native
  var script: String = js.native
  var scriptName: String = js.native
  var server: String = js.native
  var stepName: String = js.native
  var subSystem: AgentSubSystem = js.native
  var successAction: StepCompletionAction = js.native
  var successStepId: Double = js.native
  var writeLogToTable: Boolean = js.native
}

object AgentJobStepInfo {
  @scala.inline
  def apply(
    appendLogToTable: Boolean,
    appendToLogFile: Boolean,
    appendToStepHist: Boolean,
    command: String,
    commandExecutionSuccessCode: Double,
    databaseName: String,
    databaseUserName: String,
    failStepId: Double,
    failureAction: StepCompletionAction,
    id: Double,
    jobId: String,
    jobName: String,
    outputFileName: String,
    proxyName: String,
    retryAttempts: Double,
    retryInterval: Double,
    script: String,
    scriptName: String,
    server: String,
    stepName: String,
    subSystem: AgentSubSystem,
    successAction: StepCompletionAction,
    successStepId: Double,
    writeLogToTable: Boolean
  ): AgentJobStepInfo = {
    val __obj = js.Dynamic.literal(appendLogToTable = appendLogToTable.asInstanceOf[js.Any], appendToLogFile = appendToLogFile.asInstanceOf[js.Any], appendToStepHist = appendToStepHist.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandExecutionSuccessCode = commandExecutionSuccessCode.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], databaseUserName = databaseUserName.asInstanceOf[js.Any], failStepId = failStepId.asInstanceOf[js.Any], failureAction = failureAction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], outputFileName = outputFileName.asInstanceOf[js.Any], proxyName = proxyName.asInstanceOf[js.Any], retryAttempts = retryAttempts.asInstanceOf[js.Any], retryInterval = retryInterval.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], subSystem = subSystem.asInstanceOf[js.Any], successAction = successAction.asInstanceOf[js.Any], successStepId = successStepId.asInstanceOf[js.Any], writeLogToTable = writeLogToTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobStepInfo]
  }
  @scala.inline
  implicit class AgentJobStepInfoOps[Self <: AgentJobStepInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendLogToTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLogToTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendToLogFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToLogFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendToStepHist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToStepHist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandExecutionSuccessCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandExecutionSuccessCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailStepId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failStepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureAction(value: StepCompletionAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withOutputFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubSystem(value: AgentSubSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessAction(value: StepCompletionAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessStepId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteLogToTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeLogToTable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

