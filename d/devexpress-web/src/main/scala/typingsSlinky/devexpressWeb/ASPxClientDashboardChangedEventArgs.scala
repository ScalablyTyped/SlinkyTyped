package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardChanged event.
  */
@js.native
trait ASPxClientDashboardChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of a newly opened dashboard.
    */
  var DashboardId: String = js.native
}

object ASPxClientDashboardChangedEventArgs {
  @scala.inline
  def apply(DashboardId: String): ASPxClientDashboardChangedEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardChangedEventArgsOps[Self <: ASPxClientDashboardChangedEventArgs] (val x: Self) extends AnyVal {
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

