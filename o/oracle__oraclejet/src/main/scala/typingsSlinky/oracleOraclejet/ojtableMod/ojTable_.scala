package typingsSlinky.oracleOraclejet.ojtableMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.ColumnIndexKey
import typingsSlinky.oracleOraclejet.anon.ColumnKey
import typingsSlinky.oracleOraclejet.anon.DataIndex
import typingsSlinky.oracleOraclejet.anon.DropReorder
import typingsSlinky.oracleOraclejet.anon.Field
import typingsSlinky.oracleOraclejet.anon.FooterClassName
import typingsSlinky.oracleOraclejet.anon.IndexSubId
import typingsSlinky.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typingsSlinky.oracleOraclejet.anon.MaxCount
import typingsSlinky.oracleOraclejet.anon.RowHeader
import typingsSlinky.oracleOraclejet.anon.`19`
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.accessibility
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.accessibilityChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columns
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsDefault
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnsDefaultChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentRow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentRowChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.display
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.editMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedRowChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.grid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisibleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentRow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEditEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojSort
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowRendererChanged
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.verticalGridVisible
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.verticalGridVisibleChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTable_[K, D] extends baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: RowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[Field[K, D]]) | Null = js.native
  var columnsDefault: FooterClassName[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: DropReorder[K, D] = js.native
  var editMode: none | rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: auto | enabled | disabled = js.native
  var onAccessibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsDefaultChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEditModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFirstSelectedRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHorizontalGridVisibleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentRow: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRowEdit: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRowEditEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSort: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVerticalGridVisibleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: MaxCount = js.native
  var scrollPosition: ColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: `19` = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTable_ : LabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: auto | enabled | disabled = js.native
  def addEventListener(`type`: displayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: editModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: scrollPolicyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(`type`: accessibilityChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
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
  def addEventListener_columnsChanged(`type`: columnsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(`type`: columnsDefaultChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(`type`: currentRowChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
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
  def addEventListener_ojBeforeCurrentRow(`type`: ojBeforeCurrentRow, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(`type`: ojBeforeRowEdit, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(`type`: ojBeforeRowEditEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(`type`: ojSort, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(`type`: rowRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(
    `type`: rowRendererChanged,
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
  def addEventListener_selectionModeChanged(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
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
  def getContextByNode(node: Element): ColumnIndexKey | IndexSubId = js.native
  def getDataForVisibleRow(rowIndex: Double): (DataIndex[D, K]) | Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): RowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[Field[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): FooterClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): DropReorder[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: horizontalGridVisible): auto | enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: rowRenderer): (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): MaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): ColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): `19` = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  @JSName("getProperty")
  def getProperty_verticalGridVisible(property: verticalGridVisible): auto | enabled | disabled = js.native
  def refreshRow(rowIdx: Double): js.Promise[Boolean] = js.native
  def setProperties(properties: ojTableSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: grid): Unit = js.native
  def setProperty(property: display, value: list): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: editMode, value: rowEdit): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: auto): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: enabled): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: verticalGridVisible, value: auto): Unit = js.native
  def setProperty(property: verticalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: verticalGridVisible, value: enabled): Unit = js.native
  @JSName("setProperty")
  def setProperty_accessibility(property: accessibility, value: RowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Field[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: FooterClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: DropReorder[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: rowRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: rowRenderer,
    value: js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: MaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: ColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      RowSelectionStart[K] with RowSelectionEnd[K] with ColumnSelectionStart[K] with ColumnSelectionEnd[K]
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: `19`): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAccSelectionAffordanceBottom): Unit = js.native
}

