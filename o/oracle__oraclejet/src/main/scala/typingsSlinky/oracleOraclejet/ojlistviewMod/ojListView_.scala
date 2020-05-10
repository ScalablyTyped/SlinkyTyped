package typingsSlinky.oracleOraclejet.ojlistviewMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonAccessibleNavigateSkipItems
import typingsSlinky.oracleOraclejet.AnonDragDrop
import typingsSlinky.oracleOraclejet.AnonFetchSize
import typingsSlinky.oracleOraclejet.AnonFocusable
import typingsSlinky.oracleOraclejet.AnonKey
import typingsSlinky.oracleOraclejet.AnonKeyK
import typingsSlinky.oracleOraclejet.AnonOffsetX
import typingsSlinky.oracleOraclejet.AnonParent
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.ojlistviewMod.ojListView.ContextByNode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.collapsible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drillModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupHeaderPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.groupHeaderPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.item
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCopy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCut
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojPaste
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPolicy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPolicyChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptionsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRequired
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRequiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.static
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sticky
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojListView_[K, D] extends baseComponent[ojListViewSettableProperties[K, D]] {
  var as: String = js.native
  var currentItem: K = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: AnonDragDrop = js.native
  var drillMode: collapsible | none = js.native
  var expanded: KeySet[K] = js.native
  val firstSelectedItem: AnonKey[K, D] = js.native
  var groupHeaderPosition: static | sticky = js.native
  var item: AnonFocusable[K, D] = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDrillModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFirstSelectedItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupHeaderPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCopy: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCut: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjPaste: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjReorder: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: AnonFetchSize = js.native
  var scrollPosition: AnonOffsetX[K] = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojListView_ : AnonAccessibleNavigateSkipItems = js.native
  def addEventListener(`type`: drillModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: scrollPolicyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
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
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
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
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
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
  def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(`type`: ojCopy, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: ojCopy,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(`type`: ojCut, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: ojCut,
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
  def addEventListener_ojPaste(`type`: ojPaste, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: ojPaste,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(`type`: ojReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
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
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): ContextByNode[K] | Null = js.native
  def getDataForVisibleItem(context: AnonParent[K]): D = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDragDrop = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): collapsible | none = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedItem(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedItem): AnonKey[K, D] = js.native
  @JSName("getProperty")
  def getProperty_groupHeaderPosition(property: groupHeaderPosition): static | sticky = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): AnonFocusable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): AnonFetchSize = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonOffsetX[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  def scrollToItem(item: AnonKeyK[K]): Unit = js.native
  def setProperties(properties: ojListViewSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: static): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: sticky): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDragDrop): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedItem(
    property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedItem,
    value: AnonKey[K, D]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: AnonFocusable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: AnonFetchSize): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonOffsetX[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAccessibleNavigateSkipItems): Unit = js.native
}

