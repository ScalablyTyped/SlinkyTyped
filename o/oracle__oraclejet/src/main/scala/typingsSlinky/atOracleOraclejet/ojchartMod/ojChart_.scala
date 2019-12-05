package typingsSlinky.atOracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
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
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.`type`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.alphaFade
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.area
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ascending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.boxPlot
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bubble
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cartesian
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.combo
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.coordinateSystem
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.coordinateSystemChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursor
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursorBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursorBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursorPosition
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataCursorPositionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataLabelChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.delayed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.delayedScrollOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.descending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dragModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drilling
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.drillingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.first
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.funnel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupComparator
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupComparatorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.groupsOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hideAndShowBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hideAndShowBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialZooming
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialZoomingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.last
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.legend
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.legendChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.live
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.liveScrollOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mixedFrequency
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojDrill
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojSelectInput
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojViewportChange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojViewportChangeInput
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.orientation
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.orientationChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherThreshold
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.otherThresholdChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.overview
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.overviewChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pan
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pie
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pieCenter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pieCenterChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plotArea
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plotAreaChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polarGridShape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polarGridShapeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.polygon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pyramid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scatter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.select
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selection
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesComparator
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesComparatorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seriesOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.skipGaps
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.slideToLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.slideToRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smooth
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.snap
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sorting
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sortingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.splitDualY
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.splitDualYChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.splitterPosition
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.splitterPositionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stack
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stackChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stackLabel
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stackLabelChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.stock
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaults
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.timeAxisType
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.timeAxisTypeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponseChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.typeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.user
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueFormats
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueFormatsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withRescale
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.withoutRescale
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.x
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xAxis
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xAxisChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.y
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.y2Axis
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.y2AxisChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.yAxis
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.yAxisChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoomAndScroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoomAndScrollChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoomDirection
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoomDirectionChanged
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.AxisTitleContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.GroupContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.ItemContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.LegendItemContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.PieCenterLabelContext
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.ReferenceObject
import typingsSlinky.atOracleOraclejet.ojchartMod.ojChart.SeriesContext
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojChart")
@js.native
trait ojChart_[K, D] extends dvtBaseComponent[ojChartSettableProperties[K, D]] {
  var animationOnDataChange: auto | slideToLeft | slideToRight | none = js.native
  var animationOnDisplay: auto | alphaFade | zoom | none = js.native
  var as: String = js.native
  var coordinateSystem: polar | cartesian = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dataCursor: off | on | auto = js.native
  var dataCursorBehavior: smooth | snap | auto = js.native
  var dataCursorPosition: Anon_X = js.native
  var dnd: Anon_Drag = js.native
  var dragMode: pan | zoom | select | off | user = js.native
  var drilling: on | seriesOnly | groupsOnly | off = js.native
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var initialZooming: first | last | none = js.native
  var legend: Anon_AsNeeded = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCoordinateSystemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataCursorPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDragModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupComparatorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHideAndShowBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLegendChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjDrill: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSelectInput: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjViewportChange: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjViewportChangeInput: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOverviewChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPieCenterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlotAreaChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPolarGridShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSeriesComparatorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSortingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSplitDualYChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSplitterPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStackChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStackLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTimeAxisTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueFormatsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onXAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onY2AxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onYAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomAndScrollChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomDirectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  var otherThreshold: Double = js.native
  var overview: Anon_Content = js.native
  var pieCenter: Anon_Auto = js.native
  var plotArea: Anon_BackgroundColor = js.native
  var polarGridShape: polygon | circle = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  var sorting: ascending | descending | off = js.native
  var splitDualY: on | off | auto = js.native
  var splitterPosition: Double = js.native
  var stack: on | off = js.native
  var stackLabel: on | off = js.native
  var styleDefaults: Anon_AboveMarker = js.native
  var timeAxisType: enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  var tooltip: Anon_Context = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojChart_ : Anon_ComponentName = js.native
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  var valueFormats: Anon_Close = js.native
  var xAxis: Anon_AxisLine = js.native
  var y2Axis: Anon_AlignTickMarks = js.native
  var yAxis: Anon_AutoAxisLine = js.native
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  var zoomDirection: x | y | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | slideToLeft | slideToRight | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | alphaFade | zoom | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polar | cartesian], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[smooth | snap | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[pan | zoom | select | off | user], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[on | seriesOnly | groupsOnly | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[withRescale | withoutRescale | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[first | last | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _]
  ): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[polygon | circle], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[ascending | descending | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[enabled | mixedFrequency | skipGaps | disabled | auto], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[delayedScrollOnly | liveScrollOnly | delayed | live | off], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def dataLabel(context: DataLabelContext): Anon_Insert | Anon_PreventDefault = js.native
  def getContextByNode(node: Element): PieCenterLabelContext | LegendItemContext | ReferenceObject | GroupContext | AxisTitleContext | ItemContext | SeriesContext = js.native
  def getDataItem(seriesIndex: Double, groupIndex: Double): js.Object | Null = js.native
  def getGroup(groupIndex: String): String = js.native
  def getGroupCount(): Double = js.native
  def getLegend(): js.Object = js.native
  def getPlotArea(): js.Object = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | slideToLeft | slideToRight | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | alphaFade | zoom | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_coordinateSystem(property: coordinateSystem): polar | cartesian = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_dataCursor(property: dataCursor): off | on | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorBehavior(property: dataCursorBehavior): smooth | snap | auto = js.native
  @JSName("getProperty")
  def getProperty_dataCursorPosition(property: dataCursorPosition): Anon_X = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_Drag = js.native
  @JSName("getProperty")
  def getProperty_dragMode(property: dragMode): pan | zoom | select | off | user = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | seriesOnly | groupsOnly | off = js.native
  @JSName("getProperty")
  def getProperty_groupComparator(property: groupComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hideAndShowBehavior(property: hideAndShowBehavior): withRescale | withoutRescale | none = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: initialZooming): first | last | none = js.native
  @JSName("getProperty")
  def getProperty_legend(property: legend): Anon_AsNeeded = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Anon_Content = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): Anon_Auto = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): Anon_BackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_polarGridShape(property: polarGridShape): polygon | circle = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_seriesComparator(property: seriesComparator): (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: sorting): ascending | descending | off = js.native
  @JSName("getProperty")
  def getProperty_splitDualY(property: splitDualY): on | off | auto = js.native
  @JSName("getProperty")
  def getProperty_splitterPosition(property: splitterPosition): Double = js.native
  @JSName("getProperty")
  def getProperty_stack(property: stack): on | off = js.native
  @JSName("getProperty")
  def getProperty_stackLabel(property: stackLabel): on | off = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): Anon_AboveMarker = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon_Context = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): Anon_Close = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): Anon_AxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): Anon_AlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): Anon_AutoAxisLine = js.native
  @JSName("getProperty")
  def getProperty_zoomAndScroll(property: zoomAndScroll): delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  @JSName("getProperty")
  def getProperty_zoomDirection(property: zoomDirection): x | y | auto = js.native
  def getSeries(seriesIndex: String): String = js.native
  def getSeriesCount(): Double = js.native
  def getValuesAt(x: Double, y: Double): js.Object = js.native
  def getXAxis(): js.Object = js.native
  def getY2Axis(): js.Object = js.native
  def getYAxis(): js.Object = js.native
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(
    property: `type`,
    value: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar
  ): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToLeft): Unit = js.native
  def setProperty(property: animationOnDataChange, value: slideToRight): Unit = js.native
  def setProperty(property: animationOnDisplay, value: alphaFade): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: zoom): Unit = js.native
  def setProperty(property: coordinateSystem, value: cartesian): Unit = js.native
  def setProperty(property: coordinateSystem, value: polar): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: auto): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: smooth): Unit = js.native
  def setProperty(property: dataCursorBehavior, value: snap): Unit = js.native
  def setProperty(property: dataCursor, value: auto): Unit = js.native
  def setProperty(property: dataCursor, value: off): Unit = js.native
  def setProperty(property: dataCursor, value: on): Unit = js.native
  def setProperty(property: dragMode, value: off): Unit = js.native
  def setProperty(property: dragMode, value: pan): Unit = js.native
  def setProperty(property: dragMode, value: select): Unit = js.native
  def setProperty(property: dragMode, value: user): Unit = js.native
  def setProperty(property: dragMode, value: zoom): Unit = js.native
  def setProperty(property: drilling, value: groupsOnly): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: drilling, value: seriesOnly): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: none): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withRescale): Unit = js.native
  def setProperty(property: hideAndShowBehavior, value: withoutRescale): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: initialZooming, value: first): Unit = js.native
  def setProperty(property: initialZooming, value: last): Unit = js.native
  def setProperty(property: initialZooming, value: none): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: polarGridShape, value: circle): Unit = js.native
  def setProperty(property: polarGridShape, value: polygon): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: sorting, value: ascending): Unit = js.native
  def setProperty(property: sorting, value: descending): Unit = js.native
  def setProperty(property: sorting, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: auto): Unit = js.native
  def setProperty(property: splitDualY, value: off): Unit = js.native
  def setProperty(property: splitDualY, value: on): Unit = js.native
  def setProperty(property: stackLabel, value: off): Unit = js.native
  def setProperty(property: stackLabel, value: on): Unit = js.native
  def setProperty(property: stack, value: off): Unit = js.native
  def setProperty(property: stack, value: on): Unit = js.native
  def setProperty(property: timeAxisType, value: auto): Unit = js.native
  def setProperty(property: timeAxisType, value: disabled): Unit = js.native
  def setProperty(property: timeAxisType, value: enabled): Unit = js.native
  def setProperty(property: timeAxisType, value: mixedFrequency): Unit = js.native
  def setProperty(property: timeAxisType, value: skipGaps): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayed): Unit = js.native
  def setProperty(property: zoomAndScroll, value: delayedScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: live): Unit = js.native
  def setProperty(property: zoomAndScroll, value: liveScrollOnly): Unit = js.native
  def setProperty(property: zoomAndScroll, value: off): Unit = js.native
  def setProperty(property: zoomDirection, value: auto): Unit = js.native
  def setProperty(property: zoomDirection, value: x): Unit = js.native
  def setProperty(property: zoomDirection, value: y): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: Anon_X): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_Drag): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(property: groupComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_groupComparator(
    property: groupComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_legend(property: legend, value: Anon_AsNeeded): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Anon_Content): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: Anon_Auto): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: Anon_BackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(property: seriesComparator): Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesComparator(
    property: seriesComparator,
    value: js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_splitterPosition(property: splitterPosition, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: Anon_AboveMarker): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon_Context): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: Anon_Close): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: Anon_AxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: Anon_AlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: Anon_AutoAxisLine): Unit = js.native
}

