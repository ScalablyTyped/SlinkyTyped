package typingsSlinky.rcTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcTable.AnonBody
import typingsSlinky.rcTable.AnonX
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableComponents
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.tableMod.TableProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TableProps429118745 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className, id, style */
  def apply[RecordType /* <: DefaultRecordType */](
    childrenColumnName: String = null,
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
    summary: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    tableLayout: TableLayout = null,
    title: /* data */ js.Array[RecordType] => TagMod[Any] = null,
    transformColumns: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
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
    if (summary != null) __obj.updateDynamic("summary")(js.Any.fromFunction1(summary))
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (transformColumns != null) __obj.updateDynamic("transformColumns")(js.Any.fromFunction1(transformColumns))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableProps[js.Any]
}

