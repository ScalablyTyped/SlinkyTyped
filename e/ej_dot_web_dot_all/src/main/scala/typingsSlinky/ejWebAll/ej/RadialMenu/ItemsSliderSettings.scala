package typingsSlinky.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsSliderSettings extends js.Object {
  /** Specifies the value of sliderSettings labelSpace .
    */
  var labelSpace: js.UndefOr[Double] = js.native
  /** Specifies the sliderSettings stroke Width value.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /** Specifies the sliderSettings ticks values of nested radial menu items.
    */
  var ticks: js.UndefOr[js.Array[_]] = js.native
}

object ItemsSliderSettings {
  @scala.inline
  def apply(): ItemsSliderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsSliderSettings]
  }
  @scala.inline
  implicit class ItemsSliderSettingsOps[Self <: ItemsSliderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
  }
  
}

