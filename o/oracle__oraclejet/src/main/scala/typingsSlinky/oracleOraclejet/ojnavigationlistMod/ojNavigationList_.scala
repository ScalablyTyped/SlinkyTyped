package typingsSlinky.oracleOraclejet.ojnavigationlistMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.DefaultRootLabel
import typingsSlinky.oracleOraclejet.anon.Selectable
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.ojnavigationlistMod.ojNavigationList.NodeContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.collapsible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.display
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edge
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edgeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hierarchyMenuThreshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hierarchyMenuThresholdChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.item
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overflow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overflowChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.popup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootLabel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rootLabelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sliding
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojNavigationList_[K, D] extends baseComponent[ojNavigationListSettableProperties[K, D]] {
  
  def addEventListener(`type`: displayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: drillModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: edgeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: overflowChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
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
  def addEventListener_currentItemChanged(`type`: currentItemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
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
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(`type`: itemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
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
  def addEventListener_ojBeforeCurrentItem(`type`: ojBeforeCurrentItem, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
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
  def addEventListener_ojBeforeSelect(`type`: ojBeforeSelect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
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
  def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(`type`: rootLabelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: rootLabelChanged,
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
  
  var as: String = js.native
  
  var currentItem: K = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var display: all | icons = js.native
  
  var drillMode: none | collapsible | sliding = js.native
  
  var edge: top | start = js.native
  
  var expanded: KeySet[K] = js.native
  
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): none | collapsible | sliding = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | start = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Selectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_rootLabel(property: rootLabel): String | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): K = js.native
  
  var hierarchyMenuThreshold: Double = js.native
  
  var item: Selectable[K, D] = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDrillModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onEdgeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHierarchyMenuThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeCurrentItem: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOverflowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRootLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var overflow: popup | hidden = js.native
  
  var rootLabel: String | Null = js.native
  
  var selection: K = js.native
  
  def setProperties(properties: ojNavigationListSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: drillMode, value: sliding): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Selectable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: DefaultRootLabel): Unit = js.native
  
  @JSName("translations")
  var translations_ojNavigationList_ : DefaultRootLabel = js.native
}
