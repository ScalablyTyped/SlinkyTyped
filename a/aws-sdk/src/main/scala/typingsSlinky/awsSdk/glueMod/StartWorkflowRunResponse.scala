package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartWorkflowRunResponse extends js.Object {
  /**
    * An Id for the new run.
    */
  var RunId: js.UndefOr[IdString] = js.native
}

object StartWorkflowRunResponse {
  @scala.inline
  def apply(): StartWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkflowRunResponse]
  }
  @scala.inline
  implicit class StartWorkflowRunResponseOps[Self <: StartWorkflowRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunId")(js.undefined)
        ret
    }
  }
  
}

