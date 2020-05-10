package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBoxItem extends CollectionWidgetItem {
  /** Specifies the base size of an item element along the main direction. */
  var baseSize: js.UndefOr[Double | auto] = js.native
  /** Holds a Box configuration object for the item. */
  var box: js.UndefOr[dxBoxOptions] = js.native
  /** Specifies the ratio value used to count the item element size along the main direction. */
  var ratio: js.UndefOr[Double] = js.native
  /** A factor that defines how much an item shrinks relative to the rest of the items in the container. */
  var shrink: js.UndefOr[Double] = js.native
}

object dxBoxItem {
  @scala.inline
  def apply(): dxBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxItem]
  }
  @scala.inline
  implicit class dxBoxItemOps[Self <: dxBoxItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseSize(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBox(value: dxBoxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withShrink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.undefined)
        ret
    }
  }
  
}

