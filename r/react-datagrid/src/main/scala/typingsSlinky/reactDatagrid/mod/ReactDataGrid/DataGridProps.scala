package typingsSlinky.reactDatagrid.mod.ReactDataGrid

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import typingsSlinky.reactDatagrid.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataGridProps extends Props[DataGrid] {
  /**
    * Array - an array of columns that are going to be rendered in the
    * grid.
    */
  var columns: js.Array[Column] = js.native
  /**
    * Array/String/Function/Promise - for local data, an array of object
    * to render in the grid. For remote data, a string url, or a function
    * that returns a promise.
    */
  var dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]) = js.native
  var dataSourceCount: js.UndefOr[Double] = js.native
  var defaultPage: js.UndefOr[Double] = js.native
  var defaultPageSize: js.UndefOr[Double] = js.native
  /**
    * Empty text for no records.
    */
  var emptyText: js.UndefOr[String] = js.native
  /**
    * Group rows by matching values.
    */
  var groupBy: js.UndefOr[js.Array[_]] = js.native
  /**
    * String - the name of the property where the id is found for each
    * object in the data array.
    */
  var idProperty: String = js.native
  /**
    * To apply the filter while typing.
    */
  var liveFilter: js.UndefOr[Boolean] = js.native
  /**
    * If you dont want loadMask over header, specify
    */
  var loadMaskOverHeader: js.UndefOr[Boolean] = js.native
  /**
    * Loading grid.
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * If you want to enable column reordering, just specify the
    * onColumnOrderChange prop on the grid:
    */
  var onColumnOrderChange: js.UndefOr[js.Function2[/* index */ Double, /* dropIndex */ Double, Unit]] = js.native
  /**
    * If you want to enable column resized, just specify the
    * onColumnResize prop on the grid:
    */
  var onColumnResize: js.UndefOr[
    js.Function4[
      /* firstCol */ Column, 
      /* firstSize */ Double, 
      /* secondCol */ Column, 
      /* secondSize */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * When a column is shown/hidden, you can be notified using the
    * onColumnVisibilityChange callback prop.
    */
  var onColumnVisibilityChange: js.UndefOr[js.Function2[/* column */ Column, /* visibility */ Boolean, Unit]] = js.native
  /**
    * If you want to enable filter, just specify the
    * onFilter prop on the grid:
    */
  var onFilter: js.UndefOr[
    js.Function3[/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_], Unit]
  ] = js.native
  /**
    * handle page changes.
    */
  var onPageChange: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  /**
    * handle page size changes.
    */
  var onPageSizeChange: js.UndefOr[js.Function2[/* pageSize */ Double, /* props */ DataGridProps, Unit]] = js.native
  /**
    * If you want to enable selection, just specify the
    * onSelectionChange prop on the grid:
    */
  var onSelectionChange: js.UndefOr[js.Function2[/* newSelected */ js.Object, /* data */ js.Any, Unit]] = js.native
  /**
    * Sorting the data array is not done by the grid. You can however
    * pass in sort info so the grid renders with sorting icons as needed.
    */
  var onSortChange: js.UndefOr[js.Function1[/* sortInfo */ js.Array[SortInfo], Unit]] = js.native
  /**
    * Number - controlled alternative for defaultPage. When page changes,
    * onPageChange(page) is called.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Number - controlled alternative for defaultPageSize. When pageSize
    * changes, onPageSizeChange(pageSize) is called.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * When you have remote data, pagination is setup by default. If you
    * want to disable pagination, specify the pagination prop with a false
    * value.
    */
  var pagination: js.UndefOr[Boolean] = js.native
  /**
    * Customize the pagination toolbar.
    */
  var paginationToolbarProps: js.UndefOr[PaginationToolbarProps] = js.native
  /**
    * Custom row height.
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * Object/Function - you can specify either a style object to be
    * applied to all rows, or a function. The function is called with
    * (data, props) (so you have access to props.index for example) and
    * is expected to return a style object.
    */
  var rowStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])
  ] = js.native
  /**
    * The current selection.
    */
  var selected: js.UndefOr[js.Object] = js.native
  /**
    * Show cell borders. Other valid values: 'horizontal', 'vertical'.
    */
  var showCellBorders: js.UndefOr[Boolean | String] = js.native
  /**
    * Array - an array with sorting information.
    */
  var sortInfo: js.UndefOr[js.Array[SortInfo]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Boolean - show a column menu to show/hide columns.
    */
  var withColumnMenu: js.UndefOr[Boolean] = js.native
}

object DataGridProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]]),
    idProperty: String
  ): DataGridProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGridProps]
  }
  @scala.inline
  implicit class DataGridPropsOps[Self <: DataGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceFunction1(value: /* query */ PageSize => js.Promise[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[_]]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMaskOverHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMaskOverHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMaskOverHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMaskOverHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnOrderChange(value: (/* index */ Double, /* dropIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnOrderChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnOrderChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnOrderChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResize(
      value: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnVisibilityChange(value: (/* column */ Column, /* visibility */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnVisibilityChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnVisibilityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnVisibilityChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChange(value: /* page */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageSizeChange(value: (/* pageSize */ Double, /* props */ DataGridProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageSizeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPageSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: (/* newSelected */ js.Object, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortChange(value: /* sortInfo */ js.Array[SortInfo] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSortChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortChange")(js.undefined)
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
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
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
    def withPaginationToolbarProps(value: PaginationToolbarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationToolbarProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToolbarProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationToolbarProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowStyleFunction2(value: (/* data */ js.Any, /* props */ RowProps) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowStyle(value: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCellBorders(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCellBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCellBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCellBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withSortInfo(value: js.Array[SortInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWithColumnMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withColumnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithColumnMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withColumnMenu")(js.undefined)
        ret
    }
  }
  
}

