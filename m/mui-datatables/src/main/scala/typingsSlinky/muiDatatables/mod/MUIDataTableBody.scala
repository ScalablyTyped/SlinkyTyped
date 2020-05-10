package typingsSlinky.muiDatatables.mod

import typingsSlinky.muiDatatables.AnonRowIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableBody extends js.Object {
  var classes: js.Object = js.native
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  var count: Double = js.native
  var data: js.Array[js.Object | (js.Array[Double | String])] = js.native
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex, Unit]] = js.native
  var options: js.Object = js.native
  var searchText: js.UndefOr[String] = js.native
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var selectedRows: js.UndefOr[js.Object] = js.native
  var toggleExpandRow: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableBody {
  @scala.inline
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: js.Object
  ): MUIDataTableBody = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBody]
  }
  @scala.inline
  implicit class MUIDataTableBodyOps[Self <: MUIDataTableBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[MUIDataTableColumnDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
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
    def withOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRowUpdate(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectRowUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRows(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleExpandRow(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleExpandRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleExpandRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleExpandRow")(js.undefined)
        ret
    }
  }
  
}

