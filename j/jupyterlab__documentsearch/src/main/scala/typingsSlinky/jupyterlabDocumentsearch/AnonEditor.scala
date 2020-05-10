package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabCodemirror.mod.CodeMirrorEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEditor extends js.Object {
  var editor: CodeMirrorEditor = js.native
}

object AnonEditor {
  @scala.inline
  def apply(editor: CodeMirrorEditor): AnonEditor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditor]
  }
  @scala.inline
  implicit class AnonEditorOps[Self <: AnonEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditor(value: CodeMirrorEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

