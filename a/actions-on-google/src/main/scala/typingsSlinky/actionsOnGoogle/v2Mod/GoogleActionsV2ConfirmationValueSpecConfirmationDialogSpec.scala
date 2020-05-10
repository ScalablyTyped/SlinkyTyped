package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec extends js.Object {
  /**
    * This is the question asked by confirmation sub-dialog. For example \"Are
    * you sure about that?\"
    */
  var requestConfirmationText: js.UndefOr[String] = js.native
}

object GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec {
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpecOps[Self <: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestConfirmationText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestConfirmationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestConfirmationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestConfirmationText")(js.undefined)
        ret
    }
  }
  
}

