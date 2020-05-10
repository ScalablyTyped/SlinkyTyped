package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.showAddDialog
import typingsSlinky.chromeApps.chromeAppsStrings.showConfigureDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSHOWADDDIALOG extends js.Object {
  var SHOW_ADD_DIALOG: showAddDialog = js.native
  var SHOW_CONFIGURE_DIALOG: showConfigureDialog = js.native
}

object AnonSHOWADDDIALOG {
  @scala.inline
  def apply(SHOW_ADD_DIALOG: showAddDialog, SHOW_CONFIGURE_DIALOG: showConfigureDialog): AnonSHOWADDDIALOG = {
    val __obj = js.Dynamic.literal(SHOW_ADD_DIALOG = SHOW_ADD_DIALOG.asInstanceOf[js.Any], SHOW_CONFIGURE_DIALOG = SHOW_CONFIGURE_DIALOG.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSHOWADDDIALOG]
  }
  @scala.inline
  implicit class AnonSHOWADDDIALOGOps[Self <: AnonSHOWADDDIALOG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSHOW_ADD_DIALOG(value: showAddDialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ADD_DIALOG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHOW_CONFIGURE_DIALOG(value: showConfigureDialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CONFIGURE_DIALOG")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

