package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelWorkflowRun extends js.Object {
  var cancelWorkflowRun: AnonMethod = js.native
  var createOrUpdateSecretForRepo: AnonParams = js.native
  var createRegistrationToken: AnonUrl = js.native
  var createRemoveToken: AnonUrl = js.native
  var deleteArtifact: AnonMethodParams = js.native
  var deleteSecretFromRepo: AnonParamsUrl = js.native
  var downloadArtifact: AnonMethodParamsUrl = js.native
  var getArtifact: AnonMethodParams = js.native
  var getPublicKey: AnonUrl = js.native
  var getSecret: AnonMethodString = js.native
  var getSelfHostedRunner: AnonParamsAnonRunnerid = js.native
  var getWorkflow: AnonParamsAnonWorkflowid = js.native
  var getWorkflowJob: AnonParamsAnonJobid = js.native
  var getWorkflowRun: AnonMethod = js.native
  var listDownloadsForSelfHostedRunnerApplication: AnonUrl = js.native
  var listJobsForWorkflowRun: AnonParamsAnonPerpage = js.native
  var listRepoWorkflowRuns: AnonParamsAnonActor = js.native
  var listRepoWorkflows: AnonParamsAnonOwnerPage = js.native
  var listSecretsForRepo: AnonParamsAnonOwnerPage = js.native
  var listSelfHostedRunnersForRepo: AnonParamsAnonOwnerPage = js.native
  var listWorkflowJobLogs: AnonParamsAnonJobidOwner = js.native
  var listWorkflowRunArtifacts: AnonParamsAnonPerpage = js.native
  var listWorkflowRunLogs: AnonParamsAnonPerpage = js.native
  var listWorkflowRuns: AnonParamsAnonBranch = js.native
  var reRunWorkflow: AnonMethod = js.native
  var removeSelfHostedRunner: AnonParamsAnonRunnerid = js.native
}

object AnonCancelWorkflowRun {
  @scala.inline
  def apply(
    cancelWorkflowRun: AnonMethod,
    createOrUpdateSecretForRepo: AnonParams,
    createRegistrationToken: AnonUrl,
    createRemoveToken: AnonUrl,
    deleteArtifact: AnonMethodParams,
    deleteSecretFromRepo: AnonParamsUrl,
    downloadArtifact: AnonMethodParamsUrl,
    getArtifact: AnonMethodParams,
    getPublicKey: AnonUrl,
    getSecret: AnonMethodString,
    getSelfHostedRunner: AnonParamsAnonRunnerid,
    getWorkflow: AnonParamsAnonWorkflowid,
    getWorkflowJob: AnonParamsAnonJobid,
    getWorkflowRun: AnonMethod,
    listDownloadsForSelfHostedRunnerApplication: AnonUrl,
    listJobsForWorkflowRun: AnonParamsAnonPerpage,
    listRepoWorkflowRuns: AnonParamsAnonActor,
    listRepoWorkflows: AnonParamsAnonOwnerPage,
    listSecretsForRepo: AnonParamsAnonOwnerPage,
    listSelfHostedRunnersForRepo: AnonParamsAnonOwnerPage,
    listWorkflowJobLogs: AnonParamsAnonJobidOwner,
    listWorkflowRunArtifacts: AnonParamsAnonPerpage,
    listWorkflowRunLogs: AnonParamsAnonPerpage,
    listWorkflowRuns: AnonParamsAnonBranch,
    reRunWorkflow: AnonMethod,
    removeSelfHostedRunner: AnonParamsAnonRunnerid
  ): AnonCancelWorkflowRun = {
    val __obj = js.Dynamic.literal(cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createOrUpdateSecretForRepo = createOrUpdateSecretForRepo.asInstanceOf[js.Any], createRegistrationToken = createRegistrationToken.asInstanceOf[js.Any], createRemoveToken = createRemoveToken.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteSecretFromRepo = deleteSecretFromRepo.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], getSecret = getSecret.asInstanceOf[js.Any], getSelfHostedRunner = getSelfHostedRunner.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowJob = getWorkflowJob.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], listDownloadsForSelfHostedRunnerApplication = listDownloadsForSelfHostedRunnerApplication.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listRepoWorkflowRuns = listRepoWorkflowRuns.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listSecretsForRepo = listSecretsForRepo.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowJobLogs = listWorkflowJobLogs.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRunLogs = listWorkflowRunLogs.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], removeSelfHostedRunner = removeSelfHostedRunner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelWorkflowRun]
  }
  @scala.inline
  implicit class AnonCancelWorkflowRunOps[Self <: AnonCancelWorkflowRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelWorkflowRun(value: AnonMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateOrUpdateSecretForRepo(value: AnonParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdateSecretForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRegistrationToken(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRegistrationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRemoveToken(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRemoveToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArtifact(value: AnonMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteSecretFromRepo(value: AnonParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSecretFromRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadArtifact(value: AnonMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArtifact(value: AnonMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPublicKey(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSecret(value: AnonMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSelfHostedRunner(value: AnonParamsAnonRunnerid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelfHostedRunner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflow(value: AnonParamsAnonWorkflowid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflowJob(value: AnonParamsAnonJobid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflowJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflowRun(value: AnonMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDownloadsForSelfHostedRunnerApplication(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDownloadsForSelfHostedRunnerApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListJobsForWorkflowRun(value: AnonParamsAnonPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listJobsForWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoWorkflowRuns(value: AnonParamsAnonActor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoWorkflowRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoWorkflows(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoWorkflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSecretsForRepo(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSecretsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSelfHostedRunnersForRepo(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelfHostedRunnersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowJobLogs(value: AnonParamsAnonJobidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowJobLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRunArtifacts(value: AnonParamsAnonPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRunArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRunLogs(value: AnonParamsAnonPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRunLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRuns(value: AnonParamsAnonBranch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReRunWorkflow(value: AnonMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reRunWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSelfHostedRunner(value: AnonParamsAnonRunnerid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelfHostedRunner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

