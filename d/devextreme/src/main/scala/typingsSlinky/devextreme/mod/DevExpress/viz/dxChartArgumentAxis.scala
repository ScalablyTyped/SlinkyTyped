package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartArgumentAxis extends dxChartCommonAxisSettings {
  /** Aggregates series points that fall into the same category. */
  var aggregateByCategory: js.UndefOr[Boolean] = js.native
  /** Specifies the length of aggregation intervals in pixels. Does not apply if aggregateByCategory is true. May be ignored in favor of the aggregationInterval option. */
  var aggregationGroupWidth: js.UndefOr[Double] = js.native
  /** Specifies the length of aggregation intervals in axis units. Applies only to axes of continuous and logarithmic types. */
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Casts arguments to a specified data type. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** Declares a scale break collection. Applies only if the axis' type is "continuous" or "logarithmic". */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  /** Specifies the order of categories on an axis of the "discrete" type. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  /** Specifies the appearance of those constant lines that belong to the argument axis. */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisConstantLineStyle] = js.native
  /** Declares a collection of constant lines belonging to the argument axis. */
  var constantLines: js.UndefOr[js.Array[dxChartArgumentAxisConstantLines]] = js.native
  /** Dates to be excluded from the axis when workdaysOnly is true. */
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** Specifies chart elements to be highlighted when a user points to an axis label. */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.native
  /** Configures the labels of the argument axis. */
  @JSName("label")
  var label_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisLabel] = js.native
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** Specifies the value to be raised to a power when generating ticks for an axis of the "logarithmic" type. */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** @deprecated Use the argumentAxis.visualRange option instead. */
  /** Coupled with the min option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var max: js.UndefOr[Double | js.Date | String] = js.native
  /** @deprecated Use the argumentAxis.visualRange option instead. */
  /** Coupled with the max option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var min: js.UndefOr[Double | js.Date | String] = js.native
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Specifies how many minor ticks to place between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** Specifies the interval between minor ticks. Applies only to the axes of the "continuous" type. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Relocates the argument axis. */
  var position: js.UndefOr[bottom | left | right | top] = js.native
  /** Dates to be included on the axis when workdaysOnly is true. */
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  /** Declares a collection of strips belonging to the argument axis. */
  var strips: js.UndefOr[js.Array[dxChartArgumentAxisStrips]] = js.native
  /** Specifies the interval between major ticks. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Configures the axis title. */
  @JSName("title")
  var title_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisTitle] = js.native
  /** Specifies the type of the argument axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
  /** Specifies how the axis's visual range should behave when chart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  /** Defines the range where the axis can be zoomed and panned. */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
  /** Specifies which days are workdays. The array can contain values from 0 (Sunday) to 6 (Saturday). Applies only if workdaysOnly is true. */
  var workWeek: js.UndefOr[js.Array[Double]] = js.native
  /** Leaves only workdays on the axis: the work week days plus single workdays minus holidays. Applies only if the axis' argumentType is "datetime". */
  var workdaysOnly: js.UndefOr[Boolean] = js.native
}

object dxChartArgumentAxis {
  @scala.inline
  def apply(): dxChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxis]
  }
  @scala.inline
  implicit class dxChartArgumentAxisOps[Self <: dxChartArgumentAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateByCategory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateByCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateByCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateByCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationGroupWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationGroupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationGroupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationGroupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentType(value: datetime | numeric | string_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentType")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisDivisionFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDivisionFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisDivisionFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDivisionFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withBreaks(value: js.Array[ScaleBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[Double | String | js.Date]): Self = {
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
    def withConstantLineStyle(value: dxChartArgumentAxisConstantLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withConstantLines(value: js.Array[dxChartArgumentAxisConstantLines]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLines")(js.undefined)
        ret
    }
    @scala.inline
    def withHolidays(value: js.Array[js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: allArgumentPoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxChartArgumentAxisLabel): Self = {
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
    def withLinearThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double | js.Date | String): Self = {
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
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double | js.Date | String): Self = {
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
    def withMinVisualRangeLength(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisualRangeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVisualRangeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVisualRangeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: bottom | left | right | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleWorkdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkdays")(js.undefined)
        ret
    }
    @scala.inline
    def withStrips(value: js.Array[dxChartArgumentAxisStrips]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strips")(js.undefined)
        ret
    }
    @scala.inline
    def withTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: dxChartArgumentAxisTitle): Self = {
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
    def withType(value: continuous | discrete | logarithmic): Self = {
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
    @scala.inline
    def withVisualRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualRange")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualRangeUpdateMode(value: auto | keep | reset | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualRangeUpdateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualRangeUpdateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualRangeUpdateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWholeRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wholeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWholeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wholeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeek(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkdaysOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdaysOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkdaysOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workdaysOnly")(js.undefined)
        ret
    }
  }
  
}

