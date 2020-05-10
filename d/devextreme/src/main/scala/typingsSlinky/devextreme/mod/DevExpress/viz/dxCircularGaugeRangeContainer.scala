package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeRangeContainer extends BaseGaugeRangeContainer {
  /** Specifies the orientation of the range container in the CircularGauge widget. */
  var orientation: js.UndefOr[center | inside | outside] = js.native
  /** Specifies the range container's width in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object dxCircularGaugeRangeContainer {
  @scala.inline
  def apply(): dxCircularGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeRangeContainer]
  }
  @scala.inline
  implicit class dxCircularGaugeRangeContainerOps[Self <: dxCircularGaugeRangeContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: center | inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

