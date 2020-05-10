package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunResponse extends js.Object {
  /**
    * The requested workflow run metadata.
    */
  var Run: js.UndefOr[WorkflowRun] = js.native
}

object GetWorkflowRunResponse {
  @scala.inline
  def apply(): GetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunResponse]
  }
  @scala.inline
  implicit class GetWorkflowRunResponseOps[Self <: GetWorkflowRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: WorkflowRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(js.undefined)
        ret
    }
  }
  
}

