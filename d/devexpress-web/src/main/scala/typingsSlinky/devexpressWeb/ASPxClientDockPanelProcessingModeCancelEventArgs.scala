package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.BeforeDock event.
  */
@js.native
trait ASPxClientDockPanelProcessingModeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}

object ASPxClientDockPanelProcessingModeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockPanelProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockPanelProcessingModeCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDockPanelProcessingModeCancelEventArgsOps[Self <: ASPxClientDockPanelProcessingModeCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZone(value: ASPxClientDockZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

