package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListRepoWorkflowsResponse extends js.Object {
  var total_count: Double = js.native
  var workflows: js.Array[ActionsListRepoWorkflowsResponseWorkflowsItem] = js.native
}

object ActionsListRepoWorkflowsResponse {
  @scala.inline
  def apply(total_count: Double, workflows: js.Array[ActionsListRepoWorkflowsResponseWorkflowsItem]): ActionsListRepoWorkflowsResponse = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowsResponse]
  }
  @scala.inline
  implicit class ActionsListRepoWorkflowsResponseOps[Self <: ActionsListRepoWorkflowsResponse] (val x: Self) extends AnyVal {
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
    def withWorkflows(value: js.Array[ActionsListRepoWorkflowsResponseWorkflowsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

