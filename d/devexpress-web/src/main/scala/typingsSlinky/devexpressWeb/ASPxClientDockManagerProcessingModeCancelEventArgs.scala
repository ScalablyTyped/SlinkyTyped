package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@js.native
trait ASPxClientDockManagerProcessingModeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}

object ASPxClientDockManagerProcessingModeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, panel: ASPxClientDockPanel, processOnServer: Boolean, zone: ASPxClientDockZone): ASPxClientDockManagerProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerProcessingModeCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDockManagerProcessingModeCancelEventArgsOps[Self <: ASPxClientDockManagerProcessingModeCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPanel(value: ASPxClientDockPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone(value: ASPxClientDockZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

