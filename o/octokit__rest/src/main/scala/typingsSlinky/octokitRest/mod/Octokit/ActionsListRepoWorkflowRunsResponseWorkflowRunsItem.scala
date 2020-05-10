package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListRepoWorkflowRunsResponseWorkflowRunsItem extends js.Object {
  var artifacts_url: String = js.native
  var cancel_url: String = js.native
  var check_suite_id: Double = js.native
  var conclusion: Null = js.native
  var created_at: String = js.native
  var event: String = js.native
  var head_branch: String = js.native
  var head_commit: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommit = js.native
  var head_repository: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadRepository = js.native
  var head_sha: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var jobs_url: String = js.native
  var logs_url: String = js.native
  var node_id: String = js.native
  var pull_requests: js.Array[_] = js.native
  var repository: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemRepository = js.native
  var rerun_url: String = js.native
  var run_number: Double = js.native
  var status: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var workflow_url: String = js.native
}

object ActionsListRepoWorkflowRunsResponseWorkflowRunsItem {
  @scala.inline
  def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_id: Double,
    conclusion: Null,
    created_at: String,
    event: String,
    head_branch: String,
    head_commit: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommit,
    head_repository: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadRepository,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemRepository,
    rerun_url: String,
    run_number: Double,
    status: String,
    updated_at: String,
    url: String,
    workflow_url: String
  ): ActionsListRepoWorkflowRunsResponseWorkflowRunsItem = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_id = check_suite_id.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowRunsResponseWorkflowRunsItem]
  }
  @scala.inline
  implicit class ActionsListRepoWorkflowRunsResponseWorkflowRunsItemOps[Self <: ActionsListRepoWorkflowRunsResponseWorkflowRunsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck_suite_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_suite_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConclusion(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_branch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_commit(value: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_repository(value: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_sha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_requests(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: ActionsListRepoWorkflowRunsResponseWorkflowRunsItemRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRerun_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerun_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

