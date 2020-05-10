package typingsSlinky.agGrid.iFilterMod

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var applyButton: js.UndefOr[Boolean] = js.native
  var clearButton: js.UndefOr[Boolean] = js.native
  var colDef: ColDef = js.native
  var column: Column = js.native
  var context: js.Any = js.native
  var defaultOption: js.UndefOr[String] = js.native
  var filterOptions: js.UndefOr[js.Array[String]] = js.native
  var newRowsAction: js.UndefOr[String] = js.native
  var rowModel: IRowModel = js.native
  var textFormatter: js.UndefOr[js.Function1[/* from */ String, String]] = js.native
  def doesRowPassOtherFilter(rowNode: RowNode): Boolean = js.native
  def filterChangedCallback(): Unit = js.native
  def filterModifiedCallback(): Unit = js.native
  def valueGetter(rowNode: RowNode): js.Any = js.native
}

object IFilterParams {
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
    valueGetter: RowNode => js.Any
  ): IFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[IFilterParams]
  }
  @scala.inline
  implicit class IFilterParamsOps[Self <: IFilterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$scope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColDef(value: ColDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoesRowPassOtherFilter(value: RowNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesRowPassOtherFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterChangedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChangedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilterModifiedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterModifiedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowModel(value: IRowModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueGetter(value: RowNode => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButton")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOption")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRowsAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRowsAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRowsAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRowsAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormatter(value: /* from */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTextFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatter")(js.undefined)
        ret
    }
  }
  
}

