package typingsSlinky.antd.tableTableMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.antd.anon.ScrollToFirstRowOnChange
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
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
trait TableProps[RecordType] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var childrenColumnName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var components: js.UndefOr[TableComponents[RecordType]] = js.undefined
  var dataSource: js.UndefOr[js.Array[RecordType]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.undefined
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
  var footer: js.UndefOr[PanelRender[RecordType]] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ TablePaginationConfig, 
      /* filters */ Record[String, js.Array[typingsSlinky.antd.tableInterfaceMod.Key] | Null], 
      /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], 
      /* extra */ TableCurrentDataSource[RecordType], 
      Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.undefined
  var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
  var pagination: js.UndefOr[`false` | TablePaginationConfig] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.undefined
  var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.undefined
  var rowSelection: js.UndefOr[TableRowSelection[RecordType]] = js.undefined
  var scroll: js.UndefOr[js.UndefOr[X] with ScrollToFirstRowOnChange] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var showSorterTooltip: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], TagMod[Any]]] = js.undefined
  var tableLayout: js.UndefOr[TableLayout] = js.undefined
  var title: js.UndefOr[PanelRender[RecordType]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[RecordType](
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    childrenColumnName: String = null,
    className: String = null,
    columns: ColumnsType[RecordType] = null,
    components: TableComponents[RecordType] = null,
    dataSource: js.Array[RecordType] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    direction: ltr | rtl = null,
    dropdownPrefixCls: String = null,
    emptyText: TagMod[Any] | js.Function0[TagMod[Any]] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any] = null,
    expandIconColumnIndex: js.UndefOr[Double] = js.undefined,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandable: ExpandableConfig[RecordType] = null,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any] = null,
    footer: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    indentSize: js.UndefOr[Double] = js.undefined,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, js.Array[typingsSlinky.antd.tableInterfaceMod.Key] | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit = null,
    onExpand: (/* expanded */ Boolean, /* record */ RecordType) => Unit = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Unit = null,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    pagination: `false` | TablePaginationConfig = null,
    prefixCls: String = null,
    rowClassName: String | RowClassName[RecordType] = null,
    rowKey: String | GetRowKey[RecordType] = null,
    rowSelection: TableRowSelection[RecordType] = null,
    scroll: js.UndefOr[X] with ScrollToFirstRowOnChange = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showSorterTooltip: js.UndefOr[Boolean] = js.undefined,
    size: SizeType = null,
    sortDirections: js.Array[SortOrder] = null,
    style: CSSProperties = null,
    summary: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    tableLayout: TableLayout = null,
    title: /* data */ js.Array[RecordType] => TagMod[Any] = null
  ): TableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.get.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconColumnIndex)) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.get.asInstanceOf[js.Any])
    if (expandable != null) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3(expandedRowClassName))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indentSize)) __obj.updateDynamic("indentSize")(indentSize.get.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSorterTooltip)) __obj.updateDynamic("showSorterTooltip")(showSorterTooltip.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(js.Any.fromFunction1(summary))
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    __obj.asInstanceOf[TableProps[RecordType]]
  }
}

