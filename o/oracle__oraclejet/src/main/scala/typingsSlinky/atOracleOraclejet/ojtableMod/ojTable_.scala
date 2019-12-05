package typingsSlinky.atOracleOraclejet.ojtableMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atOracleOraclejet.Anon_AutoClassName
import typingsSlinky.atOracleOraclejet.Anon_AutoClassNameContext
import typingsSlinky.atOracleOraclejet.Anon_ColumnIndexColumnKey
import typingsSlinky.atOracleOraclejet.Anon_ColumnIndexKey
import typingsSlinky.atOracleOraclejet.Anon_ColumnMultiple
import typingsSlinky.atOracleOraclejet.Anon_DataIndex
import typingsSlinky.atOracleOraclejet.Anon_DragDropReorderAnonColumns
import typingsSlinky.atOracleOraclejet.Anon_FetchSizeMaxCount
import typingsSlinky.atOracleOraclejet.Anon_IndexOjtablefooter
import typingsSlinky.atOracleOraclejet.Anon_LabelAccSelectionAffordanceBottom
import typingsSlinky.atOracleOraclejet.Anon_RowHeader
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.accessibility
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.accessibilityChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columns
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsDefault
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.columnsDefaultChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.currentRow
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.currentRowChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.data
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.display
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.editMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.editModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRowChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.grid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontalGridVisible
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontalGridVisibleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.list
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentRow
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEdit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEditEnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojSort
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowEdit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rowRendererChanged
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
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionRequired
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionRequiredChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.verticalGridVisible
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.verticalGridVisibleChanged
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typingsSlinky.atOracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojTable")
@js.native
trait ojTable_[K, D] extends baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: Anon_RowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[Anon_AutoClassName[K, D]]) | Null = js.native
  var columnsDefault: Anon_AutoClassNameContext[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: Anon_DragDropReorderAnonColumns[K, D] = js.native
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
  var scrollPolicyOptions: Anon_FetchSizeMaxCount = js.native
  var scrollPosition: Anon_ColumnIndexColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: Anon_ColumnMultiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTable_ : Anon_LabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: auto | enabled | disabled = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[list | grid], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[list | grid], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[none | rowEdit], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[none | rowEdit], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsSlinky.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ],
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
  def getContextByNode(node: Element): Anon_ColumnIndexKey | Anon_IndexOjtablefooter = js.native
  def getDataForVisibleRow(rowIndex: Double): (Anon_DataIndex[D, K]) | Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): Anon_RowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[Anon_AutoClassName[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): Anon_AutoClassNameContext[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_DragDropReorderAnonColumns[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRow): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: horizontalGridVisible): auto | enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: rowRenderer): (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): Anon_FetchSizeMaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): Anon_ColumnIndexColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Anon_ColumnMultiple = js.native
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
  def setProperty_accessibility(property: accessibility, value: Anon_RowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Anon_AutoClassName[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: Anon_AutoClassNameContext[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_DragDropReorderAnonColumns[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(
    property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRow,
    value: js.Object
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: rowRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: rowRenderer,
    value: js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: Anon_FetchSizeMaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: Anon_ColumnIndexColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      (ColumnSelectionStart[K] | RowSelectionStart[K]) with (ColumnSelectionEnd[K] | RowSelectionEnd[K])
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Anon_ColumnMultiple): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelAccSelectionAffordanceBottom): Unit = js.native
}

