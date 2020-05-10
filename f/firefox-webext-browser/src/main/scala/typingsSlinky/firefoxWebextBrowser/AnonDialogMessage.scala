package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDialogMessage extends js.Object {
  /** The message to display to a user when being asked to confirm removal of the extension. */
  var dialogMessage: js.UndefOr[String] = js.native
  /** Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false. */
  var showConfirmDialog: js.UndefOr[Boolean] = js.native
}

object AnonDialogMessage {
  @scala.inline
  def apply(): AnonDialogMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDialogMessage]
  }
  @scala.inline
  implicit class AnonDialogMessageOps[Self <: AnonDialogMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConfirmDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConfirmDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmDialog")(js.undefined)
        ret
    }
  }
  
}

