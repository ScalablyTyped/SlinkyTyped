package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTileViewItem extends CollectionWidgetItem {
  /** Specifies a multiplier for the baseItemHeight option value (for the purpose of obtaining the actual item height). */
  var heightRatio: js.UndefOr[Double] = js.native
  /** Specifies a multiplier for the baseItemWidth option value (for the purpose of obtaining the actual item width). */
  var widthRatio: js.UndefOr[Double] = js.native
}

object dxTileViewItem {
  @scala.inline
  def apply(): dxTileViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewItem]
  }
  @scala.inline
  implicit class dxTileViewItemOps[Self <: dxTileViewItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthRatio")(js.undefined)
        ret
    }
  }
  
}

