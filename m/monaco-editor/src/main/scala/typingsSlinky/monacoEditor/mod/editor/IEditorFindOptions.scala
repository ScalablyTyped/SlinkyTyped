package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorFindOptions extends js.Object {
  var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Controls if Find in Selection flag is turned on when multiple lines of text are selected in the editor.
    */
  var autoFindInSelection: Boolean = js.native
  /**
    * Controls if we seed search string in the Find Widget with editor selection.
    */
  var seedSearchStringFromSelection: js.UndefOr[Boolean] = js.native
}

object IEditorFindOptions {
  @scala.inline
  def apply(autoFindInSelection: Boolean): IEditorFindOptions = {
    val __obj = js.Dynamic.literal(autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorFindOptions]
  }
  @scala.inline
  implicit class IEditorFindOptionsOps[Self <: IEditorFindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFindInSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFindInSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddExtraSpaceOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExtraSpaceOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddExtraSpaceOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExtraSpaceOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSeedSearchStringFromSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedSearchStringFromSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedSearchStringFromSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedSearchStringFromSelection")(js.undefined)
        ret
    }
  }
  
}

