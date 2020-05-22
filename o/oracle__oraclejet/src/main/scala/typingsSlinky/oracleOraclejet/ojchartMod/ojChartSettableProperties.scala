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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none
  var animationOnDisplay: auto | alphaFade | zoom | none
  var as: String
  var coordinateSystem: polar | cartesian
  var data: (DataProvider[K, D]) | Null
  var dataCursor: off | on | auto
  var dataCursorBehavior: smooth | snap | auto
  var dataCursorPosition: X
  var dnd: Drag
  var dragMode: pan | zoom | select | off | user
  var drilling: on | seriesOnly | groupsOnly | off
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: withRescale | withoutRescale | none
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var initialZooming: first | last | none
  var legend: BackgroundColor
  var orientation: horizontal | vertical
  var otherThreshold: Double
  var overview: Content
  var pieCenter: Converter
  var plotArea: BorderWidth
  var polarGridShape: polygon | circle
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var sorting: ascending | descending | off
  var splitDualY: on | off | auto
  var splitterPosition: Double
  var stack: on | off
  var stackLabel: on | off
  var styleDefaults: AnimationDownColor
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  var tooltip: Renderer
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojChartSettableProperties: ComponentName
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  var valueFormats: Close
  var xAxis: AxisLine
  var y2Axis: AlignTickMarks
  var yAxis: BaselineScaling
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  var zoomDirection: x | y | auto
  def dataLabel(context: DataLabelContext): Insert | PreventDefault
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
    zoomDirection: x | y | auto,
    data: DataProvider[K, D] = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groupComparator = js.Any.fromFunction2(groupComparator), seriesComparator = js.Any.fromFunction2(seriesComparator))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

