package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorModel extends IEditorModel {
  /**
    * Modified model.
    */
  var modified: ITextModel = js.native
  /**
    * Original model.
    */
  var original: ITextModel = js.native
}

object IDiffEditorModel {
  @scala.inline
  def apply(modified: ITextModel, original: ITextModel): IDiffEditorModel = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffEditorModel]
  }
  @scala.inline
  implicit class IDiffEditorModelOps[Self <: IDiffEditorModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModified(value: ITextModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal(value: ITextModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

