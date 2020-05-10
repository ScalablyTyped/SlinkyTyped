package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartValueAxis extends dxPolarChartCommonAxisSettings {
  /** Specifies a coefficient for dividing the value axis. */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** Specifies the order in which discrete values are arranged on the value axis. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  /** Defines an array of the value axis constant lines. */
  var constantLines: js.UndefOr[js.Array[dxPolarChartValueAxisConstantLines]] = js.native
  /** Specifies options for value axis labels. */
  @JSName("label")
  var label_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisLabel] = js.native
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** Specifies the value to be raised to a power when generating ticks for a logarithmic axis. */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** Specifies a coefficient that determines the spacing between the maximum series point and the axis. */
  var maxValueMargin: js.UndefOr[Double] = js.native
  /** Specifies a coefficient that determines the spacing between the minimum series point and the axis. */
  var minValueMargin: js.UndefOr[Double] = js.native
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Specifies the number of minor ticks between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** Specifies the interval between minor ticks. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Specifies whether or not to indicate a zero value on the value axis. */
  var showZero: js.UndefOr[Boolean] = js.native
  /** Specifies options for value axis strips. */
  var strips: js.UndefOr[js.Array[dxPolarChartValueAxisStrips]] = js.native
  /** Specifies an interval between axis ticks/grid lines. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** An object defining the configuration options for axis ticks. */
  @JSName("tick")
  var tick_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisTick] = js.native
  /** Specifies the required type of the value axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  /** Indicates whether to display series with indents from axis boundaries. */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the desired type of axis values. */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
  /** Specifies how the axis's visual range should behave when the PolarChart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset] = js.native
  /** Defines the range where the axis can be zoomed. */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.native
}

object dxPolarChartValueAxis {
  @scala.inline
  def apply(): dxPolarChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxis]
  }
  @scala.inline
  implicit class dxPolarChartValueAxisOps[Self <: dxPolarChartValueAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConstantLines(value: js.Array[dxPolarChartValueAxisConstantLines]): Self = {
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
    def withLabel(value: dxPolarChartValueAxisLabel): Self = {
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
    def withMaxValueMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueMargin")(js.undefined)
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
    def withStrips(value: js.Array[dxPolarChartValueAxisStrips]): Self = {
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
    def withTick(value: dxPolarChartValueAxisTick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
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
    def withValueMarginsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarginsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMarginsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarginsEnabled")(js.undefined)
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
    def withVisualRangeUpdateMode(value: auto | keep | reset): Self = {
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

