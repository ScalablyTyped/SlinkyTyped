package typingsSlinky.oracleOraclejet.ojsunburstMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.HoverColor
import typingsSlinky.oracleOraclejet.anon.LabelColor
import typingsSlinky.oracleOraclejet.anon.`18`
import typingsSlinky.oracleOraclejet.anon.`19`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst.DataContext
import typingsSlinky.oracleOraclejet.ojsunburstMod.ojSunburst.NodeContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationUpdateColor
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationUpdateColorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayLevels
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayLevelsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeDrill
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojDrill
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojRotateInput
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootNode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootNodeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootNodeContent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootNodeContentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rotation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rotationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sizeLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sizeLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sorting
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sortingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startAngle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startAngleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSunburst_[K, D] extends dvtBaseComponent[ojSunburstSettableProperties[K, D]] {
  
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
  def addEventListener(`type`: drillingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
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
  def addEventListener(`type`: rootNodeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: rootNodeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: rotationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: rotationChanged,
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
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationUpdateColorChanged(
    `type`: animationUpdateColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationUpdateColorChanged(
    `type`: animationUpdateColorChanged,
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
  def addEventListener_colorLabelChanged(`type`: colorLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorLabelChanged(
    `type`: colorLabelChanged,
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
  def addEventListener_displayLevelsChanged(`type`: displayLevelsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayLevelsChanged(
    `type`: displayLevelsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
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
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDefaultsChanged(`type`: nodeDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDefaultsChanged(
    `type`: nodeDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(`type`: ojBeforeCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDrill(`type`: ojBeforeDrill, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDrill(
    `type`: ojBeforeDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(`type`: ojBeforeExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
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
  def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRotateInput(`type`: ojRotateInput, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRotateInput(
    `type`: ojRotateInput,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootNodeContentChanged(`type`: rootNodeContentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootNodeContentChanged(
    `type`: rootNodeContentChanged,
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
  def addEventListener_sizeLabelChanged(`type`: sizeLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeLabelChanged(
    `type`: sizeLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(`type`: startAngleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(
    `type`: startAngleChanged,
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
  
  var animationDuration: Double = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var animationUpdateColor: String = js.native
  
  var as: String = js.native
  
  var colorLabel: String = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var displayLevels: Double = js.native
  
  var drilling: on | off = js.native
  
  var expanded: KeySet[K] = js.native
  
  def getContextByNode(node: Element): NodeContext | Null = js.native
  
  def getNode(subIdPath: js.Array[_]): DataContext | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationUpdateColor(property: animationUpdateColor): String = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_colorLabel(property: colorLabel): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_displayLevels(property: displayLevels): Double = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | off = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverBehaviorDelay(property: hoverBehaviorDelay): Double = js.native
  @JSName("getProperty")
  def getProperty_nodeDefaults(property: nodeDefaults): HoverColor = js.native
  @JSName("getProperty")
  def getProperty_rootNode(property: rootNode): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojsunburst.ojSunburst<K, D>['rootNode'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_rootNodeContent(property: rootNodeContent): `18`[K, D] = js.native
  @JSName("getProperty")
  def getProperty_rotation(property: rotation): off | on = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[_] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_sizeLabel(property: sizeLabel): String = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: sorting): on | off = js.native
  @JSName("getProperty")
  def getProperty_startAngle(property: startAngle): Double = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `19`[K, D] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverBehaviorDelay: Double = js.native
  
  var nodeDefaults: HoverColor = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationUpdateColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onColorLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDisplayLevelsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorDelayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onNodeDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeDrill: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjDrill: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjRotateInput: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRootNodeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRootNodeContentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRotationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSizeLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSortingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStartAngleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var rootNode: js.Any = js.native
  
  var rootNodeContent: `18`[K, D] = js.native
  
  var rotation: off | on = js.native
  
  var selection: js.Array[_] = js.native
  
  var selectionMode: none | single | multiple = js.native
  
  def setProperties(properties: ojSunburstSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: rotation, value: off): Unit = js.native
  def setProperty(property: rotation, value: on): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: sorting, value: off): Unit = js.native
  def setProperty(property: sorting, value: on): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationUpdateColor(property: animationUpdateColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_colorLabel(property: colorLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayLevels(property: displayLevels, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverBehaviorDelay(property: hoverBehaviorDelay, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeDefaults(property: nodeDefaults, value: HoverColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootNode(property: rootNode, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootNodeContent(property: rootNodeContent, value: `18`[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_sizeLabel(property: sizeLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `19`[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelColor): Unit = js.native
  
  var sizeLabel: String = js.native
  
  var sorting: on | off = js.native
  
  var startAngle: Double = js.native
  
  var tooltip: `19`[K, D] = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojSunburst_ : LabelColor = js.native
}
