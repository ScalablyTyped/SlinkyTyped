package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLEvaluationTaskRunResponse extends js.Object {
  /**
    * The unique identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartMLEvaluationTaskRunResponse {
  @scala.inline
  def apply(): StartMLEvaluationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
  }
  @scala.inline
  implicit class StartMLEvaluationTaskRunResponseOps[Self <: StartMLEvaluationTaskRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskRunId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskRunId")(js.undefined)
        ret
    }
  }
  
}

