package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2ConfirmationValueSpec extends js.Object {
  /**
    * Configures dialog that asks for confirmation.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] = js.native
}

object GoogleActionsV2ConfirmationValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecOps[Self <: GoogleActionsV2ConfirmationValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogSpec(value: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogSpec")(js.undefined)
        ret
    }
  }
  
}

