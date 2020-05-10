package typingsSlinky.reactBootstrapTableNext.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.AnonDataSize
import typingsSlinky.reactBootstrapTableNext.AnonOptionsPaginationOptions
import typingsSlinky.reactBootstrapTableNext.AnonOrder
import typingsSlinky.reactBootstrapTableNext.AnonSortCaret
import typingsSlinky.reactBootstrapTableNext.Partialpaginationbooleanf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTableProps[T /* <: js.Object */] extends js.Object {
  var bodyClasses: js.UndefOr[String] = js.native
  var bootstrap4: js.UndefOr[Boolean] = js.native
  var bordered: js.UndefOr[Boolean] = js.native
  /**
    * Same as HTML caption tag, you can set it as String or a React JSX.
    */
  var caption: js.UndefOr[ReactElement | String] = js.native
  var cellEdit: js.UndefOr[js.Any] = js.native
  var classes: js.UndefOr[String] = js.native
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  var condensed: js.UndefOr[Boolean] = js.native
  /**
    *  Provides data for your table. It accepts a single Array object.
    */
  var data: js.Array[_] = js.native
  var defaultSortDirection: js.UndefOr[SortOrder] = js.native
  var defaultSorted: js.UndefOr[js.Array[AnonOrder]] = js.native
  var expandRow: js.UndefOr[ExpandRowProps[T]] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var filterPosition: js.UndefOr[FilterPosition] = js.native
  var filtersClasses: js.UndefOr[String] = js.native
  var footerClasses: js.UndefOr[String] = js.native
  var headerClasses: js.UndefOr[String] = js.native
  var headerWrapperClasses: js.UndefOr[String] = js.native
  var hover: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Tells react-bootstrap-table2 which column is unique.
    */
  var keyField: String = js.native
  var noDataIndication: js.UndefOr[js.Function0[ReactElement | String]] = js.native
  /**
    * This callback function will be called only when data size change by search/filter etc.
    */
  var onDataSizeChange: js.UndefOr[js.Function1[/* props */ AnonDataSize, Unit]] = js.native
  var onExternalFilter: js.UndefOr[js.Any] = js.native
  var onFilter: js.UndefOr[js.Any] = js.native
  var onSort: js.UndefOr[js.Any] = js.native
  var onTableChange: js.UndefOr[TableChangeHandler[T]] = js.native
  var overlay: js.UndefOr[js.Any] = js.native
  var pagination: js.UndefOr[AnonOptionsPaginationOptions] = js.native
  var parentClassName: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.native
  var remote: js.UndefOr[Boolean | Partialpaginationbooleanf] = js.native
  var rowClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String] = js.native
  var rowEvents: js.UndefOr[RowEventHandlerProps[_]] = js.native
  var rowStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties
  ] = js.native
  var search: js.UndefOr[SearchProps[T] | Boolean] = js.native
  var selectRow: js.UndefOr[SelectRowProps[T]] = js.native
  var sort: js.UndefOr[AnonSortCaret] = js.native
  var striped: js.UndefOr[Boolean] = js.native
  var tabIndexCell: js.UndefOr[Boolean] = js.native
  var wrapperClasses: js.UndefOr[String] = js.native
}

object BootstrapTableProps {
  @scala.inline
  def apply[T](columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: String): BootstrapTableProps[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps[T]]
  }
  @scala.inline
  implicit class BootstrapTablePropsOps[Self[t] <: BootstrapTableProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnDescription[_, _]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrap4(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrap4: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(js.undefined)
        ret
    }
    @scala.inline
    def withBordered(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: ReactElement | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEdit(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEdit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCondensed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondensed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortDirection(value: SortOrder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSorted(value: js.Array[AnonOrder]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSorted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandRow(value: ExpandRowProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPosition(value: FilterPosition): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltersClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtersClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltersClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtersClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderWrapperClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrapperClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWrapperClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrapperClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataIndication(value: () => ReactElement | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataIndication")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoDataIndication: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataIndication")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDataSizeChange(value: /* props */ AnonDataSize => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDataSizeChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExternalFilter(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExternalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExternalFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExternalFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTableChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: AnonOptionsPaginationOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withParentClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentClassName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParentClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: Boolean | Partialpaginationbooleanf): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClasses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, String]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEvents(value: RowEventHandlerProps[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowEvents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRowStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowStyle(value: (js.Function2[/* row */ T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: SearchProps[T] | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRow(value: SelectRowProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: AnonSortCaret): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndexCell(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndexCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndexCell: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndexCell")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClasses")(js.undefined)
        ret
    }
  }
  
}

