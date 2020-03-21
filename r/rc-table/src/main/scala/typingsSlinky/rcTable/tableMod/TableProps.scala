package typingsSlinky.rcTable.tableMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.rcTable.AnonBody
import typingsSlinky.rcTable.AnonX
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.LegacyExpandableProps
import typingsSlinky.rcTable.interfaceMod.PanelRender
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps[RecordType] extends LegacyExpandableProps[RecordType] {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var components: js.UndefOr[TableComponents[RecordType]] = js.undefined
  var data: js.UndefOr[js.Array[RecordType]] = js.undefined
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.undefined
  /** Config expand rows */
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
  var footer: js.UndefOr[PanelRender[RecordType]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /**
    * @private Internal usage, may remove by refactor. Should always use `columns` instead.
    *
    * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
    */
  var internalHooks: js.UndefOr[String] = js.undefined
  /**
    * @private Internal usage, may remove by refactor.
    *
    * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
    */
  var internalRefs: js.UndefOr[AnonBody] = js.undefined
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.undefined
  var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.undefined
  var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.undefined
  var scroll: js.UndefOr[AnonX] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], TagMod[Any]]] = js.undefined
  var tableLayout: js.UndefOr[TableLayout] = js.undefined
  var title: js.UndefOr[PanelRender[RecordType]] = js.undefined
  /**
    * @private Internal usage, may remove by refactor. Should always use `columns` instead.
    *
    * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
    */
  var transformColumns: js.UndefOr[js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[RecordType](
    children: TagMod[Any] = null,
    childrenColumnName: String = null,
    className: String = null,
    columns: ColumnsType[RecordType] = null,
    components: TableComponents[RecordType] = null,
    data: js.Array[RecordType] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    emptyText: TagMod[Any] | js.Function0[TagMod[Any]] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any] = null,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandable: ExpandableConfig[RecordType] = null,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any] = null,
    footer: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    id: String = null,
    indentSize: Int | Double = null,
    internalHooks: String = null,
    internalRefs: AnonBody = null,
    onExpand: (/* expanded */ Boolean, RecordType) => Unit = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Unit = null,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    prefixCls: String = null,
    rowClassName: String | RowClassName[RecordType] = null,
    rowKey: String | GetRowKey[RecordType] = null,
    scroll: AnonX = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    summary: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    tableLayout: TableLayout = null,
    title: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    transformColumns: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType] = null
  ): TableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.asInstanceOf[js.Any])
    if (expandable != null) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3(expandedRowClassName))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (internalHooks != null) __obj.updateDynamic("internalHooks")(internalHooks.asInstanceOf[js.Any])
    if (internalRefs != null) __obj.updateDynamic("internalRefs")(internalRefs.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(js.Any.fromFunction1(summary))
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (transformColumns != null) __obj.updateDynamic("transformColumns")(js.Any.fromFunction1(transformColumns))
    __obj.asInstanceOf[TableProps[RecordType]]
  }
}

