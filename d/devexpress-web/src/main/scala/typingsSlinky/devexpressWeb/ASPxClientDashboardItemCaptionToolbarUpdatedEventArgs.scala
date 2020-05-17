package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemCaptionToolbarUpdated event.
  */
@js.native
trait ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a component name of the dashboard item.
    */
  var ItemName: String = js.native
  /**
    * Provides access to caption options of the dashboard item.
    */
  var Options: js.Any = js.native
}

object ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs {
  @scala.inline
  def apply(ItemName: String, Options: js.Any): ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemCaptionToolbarUpdatedEventArgsOps[Self <: ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

