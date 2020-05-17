package typingsSlinky.jupyterlabDocumentsearch.anon

import typingsSlinky.jupyterlabCodemirror.mod.CodeMirrorEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  var editor: CodeMirrorEditor = js.native
}

object Editor {
  @scala.inline
  def apply(editor: CodeMirrorEditor): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  @scala.inline
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
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

