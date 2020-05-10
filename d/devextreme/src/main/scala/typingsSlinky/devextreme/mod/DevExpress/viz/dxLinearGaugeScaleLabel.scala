package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLinearGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** Specifies the spacing between scale labels and ticks. */
  var indentFromTick: js.UndefOr[Double] = js.native
}

object dxLinearGaugeScaleLabel {
  @scala.inline
  def apply(): dxLinearGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScaleLabel]
  }
  @scala.inline
  implicit class dxLinearGaugeScaleLabelOps[Self <: dxLinearGaugeScaleLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentFromTick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFromTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromTick")(js.undefined)
        ret
    }
  }
  
}

