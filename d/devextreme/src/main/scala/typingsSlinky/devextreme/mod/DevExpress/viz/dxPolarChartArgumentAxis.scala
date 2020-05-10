package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartArgumentAxis extends dxPolarChartCommonAxisSettings {
  /** Specifies the desired type of axis values. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** Specifies the order in which arguments (categories) are arranged on the discrete argument axis. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  /** Defines an array of the argument axis constant lines. */
  var constantLines: js.UndefOr[js.Array[dxPolarChartArgumentAxisConstantLines]] = js.native
  /** Specifies whether or not to display the first point at the angle specified by the startAngle option. */
  var firstPointOnStartAngle: js.UndefOr[Boolean] = js.native
  /** Specifies the elements that will be highlighted when the argument axis is hovered over. */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.native
  /** Specifies options for argument axis labels. */
  @JSName("label")
  var label_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisLabel] = js.native
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** Specifies the value to be raised to a power when generating ticks for a logarithmic axis. */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** Specifies the number of minor ticks between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** Specifies the interval between minor ticks. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** Specifies the options of the minor ticks. */
  @JSName("minorTick")
  var minorTick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisMinorTick] = js.native
  /** Specifies the value to be used as the origin for the argument axis. */
  var originValue: js.UndefOr[Double] = js.native
  /** Specifies the period of the argument values in the data source. */
  var period: js.UndefOr[Double] = js.native
  /** Specifies the angle in arc degrees to which the argument axis should be rotated. The positive values rotate the axis clockwise. */
  var startAngle: js.UndefOr[Double] = js.native
  /** Specifies options for argument axis strips. */
  var strips: js.UndefOr[js.Array[dxPolarChartArgumentAxisStrips]] = js.native
  /** Specifies an interval between axis ticks/grid lines. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** An object defining the configuration options for axis ticks. */
  @JSName("tick")
  var tick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisTick] = js.native
  /** Specifies the required type of the argument axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
}

object dxPolarChartArgumentAxis {
  @scala.inline
  def apply(): dxPolarChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxis]
  }
  @scala.inline
  implicit class dxPolarChartArgumentAxisOps[Self <: dxPolarChartArgumentAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConstantLines(value: js.Array[dxPolarChartArgumentAxisConstantLines]): Self = {
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
    def withFirstPointOnStartAngle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPointOnStartAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPointOnStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPointOnStartAngle")(js.undefined)
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
    def withLabel(value: dxPolarChartArgumentAxisLabel): Self = {
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
    def withMinorTick(value: dxPolarChartArgumentAxisMinorTick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(js.undefined)
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
    def withOriginValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
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
    @scala.inline
    def withStrips(value: js.Array[dxPolarChartArgumentAxisStrips]): Self = {
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
    def withTick(value: dxPolarChartArgumentAxisTick): Self = {
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
  }
  
}

