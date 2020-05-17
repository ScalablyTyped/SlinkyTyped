package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
@js.native
trait ASPxClientDashboardItemDrillDownStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  var Action: String = js.native
  /**
    * Gets values from the current drill-down hierarchy.
    */
  var Values: js.Array[_] = js.native
}

object ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  @scala.inline
  def apply(
    Action: String,
    IsNullValue: js.Any => Boolean,
    IsOthersValue: js.Any => Boolean,
    ItemName: String,
    Values: js.Array[_]
  ): ASPxClientDashboardItemDrillDownStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDrillDownStateChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemDrillDownStateChangedEventArgsOps[Self <: ASPxClientDashboardItemDrillDownStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

