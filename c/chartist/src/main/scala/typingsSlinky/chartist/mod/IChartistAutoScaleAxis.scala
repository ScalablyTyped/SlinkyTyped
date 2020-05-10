package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistAutoScaleAxis extends ILineChartAxis {
  var high: js.UndefOr[Double] = js.native
  var low: js.UndefOr[Double] = js.native
  var onlyInteger: js.UndefOr[Boolean] = js.native
  var referenceValue: js.UndefOr[Double] = js.native
  var scaleMinSpace: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.native
}

object IChartistAutoScaleAxis {
  @scala.inline
  def apply(): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
  @scala.inline
  implicit class IChartistAutoScaleAxisOps[Self <: IChartistAutoScaleAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyInteger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMinSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMinSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMinSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMinSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: IAutoScaleAxisStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

