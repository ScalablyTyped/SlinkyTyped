package typingsSlinky.atOracleOraclejet.ojdatagridMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_AccessibleActionableMode
import typingsSlinky.atOracleOraclejet.Anon_Cell
import typingsSlinky.atOracleOraclejet.Anon_ClassName
import typingsSlinky.atOracleOraclejet.Anon_Column
import typingsSlinky.atOracleOraclejet.Anon_ColumnColumnEnd
import typingsSlinky.atOracleOraclejet.Anon_ColumnIndex
import typingsSlinky.atOracleOraclejet.Anon_Hidden
import typingsSlinky.atOracleOraclejet.Anon_MaxColumnCount
import typingsSlinky.atOracleOraclejet.Anon_Ojdatagridcell
import typingsSlinky.atOracleOraclejet.Anon_Ojdatagridheader
import typingsSlinky.atOracleOraclejet.Anon_Ojdatagridheaderlabel
import typingsSlinky.atOracleOraclejet.Anon_Reorder
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bandingInterval
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bandingIntervalChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cell
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellEdit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.cellNavigation
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.currentCell
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.currentCellChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.editMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.editModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.gridlines
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.gridlinesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.header
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.headerChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentCell
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEdit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEditEnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojResize
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojScroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojSort
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicy
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyOptions
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyOptionsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPosition
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scrollPositionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selection
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojDataGrid")
@js.native
trait ojDataGrid_[K, D] extends baseComponent[ojDataGridSettableProperties[K, D]] {
  var bandingInterval: Anon_Column = js.native
  var cell: Anon_ClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: Anon_Reorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: Anon_Hidden = js.native
  var header: Anon_ColumnColumnEnd[K, D] = js.native
  var onBandingIntervalChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentCellChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEditModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHeaderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentCell: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeEdit: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeEditEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjScroll: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSort: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: Anon_MaxColumnCount = js.native
  var scrollPosition: Anon_ColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: Anon_Cell = js.native
  @JSName("translations")
  var translations_ojDataGrid_ : Anon_AccessibleActionableMode = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
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
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: ojScroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: ojScroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
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
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): ((CellContext[K, D]) with Anon_Ojdatagridcell) | ((HeaderContext[K, D]) with Anon_Ojdatagridheader) | ((LabelContext[K, D]) with Anon_Ojdatagridheaderlabel) = js.native
  @JSName("getProperty")
  def getProperty_bandingInterval(property: bandingInterval): Anon_Column = js.native
  @JSName("getProperty")
  def getProperty_cell(property: cell): Anon_ClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_Reorder = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): Anon_Hidden = js.native
  @JSName("getProperty")
  def getProperty_header(property: header): Anon_ColumnColumnEnd[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): Anon_MaxColumnCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): Anon_ColumnIndex[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Anon_Cell = js.native
  def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: editMode, value: cellEdit): Unit = js.native
  def setProperty(property: editMode, value: cellNavigation): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: scrollPolicy, value: scroll): Unit = js.native
  @JSName("setProperty")
  def setProperty_bandingInterval(property: bandingInterval, value: Anon_Column): Unit = js.native
  @JSName("setProperty")
  def setProperty_cell(property: cell, value: Anon_ClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_Reorder): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: Anon_Hidden): Unit = js.native
  @JSName("setProperty")
  def setProperty_header(property: header, value: Anon_ColumnColumnEnd[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: Anon_MaxColumnCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: Anon_ColumnIndex[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Anon_Cell): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AccessibleActionableMode): Unit = js.native
}

