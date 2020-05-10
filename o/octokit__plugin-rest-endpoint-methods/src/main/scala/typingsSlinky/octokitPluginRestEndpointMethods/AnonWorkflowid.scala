package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWorkflowid extends js.Object {
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var workflow_id: AnonRequired = js.native
}

object AnonWorkflowid {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, workflow_id: AnonRequired): AnonWorkflowid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkflowid]
  }
  @scala.inline
  implicit class AnonWorkflowidOps[Self <: AnonWorkflowid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflow_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

