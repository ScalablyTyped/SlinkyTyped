package typingsSlinky.agGrid.iSetFilterParamsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.anon.InstantiableICellRendererComp
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import typingsSlinky.agGrid.iFilterMod.IFilterParams
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ISetFilterParamsOps[Self <: ISetFilterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewRowsAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRowsAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllOnMiniFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnMiniFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressMiniFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMiniFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparator(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMiniFilterSearchByRefDataKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniFilterSearchByRefDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiniFilterSearchByRefDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniFilterSearchByRefDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressRemoveEntries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRemoveEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRemoveEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRemoveEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesFunction1(value: /* params */ SetFilterValuesFuncParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(value: SetFilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

