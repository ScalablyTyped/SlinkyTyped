package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
@js.native
trait ASPxClientRibbonDialogBoxLauncherClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
}

object ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  @scala.inline
  def apply(group: ASPxClientRibbonGroup, processOnServer: Boolean): ASPxClientRibbonDialogBoxLauncherClickedEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonDialogBoxLauncherClickedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRibbonDialogBoxLauncherClickedEventArgsOps[Self <: ASPxClientRibbonDialogBoxLauncherClickedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: ASPxClientRibbonGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

