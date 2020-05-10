package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebookTemplateResult extends ResultStatus {
  var notebookTemplate: String = js.native
}

object AgentNotebookTemplateResult {
  @scala.inline
  def apply(errorMessage: String, notebookTemplate: String, success: Boolean): AgentNotebookTemplateResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookTemplate = notebookTemplate.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookTemplateResult]
  }
  @scala.inline
  implicit class AgentNotebookTemplateResultOps[Self <: AgentNotebookTemplateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

