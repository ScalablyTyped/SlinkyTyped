package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardBeginUpdate event.
  */
@js.native
trait ASPxClientDashboardBeginUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    */
  var DashboardId: String = js.native
}

object ASPxClientDashboardBeginUpdateEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardBeginUpdateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardBeginUpdateEventArgsOps[Self <: ASPxClientDashboardBeginUpdateEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

