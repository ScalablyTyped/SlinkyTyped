package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.anon.InstantiableICellRendererComp
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import typingsSlinky.agGrid.iFilterMod.IFilterParams
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iSetFilterParamsMod {
  
  @js.native
  trait ISetFilterParams
    extends IFilterParams
       with ComponentHolder {
    
    @JSName("apply")
    var apply: Boolean = js.native
    
    var cellHeight: Double = js.native
    
    var cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    var comparator: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
    
    var debounceMs: js.UndefOr[Double] = js.native
    
    var miniFilterSearchByRefDataKey: js.UndefOr[Boolean] = js.native
    
    @JSName("newRowsAction")
    var newRowsAction_ISetFilterParams: String = js.native
    
    var selectAllOnMiniFilter: Boolean = js.native
    
    var suppressMiniFilter: Boolean = js.native
    
    var suppressRemoveEntries: js.UndefOr[Boolean] = js.native
    
    var suppressSorting: Boolean = js.native
    
    var values: js.UndefOr[SetFilterValues] = js.native
  }
  object ISetFilterParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      apply: Boolean,
      cellHeight: Double,
      cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String,
      colDef: ColDef,
      column: Column,
      context: js.Any,
      doesRowPassOtherFilter: RowNode => Boolean,
      filterChangedCallback: () => Unit,
      filterModifiedCallback: () => Unit,
      newRowsAction: String,
      rowModel: IRowModel,
      selectAllOnMiniFilter: Boolean,
      suppressMiniFilter: Boolean,
      suppressSorting: Boolean,
      valueGetter: RowNode => js.Any
    ): ISetFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), newRowsAction = newRowsAction.asInstanceOf[js.Any], rowModel = rowModel.asInstanceOf[js.Any], selectAllOnMiniFilter = selectAllOnMiniFilter.asInstanceOf[js.Any], suppressMiniFilter = suppressMiniFilter.asInstanceOf[js.Any], suppressSorting = suppressSorting.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[ISetFilterParams]
    }
    
    @scala.inline
    implicit class ISetFilterParamsMutableBuilder[Self <: ISetFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = StObject.set(x, "cellRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComparator(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
      
      @scala.inline
      def setMiniFilterSearchByRefDataKey(value: Boolean): Self = StObject.set(x, "miniFilterSearchByRefDataKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniFilterSearchByRefDataKeyUndefined: Self = StObject.set(x, "miniFilterSearchByRefDataKey", js.undefined)
      
      @scala.inline
      def setNewRowsAction(value: String): Self = StObject.set(x, "newRowsAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllOnMiniFilter(value: Boolean): Self = StObject.set(x, "selectAllOnMiniFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressMiniFilter(value: Boolean): Self = StObject.set(x, "suppressMiniFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRemoveEntries(value: Boolean): Self = StObject.set(x, "suppressRemoveEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRemoveEntriesUndefined: Self = StObject.set(x, "suppressRemoveEntries", js.undefined)
      
      @scala.inline
      def setSuppressSorting(value: Boolean): Self = StObject.set(x, "suppressSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: SetFilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesFunction1(value: /* params */ SetFilterValuesFuncParams => Unit): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type SetFilterValues = SetFilterValuesFunc | js.Array[js.Any]
  
  type SetFilterValuesFunc = js.Function1[/* params */ SetFilterValuesFuncParams, Unit]
  
  @js.native
  trait SetFilterValuesFuncParams extends StObject {
    
    var colDef: ColDef = js.native
    
    def success(values: js.Array[String]): Unit = js.native
  }
  object SetFilterValuesFuncParams {
    
    @scala.inline
    def apply(colDef: ColDef, success: js.Array[String] => Unit): SetFilterValuesFuncParams = {
      val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[SetFilterValuesFuncParams]
    }
    
    @scala.inline
    implicit class SetFilterValuesFuncParamsMutableBuilder[Self <: SetFilterValuesFuncParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: js.Array[String] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
}
