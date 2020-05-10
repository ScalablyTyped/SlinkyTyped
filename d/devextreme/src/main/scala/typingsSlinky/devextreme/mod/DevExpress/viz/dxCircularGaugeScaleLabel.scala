package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.first
import typingsSlinky.devextreme.devextremeStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** Specifies which label to hide in case of overlapping. */
  var hideFirstOrLast: js.UndefOr[first | last] = js.native
  /** Specifies the spacing between scale labels and ticks. */
  var indentFromTick: js.UndefOr[Double] = js.native
}

object dxCircularGaugeScaleLabel {
  @scala.inline
  def apply(): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
  @scala.inline
  implicit class dxCircularGaugeScaleLabelOps[Self <: dxCircularGaugeScaleLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideFirstOrLast(value: first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstOrLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFirstOrLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstOrLast")(js.undefined)
        ret
    }
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

