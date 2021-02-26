package typingsSlinky.oracleOraclejet.ojchartMod

import typingsSlinky.oracleOraclejet.anon.AlignTickMarks
import typingsSlinky.oracleOraclejet.anon.AnimationDownColor
import typingsSlinky.oracleOraclejet.anon.AxisLine
import typingsSlinky.oracleOraclejet.anon.BackgroundColor
import typingsSlinky.oracleOraclejet.anon.BaselineScaling
import typingsSlinky.oracleOraclejet.anon.BorderWidth
import typingsSlinky.oracleOraclejet.anon.Close
import typingsSlinky.oracleOraclejet.anon.ComponentName
import typingsSlinky.oracleOraclejet.anon.Content
import typingsSlinky.oracleOraclejet.anon.Converter
import typingsSlinky.oracleOraclejet.anon.Drag
import typingsSlinky.oracleOraclejet.anon.Insert
import typingsSlinky.oracleOraclejet.anon.PreventDefault
import typingsSlinky.oracleOraclejet.anon.Renderer
import typingsSlinky.oracleOraclejet.anon.X
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  
  var as: String = js.native
  
  var coordinateSystem: polar | cartesian = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var dataCursor: off | on | auto = js.native
  
  var dataCursorBehavior: smooth | snap | auto = js.native
  
  var dataCursorPosition: X = js.native
  
  def dataLabel(context: DataLabelContext): Insert | PreventDefault = js.native
  
  var dnd: Drag = js.native
  
  var dragMode: pan | zoom | select | off | user = js.native
  
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var initialZooming: first | last | none = js.native
  
  var legend: BackgroundColor = js.native
  
  var orientation: horizontal | vertical = js.native
  
  var otherThreshold: Double = js.native
  
  var overview: Content = js.native
  
  var pieCenter: Converter = js.native
  
  var plotArea: BorderWidth = js.native
  
  var polarGridShape: polygon | circle = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  var sorting: ascending | descending | off = js.native
  
  var splitDualY: on | off | auto = js.native
  
  var splitterPosition: Double = js.native
  
  var stack: on | off = js.native
  
  var stackLabel: on | off = js.native
  
  var styleDefaults: AnimationDownColor = js.native
  
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  
  var tooltip: Renderer = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojChartSettableProperties: ComponentName = js.native
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  
  var valueFormats: Close = js.native
  
  var xAxis: AxisLine = js.native
  
  var y2Axis: AlignTickMarks = js.native
  
  var yAxis: BaselineScaling = js.native
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  
  var zoomDirection: x | y | auto = js.native
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
    dataCursorPosition: X,
    dataLabel: DataLabelContext => Insert | PreventDefault,
    dnd: Drag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: BackgroundColor,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: Content,
    pieCenter: Converter,
    plotArea: BorderWidth,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: AnimationDownColor,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: Renderer,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: ComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: Close,
    xAxis: AxisLine,
    y2Axis: AlignTickMarks,
    yAxis: BaselineScaling,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojChartSettablePropertiesMutableBuilder[Self <: ojChartSettableProperties[_, _], K, D] (val x: Self with (ojChartSettableProperties[K, D])) extends AnyVal {
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | slideToLeft | slideToRight | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | alphaFade | zoom | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateSystem(value: polar | cartesian): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursor(value: off | on | auto): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursorBehavior(value: smooth | snap | auto): Self = StObject.set(x, "dataCursorBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCursorPosition(value: X): Self = StObject.set(x, "dataCursorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabel(value: DataLabelContext => Insert | PreventDefault): Self = StObject.set(x, "dataLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDnd(value: Drag): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMode(value: pan | zoom | select | off | user): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilling(value: on | seriesOnly | groupsOnly | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "groupComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupComparatorNull: Self = StObject.set(x, "groupComparator", null)
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHideAndShowBehavior(value: withRescale | withoutRescale | none): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialZooming(value: first | last | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: BackgroundColor): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherThreshold(value: Double): Self = StObject.set(x, "otherThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview(value: Content): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieCenter(value: Converter): Self = StObject.set(x, "pieCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotArea(value: BorderWidth): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarGridShape(value: polygon | circle): Self = StObject.set(x, "polarGridShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Array[K]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: K*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setSeriesComparator(value: (/* param0 */ js.Object, /* param1 */ js.Object) => Double): Self = StObject.set(x, "seriesComparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesComparatorNull: Self = StObject.set(x, "seriesComparator", null)
    
    @scala.inline
    def setSorting(value: ascending | descending | off): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitDualY(value: on | off | auto): Self = StObject.set(x, "splitDualY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterPosition(value: Double): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: on | off): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackLabel(value: on | off): Self = StObject.set(x, "stackLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaults(value: AnimationDownColor): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAxisType(value: enabled | mixedFrequency | skipGaps | disabled | auto): Self = StObject.set(x, "timeAxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: Renderer): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: ComponentName): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormats(value: Close): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: AxisLine): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Axis(value: AlignTickMarks): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: BaselineScaling): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndScroll(value: delayedScrollOnly | liveScrollOnly | delayed | live | off): Self = StObject.set(x, "zoomAndScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDirection(value: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
  }
}
