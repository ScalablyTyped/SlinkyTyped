package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PlaceValueSpec extends js.Object {
  /**
    * Speech configuration for askForPlace dialog. The extension should be used
    * to define the PlaceDialogSpec configuration.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.native
}

object GoogleActionsV2PlaceValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2PlaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2PlaceValueSpecOps[Self <: GoogleActionsV2PlaceValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogSpec(value: GoogleActionsV2DialogSpec): Self = {
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

