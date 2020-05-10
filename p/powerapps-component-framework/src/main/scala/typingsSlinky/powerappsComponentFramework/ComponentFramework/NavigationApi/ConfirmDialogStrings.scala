package typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents the String parameters for Confirm Dialog.
		 */
@js.native
trait ConfirmDialogStrings extends js.Object {
  /**
  			 * Cancel Button label.
  			 */
  var cancelButtonLabel: js.UndefOr[String] = js.native
  /**
  			 * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
  			 */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  /**
  			 * Confirm Dialog Subtitle
  			 */
  var subtitle: js.UndefOr[String] = js.native
  /**
  			 * Confirm Dialog Text\Message.
  			 */
  var text: String = js.native
  /**
  			 * Confirm Dialog Title.
  			 */
  var title: js.UndefOr[String] = js.native
}

object ConfirmDialogStrings {
  @scala.inline
  def apply(text: String): ConfirmDialogStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogStrings]
  }
  @scala.inline
  implicit class ConfirmDialogStringsOps[Self <: ConfirmDialogStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

