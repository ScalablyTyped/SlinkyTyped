package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardStateChanged event.
  */
@js.native
trait ASPxClientDashboardStateChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the current state of the dashboard.
    */
  var DashboardState: String = js.native
}

object ASPxClientDashboardStateChangedEventArgs {
  @scala.inline
  def apply(DashboardState: String): ASPxClientDashboardStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardState = DashboardState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardStateChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardStateChangedEventArgsOps[Self <: ASPxClientDashboardStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

