package typingsSlinky.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
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
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.AxisTitleContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.DataLabelContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.GroupContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.ItemContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.LegendItemContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.PieCenterLabelContext
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.ReferenceObject
import typingsSlinky.oracleOraclejet.ojchartMod.ojChart.SeriesContext
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.alphaFade
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.area
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bubble
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cartesian
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.combo
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.coordinateSystem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.coordinateSystemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursorBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursorBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursorPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataCursorPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.delayed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.delayedScrollOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.first
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.funnel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupComparator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupComparatorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupsOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hideAndShowBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.initialZooming
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.initialZoomingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.last
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.legend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.legendChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.live
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.liveScrollOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mixedFrequency
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojDrill
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojSelectInput
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojViewportChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojViewportChangeInput
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherThreshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.otherThresholdChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overview
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pan
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pie
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pieCenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pieCenterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plotArea
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polarGridShape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polarGridShapeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.polygon
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pyramid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scatter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seriesComparator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seriesComparatorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seriesOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.skipGaps
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.slideToLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.slideToRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smooth
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.snap
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sorting
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sortingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.splitDualY
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.splitDualYChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.splitterPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.splitterPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stack
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stackChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stackLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stackLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stock
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timeAxisType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timeAxisTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.user
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withRescale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.withoutRescale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y2AxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.yAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.yAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomAndScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomAndScrollChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomDirection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomDirectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojChart_[K, D] extends dvtBaseComponent[ojChartSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: coordinateSystemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: dataCursorBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: dataCursorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: dataCursorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: dragModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: dragModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: drillingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: hideAndShowBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: highlightMatchChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: initialZoomingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: polarGridShapeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: polarGridShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: sortingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: splitDualYChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: splitDualYChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: stackChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: stackChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: stackLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: stackLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: timeAxisTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: timeAxisTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomAndScrollChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: zoomAndScrollChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomDirectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: zoomDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataCursorPositionChanged(
    `type`: dataCursorPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(`type`: dataLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataLabelChanged(
    `type`: dataLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(`type`: groupComparatorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupComparatorChanged(
    `type`: groupComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(`type`: legendChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_legendChanged(
    `type`: legendChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(`type`: ojDrill, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(`type`: ojSelectInput, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelectInput(
    `type`: ojSelectInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(`type`: ojViewportChange, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(`type`: ojViewportChangeInput, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChangeInput(
    `type`: ojViewportChangeInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(`type`: otherThresholdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(`type`: overviewChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(`type`: pieCenterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pieCenterChanged(
    `type`: pieCenterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(`type`: plotAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesComparatorChanged(
    `type`: seriesComparatorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_splitterPositionChanged(
    `type`: splitterPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(`type`: styleDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(`type`: valueFormatsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(`type`: xAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xAxisChanged(
    `type`: xAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(`type`: y2AxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_y2AxisChanged(
    `type`: y2AxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(`type`: yAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yAxisChanged(
    `type`: yAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
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
  def getProperty_dataCursorPosition(property: dataCursorPosition): X = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Drag = js.native
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
  def getProperty_legend(property: legend): BackgroundColor = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Content = js.native
  @JSName("getProperty")
  def getProperty_pieCenter(property: pieCenter): Converter = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): BorderWidth = js.native
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
  def getProperty_styleDefaults(property: styleDefaults): AnimationDownColor = js.native
  @JSName("getProperty")
  def getProperty_timeAxisType(property: timeAxisType): enabled | mixedFrequency | skipGaps | disabled | auto = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Renderer = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): Close = js.native
  @JSName("getProperty")
  def getProperty_xAxis(property: xAxis): AxisLine = js.native
  @JSName("getProperty")
  def getProperty_y2Axis(property: y2Axis): AlignTickMarks = js.native
  @JSName("getProperty")
  def getProperty_yAxis(property: yAxis): BaselineScaling = js.native
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
  
  var groupComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var hideAndShowBehavior: withRescale | withoutRescale | none = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var initialZooming: first | last | none = js.native
  
  var legend: BackgroundColor = js.native
  
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
  
  var overview: Content = js.native
  
  var pieCenter: Converter = js.native
  
  var plotArea: BorderWidth = js.native
  
  var polarGridShape: polygon | circle = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var seriesComparator: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, Double]) | Null = js.native
  
  def setProperties(properties: ojChartSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: boxPlot): Unit = js.native
  def setProperty(property: `type`, value: bubble): Unit = js.native
  def setProperty(property: `type`, value: combo): Unit = js.native
  def setProperty(property: `type`, value: funnel): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: `type`, value: pie): Unit = js.native
  def setProperty(property: `type`, value: pyramid): Unit = js.native
  def setProperty(property: `type`, value: scatter): Unit = js.native
  def setProperty(property: `type`, value: stock): Unit = js.native
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
  def setProperty_dataCursorPosition(property: dataCursorPosition, value: X): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Drag): Unit = js.native
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
  def setProperty_legend(property: legend, value: BackgroundColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Content): Unit = js.native
  @JSName("setProperty")
  def setProperty_pieCenter(property: pieCenter, value: Converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: BorderWidth): Unit = js.native
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
  def setProperty_styleDefaults(property: styleDefaults, value: AnimationDownColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Renderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: ComponentName): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: Close): Unit = js.native
  @JSName("setProperty")
  def setProperty_xAxis(property: xAxis, value: AxisLine): Unit = js.native
  @JSName("setProperty")
  def setProperty_y2Axis(property: y2Axis, value: AlignTickMarks): Unit = js.native
  @JSName("setProperty")
  def setProperty_yAxis(property: yAxis, value: BaselineScaling): Unit = js.native
  
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
  var translations_ojChart_ : ComponentName = js.native
  
  var `type`: line | area | lineWithArea | stock | boxPlot | combo | pie | scatter | bubble | funnel | pyramid | bar = js.native
  
  var valueFormats: Close = js.native
  
  var xAxis: AxisLine = js.native
  
  var y2Axis: AlignTickMarks = js.native
  
  var yAxis: BaselineScaling = js.native
  
  var zoomAndScroll: delayedScrollOnly | liveScrollOnly | delayed | live | off = js.native
  
  var zoomDirection: x | y | auto = js.native
}
