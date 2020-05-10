package typingsSlinky.akuminaCore.ipagewidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageWidget extends js.Object {
  var ContainerId: String = js.native
  var DisplayOrder: String = js.native
  var Grid: String = js.native
  var LayoutId: String = js.native
  var PageId: String = js.native
  var Title: String = js.native
  var VirtualWidgetInstanceId: String = js.native
  var WidgetDescription: String = js.native
  var WidgetIcon: String = js.native
  var WidgetInstanceId: String = js.native
  var WidgetName: String = js.native
  var WidgetOptions: String = js.native
  var WidgetProperties: String = js.native
  var ZoneId: String = js.native
}

object IPageWidget {
  @scala.inline
  def apply(
    ContainerId: String,
    DisplayOrder: String,
    Grid: String,
    LayoutId: String,
    PageId: String,
    Title: String,
    VirtualWidgetInstanceId: String,
    WidgetDescription: String,
    WidgetIcon: String,
    WidgetInstanceId: String,
    WidgetName: String,
    WidgetOptions: String,
    WidgetProperties: String,
    ZoneId: String
  ): IPageWidget = {
    val __obj = js.Dynamic.literal(ContainerId = ContainerId.asInstanceOf[js.Any], DisplayOrder = DisplayOrder.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any], LayoutId = LayoutId.asInstanceOf[js.Any], PageId = PageId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VirtualWidgetInstanceId = VirtualWidgetInstanceId.asInstanceOf[js.Any], WidgetDescription = WidgetDescription.asInstanceOf[js.Any], WidgetIcon = WidgetIcon.asInstanceOf[js.Any], WidgetInstanceId = WidgetInstanceId.asInstanceOf[js.Any], WidgetName = WidgetName.asInstanceOf[js.Any], WidgetOptions = WidgetOptions.asInstanceOf[js.Any], WidgetProperties = WidgetProperties.asInstanceOf[js.Any], ZoneId = ZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageWidget]
  }
  @scala.inline
  implicit class IPageWidgetOps[Self <: IPageWidget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualWidgetInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualWidgetInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

