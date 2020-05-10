package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.polygon
import typingsSlinky.devextreme.devextremeStrings.spline
import typingsSlinky.devextreme.devextremeStrings.splinearea
import typingsSlinky.devextreme.devextremeStrings.square
import typingsSlinky.devextreme.devextremeStrings.steparea
import typingsSlinky.devextreme.devextremeStrings.stepline
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.winloss
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSparklineOptions extends BaseSparklineOptions[dxSparkline] {
  /** Specifies the data source field that provides arguments for a sparkline. */
  var argumentField: js.UndefOr[String] = js.native
  /** Sets a color for the bars indicating negative values. Available for a sparkline of the bar type only. */
  var barNegativeColor: js.UndefOr[String] = js.native
  /** Sets a color for the bars indicating positive values. Available for a sparkline of the bar type only. */
  var barPositiveColor: js.UndefOr[String] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Sets a color for the boundary of both the first and last points on a sparkline. */
  var firstLastColor: js.UndefOr[String] = js.native
  /** Specifies whether the sparkline should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  /** Sets a color for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineColor: js.UndefOr[String] = js.native
  /** Specifies a width for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Sets a color for the bars indicating the values that are less than the winloss threshold. Available for a sparkline of the winloss type only. */
  var lossColor: js.UndefOr[String] = js.native
  /** Sets a color for the boundary of the maximum point on a sparkline. */
  var maxColor: js.UndefOr[String] = js.native
  /** Specifies the maximum value of the sparkline's value axis. */
  var maxValue: js.UndefOr[Double] = js.native
  /** Sets a color for the boundary of the minimum point on a sparkline. */
  var minColor: js.UndefOr[String] = js.native
  /** Specifies the minimum value of the sparkline value axis. */
  var minValue: js.UndefOr[Double] = js.native
  /** Sets a color for points on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointColor: js.UndefOr[String] = js.native
  /** Specifies the diameter of sparkline points in pixels. Available for the sparklines of line- and area-like types. */
  var pointSize: js.UndefOr[Double] = js.native
  /** Specifies a symbol to use as a point marker on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.native
  /** Specifies whether or not to indicate both the first and last values on a sparkline. */
  var showFirstLast: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to indicate both the minimum and maximum values on a sparkline. */
  var showMinMax: js.UndefOr[Boolean] = js.native
  /** Determines the type of a sparkline. */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.native
  /** Specifies the data source field that provides values for a sparkline. */
  var valueField: js.UndefOr[String] = js.native
  /** Sets a color for the bars indicating the values greater than a winloss threshold. Available for a sparkline of the winloss type only. */
  var winColor: js.UndefOr[String] = js.native
  /** Specifies a value that serves as a threshold for the sparkline of the winloss type. */
  var winlossThreshold: js.UndefOr[Double] = js.native
}

object dxSparklineOptions {
  @scala.inline
  def apply(): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSparklineOptions]
  }
  @scala.inline
  implicit class dxSparklineOptionsOps[Self <: dxSparklineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(js.undefined)
        ret
    }
    @scala.inline
    def withBarNegativeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barNegativeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarNegativeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barNegativeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarPositiveColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPositiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarPositiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPositiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLastColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLastColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLastColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLastColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmptyPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptyPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLossColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSymbol(value: circle | cross | polygon | square | triangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLast")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinMax")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: area | bar | line | spline | splinearea | steparea | stepline | winloss): Self = {
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
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
    @scala.inline
    def withWinColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWinlossThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winlossThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWinlossThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winlossThreshold")(js.undefined)
        ret
    }
  }
  
}

