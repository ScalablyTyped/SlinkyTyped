package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
@js.native
trait ASPxClientDashboardInitializingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  var Dashboard: js.Any = js.native
  /**
    * Gets a string value that is the dashboard identifier.
    */
  var DashboardId: String = js.native
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  var Ready: js.Any = js.native
}

object ASPxClientDashboardInitializingEventArgs {
  @scala.inline
  def apply(Dashboard: js.Any, DashboardId: String, Ready: js.Any): ASPxClientDashboardInitializingEventArgs = {
    val __obj = js.Dynamic.literal(Dashboard = Dashboard.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Ready = Ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardInitializingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardInitializingEventArgsOps[Self <: ASPxClientDashboardInitializingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboard(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ready")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

