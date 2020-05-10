package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLinearGaugeScale extends BaseGaugeScale {
  /** Specifies the orientation of scale ticks. Applies only if the geometry.orientation option is "vertical". */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.native
  /** Specifies common options for scale labels. */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.native
  /** Specifies the orientation of scale ticks. Applies only if the geometry.orientation option is "horizontal". */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.native
}

object dxLinearGaugeScale {
  @scala.inline
  def apply(): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
  @scala.inline
  implicit class dxLinearGaugeScaleOps[Self <: dxLinearGaugeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalOrientation(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxLinearGaugeScaleLabel): Self = {
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
    def withVerticalOrientation(value: bottom | center | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(js.undefined)
        ret
    }
  }
  
}

