package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportLabelsTaskRunResponse extends js.Object {
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartImportLabelsTaskRunResponse {
  @scala.inline
  def apply(): StartImportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportLabelsTaskRunResponse]
  }
  @scala.inline
  implicit class StartImportLabelsTaskRunResponseOps[Self <: StartImportLabelsTaskRunResponse] (val x: Self) extends AnyVal {
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

