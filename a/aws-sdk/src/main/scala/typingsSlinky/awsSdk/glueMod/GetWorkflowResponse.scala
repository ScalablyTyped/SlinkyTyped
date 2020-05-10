package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowResponse extends js.Object {
  /**
    * The resource metadata for the workflow.
    */
  var Workflow: js.UndefOr[typingsSlinky.awsSdk.glueMod.Workflow] = js.native
}

object GetWorkflowResponse {
  @scala.inline
  def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  @scala.inline
  implicit class GetWorkflowResponseOps[Self <: GetWorkflowResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkflow(value: Workflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workflow")(js.undefined)
        ret
    }
  }
  
}

