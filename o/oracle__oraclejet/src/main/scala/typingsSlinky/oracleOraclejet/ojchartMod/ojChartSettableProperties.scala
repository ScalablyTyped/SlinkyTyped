package typingsSlinky.oracleOraclejet.ojchartMod

import typingsSlinky.oracleOraclejet.AnonAlignTickMarks
import typingsSlinky.oracleOraclejet.AnonAnimationDownColor
import typingsSlinky.oracleOraclejet.AnonAxisLine
import typingsSlinky.oracleOraclejet.AnonBackgroundColor
import typingsSlinky.oracleOraclejet.AnonBaselineScaling
import typingsSlinky.oracleOraclejet.AnonBorderWidth
import typingsSlinky.oracleOraclejet.AnonClose
import typingsSlinky.oracleOraclejet.AnonComponentName
import typingsSlinky.oracleOraclejet.AnonContent
import typingsSlinky.oracleOraclejet.AnonConverter
import typingsSlinky.oracleOraclejet.AnonDrag
import typingsSlinky.oracleOraclejet.AnonInsert
import typingsSlinky.oracleOraclejet.AnonPreventDefault
import typingsSlinky.oracleOraclejet.AnonRenderer
import typingsSlinky.oracleOraclejet.AnonX
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bubble
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cartesian
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.combo
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.delayed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.first
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.funnel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.last
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.live
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pan
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pie
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polygon
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pyramid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scatter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smooth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.snap
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stock
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.user
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withRescale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  var as: String = js.native
  var coordinateSystem: polar | cartesian = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dataCursor: off | on | auto = js.native
  var dataCursorBehavior: smooth | snap | auto = js.native
  var dataCursorPosition: AnonX = js.native
  var dnd: AnonDrag = js.native
  var dragMode: pan | zoom | select | off | user = js.native
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var initialZooming: first | last | none = js.native
  var legend: AnonBackgroundColor = js.native
  var orientation: horizontal | vertical = js.native
  var otherThreshold: Double = js.native
  var overview: AnonContent = js.native
  var pieCenter: AnonConverter = js.native
  var plotArea: AnonBorderWidth = js.native
  var polarGridShape: polygon | circle = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var sorting: ascending | descending | off = js.native
  var splitDualY: on | off | auto = js.native
  var splitterPosition: Double = js.native
  var stack: on | off = js.native
  var stackLabel: on | off = js.native
  var styleDefaults: AnonAnimationDownColor = js.native
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  var tooltip: AnonRenderer = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojChartSettableProperties: AnonComponentName = js.native
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  var valueFormats: AnonClose = js.native
  var xAxis: AnonAxisLine = js.native
  var y2Axis: AnonAlignTickMarks = js.native
  var yAxis: AnonBaselineScaling = js.native
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  var zoomDirection: x | y | auto = js.native
  def dataLabel(context: DataLabelContext): AnonInsert | AnonPreventDefault = js.native
}

object ojChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | slideToLeft | slideToRight | none,
    animationOnDisplay: auto | alphaFade | zoom | none,
    as: String,
    coordinateSystem: polar | cartesian,
    dataCursor: off | on | auto,
    dataCursorBehavior: smooth | snap | auto,
    dataCursorPosition: AnonX,
    dataLabel: DataLabelContext => AnonInsert | AnonPreventDefault,
    dnd: AnonDrag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: AnonBackgroundColor,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: AnonContent,
    pieCenter: AnonConverter,
    plotArea: AnonBorderWidth,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: AnonAnimationDownColor,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: AnonRenderer,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: AnonClose,
    xAxis: AnonAxisLine,
    y2Axis: AnonAlignTickMarks,
    yAxis: AnonBaselineScaling,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojChartSettablePropertiesOps[Self[k, d] <: ojChartSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinateSystem(value: polar | cartesian): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursor(value: off | on | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursorBehavior(value: smooth | snap | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursorBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCursorPosition(value: AnonX): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCursorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLabel(value: DataLabelContext => AnonInsert | AnonPreventDefault): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDnd(value: AnonDrag): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragMode(value: pan | zoom | select | off | user): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrilling(value: on | seriesOnly | groupsOnly | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideAndShowBehavior(value: withRescale | withoutRescale | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAndShowBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialZooming(value: first | last | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: AnonBackgroundColor): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherThreshold(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverview(value: AnonContent): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPieCenter(value: AnonConverter): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotArea(value: AnonBorderWidth): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolarGridShape(value: polygon | circle): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polarGridShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting(value: ascending | descending | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitDualY(value: on | off | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitDualY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterPosition(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackLabel(value: on | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AnonAnimationDownColor): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAxisType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: AnonRenderer): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonComponentName): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFormats(value: AnonClose): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAxis(value: AnonAxisLine): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2Axis(value: AnonAlignTickMarks): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2Axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: AnonBaselineScaling): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomDirection(value: x | y | auto): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroupComparatorNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComparator")(null)
        ret
    }
    @scala.inline
    def withSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeriesComparatorNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesComparator")(null)
        ret
    }
  }
  
}

