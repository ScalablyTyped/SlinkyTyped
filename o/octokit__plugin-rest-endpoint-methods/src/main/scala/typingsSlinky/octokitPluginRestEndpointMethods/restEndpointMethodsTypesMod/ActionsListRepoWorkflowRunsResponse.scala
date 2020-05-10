package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListRepoWorkflowRunsResponse extends js.Object {
  var total_count: Double = js.native
  var workflow_runs: js.Array[ActionsListRepoWorkflowRunsResponseWorkflowRunsItem] = js.native
}

object ActionsListRepoWorkflowRunsResponse {
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[ActionsListRepoWorkflowRunsResponseWorkflowRunsItem]): ActionsListRepoWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowRunsResponse]
  }
  @scala.inline
  implicit class ActionsListRepoWorkflowRunsResponseOps[Self <: ActionsListRepoWorkflowRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow_runs(value: js.Array[ActionsListRepoWorkflowRunsResponseWorkflowRunsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow_runs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

