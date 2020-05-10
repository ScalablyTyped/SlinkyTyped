package typingsSlinky.officeUiFabricReact.focusTrapZoneDialogInPanelExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusTrapZoneDialogInPanelExampleState extends js.Object {
  var hideDialog: Boolean = js.native
  var showPanel: Boolean = js.native
}

object IFocusTrapZoneDialogInPanelExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, showPanel: Boolean): IFocusTrapZoneDialogInPanelExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFocusTrapZoneDialogInPanelExampleState]
  }
  @scala.inline
  implicit class IFocusTrapZoneDialogInPanelExampleStateOps[Self <: IFocusTrapZoneDialogInPanelExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

