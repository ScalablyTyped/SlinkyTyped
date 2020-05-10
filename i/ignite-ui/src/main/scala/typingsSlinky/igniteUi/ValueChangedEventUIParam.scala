package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChangedEventUIParam extends js.Object {
  /**
  	 * Gets the editor input.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the value entered from the user after internal formatting. The argument type might differ depending on the editor type.
  	 */
  var newValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the value entered from the user before internal formatting. The argument type might differ depending on the editor type.
  	 */
  var originalValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ValueChangedEventUIParam {
  @scala.inline
  def apply(): ValueChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangedEventUIParam]
  }
  @scala.inline
  implicit class ValueChangedEventUIParamOps[Self <: ValueChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorInput")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

