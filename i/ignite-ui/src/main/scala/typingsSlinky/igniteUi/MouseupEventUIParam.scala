package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseupEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor input field.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the event target.
  	 */
  var element: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object MouseupEventUIParam {
  @scala.inline
  def apply(): MouseupEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseupEventUIParam]
  }
  @scala.inline
  implicit class MouseupEventUIParamOps[Self <: MouseupEventUIParam] (val x: Self) extends AnyVal {
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
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
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

