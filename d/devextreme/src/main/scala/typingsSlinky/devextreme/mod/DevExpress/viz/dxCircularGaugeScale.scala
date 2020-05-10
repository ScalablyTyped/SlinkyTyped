package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeScale extends BaseGaugeScale {
  /** Specifies common options for scale labels. */
  @JSName("label")
  var label_dxCircularGaugeScale: js.UndefOr[dxCircularGaugeScaleLabel] = js.native
  /** Specifies the orientation of scale ticks. */
  var orientation: js.UndefOr[center | inside | outside] = js.native
}

object dxCircularGaugeScale {
  @scala.inline
  def apply(): dxCircularGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScale]
  }
  @scala.inline
  implicit class dxCircularGaugeScaleOps[Self <: dxCircularGaugeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: dxCircularGaugeScaleLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
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
  }
  
}

