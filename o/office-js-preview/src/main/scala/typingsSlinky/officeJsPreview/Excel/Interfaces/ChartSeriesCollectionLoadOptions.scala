package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of chart series.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeriesCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the color for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the color for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the color for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets series gradient style of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the fill color for negative data points in a series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the series parent label strategy area for a treemap chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[ChartPointsCollectionLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether or not connector lines are shown in waterfall charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether or not leader lines are displayed for each data label in the series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.native
}

object ChartSeriesCollectionLoadOptions {
  @scala.inline
  def apply(): ChartSeriesCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionLoadOptions]
  }
  @scala.inline
  implicit class ChartSeriesCollectionLoadOptionsOps[Self <: ChartSeriesCollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBinOptions(value: ChartBinOptionsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxwhiskerOptions(value: ChartBoxwhiskerOptionsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxwhiskerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxwhiskerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxwhiskerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleScale")(js.undefined)
        ret
    }
    @scala.inline
    def withChartType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(value: ChartDataLabelsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDoughnutHoleSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutHoleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoughnutHoleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutHoleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withExplosion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explosion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplosion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explosion")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSliceAngle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSliceAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSliceAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSliceAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartSeriesFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGapWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMaximumColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMaximumColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMaximumType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMaximumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumType")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMaximumValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMidpointColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMidpointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMidpointType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMidpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMidpointValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMidpointValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMidpointValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMinimumColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMinimumColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMinimumType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMinimumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumType")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientMinimumValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMinimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDataLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertIfNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertIfNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertIfNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertIfNegative")(js.undefined)
        ret
    }
    @scala.inline
    def withMapOptions(value: ChartMapOptionsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerBackgroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerForegroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerForegroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Boolean): Self = {
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
    def withOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLabelStrategy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabelStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLabelStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabelStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: ChartPointsCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondPlotSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondPlotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondPlotSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondPlotSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConnectorLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectorLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConnectorLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectorLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLeaderLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeaderLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLeaderLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeaderLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitType")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVaryByCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyByCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaryByCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyByCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withXErrorBars(value: ChartErrorBarsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXErrorBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorBars")(js.undefined)
        ret
    }
    @scala.inline
    def withYErrorBars(value: ChartErrorBarsLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYErrorBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorBars")(js.undefined)
        ret
    }
  }
  
}

