package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceEdit extends js.Object {
  var edits: js.Array[ResourceTextEdit | ResourceFileEdit] = js.native
}

object WorkspaceEdit {
  @scala.inline
  def apply(edits: js.Array[ResourceTextEdit | ResourceFileEdit]): WorkspaceEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEdit]
  }
  @scala.inline
  implicit class WorkspaceEditOps[Self <: WorkspaceEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdits(value: js.Array[ResourceTextEdit | ResourceFileEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

