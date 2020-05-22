package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelWorkflowRun extends js.Object {
  var cancelWorkflowRun: Method
  var createOrUpdateSecretForRepo: Params
  var createRegistrationToken: Url
  var createRemoveToken: Url
  var deleteArtifact: MethodParams
  var deleteSecretFromRepo: ParamsUrl
  var downloadArtifact: MethodParamsUrl
  var getArtifact: MethodParams
  var getPublicKey: Url
  var getSecret: MethodString
  var getSelfHostedRunner: ParamsRunnerid
  var getWorkflow: ParamsWorkflowid
  var getWorkflowJob: ParamsJobid
  var getWorkflowRun: Method
  var listDownloadsForSelfHostedRunnerApplication: Url
  var listJobsForWorkflowRun: ParamsPerpage
  var listRepoWorkflowRuns: ParamsActor
  var listRepoWorkflows: ParamsOwnerPage
  var listSecretsForRepo: ParamsOwnerPage
  var listSelfHostedRunnersForRepo: ParamsOwnerPage
  var listWorkflowJobLogs: ParamsJobidOwner
  var listWorkflowRunArtifacts: ParamsPerpage
  var listWorkflowRunLogs: ParamsPerpage
  var listWorkflowRuns: ParamsBranch
  var reRunWorkflow: Method
  var removeSelfHostedRunner: ParamsRunnerid
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
}

