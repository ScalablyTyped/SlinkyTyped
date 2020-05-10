package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebooksResult extends ResultStatus {
  var notebooks: js.Array[AgentNotebookInfo] = js.native
}

object AgentNotebooksResult {
  @scala.inline
  def apply(errorMessage: String, notebooks: js.Array[AgentNotebookInfo], success: Boolean): AgentNotebooksResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebooks = notebooks.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebooksResult]
  }
  @scala.inline
  implicit class AgentNotebooksResultOps[Self <: AgentNotebooksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebooks(value: js.Array[AgentNotebookInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

