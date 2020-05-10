package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPromptDisplayingEventUIParam extends js.Object {
  /**
  	 * Get a boolean indicating if the operation that triggered the prompt can be cancelled.
  	 */
  var canCancel: js.UndefOr[Boolean] = js.native
  /**
  	 * Get a boolean indicating if a message will be displayed to the end user.
  	 */
  var displayMessage: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the exception for the error, if there was one.
  	 */
  var exception: js.UndefOr[js.Any] = js.native
  /**
  	 * Get or set the message that will be displayed.
  	 */
  var message: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Get the [action](ig.spreadsheet.SpreadsheetUserPromptTrigger) that caused the prompt to be displayed.
  	 */
  var trigger: js.UndefOr[String] = js.native
}

object UserPromptDisplayingEventUIParam {
  @scala.inline
  def apply(): UserPromptDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPromptDisplayingEventUIParam]
  }
  @scala.inline
  implicit class UserPromptDisplayingEventUIParamOps[Self <: UserPromptDisplayingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withException(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

