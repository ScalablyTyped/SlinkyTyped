package typingsSlinky.muiDatatables.mod

import slinky.core.TagMod
import typingsSlinky.muiDatatables.muiDatatablesStrings.`false`
import typingsSlinky.muiDatatables.muiDatatablesStrings.`true`
import typingsSlinky.muiDatatables.muiDatatablesStrings.asc
import typingsSlinky.muiDatatables.muiDatatablesStrings.desc
import typingsSlinky.muiDatatables.muiDatatablesStrings.excluded
import typingsSlinky.muiDatatables.muiDatatablesStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableColumnOptions extends js.Object {
  var customBodyRender: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _], 
      String | TagMod[Any]
    ]
  ] = js.native
  var customFilterListRender: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  var customHeadRender: js.UndefOr[
    js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      String | TagMod[Any]
    ]
  ] = js.native
  var display: js.UndefOr[`true` | `false` | excluded] = js.native
  var download: js.UndefOr[Boolean] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterList: js.UndefOr[js.Array[String]] = js.native
  var filterOptions: js.UndefOr[MUIDataTableFilterOptions] = js.native
  var filterType: js.UndefOr[FilterType] = js.native
  var hint: js.UndefOr[String] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var setCellHeaderProps: js.UndefOr[js.Function1[/* columnMeta */ MUIDataTableCustomHeadRenderer, js.Object]] = js.native
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var sortDirection: js.UndefOr[asc | desc | none] = js.native
  var viewColumns: js.UndefOr[Boolean] = js.native
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
  @scala.inline
  implicit class MUIDataTableColumnOptionsOps[Self <: MUIDataTableColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomBodyRender(
      value: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _]) => String | TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBodyRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomBodyRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBodyRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFilterListRender(value: /* value */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilterListRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomFilterListRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilterListRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeadRender(
      value: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, _]) => String | TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomHeadRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: `true` | `false` | excluded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterList(value: js.Array[String]): Self = {
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
    def withFilterOptions(value: MUIDataTableFilterOptions): Self = {
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
    def withFilterType(value: FilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCellHeaderProps(value: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellHeaderProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCellHeaderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellHeaderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCellProps(value: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellProps")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetCellProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCellProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirection(value: asc | desc | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withViewColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumns")(js.undefined)
        ret
    }
  }
  
}

