package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonCol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxResponsiveBoxItem extends CollectionWidgetItem {
  /** Specifies the item location and size against the widget grid. */
  var location: js.UndefOr[AnonCol | js.Array[AnonCol]] = js.native
}

object dxResponsiveBoxItem {
  @scala.inline
  def apply(): dxResponsiveBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxItem]
  }
  @scala.inline
  implicit class dxResponsiveBoxItemOps[Self <: dxResponsiveBoxItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: AnonCol | js.Array[AnonCol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

