package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.oracleOraclejet.anon.AccessibleActionableMode
import typingsSlinky.oracleOraclejet.anon.Cell
import typingsSlinky.oracleOraclejet.anon.ClassName
import typingsSlinky.oracleOraclejet.anon.Column
import typingsSlinky.oracleOraclejet.anon.ColumnEnd
import typingsSlinky.oracleOraclejet.anon.ColumnIndex
import typingsSlinky.oracleOraclejet.anon.ColumnK
import typingsSlinky.oracleOraclejet.anon.ColumnRow
import typingsSlinky.oracleOraclejet.anon.Horizontal
import typingsSlinky.oracleOraclejet.anon.MaxColumnCount
import typingsSlinky.oracleOraclejet.anon.Reorder
import typingsSlinky.oracleOraclejet.anon.RowK
import typingsSlinky.oracleOraclejet.anon.RowNumber
import typingsSlinky.oracleOraclejet.anon.SubId
import typingsSlinky.oracleOraclejet.anon.`2`
import typingsSlinky.oracleOraclejet.anon.`3`
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bandingInterval
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bandingIntervalChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cell
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentCell
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentCellChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.data
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.editMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.header
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.headerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.label
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.navigation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentCell
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeEditEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojSort
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scroll
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdatagridMod {
  
  @js.native
  trait ojDataGrid[K, D] extends baseComponent[ojDataGridSettableProperties[K, D]] {
    
    def addEventListener(`type`: editModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: editModeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: scrollPolicyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: scrollPolicyChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_bandingIntervalChanged(`type`: bandingIntervalChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_bandingIntervalChanged(
      `type`: bandingIntervalChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cellChanged(`type`: cellChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cellChanged(
      `type`: cellChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentCellChanged(`type`: currentCellChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentCellChanged(
      `type`: currentCellChanged,
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
    def addEventListener_gridlinesChanged(`type`: gridlinesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gridlinesChanged(
      `type`: gridlinesChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headerChanged(`type`: headerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headerChanged(
      `type`: headerChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCurrentCell(`type`: ojBeforeCurrentCell, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCurrentCell(
      `type`: ojBeforeCurrentCell,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEdit(`type`: ojBeforeEdit, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEdit(
      `type`: ojBeforeEdit,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEditEnd(`type`: ojBeforeEditEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEditEnd(
      `type`: ojBeforeEditEnd,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojScroll(`type`: ojScroll, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojScroll(
      `type`: ojScroll,
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
    
    var bandingInterval: Column = js.native
    
    var cell: ClassName[K, D] = js.native
    
    var currentCell: CurrentCell[K] | Null = js.native
    
    var data: DataProvider[K, D] = js.native
    
    var dnd: Reorder = js.native
    
    var editMode: none | cellNavigation | cellEdit = js.native
    
    def getContextByNode(node: Element): ((CellContext[K, D]) with SubId) | ((HeaderContext[K, D]) with `2`) | ((LabelContext[K, D]) with `3`) = js.native
    
    @JSName("getProperty")
    def getProperty_bandingInterval(property: bandingInterval): Column = js.native
    @JSName("getProperty")
    def getProperty_cell(property: cell): ClassName[K, D] = js.native
    @JSName("getProperty")
    def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
    @JSName("getProperty")
    def getProperty_data(property: data): DataProvider[K, D] = js.native
    @JSName("getProperty")
    def getProperty_dnd(property: dnd): Reorder = js.native
    @JSName("getProperty")
    def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
    @JSName("getProperty")
    def getProperty_gridlines(property: gridlines): Horizontal = js.native
    @JSName("getProperty")
    def getProperty_header(property: header): ColumnEnd[K, D] = js.native
    @JSName("getProperty")
    def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
    @JSName("getProperty")
    def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): MaxColumnCount = js.native
    @JSName("getProperty")
    def getProperty_scrollPosition(property: scrollPosition): ColumnIndex[K] = js.native
    @JSName("getProperty")
    def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
    @JSName("getProperty")
    def getProperty_selectionMode(property: selectionMode): Cell = js.native
    
    var gridlines: Horizontal = js.native
    
    var header: ColumnEnd[K, D] = js.native
    
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
    
    var scrollPolicyOptions: MaxColumnCount = js.native
    
    var scrollPosition: ColumnIndex[K] = js.native
    
    var selection: js.Array[Selection[K]] = js.native
    
    var selectionMode: Cell = js.native
    
    def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
    
    def setProperty(property: editMode, value: cellEdit): Unit = js.native
    def setProperty(property: editMode, value: cellNavigation): Unit = js.native
    def setProperty(property: editMode, value: none): Unit = js.native
    def setProperty(property: scrollPolicy, value: auto): Unit = js.native
    def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
    def setProperty(property: scrollPolicy, value: scroll): Unit = js.native
    @JSName("setProperty")
    def setProperty_bandingInterval(property: bandingInterval, value: Column): Unit = js.native
    @JSName("setProperty")
    def setProperty_cell(property: cell, value: ClassName[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentCell(property: currentCell): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
    @JSName("setProperty")
    def setProperty_data(property: data): Unit = js.native
    @JSName("setProperty")
    def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_dnd(property: dnd, value: Reorder): Unit = js.native
    @JSName("setProperty")
    def setProperty_gridlines(property: gridlines, value: Horizontal): Unit = js.native
    @JSName("setProperty")
    def setProperty_header(property: header, value: ColumnEnd[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: MaxColumnCount): Unit = js.native
    @JSName("setProperty")
    def setProperty_scrollPosition(property: scrollPosition, value: ColumnIndex[K]): Unit = js.native
    @JSName("setProperty")
    def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
    @JSName("setProperty")
    def setProperty_selectionMode(property: selectionMode, value: Cell): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: AccessibleActionableMode): Unit = js.native
    
    @JSName("translations")
    var translations_ojDataGrid: AccessibleActionableMode = js.native
  }
  object ojDataGrid {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait CellContext[K, D] extends StObject {
      
      var cell: D = js.native
      
      var componentElement: Element = js.native
      
      var data: D = js.native
      
      var datasource: (DataProvider[K, D]) | Null = js.native
      
      var extents: ColumnRow = js.native
      
      var indexes: ColumnRow = js.native
      
      var keys: ColumnK[K] = js.native
      
      var mode: edit | navigation = js.native
      
      var parentElement: Element = js.native
    }
    object CellContext {
      
      @scala.inline
      def apply[K, D](
        cell: D,
        componentElement: Element,
        data: D,
        extents: ColumnRow,
        indexes: ColumnRow,
        keys: ColumnK[K],
        mode: edit | navigation,
        parentElement: Element
      ): CellContext[K, D] = {
        val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellContext[K, D]]
      }
      
      @scala.inline
      implicit class CellContextMutableBuilder[Self <: CellContext[_, _], K, D] (val x: Self with (CellContext[K, D])) extends AnyVal {
        
        @scala.inline
        def setCell(value: D): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        @scala.inline
        def setExtents(value: ColumnRow): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexes(value: ColumnRow): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeys(value: ColumnK[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: edit | navigation): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait CurrentCell[K] extends StObject {
      
      var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.native
      
      var index: js.UndefOr[Double] = js.native
      
      var indexes: js.UndefOr[ColumnRow] = js.native
      
      var key: js.UndefOr[js.Any] = js.native
      
      var keys: js.UndefOr[ColumnK[K]] = js.native
      
      var level: js.UndefOr[Double] = js.native
      
      var `type`: cell | header | label = js.native
    }
    object CurrentCell {
      
      @scala.inline
      def apply[K](`type`: cell | header | label): CurrentCell[K] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CurrentCell[K]]
      }
      
      @scala.inline
      implicit class CurrentCellMutableBuilder[Self <: CurrentCell[_], K] (val x: Self with CurrentCell[K]) extends AnyVal {
        
        @scala.inline
        def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setIndexes(value: ColumnRow): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setKeys(value: ColumnK[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
        
        @scala.inline
        def setType(value: cell | header | label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait HeaderContext[K, D] extends StObject {
      
      var axis: column | columnEnd | row | rowEnd = js.native
      
      var componentElement: Element = js.native
      
      var data: D = js.native
      
      var datasource: (DataProvider[K, D]) | Null = js.native
      
      var depth: Double = js.native
      
      var extent: Double = js.native
      
      var index: Double = js.native
      
      var key: K = js.native
      
      var level: Double = js.native
      
      var parentElement: Element = js.native
    }
    object HeaderContext {
      
      @scala.inline
      def apply[K, D](
        axis: column | columnEnd | row | rowEnd,
        componentElement: Element,
        data: D,
        depth: Double,
        extent: Double,
        index: Double,
        key: K,
        level: Double,
        parentElement: Element
      ): HeaderContext[K, D] = {
        val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[HeaderContext[K, D]]
      }
      
      @scala.inline
      implicit class HeaderContextMutableBuilder[Self <: HeaderContext[_, _], K, D] (val x: Self with (HeaderContext[K, D])) extends AnyVal {
        
        @scala.inline
        def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        @scala.inline
        def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait LabelContext[K, D] extends StObject {
      
      var axis: column | columnEnd | row | rowEnd = js.native
      
      var componentElement: Element = js.native
      
      var datasource: (DataProvider[K, D]) | Null = js.native
      
      var key: K = js.native
      
      var level: Double = js.native
      
      var parentElement: Element = js.native
    }
    object LabelContext {
      
      @scala.inline
      def apply[K, D](
        axis: column | columnEnd | row | rowEnd,
        componentElement: Element,
        key: K,
        level: Double,
        parentElement: Element
      ): LabelContext[K, D] = {
        val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelContext[K, D]]
      }
      
      @scala.inline
      implicit class LabelContextMutableBuilder[Self <: LabelContext[_, _], K, D] (val x: Self with (LabelContext[K, D])) extends AnyVal {
        
        @scala.inline
        def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        @scala.inline
        def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait Selection[K] extends StObject {
      
      var endIndex: js.UndefOr[RowNumber] = js.native
      
      var endKey: js.UndefOr[RowK[K]] = js.native
      
      var startIndex: js.UndefOr[RowNumber] = js.native
      
      var startKey: js.UndefOr[RowK[K]] = js.native
    }
    object Selection {
      
      @scala.inline
      def apply[K](): Selection[K] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Selection[K]]
      }
      
      @scala.inline
      implicit class SelectionMutableBuilder[Self <: Selection[_], K] (val x: Self with Selection[K]) extends AnyVal {
        
        @scala.inline
        def setEndIndex(value: RowNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        @scala.inline
        def setEndKey(value: RowK[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
        
        @scala.inline
        def setStartIndex(value: RowNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        @scala.inline
        def setStartKey(value: RowK[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
      }
    }
    
    type ojBeforeCurrentCell[K] = CustomEvent
    
    type ojBeforeEdit[K, D] = CustomEvent
    
    type ojBeforeEditEnd[K, D] = CustomEvent
    
    type ojResize = CustomEvent
    
    type ojScroll = CustomEvent
    
    type ojSort = CustomEvent
  }
  
  @js.native
  trait ojDataGridEventMap[K, D] extends baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
    
    var bandingIntervalChanged: CustomEvent = js.native
    
    var cellChanged: CustomEvent = js.native
    
    var currentCellChanged: CustomEvent = js.native
    
    var dataChanged: CustomEvent = js.native
    
    var dndChanged: CustomEvent = js.native
    
    var editModeChanged: CustomEvent = js.native
    
    var gridlinesChanged: CustomEvent = js.native
    
    var headerChanged: CustomEvent = js.native
    
    var ojBeforeCurrentCell: CustomEvent = js.native
    
    var ojBeforeEdit: CustomEvent = js.native
    
    var ojBeforeEditEnd: CustomEvent = js.native
    
    var ojResize: CustomEvent = js.native
    
    var ojScroll: CustomEvent = js.native
    
    var ojSort: CustomEvent = js.native
    
    var scrollPolicyChanged: CustomEvent = js.native
    
    var scrollPolicyOptionsChanged: CustomEvent = js.native
    
    var scrollPositionChanged: CustomEvent = js.native
    
    var selectionChanged: CustomEvent = js.native
    
    var selectionModeChanged: CustomEvent = js.native
  }
  object ojDataGridEventMap {
    
    @scala.inline
    def apply[K, D](
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      bandingIntervalChanged: CustomEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      cellChanged: CustomEvent,
      change: Event,
      click: MouseEvent,
      close: Event,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      currentCellChanged: CustomEvent,
      cut: ClipboardEvent,
      dataChanged: CustomEvent,
      dblclick: MouseEvent,
      dndChanged: CustomEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      editModeChanged: CustomEvent,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      gridlinesChanged: CustomEvent,
      headerChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojBeforeCurrentCell: CustomEvent,
      ojBeforeEdit: CustomEvent,
      ojBeforeEditEnd: CustomEvent,
      ojResize: CustomEvent,
      ojScroll: CustomEvent,
      ojSort: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      scrollPolicyChanged: CustomEvent,
      scrollPolicyOptionsChanged: CustomEvent,
      scrollPositionChanged: CustomEvent,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionChanged: CustomEvent,
      selectionModeChanged: CustomEvent,
      selectionchange: Event,
      selectstart: Event,
      stalled: Event,
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojDataGridEventMap[K, D] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], bandingIntervalChanged = bandingIntervalChanged.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellChanged = cellChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentCellChanged = currentCellChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], headerChanged = headerChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCurrentCell = ojBeforeCurrentCell.asInstanceOf[js.Any], ojBeforeEdit = ojBeforeEdit.asInstanceOf[js.Any], ojBeforeEditEnd = ojBeforeEditEnd.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojScroll = ojScroll.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDataGridEventMap[K, D]]
    }
    
    @scala.inline
    implicit class ojDataGridEventMapMutableBuilder[Self <: ojDataGridEventMap[_, _], K, D] (val x: Self with (ojDataGridEventMap[K, D])) extends AnyVal {
      
      @scala.inline
      def setBandingIntervalChanged(value: CustomEvent): Self = StObject.set(x, "bandingIntervalChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellChanged(value: CustomEvent): Self = StObject.set(x, "cellChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellChanged(value: CustomEvent): Self = StObject.set(x, "currentCellChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataChanged(value: CustomEvent): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDndChanged(value: CustomEvent): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeChanged(value: CustomEvent): Self = StObject.set(x, "editModeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridlinesChanged(value: CustomEvent): Self = StObject.set(x, "gridlinesChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderChanged(value: CustomEvent): Self = StObject.set(x, "headerChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeCurrentCell(value: CustomEvent): Self = StObject.set(x, "ojBeforeCurrentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeEdit(value: CustomEvent): Self = StObject.set(x, "ojBeforeEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeEditEnd(value: CustomEvent): Self = StObject.set(x, "ojBeforeEditEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjResize(value: CustomEvent): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjScroll(value: CustomEvent): Self = StObject.set(x, "ojScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjSort(value: CustomEvent): Self = StObject.set(x, "ojSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicyChanged(value: CustomEvent): Self = StObject.set(x, "scrollPolicyChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicyOptionsChanged(value: CustomEvent): Self = StObject.set(x, "scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionChanged(value: CustomEvent): Self = StObject.set(x, "scrollPositionChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojDataGridSettableProperties[K, D] extends baseComponentSettableProperties {
    
    var bandingInterval: Column = js.native
    
    var cell: ClassName[K, D] = js.native
    
    var currentCell: CurrentCell[K] | Null = js.native
    
    var data: (DataProvider[K, D]) | Null = js.native
    
    var dnd: Reorder = js.native
    
    var editMode: none | cellNavigation | cellEdit = js.native
    
    var gridlines: Horizontal = js.native
    
    var header: ColumnEnd[K, D] = js.native
    
    var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
    
    var scrollPolicyOptions: MaxColumnCount = js.native
    
    var scrollPosition: ColumnIndex[K] = js.native
    
    var selection: js.Array[Selection[K]] = js.native
    
    var selectionMode: Cell = js.native
    
    @JSName("translations")
    var translations_ojDataGridSettableProperties: AccessibleActionableMode = js.native
  }
  object ojDataGridSettableProperties {
    
    @scala.inline
    def apply[K, D](
      bandingInterval: Column,
      cell: ClassName[K, D],
      dnd: Reorder,
      editMode: none | cellNavigation | cellEdit,
      gridlines: Horizontal,
      header: ColumnEnd[K, D],
      scrollPolicy: auto | loadMoreOnScroll | scroll,
      scrollPolicyOptions: MaxColumnCount,
      scrollPosition: ColumnIndex[K],
      selection: js.Array[Selection[K]],
      selectionMode: Cell,
      translations: AccessibleActionableMode
    ): ojDataGridSettableProperties[K, D] = {
      val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
    }
    
    @scala.inline
    implicit class ojDataGridSettablePropertiesMutableBuilder[Self <: ojDataGridSettableProperties[_, _], K, D] (val x: Self with (ojDataGridSettableProperties[K, D])) extends AnyVal {
      
      @scala.inline
      def setBandingInterval(value: Column): Self = StObject.set(x, "bandingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCell(value: ClassName[K, D]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCell(value: CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellNull: Self = StObject.set(x, "currentCell", null)
      
      @scala.inline
      def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDnd(value: Reorder): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditMode(value: none | cellNavigation | cellEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridlines(value: Horizontal): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ColumnEnd[K, D]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicyOptions(value: MaxColumnCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPosition(value: ColumnIndex[K]): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: js.Array[Selection[K]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: Cell): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionVarargs(value: Selection[K]*): Self = StObject.set(x, "selection", js.Array(value :_*))
      
      @scala.inline
      def setTranslations(value: AccessibleActionableMode): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatagrid.ojDataGridSettableProperties<K, D>> */
  @js.native
  trait ojDataGridSettablePropertiesLenient[K, D]
    extends /* key */ StringDictionary[js.Any] {
    
    var bandingInterval: js.UndefOr[Column] = js.native
    
    var cell: js.UndefOr[ClassName[K, D]] = js.native
    
    var currentCell: js.UndefOr[CurrentCell[K] | Null] = js.native
    
    var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
    
    var dnd: js.UndefOr[Reorder] = js.native
    
    var editMode: js.UndefOr[none | cellNavigation | cellEdit] = js.native
    
    var gridlines: js.UndefOr[Horizontal] = js.native
    
    var header: js.UndefOr[ColumnEnd[K, D]] = js.native
    
    var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll | scroll] = js.native
    
    var scrollPolicyOptions: js.UndefOr[MaxColumnCount] = js.native
    
    var scrollPosition: js.UndefOr[ColumnIndex[K]] = js.native
    
    var selection: js.UndefOr[js.Array[Selection[K]]] = js.native
    
    var selectionMode: js.UndefOr[Cell] = js.native
    
    var translations: js.UndefOr[AccessibleActionableMode] = js.native
  }
  object ojDataGridSettablePropertiesLenient {
    
    @scala.inline
    def apply[K, D](): ojDataGridSettablePropertiesLenient[K, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojDataGridSettablePropertiesLenient[K, D]]
    }
    
    @scala.inline
    implicit class ojDataGridSettablePropertiesLenientMutableBuilder[Self <: ojDataGridSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojDataGridSettablePropertiesLenient[K, D])) extends AnyVal {
      
      @scala.inline
      def setBandingInterval(value: Column): Self = StObject.set(x, "bandingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandingIntervalUndefined: Self = StObject.set(x, "bandingInterval", js.undefined)
      
      @scala.inline
      def setCell(value: ClassName[K, D]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCurrentCell(value: CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellNull: Self = StObject.set(x, "currentCell", null)
      
      @scala.inline
      def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      @scala.inline
      def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDnd(value: Reorder): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
      
      @scala.inline
      def setEditMode(value: none | cellNavigation | cellEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      @scala.inline
      def setGridlines(value: Horizontal): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
      
      @scala.inline
      def setHeader(value: ColumnEnd[K, D]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicyOptions(value: MaxColumnCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPolicyOptionsUndefined: Self = StObject.set(x, "scrollPolicyOptions", js.undefined)
      
      @scala.inline
      def setScrollPolicyUndefined: Self = StObject.set(x, "scrollPolicy", js.undefined)
      
      @scala.inline
      def setScrollPosition(value: ColumnIndex[K]): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Array[Selection[K]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionMode(value: Cell): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSelectionVarargs(value: Selection[K]*): Self = StObject.set(x, "selection", js.Array(value :_*))
      
      @scala.inline
      def setTranslations(value: AccessibleActionableMode): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
