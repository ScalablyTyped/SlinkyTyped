package typingsSlinky.muiDatatables.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.muiDatatables.anon.ColIndex
import typingsSlinky.muiDatatables.anon.DataDataIndex
import typingsSlinky.muiDatatables.anon.Lookup
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaBody
import typingsSlinky.muiDatatables.anon.Partialfilenamestringsepa
import typingsSlinky.muiDatatables.anon.RowIndex
import typingsSlinky.muiDatatables.anon.XAxis
import typingsSlinky.muiDatatables.muiDatatablesStrings.chip
import typingsSlinky.muiDatatables.muiDatatablesStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var customFilterDialogFooter: js.UndefOr[js.Function1[/* filterList */ js.Array[_], TagMod[Any]]] = js.native
  var customFooter: js.UndefOr[
    js.Function5[
      /* rowCount */ Double, 
      /* page */ Double, 
      /* rowsPerPage */ Double, 
      /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], 
      /* changePage */ js.Function1[/* newPage */ Double, Unit], 
      TagMod[Any]
    ]
  ] = js.native
  var customRowRender: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double, TagMod[Any]]
  ] = js.native
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[_], 
      /* columns */ js.Array[_], 
      Boolean
    ]
  ] = js.native
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
  var customSort: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* colIndex */ Double, /* order */ String, js.Array[_]]
  ] = js.native
  var customToolbar: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ Lookup, 
      /* displayData */ js.Array[DataDataIndex], 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit], 
      TagMod[Any]
    ]
  ] = js.native
  var disableToolbarSelect: js.UndefOr[Boolean] = js.native
  var download: js.UndefOr[Boolean] = js.native
  var downloadOptions: js.UndefOr[Partialfilenamestringsepa] = js.native
  var elevation: js.UndefOr[Double] = js.native
  var expandableRows: js.UndefOr[Boolean] = js.native
  var expandableRowsOnClick: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterType: js.UndefOr[FilterType] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var fixedHeaderOptions: js.UndefOr[XAxis] = js.native
  var isRowExpandable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.native
  var isRowSelectable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.native
  var onCellClick: js.UndefOr[js.Function2[/* colData */ js.Any, /* cellMeta */ ColIndex, Unit]] = js.native
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ Double, Unit]] = js.native
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ Double, Unit]] = js.native
  var onColumnSortChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* direction */ String, Unit]] = js.native
  var onColumnViewChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.native
  /**
    * A callback function that triggers when the user downloads the CSV file.
    * In the callback, you can control what is written to the CSV file.
    * Return false to cancel download of file.
    */
  var onDownload: js.UndefOr[
    js.Function4[
      /* buildHead */ js.Function1[/* columns */ js.Any, String], 
      /* buildBody */ js.Function1[/* data */ js.Any, String], 
      /* columns */ js.Any, 
      /* data */ js.Any, 
      String | Boolean
    ]
  ] = js.native
  var onFilterChange: js.UndefOr[
    js.Function3[
      /* changedColumn */ String, 
      /* filterList */ js.Array[_], 
      /* type */ FilterType | chip | reset, 
      Unit
    ]
  ] = js.native
  var onFilterDialogClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onFilterDialogOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, Unit]] = js.native
  var onRowsDelete: js.UndefOr[js.Function1[/* rowsDeleted */ js.Array[_], Unit]] = js.native
  var onRowsExpand: js.UndefOr[
    js.Function2[/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_], Unit]
  ] = js.native
  var onRowsSelect: js.UndefOr[
    js.Function2[/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_], Unit]
  ] = js.native
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.native
  var onSearchClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearchOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onTableChange: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.native
  var onTableInit: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.native
  var page: js.UndefOr[Double] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var renderExpandableRow: js.UndefOr[
    js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, TagMod[Any]]
  ] = js.native
  var resizableColumns: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Responsive] = js.native
  var rowHover: js.UndefOr[Boolean] = js.native
  var rowsExpanded: js.UndefOr[js.Array[_]] = js.native
  var rowsPerPage: js.UndefOr[Double] = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
  var rowsSelected: js.UndefOr[js.Array[_]] = js.native
  var search: js.UndefOr[Boolean] = js.native
  var searchOpen: js.UndefOr[Boolean] = js.native
  var searchPlaceholder: js.UndefOr[String] = js.native
  var searchText: js.UndefOr[String] = js.native
  var selectableRows: js.UndefOr[SelectableRows] = js.native
  var selectableRowsHeader: js.UndefOr[Boolean] = js.native
  var selectableRowsOnClick: js.UndefOr[Boolean] = js.native
  var serverSide: js.UndefOr[Boolean] = js.native
  var serverSideFilterList: js.UndefOr[js.Array[_]] = js.native
  var setRowProps: js.UndefOr[js.Function2[/* row */ js.Array[_], /* rowIndex */ Double, js.Object]] = js.native
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var sortFilterList: js.UndefOr[Boolean] = js.native
  var textLabels: js.UndefOr[PartialMUIDataTableTextLaBody] = js.native
  var viewColumns: js.UndefOr[Boolean] = js.native
}

object MUIDataTableOptions {
  @scala.inline
  def apply(): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableOptions]
  }
  @scala.inline
  implicit class MUIDataTableOptionsOps[Self <: MUIDataTableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFilterDialogFooter(value: /* filterList */ js.Array[_] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilterDialogFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomFilterDialogFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilterDialogFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFooter(
      value: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], /* changePage */ js.Function1[/* newPage */ Double, Unit]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCustomFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRowRender(value: (/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRowRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomRowRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRowRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSearch(
      value: (/* searchQuery */ String, /* currentRow */ js.Array[_], /* columns */ js.Array[_]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSearch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSearchRender(
      value: (/* searchText */ String, /* handleSearch */ js.Any, /* hideSearch */ js.Any, /* options */ js.Any) => ReactComponentClass[js.Object] | ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSearchRender")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCustomSearchRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSearchRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSort(value: (/* data */ js.Array[_], /* colIndex */ Double, /* order */ String) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSort")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolbar(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCustomToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolbarSelect(
      value: (/* selectedRows */ Lookup, /* displayData */ js.Array[DataDataIndex], /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarSelect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomToolbarSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbarSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableToolbarSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableToolbarSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableToolbarSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableToolbarSelect")(js.undefined)
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
    def withDownloadOptions(value: Partialfilenamestringsepa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowsOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowsOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowsOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowsOnClick")(js.undefined)
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
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeaderOptions(value: XAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeaderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaderOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowExpandable(value: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowExpandable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsRowExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowExpandable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowSelectable(value: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsRowSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: (/* colData */ js.Any, /* cellMeta */ ColIndex) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangePage(value: /* currentPage */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangePage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangePage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeRowsPerPage(value: /* numberOfRows */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeRowsPerPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeRowsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeRowsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnSortChange(value: (/* changedColumn */ String, /* direction */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnSortChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnSortChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnSortChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnViewChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnViewChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnViewChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnViewChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDownload(
      value: (/* buildHead */ js.Function1[/* columns */ js.Any, String], /* buildBody */ js.Function1[/* data */ js.Any, String], /* columns */ js.Any, /* data */ js.Any) => String | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterChange(
      value: (/* changedColumn */ String, /* filterList */ js.Array[_], /* type */ FilterType | chip | reset) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFilterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterDialogClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDialogClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFilterDialogClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDialogClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterDialogOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDialogOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFilterDialogOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDialogOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = {
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
    def withOnRowsDelete(value: /* rowsDeleted */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowsDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsExpand(value: (/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowsExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsSelect(value: (/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowsSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchChange(value: /* searchText */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearchChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearchClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearchOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTableChange(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTableChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTableInit(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTableInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableInit")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
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
    def withRenderExpandableRow(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderExpandableRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderExpandableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderExpandableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Responsive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsExpanded(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsPerPageOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsPerPageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsSelected(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
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
    def withSelectableRows(value: SelectableRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableRowsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRowsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableRowsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRowsHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableRowsOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRowsOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableRowsOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRowsOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSide")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideFilterList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideFilterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideFilterList")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRowProps(value: (/* row */ js.Array[_], /* rowIndex */ Double) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTableProps(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetTableProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTableProps")(js.undefined)
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
    def withSortFilterList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFilterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFilterList")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLabels(value: PartialMUIDataTableTextLaBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLabels")(js.undefined)
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

