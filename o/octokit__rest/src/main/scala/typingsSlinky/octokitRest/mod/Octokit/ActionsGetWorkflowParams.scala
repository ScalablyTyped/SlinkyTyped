package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetWorkflowParams extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  var workflow_id: Double = js.native
}

object ActionsGetWorkflowParams {
  @scala.inline
  def apply(owner: String, repo: String, workflow_id: Double): ActionsGetWorkflowParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowParams]
  }
  @scala.inline
  implicit class ActionsGetWorkflowParamsOps[Self <: ActionsGetWorkflowParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

