package typingsSlinky.devextreme.mod.DevExpress.viz

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
trait dxChartValueAxis extends dxChartCommonAxisSettings {
  /** Enables auto-calculated scale breaks. Applies only if the axis' type is "continuous" or "logarithmic" and valueType is "numeric". */
  var autoBreaksEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** Declares a custom scale break collection. Applies only if the axis' type is "continuous" or "logarithmic". */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  /** Specifies the order of categories on an axis of the "discrete" type. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  /** Specifies the appearance of those constant lines that belong to the value axis. */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartValueAxis: js.UndefOr[dxChartValueAxisConstantLineStyle] = js.native
  /** Declares a collection of constant lines belonging to the value axis. */
  var constantLines: js.UndefOr[js.Array[dxChartValueAxisConstantLines]] = js.native
  /** Configures the labels of the value axis. */
  @JSName("label")
  var label_dxChartValueAxis: js.UndefOr[dxChartValueAxisLabel] = js.native
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** Specifies the value to be raised to a power when generating ticks for an axis of the "logarithmic" type. */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** @deprecated Use the valueAxis.visualRange option instead. */
  /** Coupled with the min option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var max: js.UndefOr[Double | js.Date | String] = js.native
  /** Sets a limit on auto-calculated scale breaks. Custom scale breaks are not counted. */
  var maxAutoBreakCount: js.UndefOr[Double] = js.native
  /** @deprecated Use the valueAxis.visualRange option instead. */
  /** Coupled with the max option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var min: js.UndefOr[Double | js.Date | String] = js.native
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Specifies how many minor ticks to place between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** Specifies the interval between minor ticks. Applies only to continuous axes. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Adds a pixel-measured empty space between two side-by-side value axes. Applies if several value axes are located on one side of the chart. */
  var multipleAxesSpacing: js.UndefOr[Double] = js.native
  /** Specifies the name of the value axis. */
  var name: js.UndefOr[String] = js.native
  /** Binds the value axis to a pane. */
  var pane: js.UndefOr[String] = js.native
  /** Relocates the value axis. */
  var position: js.UndefOr[bottom | left | right | top] = js.native
  /** Specifies whether or not to show zero on the value axis. */
  var showZero: js.UndefOr[Boolean] = js.native
  /** Declares a collection of strips belonging to the value axis. */
  var strips: js.UndefOr[js.Array[dxChartValueAxisStrips]] = js.native
  /** Synchronizes two or more value axes with each other at a specific value. */
  var synchronizedValue: js.UndefOr[Double] = js.native
  /** Specifies the interval between major ticks. Does not apply to discrete axes. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Configures the axis title. */
  @JSName("title")
  var title_dxChartValueAxis: js.UndefOr[dxChartValueAxisTitle] = js.native
  /** Specifies the type of the value axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  /** Casts values to a specified data type. */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
  /** Specifies how the axis's visual range should behave when chart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  /** Defines the range where the axis can be zoomed and panned. */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
}

object dxChartValueAxis {
  @scala.inline
  def apply(): dxChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxis]
  }
  @scala.inline
  implicit class dxChartValueAxisOps[Self <: dxChartValueAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBreaksEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreaksEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBreaksEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreaksEnabled")(js.undefined)
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
    def withConstantLineStyle(value: dxChartValueAxisConstantLineStyle): Self = {
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
    def withConstantLines(value: js.Array[dxChartValueAxisConstantLines]): Self = {
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
    def withLabel(value: dxChartValueAxisLabel): Self = {
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
    def withMaxAutoBreakCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoBreakCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAutoBreakCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoBreakCount")(js.undefined)
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
    def withMultipleAxesSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleAxesSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleAxesSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleAxesSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
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
    def withShowZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZero")(js.undefined)
        ret
    }
    @scala.inline
    def withStrips(value: js.Array[dxChartValueAxisStrips]): Self = {
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
    def withSynchronizedValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizedValue")(js.undefined)
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
    def withTitle(value: dxChartValueAxisTitle): Self = {
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
    def withValueType(value: datetime | numeric | string_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
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
  }
  
}

