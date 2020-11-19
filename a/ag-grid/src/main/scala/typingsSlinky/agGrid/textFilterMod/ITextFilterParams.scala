package typingsSlinky.agGrid.textFilterMod

import typingsSlinky.agGrid.baseFilterMod.IComparableFilterParams
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextFilterParams extends IComparableFilterParams {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var debounceMs: js.UndefOr[Double] = js.native
  
  var textCustomComparator: js.UndefOr[TextComparator] = js.native
}
object ITextFilterParams {
  
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
  ): ITextFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[ITextFilterParams]
  }
  
  @scala.inline
  implicit class ITextFilterParamsOps[Self <: ITextFilterParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setDebounceMs(value: Double): Self = this.set("debounceMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceMs: Self = this.set("debounceMs", js.undefined)
    
    @scala.inline
    def setTextCustomComparator(value: (/* filter */ String, /* gridValue */ js.Any, /* filterText */ String) => Boolean): Self = this.set("textCustomComparator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTextCustomComparator: Self = this.set("textCustomComparator", js.undefined)
  }
}
