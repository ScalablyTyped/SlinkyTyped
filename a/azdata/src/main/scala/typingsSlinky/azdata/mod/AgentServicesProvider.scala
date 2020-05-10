package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentServicesProvider extends DataProvider {
  def createAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[CreateAgentAlertResult] = js.native
  def createJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[CreateAgentJobResult] = js.native
  def createJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[CreateAgentJobScheduleResult] = js.native
  // Job Step management methods
  def createJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[CreateAgentJobStepResult] = js.native
  def createNotebook(ownerUri: String, notebook: AgentNotebookInfo, templateFilePath: String): Thenable[CreateAgentNotebookResult] = js.native
  def createOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[CreateAgentOperatorResult] = js.native
  def createProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[CreateAgentOperatorResult] = js.native
  def deleteAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[ResultStatus] = js.native
  def deleteJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[ResultStatus] = js.native
  def deleteJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[ResultStatus] = js.native
  def deleteJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[ResultStatus] = js.native
  def deleteMaterializedNotebook(ownerUri: String, agentNotebookHistory: AgentNotebookHistoryInfo, targetDatabase: String): Thenable[ResultStatus] = js.native
  def deleteNotebook(ownerUri: String, notebook: AgentNotebookInfo): Thenable[ResultStatus] = js.native
  def deleteOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[ResultStatus] = js.native
  def deleteProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[ResultStatus] = js.native
  // Alert management methods
  def getAlerts(ownerUri: String): Thenable[AgentAlertsResult] = js.native
  // Credential method
  def getCredentials(ownerUri: String): Thenable[GetCredentialsResult] = js.native
  def getJobDefaults(ownerUri: String): Thenable[AgentJobDefaultsResult] = js.native
  def getJobHistory(ownerUri: String, jobId: String, jobName: String): Thenable[AgentJobHistoryResult] = js.native
  // Job Schedule management methods
  def getJobSchedules(ownerUri: String): Thenable[AgentJobSchedulesResult] = js.native
  // Job management methods
  def getJobs(ownerUri: String): Thenable[AgentJobsResult] = js.native
  def getMaterializedNotebook(ownerUri: String, targetDatabase: String, notebookMaterializedId: Double): Thenable[AgentNotebookMaterializedResult] = js.native
  def getNotebookHistory(ownerUri: String, jobId: String, jobName: String, targetDatabase: String): Thenable[AgentNotebookHistoryResult] = js.native
  // Notebook management methods
  def getNotebooks(ownerUri: String): Thenable[AgentNotebooksResult] = js.native
  // Operator management methods
  def getOperators(ownerUri: String): Thenable[AgentOperatorsResult] = js.native
  // Proxy management methods
  def getProxies(ownerUri: String): Thenable[AgentProxiesResult] = js.native
  def getTemplateNotebook(ownerUri: String, targetDatabase: String, jobId: String): Thenable[AgentNotebookTemplateResult] = js.native
  def jobAction(ownerUri: String, jobName: String, action: String): Thenable[ResultStatus] = js.native
  def registerOnUpdated(handler: js.Function0[_]): Unit = js.native
  def updateAlert(ownerUri: String, originalAlertName: String, alertInfo: AgentAlertInfo): Thenable[UpdateAgentAlertResult] = js.native
  def updateJob(ownerUri: String, originalJobName: String, jobInfo: AgentJobInfo): Thenable[UpdateAgentJobResult] = js.native
  def updateJobSchedule(ownerUri: String, originalScheduleName: String, scheduleInfo: AgentJobScheduleInfo): Thenable[UpdateAgentJobScheduleResult] = js.native
  def updateJobStep(ownerUri: String, originalJobStepName: String, stepInfo: AgentJobStepInfo): Thenable[UpdateAgentJobStepResult] = js.native
  def updateNotebook(
    ownerUri: String,
    originialNotebookName: String,
    notebook: AgentNotebookInfo,
    templateFilePath: String
  ): Thenable[UpdateAgentNotebookResult] = js.native
  def updateNotebookMaterializedName(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    name: String
  ): Thenable[ResultStatus] = js.native
  def updateNotebookMaterializedPin(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    pin: Boolean
  ): Thenable[ResultStatus] = js.native
  def updateOperator(ownerUri: String, originalOperatorName: String, operatorInfo: AgentOperatorInfo): Thenable[UpdateAgentOperatorResult] = js.native
  def updateProxy(ownerUri: String, originalProxyName: String, proxyInfo: AgentProxyInfo): Thenable[UpdateAgentOperatorResult] = js.native
}

object AgentServicesProvider {
  @scala.inline
  def apply(
    createAlert: (String, AgentAlertInfo) => Thenable[CreateAgentAlertResult],
    createJob: (String, AgentJobInfo) => Thenable[CreateAgentJobResult],
    createJobSchedule: (String, AgentJobScheduleInfo) => Thenable[CreateAgentJobScheduleResult],
    createJobStep: (String, AgentJobStepInfo) => Thenable[CreateAgentJobStepResult],
    createNotebook: (String, AgentNotebookInfo, String) => Thenable[CreateAgentNotebookResult],
    createOperator: (String, AgentOperatorInfo) => Thenable[CreateAgentOperatorResult],
    createProxy: (String, AgentProxyInfo) => Thenable[CreateAgentOperatorResult],
    deleteAlert: (String, AgentAlertInfo) => Thenable[ResultStatus],
    deleteJob: (String, AgentJobInfo) => Thenable[ResultStatus],
    deleteJobSchedule: (String, AgentJobScheduleInfo) => Thenable[ResultStatus],
    deleteJobStep: (String, AgentJobStepInfo) => Thenable[ResultStatus],
    deleteMaterializedNotebook: (String, AgentNotebookHistoryInfo, String) => Thenable[ResultStatus],
    deleteNotebook: (String, AgentNotebookInfo) => Thenable[ResultStatus],
    deleteOperator: (String, AgentOperatorInfo) => Thenable[ResultStatus],
    deleteProxy: (String, AgentProxyInfo) => Thenable[ResultStatus],
    getAlerts: String => Thenable[AgentAlertsResult],
    getCredentials: String => Thenable[GetCredentialsResult],
    getJobDefaults: String => Thenable[AgentJobDefaultsResult],
    getJobHistory: (String, String, String) => Thenable[AgentJobHistoryResult],
    getJobSchedules: String => Thenable[AgentJobSchedulesResult],
    getJobs: String => Thenable[AgentJobsResult],
    getMaterializedNotebook: (String, String, Double) => Thenable[AgentNotebookMaterializedResult],
    getNotebookHistory: (String, String, String, String) => Thenable[AgentNotebookHistoryResult],
    getNotebooks: String => Thenable[AgentNotebooksResult],
    getOperators: String => Thenable[AgentOperatorsResult],
    getProxies: String => Thenable[AgentProxiesResult],
    getTemplateNotebook: (String, String, String) => Thenable[AgentNotebookTemplateResult],
    jobAction: (String, String, String) => Thenable[ResultStatus],
    providerId: String,
    registerOnUpdated: js.Function0[_] => Unit,
    updateAlert: (String, String, AgentAlertInfo) => Thenable[UpdateAgentAlertResult],
    updateJob: (String, String, AgentJobInfo) => Thenable[UpdateAgentJobResult],
    updateJobSchedule: (String, String, AgentJobScheduleInfo) => Thenable[UpdateAgentJobScheduleResult],
    updateJobStep: (String, String, AgentJobStepInfo) => Thenable[UpdateAgentJobStepResult],
    updateNotebook: (String, String, AgentNotebookInfo, String) => Thenable[UpdateAgentNotebookResult],
    updateNotebookMaterializedName: (String, AgentNotebookHistoryInfo, String, String) => Thenable[ResultStatus],
    updateNotebookMaterializedPin: (String, AgentNotebookHistoryInfo, String, Boolean) => Thenable[ResultStatus],
    updateOperator: (String, String, AgentOperatorInfo) => Thenable[UpdateAgentOperatorResult],
    updateProxy: (String, String, AgentProxyInfo) => Thenable[UpdateAgentOperatorResult]
  ): AgentServicesProvider = {
    val __obj = js.Dynamic.literal(createAlert = js.Any.fromFunction2(createAlert), createJob = js.Any.fromFunction2(createJob), createJobSchedule = js.Any.fromFunction2(createJobSchedule), createJobStep = js.Any.fromFunction2(createJobStep), createNotebook = js.Any.fromFunction3(createNotebook), createOperator = js.Any.fromFunction2(createOperator), createProxy = js.Any.fromFunction2(createProxy), deleteAlert = js.Any.fromFunction2(deleteAlert), deleteJob = js.Any.fromFunction2(deleteJob), deleteJobSchedule = js.Any.fromFunction2(deleteJobSchedule), deleteJobStep = js.Any.fromFunction2(deleteJobStep), deleteMaterializedNotebook = js.Any.fromFunction3(deleteMaterializedNotebook), deleteNotebook = js.Any.fromFunction2(deleteNotebook), deleteOperator = js.Any.fromFunction2(deleteOperator), deleteProxy = js.Any.fromFunction2(deleteProxy), getAlerts = js.Any.fromFunction1(getAlerts), getCredentials = js.Any.fromFunction1(getCredentials), getJobDefaults = js.Any.fromFunction1(getJobDefaults), getJobHistory = js.Any.fromFunction3(getJobHistory), getJobSchedules = js.Any.fromFunction1(getJobSchedules), getJobs = js.Any.fromFunction1(getJobs), getMaterializedNotebook = js.Any.fromFunction3(getMaterializedNotebook), getNotebookHistory = js.Any.fromFunction4(getNotebookHistory), getNotebooks = js.Any.fromFunction1(getNotebooks), getOperators = js.Any.fromFunction1(getOperators), getProxies = js.Any.fromFunction1(getProxies), getTemplateNotebook = js.Any.fromFunction3(getTemplateNotebook), jobAction = js.Any.fromFunction3(jobAction), providerId = providerId.asInstanceOf[js.Any], registerOnUpdated = js.Any.fromFunction1(registerOnUpdated), updateAlert = js.Any.fromFunction3(updateAlert), updateJob = js.Any.fromFunction3(updateJob), updateJobSchedule = js.Any.fromFunction3(updateJobSchedule), updateJobStep = js.Any.fromFunction3(updateJobStep), updateNotebook = js.Any.fromFunction4(updateNotebook), updateNotebookMaterializedName = js.Any.fromFunction4(updateNotebookMaterializedName), updateNotebookMaterializedPin = js.Any.fromFunction4(updateNotebookMaterializedPin), updateOperator = js.Any.fromFunction3(updateOperator), updateProxy = js.Any.fromFunction3(updateProxy))
    __obj.asInstanceOf[AgentServicesProvider]
  }
  @scala.inline
  implicit class AgentServicesProviderOps[Self <: AgentServicesProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAlert(value: (String, AgentAlertInfo) => Thenable[CreateAgentAlertResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAlert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateJob(value: (String, AgentJobInfo) => Thenable[CreateAgentJobResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateJobSchedule(value: (String, AgentJobScheduleInfo) => Thenable[CreateAgentJobScheduleResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJobSchedule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateJobStep(value: (String, AgentJobStepInfo) => Thenable[CreateAgentJobStepResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJobStep")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateNotebook(value: (String, AgentNotebookInfo, String) => Thenable[CreateAgentNotebookResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNotebook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateOperator(value: (String, AgentOperatorInfo) => Thenable[CreateAgentOperatorResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOperator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateProxy(value: (String, AgentProxyInfo) => Thenable[CreateAgentOperatorResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProxy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteAlert(value: (String, AgentAlertInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAlert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteJob(value: (String, AgentJobInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteJob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteJobSchedule(value: (String, AgentJobScheduleInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteJobSchedule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteJobStep(value: (String, AgentJobStepInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteJobStep")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteMaterializedNotebook(value: (String, AgentNotebookHistoryInfo, String) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMaterializedNotebook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDeleteNotebook(value: (String, AgentNotebookInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteNotebook")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteOperator(value: (String, AgentOperatorInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOperator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteProxy(value: (String, AgentProxyInfo) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProxy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAlerts(value: String => Thenable[AgentAlertsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlerts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCredentials(value: String => Thenable[GetCredentialsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCredentials")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJobDefaults(value: String => Thenable[AgentJobDefaultsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJobDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJobHistory(value: (String, String, String) => Thenable[AgentJobHistoryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJobHistory")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetJobSchedules(value: String => Thenable[AgentJobSchedulesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJobSchedules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJobs(value: String => Thenable[AgentJobsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJobs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMaterializedNotebook(value: (String, String, Double) => Thenable[AgentNotebookMaterializedResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaterializedNotebook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNotebookHistory(value: (String, String, String, String) => Thenable[AgentNotebookHistoryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNotebookHistory")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetNotebooks(value: String => Thenable[AgentNotebooksResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNotebooks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOperators(value: String => Thenable[AgentOperatorsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOperators")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProxies(value: String => Thenable[AgentProxiesResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTemplateNotebook(value: (String, String, String) => Thenable[AgentNotebookTemplateResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplateNotebook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withJobAction(value: (String, String, String) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobAction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegisterOnUpdated(value: js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAlert(value: (String, String, AgentAlertInfo) => Thenable[UpdateAgentAlertResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAlert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateJob(value: (String, String, AgentJobInfo) => Thenable[UpdateAgentJobResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateJob")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateJobSchedule(value: (String, String, AgentJobScheduleInfo) => Thenable[UpdateAgentJobScheduleResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateJobSchedule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateJobStep(value: (String, String, AgentJobStepInfo) => Thenable[UpdateAgentJobStepResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateJobStep")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateNotebook(value: (String, String, AgentNotebookInfo, String) => Thenable[UpdateAgentNotebookResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNotebook")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateNotebookMaterializedName(value: (String, AgentNotebookHistoryInfo, String, String) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNotebookMaterializedName")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateNotebookMaterializedPin(value: (String, AgentNotebookHistoryInfo, String, Boolean) => Thenable[ResultStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNotebookMaterializedPin")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateOperator(value: (String, String, AgentOperatorInfo) => Thenable[UpdateAgentOperatorResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOperator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateProxy(value: (String, String, AgentProxyInfo) => Thenable[UpdateAgentOperatorResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProxy")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

