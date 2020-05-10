package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGaugeScale extends js.Object {
  var endAngle: js.UndefOr[Double] = js.native
  var labels: js.UndefOr[ArcGaugeScaleLabels] = js.native
  var majorTicks: js.UndefOr[ArcGaugeScaleMajorTicks] = js.native
  var majorUnit: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minorTicks: js.UndefOr[ArcGaugeScaleMinorTicks] = js.native
  var minorUnit: js.UndefOr[Double] = js.native
  var rangeDistance: js.UndefOr[Double] = js.native
  var rangeLineCap: js.UndefOr[String] = js.native
  var rangePlaceholderColor: js.UndefOr[String] = js.native
  var rangeSize: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
}

object ArcGaugeScale {
  @scala.inline
  def apply(): ArcGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeScale]
  }
  @scala.inline
  implicit class ArcGaugeScaleOps[Self <: ArcGaugeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ArcGaugeScaleLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicks(value: ArcGaugeScaleMajorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicks(value: ArcGaugeScaleMinorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeLineCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withRangePlaceholderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePlaceholderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePlaceholderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePlaceholderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
  }
  
}

