package typingsSlinky.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonICodeEditor extends js.Object {
  var ICodeEditor: String = js.native
  var IDiffEditor: String = js.native
}

object AnonICodeEditor {
  @scala.inline
  def apply(ICodeEditor: String, IDiffEditor: String): AnonICodeEditor = {
    val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonICodeEditor]
  }
  @scala.inline
  implicit class AnonICodeEditorOps[Self <: AnonICodeEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withICodeEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICodeEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDiffEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDiffEditor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

