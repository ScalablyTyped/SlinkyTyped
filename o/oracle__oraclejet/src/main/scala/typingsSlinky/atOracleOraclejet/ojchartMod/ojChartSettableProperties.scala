package typingsSlinky.atOracleOraclejet.ojchartMod

import typingsSlinky.atOracleOraclejet.Anon_AboveMarker
import typingsSlinky.atOracleOraclejet.Anon_AlignTickMarks
import typingsSlinky.atOracleOraclejet.Anon_AsNeeded
import typingsSlinky.atOracleOraclejet.Anon_Auto
import typingsSlinky.atOracleOraclejet.Anon_AutoAxisLine
import typingsSlinky.atOracleOraclejet.Anon_AxisLine
import typingsSlinky.atOracleOraclejet.Anon_BackgroundColor
import typingsSlinky.atOracleOraclejet.Anon_Close
import typingsSlinky.atOracleOraclejet.Anon_ComponentName
import typingsSlinky.atOracleOraclejet.Anon_Content
import typingsSlinky.atOracleOraclejet.Anon_Context
import typingsSlinky.atOracleOraclejet.Anon_Drag
import typingsSlinky.atOracleOraclejet.Anon_Insert
import typingsSlinky.atOracleOraclejet.Anon_PreventDefault
import typingsSlinky.atOracleOraclejet.Anon_X
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.alphaFade
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.area
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ascending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.boxPlot
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bubble
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cartesian
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.combo
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.delayed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.delayedScrollOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.descending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.first
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.funnel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupsOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.last
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.live
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.liveScrollOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mixedFrequency
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pan
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pie
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polygon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pyramid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scatter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.select
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.skipGaps
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.slideToLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.slideToRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smooth
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.snap
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stock
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.user
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withRescale
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withoutRescale
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.x
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.y
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
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
  var dataCursorPosition: Anon_X
  var dnd: Anon_Drag
  var dragMode: pan | zoom | select | off | user
  var drilling: on | seriesOnly | groupsOnly | off
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: withRescale | withoutRescale | none
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var initialZooming: first | last | none
  var legend: Anon_AsNeeded
  var orientation: horizontal | vertical
  var otherThreshold: Double
  var overview: Anon_Content
  var pieCenter: Anon_Auto
  var plotArea: Anon_BackgroundColor
  var polarGridShape: polygon | circle
  var selection: js.Array[K]
  var selectionMode: single | multiple | none
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null
  var sorting: ascending | descending | off
  var splitDualY: on | off | auto
  var splitterPosition: Double
  var stack: on | off
  var stackLabel: on | off
  var styleDefaults: Anon_AboveMarker
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto
  var tooltip: Anon_Context
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojChartSettableProperties: Anon_ComponentName
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  var valueFormats: Anon_Close
  var xAxis: Anon_AxisLine
  var y2Axis: Anon_AlignTickMarks
  var yAxis: Anon_AutoAxisLine
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off
  var zoomDirection: x | y | auto
  def dataLabel(context: DataLabelContext): Anon_Insert | Anon_PreventDefault
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
    dataCursorPosition: Anon_X,
    dataLabel: DataLabelContext => Anon_Insert | Anon_PreventDefault,
    dnd: Anon_Drag,
    dragMode: pan | zoom | select | off | user,
    drilling: on | seriesOnly | groupsOnly | off,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: withRescale | withoutRescale | none,
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: first | last | none,
    legend: Anon_AsNeeded,
    orientation: horizontal | vertical,
    otherThreshold: Double,
    overview: Anon_Content,
    pieCenter: Anon_Auto,
    plotArea: Anon_BackgroundColor,
    polarGridShape: polygon | circle,
    selection: js.Array[K],
    selectionMode: single | multiple | none,
    sorting: ascending | descending | off,
    splitDualY: on | off | auto,
    splitterPosition: Double,
    stack: on | off,
    stackLabel: on | off,
    styleDefaults: Anon_AboveMarker,
    timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto,
    tooltip: Anon_Context,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentName,
    `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar,
    valueFormats: Anon_Close,
    xAxis: Anon_AxisLine,
    y2Axis: Anon_AlignTickMarks,
    yAxis: Anon_AutoAxisLine,
    zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off,
    zoomDirection: x | y | auto,
    data: DataProvider[K, D] = null,
    groupComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null,
    seriesComparator: (/* param0 */ js.Object, /* param1 */ js.Object) => Double = null
  ): ojChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataCursorBehavior = dataCursorBehavior.asInstanceOf[js.Any], dataCursorPosition = dataCursorPosition.asInstanceOf[js.Any], dataLabel = js.Any.fromFunction1(dataLabel), dnd = dnd.asInstanceOf[js.Any], dragMode = dragMode.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], pieCenter = pieCenter.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], polarGridShape = polarGridShape.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], splitDualY = splitDualY.asInstanceOf[js.Any], splitterPosition = splitterPosition.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stackLabel = stackLabel.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], timeAxisType = timeAxisType.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zoomAndScroll = zoomAndScroll.asInstanceOf[js.Any], zoomDirection = zoomDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupComparator != null) __obj.updateDynamic("groupComparator")(js.Any.fromFunction2(groupComparator))
    if (seriesComparator != null) __obj.updateDynamic("seriesComparator")(js.Any.fromFunction2(seriesComparator))
    __obj.asInstanceOf[ojChartSettableProperties[K, D]]
  }
}

