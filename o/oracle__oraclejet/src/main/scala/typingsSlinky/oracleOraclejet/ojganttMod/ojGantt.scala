package typingsSlinky.oracleOraclejet.ojganttMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AccessibleDependencyInfo
import typingsSlinky.oracleOraclejet.anon.Baseline
import typingsSlinky.oracleOraclejet.anon.BaselineDate
import typingsSlinky.oracleOraclejet.anon.End
import typingsSlinky.oracleOraclejet.anon.Index
import typingsSlinky.oracleOraclejet.anon.MaxWidth
import typingsSlinky.oracleOraclejet.anon.Move
import typingsSlinky.oracleOraclejet.anon.OffsetY
import typingsSlinky.oracleOraclejet.anon.RowIndex
import typingsSlinky.oracleOraclejet.anon.Scale
import typingsSlinky.oracleOraclejet.anon.Value
import typingsSlinky.oracleOraclejet.anon.Vertical
import typingsSlinky.oracleOraclejet.anon.`8`
import typingsSlinky.oracleOraclejet.anon.`9`
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.majorAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.majorAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.milestone
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minorAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minorAxisChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.normal
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.summary
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojGantt[K1, K2, D1, D2] extends dvtTimeComponent[ojGanttSettableProperties[K1, K2, D1, D2]] {
  
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
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var as: String = js.native
  
  var axisPosition: bottom | top = js.native
  
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  
  var dnd: Move = js.native
  
  var end: String = js.native
  
  def getContextByNode(node: Element): Index | RowIndex | Null = js.native
  
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
  def getProperty_dnd(property: dnd): Move = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): Vertical = js.native
  @JSName("getProperty")
  def getProperty_majorAxis(property: majorAxis): Scale = js.native
  @JSName("getProperty")
  def getProperty_minorAxis(property: minorAxis): Scale = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_rowAxis(property: rowAxis): MaxWidth[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_rowDefaults(property: rowDefaults): `8` = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): OffsetY = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  @JSName("getProperty")
  def getProperty_taskData(property: taskData): js.UndefOr[DataProvider[K2, D2]] = js.native
  @JSName("getProperty")
  def getProperty_taskDefaults(property: taskDefaults): Baseline = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `9`[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): BaselineDate = js.native
  @JSName("getProperty")
  def getProperty_viewportEnd(property: viewportEnd): String = js.native
  @JSName("getProperty")
  def getProperty_viewportStart(property: viewportStart): String = js.native
  
  var gridlines: Vertical = js.native
  
  var majorAxis: Scale = js.native
  
  var minorAxis: Scale = js.native
  
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
  
  var rowAxis: MaxWidth[K2, D2] = js.native
  
  var rowDefaults: `8` = js.native
  
  var scrollPosition: OffsetY = js.native
  
  var selection: js.Array[K2] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
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
  def setProperty_dependencyData(property: dependencyData): Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(property: dependencyData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Move): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: Vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_majorAxis(property: majorAxis, value: Scale): Unit = js.native
  @JSName("setProperty")
  def setProperty_minorAxis(property: minorAxis, value: Scale): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowAxis(property: rowAxis, value: MaxWidth[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowDefaults(property: rowDefaults, value: `8`): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: OffsetY): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskDefaults(property: taskDefaults, value: Baseline): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `9`[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AccessibleDependencyInfo): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: BaselineDate): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportEnd(property: viewportEnd, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportStart(property: viewportStart, value: String): Unit = js.native
  
  var start: String = js.native
  
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  
  var taskDefaults: Baseline = js.native
  
  var tooltip: `9`[K2, D2] = js.native
  
  @JSName("translations")
  var translations_ojGantt: AccessibleDependencyInfo = js.native
  
  var valueFormats: BaselineDate = js.native
  
  var viewportEnd: String = js.native
  
  var viewportStart: String = js.native
}
object ojGantt {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Dependency[K1, K2] extends StObject {
    
    var id: K1 = js.native
    
    var predecessorTaskId: K2 = js.native
    
    var shortDesc: js.UndefOr[String] = js.native
    
    var successorTaskId: K2 = js.native
    
    var svgClassName: js.UndefOr[String] = js.native
    
    var svgStyle: js.UndefOr[js.Object] = js.native
    
    var `type`: js.UndefOr[startStart | startFinish | finishFinish | finishStart] = js.native
  }
  object Dependency {
    
    @scala.inline
    def apply[K1, K2](id: K1, predecessorTaskId: K2, successorTaskId: K2): Dependency[K1, K2] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency[K1, K2]]
    }
    
    @scala.inline
    implicit class DependencyMutableBuilder[Self <: Dependency[_, _], K1, K2] (val x: Self with (Dependency[K1, K2])) extends AnyVal {
      
      @scala.inline
      def setId(value: K1): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredecessorTaskId(value: K2): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
      
      @scala.inline
      def setSuccessorTaskId(value: K2): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      @scala.inline
      def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      @scala.inline
      def setType(value: startStart | startFinish | finishFinish | finishStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ReferenceObject extends StObject {
    
    var svgClassName: js.UndefOr[String] = js.native
    
    var svgStyle: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object ReferenceObject {
    
    @scala.inline
    def apply(): ReferenceObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceObject]
    }
    
    @scala.inline
    implicit class ReferenceObjectMutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      @scala.inline
      def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Row[K2] extends StObject {
    
    var id: js.UndefOr[js.Any] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var labelStyle: js.UndefOr[js.Object] = js.native
    
    var tasks: js.UndefOr[js.Array[RowTask[K2]]] = js.native
  }
  object Row {
    
    @scala.inline
    def apply[K2](): Row[K2] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Row[K2]]
    }
    
    @scala.inline
    implicit class RowMutableBuilder[Self <: Row[_], K2] (val x: Self with Row[K2]) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTasks(value: js.Array[RowTask[K2]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      @scala.inline
      def setTasksVarargs(value: RowTask[K2]*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RowAxisLabelRendererContext[K2, D2] extends StObject {
    
    var componentElement: Element = js.native
    
    var itemData: js.Array[D2] = js.native
    
    var maxHeight: Double = js.native
    
    var maxWidth: Double = js.native
    
    var parentElement: Element = js.native
    
    var rowData: Row[K2] = js.native
  }
  object RowAxisLabelRendererContext {
    
    @scala.inline
    def apply[K2, D2](
      componentElement: Element,
      itemData: js.Array[D2],
      maxHeight: Double,
      maxWidth: Double,
      parentElement: Element,
      rowData: Row[K2]
    ): RowAxisLabelRendererContext[K2, D2] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowAxisLabelRendererContext[K2, D2]]
    }
    
    @scala.inline
    implicit class RowAxisLabelRendererContextMutableBuilder[Self <: RowAxisLabelRendererContext[_, _], K2, D2] (val x: Self with (RowAxisLabelRendererContext[K2, D2])) extends AnyVal {
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: js.Array[D2]): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDataVarargs(value: D2*): Self = StObject.set(x, "itemData", js.Array(value :_*))
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowData(value: Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RowTask[K2] extends StObject {
    
    var baseline: js.UndefOr[End] = js.native
    
    var borderRadius: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var id: K2 = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var labelPosition: js.UndefOr[String | js.Array[String]] = js.native
    
    var labelStyle: js.UndefOr[js.Object] = js.native
    
    var progress: js.UndefOr[Value] = js.native
    
    var shortDesc: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[String] = js.native
    
    var svgClassName: js.UndefOr[String] = js.native
    
    var svgStyle: js.UndefOr[js.Object] = js.native
    
    var `type`: js.UndefOr[normal | milestone | summary | auto] = js.native
  }
  object RowTask {
    
    @scala.inline
    def apply[K2](id: K2): RowTask[K2] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowTask[K2]]
    }
    
    @scala.inline
    implicit class RowTaskMutableBuilder[Self <: RowTask[_], K2] (val x: Self with RowTask[K2]) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: End): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: K2): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: String | js.Array[String]): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelPositionVarargs(value: String*): Self = StObject.set(x, "labelPosition", js.Array(value :_*))
      
      @scala.inline
      def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      @scala.inline
      def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      @scala.inline
      def setType(value: normal | milestone | summary | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext[K2, D2] extends StObject {
    
    var color: String = js.native
    
    var componentElement: Element = js.native
    
    var data: RowTask[K2] = js.native
    
    var itemData: D2 = js.native
    
    var parentElement: Element = js.native
    
    var rowData: Row[K2] = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply[K2, D2](
      color: String,
      componentElement: Element,
      data: RowTask[K2],
      itemData: D2,
      parentElement: Element,
      rowData: Row[K2]
    ): TooltipContext[K2, D2] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext[K2, D2]]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext[_, _], K2, D2] (val x: Self with (TooltipContext[K2, D2])) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: RowTask[K2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: D2): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowData(value: Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    }
  }
  
  type ojMove[K2, D2] = CustomEvent
  
  type ojViewportChange = CustomEvent
}
