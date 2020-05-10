package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListJobsForWorkflowRunResponse extends js.Object {
  var jobs: js.Array[ActionsListJobsForWorkflowRunResponseJobsItem] = js.native
  var total_count: Double = js.native
}

object ActionsListJobsForWorkflowRunResponse {
  @scala.inline
  def apply(jobs: js.Array[ActionsListJobsForWorkflowRunResponseJobsItem], total_count: Double): ActionsListJobsForWorkflowRunResponse = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunResponse]
  }
  @scala.inline
  implicit class ActionsListJobsForWorkflowRunResponseOps[Self <: ActionsListJobsForWorkflowRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: js.Array[ActionsListJobsForWorkflowRunResponseJobsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

