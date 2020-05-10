package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorFindOptions extends js.Object {
  val addExtraSpaceOnTop: Boolean = js.native
  val autoFindInSelection: Boolean = js.native
  val seedSearchStringFromSelection: Boolean = js.native
}

object InternalEditorFindOptions {
  @scala.inline
  def apply(addExtraSpaceOnTop: Boolean, autoFindInSelection: Boolean, seedSearchStringFromSelection: Boolean): InternalEditorFindOptions = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorFindOptions]
  }
  @scala.inline
  implicit class InternalEditorFindOptionsOps[Self <: InternalEditorFindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddExtraSpaceOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExtraSpaceOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFindInSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFindInSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeedSearchStringFromSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedSearchStringFromSelection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

