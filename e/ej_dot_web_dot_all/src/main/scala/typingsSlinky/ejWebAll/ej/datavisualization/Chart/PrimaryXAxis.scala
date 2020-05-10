package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryXAxis extends js.Object {
  /** Specifies the position of the axis labels.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[LabelAlignment | String] = js.native
  /** Options for customizing horizontal axis alternate grid band.
    */
  var alternateGridBand: js.UndefOr[PrimaryXAxisAlternateGridBand] = js.native
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[PrimaryXAxisAxisLine] = js.native
  /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
    * @Default {null}
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /** Specifies the number of columns or plot areas an axis has to span horizontally.
    * @Default {null}
    */
  var columnSpan: js.UndefOr[Double] = js.native
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
  var crosshairLabel: js.UndefOr[PrimaryXAxisCrosshairLabel] = js.native
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
  var font: js.UndefOr[PrimaryXAxisFont] = js.native
  /** Specifies the type of interval in date time axis.
    * @Default {null. See IntervalType}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.native
  /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
    * @Default {false}
    */
  var isIndexed: js.UndefOr[Boolean] = js.native
  /** Specifies whether to inverse the axis.
    * @Default {false}
    */
  var isInversed: js.UndefOr[Boolean] = js.native
  /** Options for customizing the border of the labels.
    */
  var labelBorder: js.UndefOr[PrimaryXAxisLabelBorder] = js.native
  /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
    * @Default {null}
    */
  var labelFormat: js.UndefOr[String] = js.native
  /** Specifies the action to take when the axis labels are overlapping with each other.
    * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
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
  /** Angle in degrees to rotate the axis labels.
    * @Default {null}
    */
  var labelRotation: js.UndefOr[Double] = js.native
  /** Logarithmic base value. This is applicable only for logarithmic axis.
    * @Default {10}
    */
  var logBase: js.UndefOr[Double] = js.native
  /** Options for customizing major gird lines.
    */
  var majorGridLines: js.UndefOr[PrimaryXAxisMajorGridLines] = js.native
  /** Options for customizing the major tick lines.
    */
  var majorTickLines: js.UndefOr[PrimaryXAxisMajorTickLines] = js.native
  /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
    * @Default {34}
    */
  var maximumLabelWidth: js.UndefOr[Double] = js.native
  /** Maximum number of labels to be displayed in every 100 pixels.
    * @Default {3}
    */
  var maximumLabels: js.UndefOr[Double] = js.native
  /** Options for customizing the minor grid lines.
    */
  var minorGridLines: js.UndefOr[PrimaryXAxisMinorGridLines] = js.native
  /** Options for customizing the minor tick lines.
    */
  var minorTickLines: js.UndefOr[PrimaryXAxisMinorTickLines] = js.native
  /** Specifies the number of minor ticks per interval.
    * @Default {null}
    */
  var minorTicksPerInterval: js.UndefOr[Double] = js.native
  /** Options for customizing the multi level labels.
    * @Default {[ ]}
    */
  var multiLevelLabels: js.UndefOr[js.Array[PrimaryXAxisMultiLevelLabel]] = js.native
  /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  /** Specifies whether to render the axis at the opposite side of its default position.
    * @Default {false}
    */
  var opposedPosition: js.UndefOr[Boolean] = js.native
  /** Specifies the orientation of the axis line
    * @Default {Horizontal}
    */
  var orientation: js.UndefOr[AxisOrientation | String] = js.native
  /** Specifies the padding for the plot area.
    * @Default {10}
    */
  var plotOffset: js.UndefOr[Double] = js.native
  /** Options to customize the range of the axis.
    */
  var range: js.UndefOr[PrimaryXAxisRange] = js.native
  /** Specifies the padding for the axis range.
    * @Default {None. See RangePadding}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.native
  /** Rounds the number to the given number of decimals.
    * @Default {null}
    */
  var roundingPlaces: js.UndefOr[Double] = js.native
  /** Options for customizing the axis scrollbar
    */
  var scrollbarSettings: js.UndefOr[PrimaryXAxisScrollbarSettings] = js.native
  /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
    * @Default {true}
    */
  var showNextToAxisLine: js.UndefOr[Boolean] = js.native
  /** Options for customizing the strip lines.
    * @Default {[ ]}
    */
  var stripLine: js.UndefOr[js.Array[PrimaryXAxisStripLine]] = js.native
  /** Specifies the position of the axis tick lines.
    * @Default {outside. See TickLinesPosition}
    */
  var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.native
  /** Options for customizing the axis title.
    */
  var title: js.UndefOr[PrimaryXAxisTitle] = js.native
  /** Specifies the type of data the axis is handling.
    * @Default {null. See ValueType}
    */
  var valueType: js.UndefOr[ValueType | String] = js.native
  /** Show/hides the axis.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
  /** Position of the zoomed axis. Value ranges from 0 to 1.
    * @Default {0}
    */
  var zoomPosition: js.UndefOr[Double] = js.native
}

object PrimaryXAxis {
  @scala.inline
  def apply(): PrimaryXAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryXAxis]
  }
  @scala.inline
  implicit class PrimaryXAxisOps[Self <: PrimaryXAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: LabelAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateGridBand(value: PrimaryXAxisAlternateGridBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateGridBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateGridBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateGridBand")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLine(value: PrimaryXAxisAxisLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossesAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossesAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossesInAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesInAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossesInAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossesInAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairLabel(value: PrimaryXAxisCrosshairLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredIntervals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredIntervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredIntervals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredIntervals")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLabelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLabelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoIntervalOnZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoIntervalOnZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoIntervalOnZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoIntervalOnZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrim")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PrimaryXAxisFont): Self = {
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
    def withIntervalType(value: IntervalType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIndexed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIndexed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndexed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInversed")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBorder(value: PrimaryXAxisLabelBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIntersectAction(value: LabelIntersectAction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIntersectAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIntersectAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIntersectAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPlacement(value: LabelPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
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
    def withLabelRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorGridLines(value: PrimaryXAxisMajorGridLines): Self = {
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
    def withMajorTickLines(value: PrimaryXAxisMajorTickLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLabelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLabels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLines(value: PrimaryXAxisMinorGridLines): Self = {
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
    def withMinorTickLines(value: PrimaryXAxisMinorTickLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicksPerInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicksPerInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicksPerInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicksPerInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLevelLabels(value: js.Array[PrimaryXAxisMultiLevelLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiLevelLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabels")(js.undefined)
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
    def withOpposedPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpposedPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposedPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: AxisOrientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: PrimaryXAxisRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangePadding(value: RangePadding | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarSettings(value: PrimaryXAxisScrollbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNextToAxisLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextToAxisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextToAxisLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextToAxisLine")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLine(value: js.Array[PrimaryXAxisStripLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLinesPosition(value: TickLinesPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLinesPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLinesPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLinesPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: PrimaryXAxisTitle): Self = {
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
    def withValueType(value: ValueType | String): Self = {
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
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomPosition")(js.undefined)
        ret
    }
  }
  
}

