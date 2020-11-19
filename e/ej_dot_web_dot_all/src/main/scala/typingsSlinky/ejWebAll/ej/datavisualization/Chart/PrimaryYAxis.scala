package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryYAxis extends js.Object {
  
  /** Specifies the position of the axis labels.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[LabelAlignment | String] = js.native
  
  /** Options for customizing vertical axis alternate grid band.
    */
  var alternateGridBand: js.UndefOr[PrimaryYAxisAlternateGridBand] = js.native
  
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[PrimaryYAxisAxisLine] = js.native
  
  /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
    * value of crossing axis, then axis will be placed at the opposite side.
    * @Default {null}
    */
  var crossesAt: js.UndefOr[Double] = js.native
  
  /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
    * axis or primary Y axis will be used for crossing
    * @Default {null}
    */
  var crossesInAxis: js.UndefOr[String] = js.native
  
  /** Options to customize the crosshair label.
    */
  var crosshairLabel: js.UndefOr[PrimaryYAxisCrosshairLabel] = js.native
  
  /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
    * @Default {null}
    */
  var desiredIntervals: js.UndefOr[Double] = js.native
  
  /** Specifies the position of labels at the edge of the axis.
    * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
    */
  var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.native
  
  /** Specifies the interval of the axis according to the zoomed data of the chart.
    * @Default {true}
    */
  var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the font of the axis Labels.
    */
  var font: js.UndefOr[PrimaryYAxisFont] = js.native
  
  /** Specifies the type of interval in date time axis.
    * @Default {null. See IntervalType}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.native
  
  /** Specifies whether to inverse the axis.
    * @Default {false}
    */
  var isInversed: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the border of the labels.
    */
  var labelBorder: js.UndefOr[PrimaryYAxisLabelBorder] = js.native
  
  /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
    * @Default {null}
    */
  var labelFormat: js.UndefOr[String] = js.native
  
  /** Specifies the action to take when the axis labels are overlapping with each other.
    * @Default {ej.datavisualization.Chart.LabelIntersectAction.None}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
  
  /** Specifies the placement of labels.
    * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  
  /** Specifies the position of the axis labels.
    * @Default {outside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | String] = js.native
  
  /** Logarithmic base value. This is applicable only for logarithmic axis.
    * @Default {10}
    */
  var logBase: js.UndefOr[Double] = js.native
  
  /** Options for customizing major gird lines.
    */
  var majorGridLines: js.UndefOr[PrimaryYAxisMajorGridLines] = js.native
  
  /** Options for customizing the major tick lines.
    */
  var majorTickLines: js.UndefOr[PrimaryYAxisMajorTickLines] = js.native
  
  /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
    * @Default {ej.datavisualization.Chart.maximumLabelWidth type {int}}
    */
  var maximumLabelWidth: js.UndefOr[Double] = js.native
  
  /** Maximum number of labels to be displayed in every 100 pixels.
    * @Default {3}
    */
  var maximumLabels: js.UndefOr[Double] = js.native
  
  /** Options for customizing the minor grid lines.
    */
  var minorGridLines: js.UndefOr[PrimaryYAxisMinorGridLines] = js.native
  
  /** Options for customizing the minor tick lines.
    */
  var minorTickLines: js.UndefOr[PrimaryYAxisMinorTickLines] = js.native
  
  /** Specifies the number of minor ticks per interval.
    * @Default {null}
    */
  var minorTicksPerInterval: js.UndefOr[Double] = js.native
  
  /** Options for customizing the multi level labels.
    * @Default {[ ]}
    */
  var multiLevelLabels: js.UndefOr[js.Array[PrimaryYAxisMultiLevelLabel]] = js.native
  
  /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  
  /** Specifies whether to render the axis at the opposite side of its default position.
    * @Default {false}
    */
  var opposedPosition: js.UndefOr[Boolean] = js.native
  
  /** Specifies the orientation of the axis line in the chart.
    * @Default {Vertical}
    */
  var orientation: js.UndefOr[AxisOrientation | String] = js.native
  
  /** Specifies the padding for the plot area.
    * @Default {10}
    */
  var plotOffset: js.UndefOr[Double] = js.native
  
  /** Options to customize the range of the axis.
    */
  var range: js.UndefOr[PrimaryYAxisRange] = js.native
  
  /** Specifies the padding for the axis range.
    * @Default {ej.datavisualization.Chart.RangePadding.None. See RangePadding}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.native
  
  /** Rounds the number to the given number of decimals.
    * @Default {null}
    */
  var roundingPlaces: js.UndefOr[Double] = js.native
  
  /** Specifies the index of the row to which the axis is associated, when the chart area is divided into multiple plot areas by using rowDefinitions.
    * @Default {null}
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the number of row or plot areas an axis has to span vertically.
    * @Default {null}
    */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /** Options for customizing the axis scrollbar.
    */
  var scrollbarSettings: js.UndefOr[PrimaryYAxisScrollbarSettings] = js.native
  
  /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
    * @Default {true}
    */
  var showNextToAxisLine: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the strip lines.
    * @Default {[ ]}
    */
  var stripLine: js.UndefOr[js.Array[PrimaryYAxisStripLine]] = js.native
  
  /** Specifies the position of the axis tick lines.
    * @Default {outside. See TickLinesPosition}
    */
  var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.native
  
  /** Options for customizing the axis title.
    */
  var title: js.UndefOr[PrimaryYAxisTitle] = js.native
  
  /** Specifies the type of data the axis is handling.
    * @Default {null. See ValueType}
    */
  var valueType: js.UndefOr[ValueType | String] = js.native
  
  /** Show/hides the axis.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Values ranges from 0 to 1.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
  
  /** Position of the zoomed axis. Value ranges from 0 to 1
    * @Default {0}
    */
  var zoomPosition: js.UndefOr[Double] = js.native
}
object PrimaryYAxis {
  
  @scala.inline
  def apply(): PrimaryYAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxis]
  }
  
  @scala.inline
  implicit class PrimaryYAxisOps[Self <: PrimaryYAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: LabelAlignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAlternateGridBand(value: PrimaryYAxisAlternateGridBand): Self = this.set("alternateGridBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateGridBand: Self = this.set("alternateGridBand", js.undefined)
    
    @scala.inline
    def setAxisLine(value: PrimaryYAxisAxisLine): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    
    @scala.inline
    def setCrossesAt(value: Double): Self = this.set("crossesAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossesAt: Self = this.set("crossesAt", js.undefined)
    
    @scala.inline
    def setCrossesInAxis(value: String): Self = this.set("crossesInAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossesInAxis: Self = this.set("crossesInAxis", js.undefined)
    
    @scala.inline
    def setCrosshairLabel(value: PrimaryYAxisCrosshairLabel): Self = this.set("crosshairLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairLabel: Self = this.set("crosshairLabel", js.undefined)
    
    @scala.inline
    def setDesiredIntervals(value: Double): Self = this.set("desiredIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredIntervals: Self = this.set("desiredIntervals", js.undefined)
    
    @scala.inline
    def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = this.set("edgeLabelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeLabelPlacement: Self = this.set("edgeLabelPlacement", js.undefined)
    
    @scala.inline
    def setEnableAutoIntervalOnZooming(value: Boolean): Self = this.set("enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoIntervalOnZooming: Self = this.set("enableAutoIntervalOnZooming", js.undefined)
    
    @scala.inline
    def setEnableTrim(value: Boolean): Self = this.set("enableTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrim: Self = this.set("enableTrim", js.undefined)
    
    @scala.inline
    def setFont(value: PrimaryYAxisFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setIntervalType(value: IntervalType | String): Self = this.set("intervalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalType: Self = this.set("intervalType", js.undefined)
    
    @scala.inline
    def setIsInversed(value: Boolean): Self = this.set("isInversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInversed: Self = this.set("isInversed", js.undefined)
    
    @scala.inline
    def setLabelBorder(value: PrimaryYAxisLabelBorder): Self = this.set("labelBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBorder: Self = this.set("labelBorder", js.undefined)
    
    @scala.inline
    def setLabelFormat(value: String): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    
    @scala.inline
    def setLabelIntersectAction(value: LabelIntersectAction | String): Self = this.set("labelIntersectAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIntersectAction: Self = this.set("labelIntersectAction", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: LabelPlacement | String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: LabelPosition | String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLogBase(value: Double): Self = this.set("logBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBase: Self = this.set("logBase", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: PrimaryYAxisMajorGridLines): Self = this.set("majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridLines: Self = this.set("majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTickLines(value: PrimaryYAxisMajorTickLines): Self = this.set("majorTickLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTickLines: Self = this.set("majorTickLines", js.undefined)
    
    @scala.inline
    def setMaximumLabelWidth(value: Double): Self = this.set("maximumLabelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLabelWidth: Self = this.set("maximumLabelWidth", js.undefined)
    
    @scala.inline
    def setMaximumLabels(value: Double): Self = this.set("maximumLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLabels: Self = this.set("maximumLabels", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: PrimaryYAxisMinorGridLines): Self = this.set("minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLines: Self = this.set("minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTickLines(value: PrimaryYAxisMinorTickLines): Self = this.set("minorTickLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickLines: Self = this.set("minorTickLines", js.undefined)
    
    @scala.inline
    def setMinorTicksPerInterval(value: Double): Self = this.set("minorTicksPerInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicksPerInterval: Self = this.set("minorTicksPerInterval", js.undefined)
    
    @scala.inline
    def setMultiLevelLabelsVarargs(value: PrimaryYAxisMultiLevelLabel*): Self = this.set("multiLevelLabels", js.Array(value :_*))
    
    @scala.inline
    def setMultiLevelLabels(value: js.Array[PrimaryYAxisMultiLevelLabel]): Self = this.set("multiLevelLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLevelLabels: Self = this.set("multiLevelLabels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpposedPosition(value: Boolean): Self = this.set("opposedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpposedPosition: Self = this.set("opposedPosition", js.undefined)
    
    @scala.inline
    def setOrientation(value: AxisOrientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPlotOffset(value: Double): Self = this.set("plotOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlotOffset: Self = this.set("plotOffset", js.undefined)
    
    @scala.inline
    def setRange(value: PrimaryYAxisRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRangePadding(value: RangePadding | String): Self = this.set("rangePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePadding: Self = this.set("rangePadding", js.undefined)
    
    @scala.inline
    def setRoundingPlaces(value: Double): Self = this.set("roundingPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingPlaces: Self = this.set("roundingPlaces", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setScrollbarSettings(value: PrimaryYAxisScrollbarSettings): Self = this.set("scrollbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarSettings: Self = this.set("scrollbarSettings", js.undefined)
    
    @scala.inline
    def setShowNextToAxisLine(value: Boolean): Self = this.set("showNextToAxisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNextToAxisLine: Self = this.set("showNextToAxisLine", js.undefined)
    
    @scala.inline
    def setStripLineVarargs(value: PrimaryYAxisStripLine*): Self = this.set("stripLine", js.Array(value :_*))
    
    @scala.inline
    def setStripLine(value: js.Array[PrimaryYAxisStripLine]): Self = this.set("stripLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripLine: Self = this.set("stripLine", js.undefined)
    
    @scala.inline
    def setTickLinesPosition(value: TickLinesPosition | String): Self = this.set("tickLinesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLinesPosition: Self = this.set("tickLinesPosition", js.undefined)
    
    @scala.inline
    def setTitle(value: PrimaryYAxisTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValueType(value: ValueType | String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
    
    @scala.inline
    def setZoomPosition(value: Double): Self = this.set("zoomPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomPosition: Self = this.set("zoomPosition", js.undefined)
  }
}
