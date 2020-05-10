package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartNavigatorCategoryAxis extends js.Object {
  var autoBaseUnitSteps: js.UndefOr[StockChartNavigatorCategoryAxisAutoBaseUnitSteps] = js.native
  var axisCrossingValue: js.UndefOr[js.Any | js.Date] = js.native
  var background: js.UndefOr[String] = js.native
  var baseUnit: js.UndefOr[String] = js.native
  var baseUnitStep: js.UndefOr[js.Any] = js.native
  var categories: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[String] = js.native
  var crosshair: js.UndefOr[StockChartNavigatorCategoryAxisCrosshair] = js.native
  var field: js.UndefOr[String] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var labels: js.UndefOr[StockChartNavigatorCategoryAxisLabels] = js.native
  var line: js.UndefOr[StockChartNavigatorCategoryAxisLine] = js.native
  var majorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMajorGridLines] = js.native
  var majorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMajorTicks] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var maxDateGroups: js.UndefOr[Double] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var minorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMinorGridLines] = js.native
  var minorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMinorTicks] = js.native
  var notes: js.UndefOr[StockChartNavigatorCategoryAxisNotes] = js.native
  var plotBands: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisPlotBand]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var roundToBaseUnit: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[StockChartNavigatorCategoryAxisTitle] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var weekStartDay: js.UndefOr[Double] = js.native
}

object StockChartNavigatorCategoryAxis {
  @scala.inline
  def apply(): StockChartNavigatorCategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorCategoryAxis]
  }
  @scala.inline
  implicit class StockChartNavigatorCategoryAxisOps[Self <: StockChartNavigatorCategoryAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBaseUnitSteps(value: StockChartNavigatorCategoryAxisAutoBaseUnitSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBaseUnitSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBaseUnitSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBaseUnitSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisCrossingValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisCrossingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisCrossingValue(value: js.Any | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisCrossingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisCrossingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisCrossingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUnitStep(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUnitStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUnitStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUnitStep")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
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
    def withCrosshair(value: StockChartNavigatorCategoryAxisCrosshair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withJustified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justified")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StockChartNavigatorCategoryAxisLabels): Self = {
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
    def withLine(value: StockChartNavigatorCategoryAxisLine): Self = {
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
    def withMajorGridLines(value: StockChartNavigatorCategoryAxisMajorGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicks(value: StockChartNavigatorCategoryAxisMajorTicks): Self = {
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
    def withMax(value: js.Any): Self = {
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
    def withMaxDateGroups(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDateGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Any): Self = {
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
    def withMinorGridLines(value: StockChartNavigatorCategoryAxisMinorGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicks(value: StockChartNavigatorCategoryAxisMinorTicks): Self = {
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
    def withNotes(value: StockChartNavigatorCategoryAxisNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBands(value: js.Array[StockChartNavigatorCategoryAxisPlotBand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBands")(js.undefined)
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
    def withRoundToBaseUnit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundToBaseUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundToBaseUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundToBaseUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: StockChartNavigatorCategoryAxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStartDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartDay")(js.undefined)
        ret
    }
  }
  
}

