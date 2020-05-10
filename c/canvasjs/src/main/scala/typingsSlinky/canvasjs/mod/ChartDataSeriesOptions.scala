package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataSeriesOptions extends ChartDataCommon {
  /**
    * Setting axisXIndex lets you choose to which X axis the dataSeries should be attached.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first X axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisXIndex: js.UndefOr[Double] = js.native
  /**
    * Setting axisXType lets you choose between primary and secondary X Axis for a dataSeries to plot against. By choosing “secondary” Axis you can plot the series against axisX2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary X axis.
    */
  var axisXType: js.UndefOr[String] = js.native
  /**
    * Setting axisYIndex lets you choose to which Y axis the dataSeries should be attached to.
    * In case of Multi-Series or Combinational Charts, one can assign some series to first Y axis and rest to another axis.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against first axis.
    */
  var axisYIndex: js.UndefOr[Double] = js.native
  /**
    * Setting axisYType lets you choose between primary and secondary Y Axis for a dataSeries to plot against. By choosing "secondary" Axis you can plot the series against axisY2.
    * In case of Multi-Series or Combinational Charts, one can assign primary axis to some series and secondary axis to other series.
    * This is helpful when dataSeries objects use different unit of measurement or range of data. By default, all series are plotted against primary Y axis.
    * Default: "primary"
    * Options: "primary", "secondary"
    */
  var axisYType: js.UndefOr[String] = js.native
  /**
    * Sets the bevel property, which creates a chiselled effect at the corners of a Column Charts and Bar Charts.
    * Default: "true"
    * Example: "true", "false"
    */
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  /**
    * By default, a line breaks wherever a null dataPoint (y = null) is present.
    * You can change this behaviour to draw a line between adjacent non-null dataPoints by setting connectNullData to true.
    * Default: false
    * Example: true, false
    */
  var connectNullData: js.UndefOr[Boolean] = js.native
  /**
    * It represents collection dataPoint inside dataSeries.
    */
  var dataPoints: js.Array[ChartDataPoint] = js.native
  /**
    * Enables or disables exploding of Pie/Doughnut segment on click.
    * Default: true
    * Options: false, true
    */
  var explodeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Sets opacity of the filled color.
    * Default: .7 for Area Charts and 1 for all other chart types.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * innerRadius property allows you to set a Doughnut chart’s inner radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the outer radius of doughnut chart.
    * Default: “70%”
    * Example: 200, 150, “90%”, “75%”
    */
  var innerRadius: js.UndefOr[Double | String] = js.native
  /**
    * Sets the Line Dash Type for all Line and Area Charts.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets the thickness of line in line charts and area charts.
    * Default: 2
    * Example: 3,4..
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the Line Dash Type of line wherever null data is present.
    * Note:
    * 1.Will effect only if connectNullData is set to true.
    * 2.Supported with all Line and Area Charts.
    * 3.Not Supported on IE8.
    * Default: "dash"
    */
  var nullDataLineDashType: js.UndefOr[DashType] = js.native
  /**
    * Defines how percent values are formatted before they appear on the indexLabel or toolTip. You can format percent values using this property.
    */
  var percentFormatString: js.UndefOr[String] = js.native
  /**
    * radius property allows you to set the Pie/Doughnut chart’s (outer) radius.
    * Value can either be in pixels (number – ex: 100) or percent (string – ex: “80%”). Percent values are relative to the plot area’s size.
    * By default, a pie/doughnut chart’s size(radius) changes in order to best fit the indexLabels. This can lead to charts of different sizes in the same page.
    * In order to override this behavior and set equal sizes to all pie/doughnut charts in a page, you can use radius property.
    * Default: Automatically calculate in order to best fit the indexLabels.
    * Example: 200, 150, “90%”, “75%”
    */
  var radius: js.UndefOr[Double | String] = js.native
  /**
    * In candle Stick chart, when Closing Price is greater than Opening price, the body is filled with white by default and it can be overridden by risingColor property.
    * Default: "white"
    * Options: "red", "#DD7E86", etc.
    */
  var risingColor: js.UndefOr[String] = js.native
  /**
    * Setting this property to true makes the dataSeries to appear in legend. In case of pie/ doughnut chart, dataPoints of the single series chart appear in legend.
    * Default: false
    * Options: false, true
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * Sets the starting Angle of the Pie or Doughnut Chart in degrees.
    * Default: 0
    * Example: 30, 240, -100..
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * Sets the type of chart to be rendered for corresponding dataSeries. One can choose from the following options.
    * Default: "column"
    * Options:
    *     "line"
    *     "column"
    *     "bar"
    *     "area"
    *     "spline"
    *     "splineArea"
    *     "stepLine"
    *     "scatter"
    *     "bubble"
    *     "stackedColumn"
    *     "stackedBar"
    *     "stackedArea"
    *     "stackedColumn100"
    *     "stackedBar100"
    *     "stackedArea100"
    *     "pie"
    *     "doughnut"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of dataSeries. Data Series is visible by default and you can hide the same by setting visible property to false.
    * Default: true
    * Example: true, false
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Defines how x axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var xValueFormatString: js.UndefOr[String] = js.native
  /**
    * This defines the data type of x values. Data Type is normally figured out by default based on the object type that is assigned to x.
    * But if you are providing time stamp (which is integer) values instead of Date objects, you’ll have to explicitly set the xValueType to "dateTime".
    * Default: Automatically Calculated
    * Options: "number", "dateTime"
    */
  var xValueType: js.UndefOr[String] = js.native
  /**
    * Defines how y axis values must be formatted before they appear on the indexLabel or toolTip. You can format numbers and date time values using this property.
    */
  var yValueFormatString: js.UndefOr[String] = js.native
  /**
    * Defines how z values is formatted before they appear on the indexLabel or toolTip. You can format numbers using this property.
    */
  var zValueFormatString: js.UndefOr[String] = js.native
}

object ChartDataSeriesOptions {
  @scala.inline
  def apply(dataPoints: js.Array[ChartDataPoint]): ChartDataSeriesOptions = {
    val __obj = js.Dynamic.literal(dataPoints = dataPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSeriesOptions]
  }
  @scala.inline
  implicit class ChartDataSeriesOptionsOps[Self <: ChartDataSeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPoints(value: js.Array[ChartDataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisXIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisXIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisXIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisXIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisXType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisXType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisXType")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisYIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisYIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisYIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisYIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisYType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisYType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisYType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisYType")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectNullData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectNullData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectNullData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectNullData")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodeOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodeOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withNullDataLineDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullDataLineDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullDataLineDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullDataLineDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentFormatString")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRisingColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRisingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
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
    def withType(value: String): Self = {
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
    def withXValueFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXValueFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueFormatString")(js.undefined)
        ret
    }
    @scala.inline
    def withXValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueType")(js.undefined)
        ret
    }
    @scala.inline
    def withYValueFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValueFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYValueFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValueFormatString")(js.undefined)
        ret
    }
    @scala.inline
    def withZValueFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zValueFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZValueFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zValueFormatString")(js.undefined)
        ret
    }
  }
  
}

