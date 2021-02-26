package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.iCellRendererMod.ICellRenderer
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererParams
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupCellRendererMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
  @js.native
  class GroupCellRenderer ()
    extends Component
       with ICellRenderer {
    
    /* private */ def addCheckboxIfNeeded(): js.Any = js.native
    
    /* private */ def addChildCount(): js.Any = js.native
    
    /* private */ def addExpandAndContract(): js.Any = js.native
    
    /* private */ def addValueElement(): js.Any = js.native
    
    /* private */ def assignBlankValueToGroupFooterCell(params: js.Any): js.Any = js.native
    
    var cellIsBlank: js.Any = js.native
    
    var cellRendererService: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createFooterCell(): js.Any = js.native
    
    /* private */ def createGroupCell(): js.Any = js.native
    
    /* private */ def createLeafCell(): js.Any = js.native
    
    var displayedGroup: js.Any = js.native
    
    var draggedFromHideOpenParents: js.Any = js.native
    
    var eCheckbox: js.Any = js.native
    
    var eChildCount: js.Any = js.native
    
    var eContracted: js.Any = js.native
    
    var eExpanded: js.Any = js.native
    
    var eValue: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var expressionService: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var indentClass: js.Any = js.native
    
    @JSName("init")
    def init_MGroupCellRenderer(params: GroupCellRendererParams): Unit = js.native
    
    var innerCellRenderer: js.Any = js.native
    
    /* private */ def isEmbeddedRowMismatch(): js.Any = js.native
    
    /* private */ def isExpandable(): js.Any = js.native
    
    /* private */ def isUserWantsSelected(): js.Any = js.native
    
    var mouseEventService: js.Any = js.native
    
    /* private */ def onAllChildrenCountChanged(): js.Any = js.native
    
    def onCellDblClicked(mouseEvent: MouseEvent): Unit = js.native
    
    def onExpandClicked(mouseEvent: MouseEvent): Unit = js.native
    
    def onExpandOrContract(): Unit = js.native
    
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
    
    var params: js.Any = js.native
    
    def refresh(): Boolean = js.native
    
    /* private */ def setIndent(): js.Any = js.native
    
    /* private */ def setPaddingDeprecatedWay(paddingCount: js.Any, padding: js.Any): js.Any = js.native
    
    /* private */ def setupDragOpenParents(): js.Any = js.native
    
    /* private */ def setupIndent(): js.Any = js.native
    
    /* private */ def showExpandAndContractIcons(): js.Any = js.native
    
    /* private */ def updateChildCount(): js.Any = js.native
    
    var valueFormatterService: js.Any = js.native
  }
  /* static members */
  object GroupCellRenderer {
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait GroupCellRendererParams extends ICellRendererParams {
    
    var actualValue: String = js.native
    
    var checkbox: js.Any = js.native
    
    var footerValueGetter: js.Any = js.native
    
    var fullWidth: Boolean = js.native
    
    var padding: Double = js.native
    
    var pinned: String = js.native
    
    var scope: js.Any = js.native
    
    var suppressCount: Boolean = js.native
    
    var suppressDoubleClickExpand: Boolean = js.native
    
    var suppressPadding: Boolean = js.native
  }
  object GroupCellRendererParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      actualValue: String,
      addRenderedRowListener: (String, js.Function) => Unit,
      api: GridApi,
      checkbox: js.Any,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      eGridCell: HTMLElement,
      eParentOfValue: HTMLElement,
      footerValueGetter: js.Any,
      formatValue: js.Any => js.Any,
      fullWidth: Boolean,
      getValue: () => js.Any,
      node: RowNode,
      padding: Double,
      pinned: String,
      refreshCell: () => Unit,
      rowIndex: Double,
      scope: js.Any,
      setValue: js.Any => Unit,
      suppressCount: Boolean,
      suppressDoubleClickExpand: Boolean,
      suppressPadding: Boolean,
      value: js.Any,
      valueFormatted: js.Any
    ): GroupCellRendererParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], actualValue = actualValue.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], footerValueGetter = footerValueGetter.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), fullWidth = fullWidth.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), suppressCount = suppressCount.asInstanceOf[js.Any], suppressDoubleClickExpand = suppressDoubleClickExpand.asInstanceOf[js.Any], suppressPadding = suppressPadding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupCellRendererParams]
    }
    
    @scala.inline
    implicit class GroupCellRendererParamsMutableBuilder[Self <: GroupCellRendererParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualValue(value: String): Self = StObject.set(x, "actualValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckbox(value: js.Any): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterValueGetter(value: js.Any): Self = StObject.set(x, "footerValueGetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressCount(value: Boolean): Self = StObject.set(x, "suppressCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressDoubleClickExpand(value: Boolean): Self = StObject.set(x, "suppressDoubleClickExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPadding(value: Boolean): Self = StObject.set(x, "suppressPadding", value.asInstanceOf[js.Any])
    }
  }
}
