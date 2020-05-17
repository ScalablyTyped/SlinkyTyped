package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDraggable
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDropInsideItem extends js.Object {
  var component: js.UndefOr[dxSortable] = js.native
  var dropInsideItem: js.UndefOr[Boolean] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.event] = js.native
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  var fromData: js.UndefOr[js.Any] = js.native
  var fromIndex: js.UndefOr[Double] = js.native
  var itemData: js.UndefOr[js.Any] = js.native
  var itemElement: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  var toData: js.UndefOr[js.Any] = js.native
  var toIndex: js.UndefOr[Double] = js.native
}

object ComponentDropInsideItem {
  @scala.inline
  def apply(): ComponentDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDropInsideItem]
  }
  @scala.inline
  implicit class ComponentDropInsideItemOps[Self <: ComponentDropInsideItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: dxSortable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withDropInsideItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropInsideItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropInsideItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropInsideItem")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withFromComponent(value: dxSortable | dxDraggable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withFromData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromData")(js.undefined)
        ret
    }
    @scala.inline
    def withFromIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withItemData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(js.undefined)
        ret
    }
    @scala.inline
    def withItemElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withToComponent(value: dxSortable | dxDraggable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withToData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toData")(js.undefined)
        ret
    }
    @scala.inline
    def withToIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toIndex")(js.undefined)
        ret
    }
  }
  
}

