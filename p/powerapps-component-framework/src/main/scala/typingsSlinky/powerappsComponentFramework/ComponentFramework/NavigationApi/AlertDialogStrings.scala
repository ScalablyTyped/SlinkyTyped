package typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents the String parameters for Alert Dialog.
		 */
@js.native
trait AlertDialogStrings extends js.Object {
  /**
  			 * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
  			 */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  /**
  			 * The message to be displyed in the alert dialog.
  			 */
  var text: String = js.native
}

object AlertDialogStrings {
  @scala.inline
  def apply(text: String): AlertDialogStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogStrings]
  }
  @scala.inline
  implicit class AlertDialogStringsOps[Self <: AlertDialogStrings] (val x: Self) extends AnyVal {
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
  }
  
}

