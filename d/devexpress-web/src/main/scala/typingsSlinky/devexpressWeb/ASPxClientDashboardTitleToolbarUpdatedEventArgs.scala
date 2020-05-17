package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
  */
@js.native
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to dashboard title options.
    */
  var Options: js.Any = js.native
}

object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  @scala.inline
  def apply(Options: js.Any): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardTitleToolbarUpdatedEventArgsOps[Self <: ASPxClientDashboardTitleToolbarUpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

