package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelWorkflowRun extends js.Object {
  var cancelWorkflowRun: Method = js.native
  var createOrUpdateSecretForRepo: Params = js.native
  var createRegistrationToken: Url = js.native
  var createRemoveToken: Url = js.native
  var deleteArtifact: MethodParams = js.native
  var deleteSecretFromRepo: ParamsUrl = js.native
  var downloadArtifact: MethodParamsUrl = js.native
  var getArtifact: MethodParams = js.native
  var getPublicKey: Url = js.native
  var getSecret: MethodString = js.native
  var getSelfHostedRunner: ParamsRunnerid = js.native
  var getWorkflow: ParamsWorkflowid = js.native
  var getWorkflowJob: ParamsJobid = js.native
  var getWorkflowRun: Method = js.native
  var listDownloadsForSelfHostedRunnerApplication: Url = js.native
  var listJobsForWorkflowRun: ParamsPerpage = js.native
  var listRepoWorkflowRuns: ParamsActor = js.native
  var listRepoWorkflows: ParamsOwnerPage = js.native
  var listSecretsForRepo: ParamsOwnerPage = js.native
  var listSelfHostedRunnersForRepo: ParamsOwnerPage = js.native
  var listWorkflowJobLogs: ParamsJobidOwner = js.native
  var listWorkflowRunArtifacts: ParamsPerpage = js.native
  var listWorkflowRunLogs: ParamsPerpage = js.native
  var listWorkflowRuns: ParamsBranch = js.native
  var reRunWorkflow: Method = js.native
  var removeSelfHostedRunner: ParamsRunnerid = js.native
}

object CancelWorkflowRun {
  @scala.inline
  def apply(
    cancelWorkflowRun: Method,
    createOrUpdateSecretForRepo: Params,
    createRegistrationToken: Url,
    createRemoveToken: Url,
    deleteArtifact: MethodParams,
    deleteSecretFromRepo: ParamsUrl,
    downloadArtifact: MethodParamsUrl,
    getArtifact: MethodParams,
    getPublicKey: Url,
    getSecret: MethodString,
    getSelfHostedRunner: ParamsRunnerid,
    getWorkflow: ParamsWorkflowid,
    getWorkflowJob: ParamsJobid,
    getWorkflowRun: Method,
    listDownloadsForSelfHostedRunnerApplication: Url,
    listJobsForWorkflowRun: ParamsPerpage,
    listRepoWorkflowRuns: ParamsActor,
    listRepoWorkflows: ParamsOwnerPage,
    listSecretsForRepo: ParamsOwnerPage,
    listSelfHostedRunnersForRepo: ParamsOwnerPage,
    listWorkflowJobLogs: ParamsJobidOwner,
    listWorkflowRunArtifacts: ParamsPerpage,
    listWorkflowRunLogs: ParamsPerpage,
    listWorkflowRuns: ParamsBranch,
    reRunWorkflow: Method,
    removeSelfHostedRunner: ParamsRunnerid
  ): CancelWorkflowRun = {
    val __obj = js.Dynamic.literal(cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createOrUpdateSecretForRepo = createOrUpdateSecretForRepo.asInstanceOf[js.Any], createRegistrationToken = createRegistrationToken.asInstanceOf[js.Any], createRemoveToken = createRemoveToken.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteSecretFromRepo = deleteSecretFromRepo.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], getSecret = getSecret.asInstanceOf[js.Any], getSelfHostedRunner = getSelfHostedRunner.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowJob = getWorkflowJob.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], listDownloadsForSelfHostedRunnerApplication = listDownloadsForSelfHostedRunnerApplication.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listRepoWorkflowRuns = listRepoWorkflowRuns.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listSecretsForRepo = listSecretsForRepo.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowJobLogs = listWorkflowJobLogs.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRunLogs = listWorkflowRunLogs.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], removeSelfHostedRunner = removeSelfHostedRunner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWorkflowRun]
  }
  @scala.inline
  implicit class CancelWorkflowRunOps[Self <: CancelWorkflowRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelWorkflowRun(value: Method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateOrUpdateSecretForRepo(value: Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdateSecretForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRegistrationToken(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRegistrationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRemoveToken(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRemoveToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArtifact(value: MethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteSecretFromRepo(value: ParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSecretFromRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadArtifact(value: MethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArtifact(value: MethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArtifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPublicKey(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSecret(value: MethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSelfHostedRunner(value: ParamsRunnerid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelfHostedRunner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflow(value: ParamsWorkflowid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflowJob(value: ParamsJobid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflowJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorkflowRun(value: Method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDownloadsForSelfHostedRunnerApplication(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDownloadsForSelfHostedRunnerApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListJobsForWorkflowRun(value: ParamsPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listJobsForWorkflowRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoWorkflowRuns(value: ParamsActor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoWorkflowRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepoWorkflows(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepoWorkflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSecretsForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSecretsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSelfHostedRunnersForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelfHostedRunnersForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowJobLogs(value: ParamsJobidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowJobLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRunArtifacts(value: ParamsPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRunArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRunLogs(value: ParamsPerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRunLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWorkflowRuns(value: ParamsBranch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWorkflowRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReRunWorkflow(value: Method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reRunWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSelfHostedRunner(value: ParamsRunnerid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelfHostedRunner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

