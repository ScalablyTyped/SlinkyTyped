package typingsSlinky.agGrid.baseFilterMod

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScalarFilterParams extends IComparableFilterParams {
  var inRangeInclusive: js.UndefOr[Boolean] = js.native
  var nullComparator: js.UndefOr[NullComparator] = js.native
}

object IScalarFilterParams {
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
  ): IScalarFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[IScalarFilterParams]
  }
  @scala.inline
  implicit class IScalarFilterParamsOps[Self <: IScalarFilterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInRangeInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRangeInclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRangeInclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRangeInclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withNullComparator(value: NullComparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullComparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullComparator")(js.undefined)
        ret
    }
  }
  
}

