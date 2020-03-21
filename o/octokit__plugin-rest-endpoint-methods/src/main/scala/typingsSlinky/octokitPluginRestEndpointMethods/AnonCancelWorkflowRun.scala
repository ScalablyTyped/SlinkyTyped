package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelWorkflowRun extends js.Object {
  var cancelWorkflowRun: AnonMethod
  var createOrUpdateSecretForRepo: AnonParams
  var createRegistrationToken: AnonUrl
  var createRemoveToken: AnonUrl
  var deleteArtifact: AnonMethodParams
  var deleteSecretFromRepo: AnonParamsUrl
  var downloadArtifact: AnonMethodParamsUrl
  var getArtifact: AnonMethodParams
  var getPublicKey: AnonUrl
  var getSecret: AnonMethodString
  var getSelfHostedRunner: AnonParamsAnonRunnerid
  var getWorkflow: AnonParamsAnonWorkflowid
  var getWorkflowJob: AnonParamsAnonJobid
  var getWorkflowRun: AnonMethod
  var listDownloadsForSelfHostedRunnerApplication: AnonUrl
  var listJobsForWorkflowRun: AnonParamsAnonPerpage
  var listRepoWorkflowRuns: AnonParamsAnonActor
  var listRepoWorkflows: AnonParamsAnonOwnerPage
  var listSecretsForRepo: AnonParamsAnonOwnerPage
  var listSelfHostedRunnersForRepo: AnonParamsAnonOwnerPage
  var listWorkflowJobLogs: AnonParamsAnonJobidOwner
  var listWorkflowRunArtifacts: AnonParamsAnonPerpage
  var listWorkflowRunLogs: AnonParamsAnonPerpage
  var listWorkflowRuns: AnonParamsAnonBranch
  var reRunWorkflow: AnonMethod
  var removeSelfHostedRunner: AnonParamsAnonRunnerid
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
}

