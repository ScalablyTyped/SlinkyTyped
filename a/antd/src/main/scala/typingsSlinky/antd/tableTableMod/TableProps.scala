package typingsSlinky.antd.tableTableMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.ScrollToFirstRowOnChange
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.antd.tableInterfaceMod.ColumnsType
import typingsSlinky.antd.tableInterfaceMod.GetPopupContainer
import typingsSlinky.antd.tableInterfaceMod.SortOrder
import typingsSlinky.antd.tableInterfaceMod.SorterResult
import typingsSlinky.antd.tableInterfaceMod.TableCurrentDataSource
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.tableInterfaceMod.TablePaginationConfig
import typingsSlinky.antd.tableInterfaceMod.TableRowSelection
import typingsSlinky.rcTable.anon.X
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.ExpandedRowRender
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.PanelRender
import typingsSlinky.rcTable.interfaceMod.RenderExpandIcon
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-table.rc-table/lib/Table.TableProps<RecordType>, 'transformColumns' | 'internalHooks' | 'internalRefs' | 'data' | 'columns' | 'scroll'> */
@js.native
trait TableProps[RecordType] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var childrenColumnName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  var components: js.UndefOr[TableComponents[RecordType]] = js.native
  var dataSource: js.UndefOr[js.Array[RecordType]] = js.native
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var dropdownPrefixCls: js.UndefOr[String] = js.native
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.native
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
  var footer: js.UndefOr[PanelRender[RecordType]] = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var id: js.UndefOr[String] = js.native
  var indentSize: js.UndefOr[Double] = js.native
  var loading: js.UndefOr[Boolean | SpinProps] = js.native
  var locale: js.UndefOr[TableLocale] = js.native
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ PaginationConfig, 
      /* filters */ Record[String, js.Array[typingsSlinky.antd.tableInterfaceMod.Key] | Null], 
      /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], 
      /* extra */ TableCurrentDataSource[RecordType], 
      Unit
    ]
  ] = js.native
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.native
  var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.native
  var pagination: js.UndefOr[`false` | TablePaginationConfig] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.native
  var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.native
  var rowSelection: js.UndefOr[TableRowSelection[RecordType]] = js.native
  var scroll: js.UndefOr[js.UndefOr[X] with ScrollToFirstRowOnChange] = js.native
  var showHeader: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], TagMod[Any]]] = js.native
  var tableLayout: js.UndefOr[TableLayout] = js.native
  var title: js.UndefOr[PanelRender[RecordType]] = js.native
}

object TableProps {
  @scala.inline
  def apply[RecordType](): TableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps[RecordType]]
  }
  @scala.inline
  implicit class TablePropsOps[Self[recordtype] <: TableProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withBordered(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenColumnName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenColumnName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ColumnsType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: TableComponents[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandAllRows(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAllRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandAllRows: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAllRows")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpandedRowKeys(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpandedRowKeys: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownPrefixCls: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTextReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyTextFunction0(value: () => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmptyText(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIconColumnIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIconColumnIndex: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandRowByClick(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRowByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandRowByClick: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRowByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: ExpandableConfig[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowClassName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpandedRowClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowKeys(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedRowKeys: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedRowRender(
      value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowRender")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExpandedRowRender: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowRender")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentSize(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentSize: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean | SpinProps): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: TableLocale): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* pagination */ PaginationConfig, /* filters */ Record[String, js.Array[typingsSlinky.antd.tableInterfaceMod.Key] | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpandedRowsChange: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandedRowsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderRow: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRow: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: `false` | TablePaginationConfig): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRowClassName(value: String | RowClassName[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClassName: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowKey(value: String | GetRowKey[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKey: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelection(value: TableRowSelection[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelection: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: js.UndefOr[X] with ScrollToFirstRowOnChange): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirections(value: js.Array[SortOrder]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirections: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSummary: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLayout(value: TableLayout): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLayout: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: /* data */ js.Array[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

