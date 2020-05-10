package typingsSlinky.materialUiDatatables

import typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default
import typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsSlinky.materialUiDatatables.mod.Column
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<material-ui-datatables.material-ui-datatables.DataTableProps> */
@js.native
trait PartialDataTableProps extends js.Object {
  var columns: js.UndefOr[js.Array[Column]] = js.native
  var count: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var deselectOnClickaway: js.UndefOr[Boolean] = js.native
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  var filterHintText: js.UndefOr[String] = js.native
  var filterValue: js.UndefOr[String] = js.native
  var fixedFooter: js.UndefOr[Boolean] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var footerToolbarStyle: js.UndefOr[CSSProperties] = js.native
  var headerToolbarMode: js.UndefOr[default | filter | String] = js.native
  var height: js.UndefOr[js.Any] = js.native
  var multiSelectable: js.UndefOr[Boolean] = js.native
  var onCellClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.native
  var onCellDoubleClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.native
  var onFilterValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onNextPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onPreviousPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Any, Unit]] = js.native
  var onRowSizeChange: js.UndefOr[js.Function2[/* index */ Double, /* value */ js.Any, Unit]] = js.native
  var onSortOrderChange: js.UndefOr[js.Function2[/* key */ String, /* order */ String, Unit]] = js.native
  var page: js.UndefOr[Double] = js.native
  var rowSize: js.UndefOr[Double] = js.native
  var rowSizeLabel: js.UndefOr[String] = js.native
  var rowSizeList: js.UndefOr[js.Array[Double]] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showCheckboxes: js.UndefOr[Boolean] = js.native
  var showFooterToolbar: js.UndefOr[Boolean] = js.native
  var showHeaderToolbar: js.UndefOr[Boolean] = js.native
  var showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.native
  var showRowHover: js.UndefOr[Boolean] = js.native
  var showRowSizeControls: js.UndefOr[Boolean] = js.native
  var stripedRows: js.UndefOr[Boolean] = js.native
  var summaryLabelTemplate: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* count */ Double, _]] = js.native
  var tableBodyStyle: js.UndefOr[CSSProperties] = js.native
  var tableHeaderColumnStyle: js.UndefOr[CSSProperties] = js.native
  var tableHeaderStyle: js.UndefOr[CSSProperties] = js.native
  var tableRowColumnStyle: js.UndefOr[CSSProperties] = js.native
  var tableRowStyle: js.UndefOr[CSSProperties] = js.native
  var tableStyle: js.UndefOr[CSSProperties] = js.native
  var tableWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[CSSProperties] = js.native
  var toolbarIconRight: js.UndefOr[js.Any] = js.native
}

object PartialDataTableProps {
  @scala.inline
  def apply(): PartialDataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataTableProps]
  }
  @scala.inline
  implicit class PartialDataTablePropsOps[Self <: PartialDataTableProps] (val x: Self) extends AnyVal {
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
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
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
    def withDeselectOnClickaway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnClickaway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectOnClickaway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnClickaway")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterHintText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterHintText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHintText")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFooter")(js.undefined)
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
    def withFooterToolbarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerToolbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterToolbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerToolbarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderToolbarMode(value: default | filter | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerToolbarMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderToolbarMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerToolbarMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDoubleClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClick")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnCellDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterValueChange(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextPageClick(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextPageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNextPageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextPageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreviousPageClick(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreviousPageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPreviousPageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreviousPageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSelection(value: /* selectedRows */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSizeChange(value: (/* index */ Double, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSizeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSortOrderChange(value: (/* key */ String, /* order */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortOrderChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSortOrderChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortOrderChange")(js.undefined)
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
    def withRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSizeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSizeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSizeList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSizeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeList")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckboxes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooterToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooterToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooterToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooterToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderToolbarFilterIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbarFilterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderToolbarFilterIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbarFilterIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowSizeControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowSizeControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowSizeControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowSizeControls")(js.undefined)
        ret
    }
    @scala.inline
    def withStripedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryLabelTemplate(value: (/* start */ Double, /* end */ Double, /* count */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryLabelTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSummaryLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryLabelTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderColumnStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowColumnStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withTitleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarIconRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarIconRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIconRight")(js.undefined)
        ret
    }
  }
  
}

