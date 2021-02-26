package typingsSlinky.agGrid

import typingsSlinky.agGrid.baseFilterMod.FilterConditionType
import typingsSlinky.agGrid.baseFilterMod.IComparableFilterParams
import typingsSlinky.agGrid.baseFilterMod.ScalarBaseFilter
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.dateComponentMod.IDate
import typingsSlinky.agGrid.dateComponentMod.IDateParams
import typingsSlinky.agGrid.iFilterMod.SerializedFilter
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
  @js.native
  class DateFilter ()
    extends ScalarBaseFilter[js.Date, IDateFilterParams, SerializedDateFilter] {
    def this(template: String) = this()
    
    var componentRecipes: js.Any = js.native
    
    /* private */ def createComponents(`type`: js.Any): js.Any = js.native
    
    var dateFrom: js.Any = js.native
    
    var dateFromComponent: js.Any = js.native
    
    var dateFromCondition: js.Any = js.native
    
    var dateFromConditionComponent: js.Any = js.native
    
    var dateTo: js.Any = js.native
    
    var dateToComponent: js.Any = js.native
    
    var dateToCondition: js.Any = js.native
    
    var dateToConditionComponent: js.Any = js.native
    
    /* private */ def defaultComparator(filterDate: js.Any, cellValue: js.Any): js.Any = js.native
    
    var eDateFromConditionPanel: js.Any = js.native
    
    var eDateFromPanel: js.Any = js.native
    
    var eDateToConditionPanel: js.Any = js.native
    
    var eDateToPanel: js.Any = js.native
    
    def getDateFrom(): String = js.native
    
    def getDateTo(): String = js.native
    
    def getFilterType(): String = js.native
    
    /* private */ def onDateChanged(`type`: js.Any): js.Any = js.native
    
    def setDateFrom(date: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def setDateFrom_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
    
    def setDateTo(date: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def setDateTo_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
    
    def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
  }
  /* static members */
  object DateFilter {
    
    @JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter.removeTimezone")
    @js.native
    def removeTimezone(from: js.Date): js.Date = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.dateComponentMod.IDateComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
  @js.native
  class DefaultDateComponent ()
    extends Component
       with IDate {
    
    var eDateInput: js.Any = js.native
    
    @JSName("init")
    def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
    
    var listener: js.Any = js.native
  }
  
  type IDateComparatorFunc = js.Function2[/* filterLocalDateAtMidnight */ js.Date, /* cellValue */ js.Any, Double]
  
  @js.native
  trait IDateFilterParams extends IComparableFilterParams {
    
    var browserDatePicker: js.UndefOr[Boolean] = js.native
    
    var comparator: js.UndefOr[IDateComparatorFunc] = js.native
  }
  object IDateFilterParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      colDef: ColDef,
      column: Column,
      context: js.Any,
      doesRowPassOtherFilter: RowNode => Boolean,
      filterChangedCallback: () => Unit,
      filterModifiedCallback: () => Unit,
      rowModel: IRowModel,
      suppressAndOrCondition: Boolean,
      valueGetter: RowNode => js.Any
    ): IDateFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IDateFilterParams]
    }
    
    @scala.inline
    implicit class IDateFilterParamsMutableBuilder[Self <: IDateFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserDatePicker(value: Boolean): Self = StObject.set(x, "browserDatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserDatePickerUndefined: Self = StObject.set(x, "browserDatePicker", js.undefined)
      
      @scala.inline
      def setComparator(value: (/* filterLocalDateAtMidnight */ js.Date, /* cellValue */ js.Any) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    }
  }
  
  @js.native
  trait SerializedDateFilter extends SerializedFilter {
    
    var dateFrom: String = js.native
    
    var dateTo: String = js.native
    
    var `type`: String = js.native
  }
  object SerializedDateFilter {
    
    @scala.inline
    def apply(dateFrom: String, dateTo: String, filterType: String, `type`: String): SerializedDateFilter = {
      val __obj = js.Dynamic.literal(dateFrom = dateFrom.asInstanceOf[js.Any], dateTo = dateTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedDateFilter]
    }
    
    @scala.inline
    implicit class SerializedDateFilterMutableBuilder[Self <: SerializedDateFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFrom(value: String): Self = StObject.set(x, "dateFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTo(value: String): Self = StObject.set(x, "dateTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
