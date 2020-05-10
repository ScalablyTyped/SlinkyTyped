package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorViewState extends IEditorViewState {
  var modified: ICodeEditorViewState | Null = js.native
  var original: ICodeEditorViewState | Null = js.native
}

object IDiffEditorViewState {
  @scala.inline
  def apply(): IDiffEditorViewState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorViewState]
  }
  @scala.inline
  implicit class IDiffEditorViewStateOps[Self <: IDiffEditorViewState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModified(value: ICodeEditorViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(null)
        ret
    }
    @scala.inline
    def withOriginal(value: ICodeEditorViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(null)
        ret
    }
  }
  
}

