package typingsSlinky.reactMonacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeEditor extends js.Object {
  var ICodeEditor: String = js.native
  var IDiffEditor: String = js.native
}

object ICodeEditor {
  @scala.inline
  def apply(ICodeEditor: String, IDiffEditor: String): ICodeEditor = {
    val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeEditor]
  }
  @scala.inline
  implicit class ICodeEditorOps[Self <: ICodeEditor] (val x: Self) extends AnyVal {
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

