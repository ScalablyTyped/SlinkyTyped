package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series extends js.Object {
  /** Specifies animation duration for series rendering.
    * @Default {null}
    */
  var animationDuration: js.UndefOr[String] = js.native
  /** Color of the point, where the close is up in financial chart.
    * @Default {null}
    */
  var bearFillColor: js.UndefOr[String] = js.native
  /** Options for customizing the border of the series.
    */
  var border: js.UndefOr[SeriesBorder] = js.native
  /** Quartile calculation has been performed in three different formulas to render the boxplot series .
    * @Default {exclusive.See BoxPlotMode}
    */
  var boxPlotMode: js.UndefOr[LabelPosition | String] = js.native
  /** Options for customizing the bubble options of the Bubble series
    */
  var bubbleOptions: js.UndefOr[SeriesBubbleOptions] = js.native
  /** Color of the point, where the close is down in financial chart.
    * @Default {null}
    */
  var bullFillColor: js.UndefOr[String] = js.native
  /** Specifies spline tension values for cardinal spline type.Value ranges from 0 to 1.
    * @Default {0.5}
    */
  var cardinalSplineTension: js.UndefOr[Double] = js.native
  /** Name of the property in the datasource that contains close value for the series.
    * @Default {null}
    */
  var close: js.UndefOr[String] = js.native
  /** To render the column and bar type series in rectangle/cylinder shape. See ColumnFacet
    * @Default {rectangle}
    */
  var columnFacet: js.UndefOr[ColumnFacet | String] = js.native
  /** Spacing between columns of different series. Value ranges from 0 to 1
    * @Default {0}
    */
  var columnSpacing: js.UndefOr[Double] = js.native
  /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
    * @Default {0.7}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Options for customizing the waterfall connector line.
    */
  var connectorLine: js.UndefOr[SeriesConnectorLine] = js.native
  /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
    */
  var cornerRadius: js.UndefOr[SeriesCornerRadius] = js.native
  /** Pattern of dashes and gaps used to stroke the line type series.
    */
  var dashArray: js.UndefOr[String] = js.native
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1.
    * @Default {0.4}
    */
  var doughnutCoefficient: js.UndefOr[Double] = js.native
  /** Controls the size of the doughnut series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var doughnutSize: js.UndefOr[Double] = js.native
  /** Options to customize the drag and drop in series.
    */
  var dragSettings: js.UndefOr[SeriesDragSettings] = js.native
  /** Type of series to be drawn in radar or polar series.
    * @Default {line. See DrawType}
    */
  var drawType: js.UndefOr[DrawType | String] = js.native
  /** Options for customizing the empty point in the series.
    */
  var emptyPointSettings: js.UndefOr[SeriesEmptyPointSettings] = js.native
  /** Enable/disable the animation of series.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** To avoid overlapping of data labels smartly.
    * @Default {null}
    */
  var enableSmartLabels: js.UndefOr[Double] = js.native
  /** End angle of pie/doughnut series. For a complete circle, it has to be 360, by default.
    * @Default {null}
    */
  var endAngle: js.UndefOr[Double] = js.native
  /** Options to customize the error bar in series.
    */
  var errorBar: js.UndefOr[SeriesErrorBar] = js.native
  /** Explodes the pie/doughnut slices on mouse move.
    * @Default {false}
    */
  var explode: js.UndefOr[Boolean] = js.native
  /** Explodes all the slice of pie/doughnut on render.
    * @Default {null}
    */
  var explodeAll: js.UndefOr[Boolean] = js.native
  /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
    * @Default {null}
    */
  var explodeIndex: js.UndefOr[Double] = js.native
  /** Specifies the distance of the slice from the center, when it is exploded.
    * @Default {25}
    */
  var explodeOffset: js.UndefOr[Double] = js.native
  /** Fill color of the series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the series font.
    */
  var font: js.UndefOr[SeriesFont] = js.native
  /** Specifies the height of the funnel in funnel series. Values can be in both pixel and percentage.
    * @Default {32.7%}
    */
  var funnelHeight: js.UndefOr[String] = js.native
  /** Specifies the width of the funnel in funnel series. Values can be in both pixel and percentage.
    * @Default {11.6%}
    */
  var funnelWidth: js.UndefOr[String] = js.native
  /** Gap between the slices of pyramid/funnel series.
    * @Default {0}
    */
  var gapRatio: js.UndefOr[Double] = js.native
  /** Distance between the two pie's in pieOfPie series.
    * @Default {50}
    */
  var gapWidth: js.UndefOr[Double] = js.native
  /** Name of the property in the datasource that contains high value for the series.
    * @Default {null}
    */
  var high: js.UndefOr[String] = js.native
  /** Options for customizing the appearance of the series or data point while highlighting.
    */
  var highlightSettings: js.UndefOr[SeriesHighlightSettings] = js.native
  /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
    * @Default {true}
    */
  var isClosed: js.UndefOr[Boolean] = js.native
  /** Specifies whether to stack the column series in polar/radar charts.
    * @Default {true}
    */
  var isStacking: js.UndefOr[Boolean] = js.native
  /** Renders the chart vertically. This is applicable only for Cartesian type series.
    * @Default {false}
    */
  var isTransposed: js.UndefOr[Boolean] = js.native
  /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
    * @Default {inside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | String] = js.native
  /** Specifies the line cap of the series.
    * @Default {Butt. See LineCap}
    */
  var lineCap: js.UndefOr[LineCap | String] = js.native
  /** Specifies the type of shape to be used where two lines meet.
    * @Default {Round. See LineJoin}
    */
  var lineJoin: js.UndefOr[LineJoin | String] = js.native
  /** Name of the property in the datasource that contains low value for the series.
    * @Default {null}
    */
  var low: js.UndefOr[String] = js.native
  /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[SeriesMarker] = js.native
  /** Name of the series, that is to be displayed in the legend.
    * @Default {Add a comment to this line}
    */
  var name: js.UndefOr[String] = js.native
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Name of the property in the datasource that contains open value for the series.
    * @Default {null}
    */
  var open: js.UndefOr[String] = js.native
  /** Options for customizing the outlier of individual series.
    */
  var outlierSettings: js.UndefOr[SeriesOutlierSettings] = js.native
  /** Name of a field in data source where fill color for all the data points is generated.
    */
  var palette: js.UndefOr[String] = js.native
  /** Controls the size of pie series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var pieCoefficient: js.UndefOr[Double] = js.native
  /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
    * @Default {0.6}
    */
  var pieOfPieCoefficient: js.UndefOr[Double] = js.native
  /** Name of the property in the datasource that contains fill color for the series.
    * @Default {null}
    */
  var pointColorMappingName: js.UndefOr[String] = js.native
  /** Option to add data points; each point should have x and y property. Also, optionally, you can customize the points color, border, marker by using fill, border and marker options.
    */
  var points: js.UndefOr[js.Array[SeriesPoint]] = js.native
  /** Fill color for the positive column of the waterfall.
    * @Default {null}
    */
  var positiveFill: js.UndefOr[String] = js.native
  /** Specifies the mode of the pyramid series.
    * @Default {linear}
    */
  var pyramidMode: js.UndefOr[PyramidMode | String] = js.native
  /** Specifies ej.Query to select data from dataSource. This property is applicable only when the dataSource is ej.DataManager.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Options for customizing the appearance of the series/data point on selection.
    */
  var selectionSettings: js.UndefOr[SeriesSelectionSettings] = js.native
  /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
    * @Default {true}
    */
  var showMedian: js.UndefOr[Boolean] = js.native
  /** Name of the property in the datasource that contains the size value for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[String] = js.native
  /** Specifies the different types of spline curve.
    * @Default {Natural. See SplineType}
    */
  var splineType: js.UndefOr[SplineType | String] = js.native
  /** Specifies the mode for splitting the data points in pieOfPie series.
    * @Default {value. See SplitMode}
    */
  var splitMode: js.UndefOr[SplitMode | String] = js.native
  /** Split Value of pieOfPie series.
    * @Default {null}
    */
  var splitValue: js.UndefOr[String] = js.native
  /** To group the series of stacking collection.
    */
  var stackingGroup: js.UndefOr[String] = js.native
  /** Start angle from where the pie/doughnut series renders. It starts from 0, by default.
    * @Default {null}
    */
  var startAngle: js.UndefOr[Double] = js.native
  /** Options for customizing the tooltip of chart.
    */
  var tooltip: js.UndefOr[SeriesTooltip] = js.native
  /** Option to add trendlines to chart.
    */
  var trendlines: js.UndefOr[js.Array[SeriesTrendline]] = js.native
  /** Specifies the type of the series to render in chart.
    * @Default {column. see Type}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  /** Controls the visibility of the series.
    * @Default {visible}
    */
  var visibility: js.UndefOr[String] = js.native
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var xAxisName: js.UndefOr[String] = js.native
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var yAxisName: js.UndefOr[String] = js.native
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
  /** Z-order of the series.
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object Series {
  @scala.inline
  def apply(): Series = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Series]
  }
  @scala.inline
  implicit class SeriesOps[Self <: Series] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBearFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: SeriesBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxPlotMode(value: LabelPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPlotMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxPlotMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPlotMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleOptions(value: SeriesBubbleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBullFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCardinalSplineTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalSplineTension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinalSplineTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalSplineTension")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFacet(value: ColumnFacet | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFacet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFacet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFacet")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorLine(value: SeriesConnectorLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLine")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: SeriesCornerRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withDoughnutCoefficient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutCoefficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoughnutCoefficient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutCoefficient")(js.undefined)
        ret
    }
    @scala.inline
    def withDoughnutSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoughnutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doughnutSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDragSettings(value: SeriesDragSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawType(value: DrawType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawType")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyPointSettings(value: SeriesEmptyPointSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPointSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyPointSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPointSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSmartLabels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSmartLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSmartLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSmartLabels")(js.undefined)
        ret
    }
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
    def withErrorBar(value: SeriesErrorBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBar")(js.undefined)
        ret
    }
    @scala.inline
    def withExplode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explode")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodeAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodeAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: SeriesFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFunnelHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunnelHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFunnelWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunnelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGapRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withGapWidth(value: Double): Self = {
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
    def withHigh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSettings(value: SeriesHighlightSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStacking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStacking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStacking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStacking")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTransposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransposed")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: LabelPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: LineCap | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: LineJoin | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: SeriesMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlierSettings(value: SeriesOutlierSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlierSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPieCoefficient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCoefficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieCoefficient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCoefficient")(js.undefined)
        ret
    }
    @scala.inline
    def withPieOfPieCoefficient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieOfPieCoefficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieOfPieCoefficient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieOfPieCoefficient")(js.undefined)
        ret
    }
    @scala.inline
    def withPointColorMappingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColorMappingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointColorMappingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColorMappingName")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[SeriesPoint]): Self = {
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
    def withPositiveFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveFill")(js.undefined)
        ret
    }
    @scala.inline
    def withPyramidMode(value: PyramidMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramidMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPyramidMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramidMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionSettings(value: SeriesSelectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMedian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMedian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMedian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMedian")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSplineType(value: SplineType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineType")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitMode(value: SplitMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitValue(value: String): Self = {
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
    def withStackingGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackingGroup")(js.undefined)
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
    def withTooltip(value: SeriesTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendlines(value: js.Array[SeriesTrendline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendlines")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type | String): Self = {
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
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleOnLegend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(js.undefined)
        ret
    }
    @scala.inline
    def withXName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(js.undefined)
        ret
    }
    @scala.inline
    def withYName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(js.undefined)
        ret
    }
    @scala.inline
    def withZOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(js.undefined)
        ret
    }
  }
  
}

