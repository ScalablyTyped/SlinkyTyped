package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemErrorBars extends js.Object {
  var color: js.UndefOr[String] = js.native
  var endCaps: js.UndefOr[Boolean] = js.native
  var line: js.UndefOr[ChartSeriesItemErrorBarsLine] = js.native
  var value: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  var visual: js.UndefOr[js.Function] = js.native
  var xValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  var yValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
}

object ChartSeriesItemErrorBars {
  @scala.inline
  def apply(): ChartSeriesItemErrorBars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemErrorBars]
  }
  @scala.inline
  implicit class ChartSeriesItemErrorBarsOps[Self <: ChartSeriesItemErrorBars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEndCaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCaps")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: ChartSeriesItemErrorBarsLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double | js.Any | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(js.undefined)
        ret
    }
    @scala.inline
    def withXValue(value: String | Double | js.Any | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValue")(js.undefined)
        ret
    }
    @scala.inline
    def withYValue(value: String | Double | js.Any | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValue")(js.undefined)
        ret
    }
  }
  
}

