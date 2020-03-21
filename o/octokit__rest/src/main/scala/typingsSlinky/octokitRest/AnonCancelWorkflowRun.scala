package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.ActionsCancelWorkflowRunParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsCreateOrUpdateSecretForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsCreateRegistrationTokenParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsCreateRegistrationTokenResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsCreateRemoveTokenParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsCreateRemoveTokenResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsDeleteArtifactParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsDeleteSecretFromRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsDownloadArtifactParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetArtifactParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetArtifactResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetPublicKeyParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetPublicKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetSecretParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetSecretResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetSelfHostedRunnerParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetSelfHostedRunnerResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowJobParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowJobResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowRunParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsGetWorkflowRunResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListJobsForWorkflowRunParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListJobsForWorkflowRunResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListRepoWorkflowRunsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListRepoWorkflowRunsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListRepoWorkflowsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListRepoWorkflowsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListSecretsForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListSecretsForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowJobLogsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowRunArtifactsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowRunArtifactsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowRunLogsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowRunsParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsListWorkflowRunsResponse
import typingsSlinky.octokitRest.mod.Octokit.ActionsReRunWorkflowParams
import typingsSlinky.octokitRest.mod.Octokit.ActionsRemoveSelfHostedRunnerParams
import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelWorkflowRun extends js.Object {
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: AnonCall = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  @JSName("createOrUpdateSecretForRepo")
  var createOrUpdateSecretForRepo_Original: AnonEndpoint = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  @JSName("createRegistrationToken")
  var createRegistrationToken_Original: AnonCallEndpoint = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  @JSName("createRemoveToken")
  var createRemoveToken_Original: AnonCallParams = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: AnonEndpointEndpoint = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("deleteSecretFromRepo")
  var deleteSecretFromRepo_Original: AnonCallParamsEndpointEndpoint = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: Anon0 = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: Anon1 = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon2 = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getSecret")
  var getSecret_Original: Anon3 = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("getSelfHostedRunner")
  var getSelfHostedRunner_Original: Anon4 = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowJob")
  var getWorkflowJob_Original: Anon6 = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: Anon7 = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: Anon5 = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listDownloadsForSelfHostedRunnerApplication")
  var listDownloadsForSelfHostedRunnerApplication_Original: Anon8 = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: Anon9 = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflowRuns")
  var listRepoWorkflowRuns_Original: Anon10 = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: Anon11 = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("listSecretsForRepo")
  var listSecretsForRepo_Original: Anon12 = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: Anon13 = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowJobLogs")
  var listWorkflowJobLogs_Original: Anon14 = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: Anon15 = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowRunLogs")
  var listWorkflowRunLogs_Original: Anon16 = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: Anon17 = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: Anon18 = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("removeSelfHostedRunner")
  var removeSelfHostedRunner_Original: Anon19 = js.native
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[AnyResponse] = js.native
  def cancelWorkflowRun(params: RequestOptions with ActionsCancelWorkflowRunParams): js.Promise[AnyResponse] = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  def createOrUpdateSecretForRepo(): js.Promise[AnyResponse] = js.native
  def createOrUpdateSecretForRepo(params: RequestOptions with ActionsCreateOrUpdateSecretForRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  def createRegistrationToken(): js.Promise[Response[ActionsCreateRegistrationTokenResponse]] = js.native
  def createRegistrationToken(params: RequestOptions with ActionsCreateRegistrationTokenParams): js.Promise[Response[ActionsCreateRegistrationTokenResponse]] = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  def createRemoveToken(): js.Promise[Response[ActionsCreateRemoveTokenResponse]] = js.native
  def createRemoveToken(params: RequestOptions with ActionsCreateRemoveTokenParams): js.Promise[Response[ActionsCreateRemoveTokenResponse]] = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[AnyResponse] = js.native
  def deleteArtifact(params: RequestOptions with ActionsDeleteArtifactParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def deleteSecretFromRepo(): js.Promise[AnyResponse] = js.native
  def deleteSecretFromRepo(params: RequestOptions with ActionsDeleteSecretFromRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadArtifact(): js.Promise[AnyResponse] = js.native
  def downloadArtifact(params: RequestOptions with ActionsDownloadArtifactParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[Response[ActionsGetArtifactResponse]] = js.native
  def getArtifact(params: RequestOptions with ActionsGetArtifactParams): js.Promise[Response[ActionsGetArtifactResponse]] = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getPublicKey(): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  def getPublicKey(params: RequestOptions with ActionsGetPublicKeyParams): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getSecret(): js.Promise[Response[ActionsGetSecretResponse]] = js.native
  def getSecret(params: RequestOptions with ActionsGetSecretParams): js.Promise[Response[ActionsGetSecretResponse]] = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def getSelfHostedRunner(): js.Promise[Response[ActionsGetSelfHostedRunnerResponse]] = js.native
  def getSelfHostedRunner(params: RequestOptions with ActionsGetSelfHostedRunnerParams): js.Promise[Response[ActionsGetSelfHostedRunnerResponse]] = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[Response[ActionsGetWorkflowResponse]] = js.native
  def getWorkflow(params: RequestOptions with ActionsGetWorkflowParams): js.Promise[Response[ActionsGetWorkflowResponse]] = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowJob(): js.Promise[Response[ActionsGetWorkflowJobResponse]] = js.native
  def getWorkflowJob(params: RequestOptions with ActionsGetWorkflowJobParams): js.Promise[Response[ActionsGetWorkflowJobResponse]] = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[Response[ActionsGetWorkflowRunResponse]] = js.native
  def getWorkflowRun(params: RequestOptions with ActionsGetWorkflowRunParams): js.Promise[Response[ActionsGetWorkflowRunResponse]] = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listDownloadsForSelfHostedRunnerApplication(): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  def listDownloadsForSelfHostedRunnerApplication(params: RequestOptions with ActionsListDownloadsForSelfHostedRunnerApplicationParams): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listJobsForWorkflowRun(): js.Promise[Response[ActionsListJobsForWorkflowRunResponse]] = js.native
  def listJobsForWorkflowRun(params: RequestOptions with ActionsListJobsForWorkflowRunParams): js.Promise[Response[ActionsListJobsForWorkflowRunResponse]] = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflowRuns(): js.Promise[Response[ActionsListRepoWorkflowRunsResponse]] = js.native
  def listRepoWorkflowRuns(params: RequestOptions with ActionsListRepoWorkflowRunsParams): js.Promise[Response[ActionsListRepoWorkflowRunsResponse]] = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[Response[ActionsListRepoWorkflowsResponse]] = js.native
  def listRepoWorkflows(params: RequestOptions with ActionsListRepoWorkflowsParams): js.Promise[Response[ActionsListRepoWorkflowsResponse]] = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def listSecretsForRepo(): js.Promise[Response[ActionsListSecretsForRepoResponse]] = js.native
  def listSecretsForRepo(params: RequestOptions with ActionsListSecretsForRepoParams): js.Promise[Response[ActionsListSecretsForRepoResponse]] = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[Response[ActionsListSelfHostedRunnersForRepoResponse]] = js.native
  def listSelfHostedRunnersForRepo(params: RequestOptions with ActionsListSelfHostedRunnersForRepoParams): js.Promise[Response[ActionsListSelfHostedRunnersForRepoResponse]] = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowJobLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowJobLogs(params: RequestOptions with ActionsListWorkflowJobLogsParams): js.Promise[AnyResponse] = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[Response[ActionsListWorkflowRunArtifactsResponse]] = js.native
  def listWorkflowRunArtifacts(params: RequestOptions with ActionsListWorkflowRunArtifactsParams): js.Promise[Response[ActionsListWorkflowRunArtifactsResponse]] = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowRunLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowRunLogs(params: RequestOptions with ActionsListWorkflowRunLogsParams): js.Promise[AnyResponse] = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  def listWorkflowRuns(): js.Promise[Response[ActionsListWorkflowRunsResponse]] = js.native
  def listWorkflowRuns(params: RequestOptions with ActionsListWorkflowRunsParams): js.Promise[Response[ActionsListWorkflowRunsResponse]] = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[AnyResponse] = js.native
  def reRunWorkflow(params: RequestOptions with ActionsReRunWorkflowParams): js.Promise[AnyResponse] = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def removeSelfHostedRunner(): js.Promise[AnyResponse] = js.native
  def removeSelfHostedRunner(params: RequestOptions with ActionsRemoveSelfHostedRunnerParams): js.Promise[AnyResponse] = js.native
}

