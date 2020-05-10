package typingsSlinky.oracleOraclejet.ojganttMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.Anon7
import typingsSlinky.oracleOraclejet.AnonAccessibleDependencyInfo
import typingsSlinky.oracleOraclejet.AnonBaseline
import typingsSlinky.oracleOraclejet.AnonBaselineDate
import typingsSlinky.oracleOraclejet.AnonHeightNumber
import typingsSlinky.oracleOraclejet.AnonIndex
import typingsSlinky.oracleOraclejet.AnonMaxWidth
import typingsSlinky.oracleOraclejet.AnonMove
import typingsSlinky.oracleOraclejet.AnonOffsetY
import typingsSlinky.oracleOraclejet.AnonRowIndex
import typingsSlinky.oracleOraclejet.AnonScale
import typingsSlinky.oracleOraclejet.AnonVertical
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typingsSlinky.oracleOraclejet.ojtimeBaseMod.dvtTimeComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.axisPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.axisPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dependencyData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dependencyDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.majorAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.majorAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minorAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minorAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojMove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojViewportChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.taskData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.taskDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.taskDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.taskDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.viewportEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.viewportEndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.viewportStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.viewportStartChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGantt_[K1, K2, D1, D2] extends dvtTimeComponent[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var axisPosition: bottom | top = js.native
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var dnd: AnonMove = js.native
  var end: String = js.native
  var gridlines: AnonVertical = js.native
  var majorAxis: AnonScale = js.native
  var minorAxis: AnonScale = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAxisPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDependencyDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMajorAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinorAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjMove: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjViewportChange: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReferenceObjectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowAxisChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTaskDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTaskDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueFormatsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onViewportEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onViewportStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var rowAxis: AnonMaxWidth[K2, D2] = js.native
  var rowDefaults: AnonHeightNumber = js.native
  var scrollPosition: AnonOffsetY = js.native
  var selection: js.Array[K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var start: String = js.native
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var taskDefaults: AnonBaseline = js.native
  var tooltip: Anon7[K2, D2] = js.native
  @JSName("translations")
  var translations_ojGantt_ : AnonAccessibleDependencyInfo = js.native
  var valueFormats: AnonBaselineDate = js.native
  var viewportEnd: String = js.native
  var viewportStart: String = js.native
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
  def addEventListener(`type`: axisPositionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: axisPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
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
  def addEventListener_dependencyDataChanged(`type`: dependencyDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dependencyDataChanged(
    `type`: dependencyDataChanged,
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
  def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(`type`: gridlinesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(`type`: majorAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: majorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(`type`: minorAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: minorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(`type`: ojMove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: ojMove,
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
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(`type`: rowAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: rowAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(`type`: rowDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: rowDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(`type`: scrollPositionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
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
  def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(`type`: taskDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: taskDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(`type`: taskDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: taskDefaultsChanged,
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
  def addEventListener_viewportEndChanged(`type`: viewportEndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: viewportEndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(`type`: viewportStartChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: viewportStartChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): AnonIndex | AnonRowIndex | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_axisPosition(property: axisPosition): bottom | top = js.native
  @JSName("getProperty")
  def getProperty_dependencyData(property: dependencyData): js.UndefOr[DataProvider[K1, D1]] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonMove = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): AnonVertical = js.native
  @JSName("getProperty")
  def getProperty_majorAxis(property: majorAxis): AnonScale = js.native
  @JSName("getProperty")
  def getProperty_minorAxis(property: minorAxis): AnonScale = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_rowAxis(property: rowAxis): AnonMaxWidth[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_rowDefaults(property: rowDefaults): AnonHeightNumber = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonOffsetY = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  @JSName("getProperty")
  def getProperty_taskData(property: taskData): js.UndefOr[DataProvider[K2, D2]] = js.native
  @JSName("getProperty")
  def getProperty_taskDefaults(property: taskDefaults): AnonBaseline = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon7[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): AnonBaselineDate = js.native
  @JSName("getProperty")
  def getProperty_viewportEnd(property: viewportEnd): String = js.native
  @JSName("getProperty")
  def getProperty_viewportStart(property: viewportStart): String = js.native
  def setProperties(properties: ojGanttSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: axisPosition, value: bottom): Unit = js.native
  def setProperty(property: axisPosition, value: top): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(property: dependencyData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonMove): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: AnonVertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_majorAxis(property: majorAxis, value: AnonScale): Unit = js.native
  @JSName("setProperty")
  def setProperty_minorAxis(property: minorAxis, value: AnonScale): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowAxis(property: rowAxis, value: AnonMaxWidth[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowDefaults(property: rowDefaults, value: AnonHeightNumber): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonOffsetY): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskDefaults(property: taskDefaults, value: AnonBaseline): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon7[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAccessibleDependencyInfo): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: AnonBaselineDate): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportEnd(property: viewportEnd, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportStart(property: viewportStart, value: String): Unit = js.native
}

