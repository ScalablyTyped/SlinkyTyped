package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableToolbar extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var filterData: js.UndefOr[js.Any] = js.native
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var filterUpdate: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var resetFilters: js.UndefOr[js.Any] = js.native
  var searchTextUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var setTableActions: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var tableRef: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var title: js.UndefOr[js.Any] = js.native
  var toggleViewColumn: js.UndefOr[js.Any] = js.native
}

object MUIDataTableToolbar {
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef]): MUIDataTableToolbar = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbar]
  }
  @scala.inline
  implicit class MUIDataTableToolbarOps[Self <: MUIDataTableToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[MUIDataTableColumnDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterList(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterUpdate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withResetFilters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTextUpdate(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTextUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchTextUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTextUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTableActions(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTableActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRef(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRef")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleViewColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleViewColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleViewColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleViewColumn")(js.undefined)
        ret
    }
  }
  
}

