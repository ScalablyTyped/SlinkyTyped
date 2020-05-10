package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateChangingEventUIParam extends js.Object {
  /**
  	 * Gets the name of the action. That can be one of the following: "open" - request to open the dialog. "close" - request to close the dialog. "minimize" - request to minimize the dialog. "maximize" - request to maximize the dialog. "restore" - request to restore the dialog from minimized or maximized state. "pin" - request to pin the dialog. "unpin" - request to unpin the dialog.
  	 */
  var action: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
  	 */
  var button: js.UndefOr[String] = js.native
  /**
  	 * Gets the boolean value of the old pin state of the dialog.
  	 */
  var oldPinned: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
  	 */
  var oldState: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the igDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object StateChangingEventUIParam {
  @scala.inline
  def apply(): StateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateChangingEventUIParam]
  }
  @scala.inline
  implicit class StateChangingEventUIParamOps[Self <: StateChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withOldPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withOldState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(js.undefined)
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

