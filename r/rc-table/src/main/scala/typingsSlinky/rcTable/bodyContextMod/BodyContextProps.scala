package typingsSlinky.rcTable.bodyContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTable.interfaceMod.ColumnGroupType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.ExpandableType
import typingsSlinky.rcTable.interfaceMod.ExpandedRowRender
import typingsSlinky.rcTable.interfaceMod.RenderExpandIcon
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.RowClassName
import typingsSlinky.rcTable.interfaceMod.TableLayout
import typingsSlinky.rcTable.interfaceMod.TriggerEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyContextProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType] = js.native
  var componentWidth: Double = js.native
  var expandIcon: RenderExpandIcon[RecordType] = js.native
  var expandIconColumnIndex: Double = js.native
  var expandRowByClick: Boolean = js.native
  var expandableType: ExpandableType = js.native
  var expandedRowClassName: RowClassName[RecordType] = js.native
  var expandedRowRender: ExpandedRowRender[RecordType] = js.native
  var fixColumn: Boolean = js.native
  var fixHeader: Boolean = js.native
  var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
  var horizonScroll: Boolean = js.native
  var indentSize: Double = js.native
  var onTriggerExpand: TriggerEventHandler[RecordType] = js.native
  var rowClassName: String | RowClassName[RecordType] = js.native
  var tableLayout: TableLayout = js.native
}

object BodyContextProps {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    componentWidth: Double,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactElement,
    expandIconColumnIndex: Double,
    expandRowByClick: Boolean,
    expandableType: ExpandableType,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement,
    fixColumn: Boolean,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[RecordType]],
    horizonScroll: Boolean,
    indentSize: Double,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    rowClassName: String | RowClassName[RecordType],
    tableLayout: TableLayout
  ): BodyContextProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContextProps[RecordType]]
  }
  @scala.inline
  implicit class BodyContextPropsOps[Self <: BodyContextProps[_], RecordType] (val x: Self with BodyContextProps[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentWidth(value: Double): Self = this.set("componentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactElement): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = this.set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = this.set("expandRowByClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandableType(value: ExpandableType): Self = this.set("expandableType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("expandedRowClassName", js.Any.fromFunction3(value))
    @scala.inline
    def setExpandedRowRender(
      value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactElement
    ): Self = this.set("expandedRowRender", js.Any.fromFunction4(value))
    @scala.inline
    def setFixColumn(value: Boolean): Self = this.set("fixColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixHeader(value: Boolean): Self = this.set("fixHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = this.set("flattenColumns", js.Array(value :_*))
    @scala.inline
    def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = this.set("flattenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizonScroll(value: Boolean): Self = this.set("horizonScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTriggerExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = this.set("onTriggerExpand", js.Any.fromFunction2(value))
    @scala.inline
    def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("rowClassName", js.Any.fromFunction3(value))
    @scala.inline
    def setRowClassName(value: String | RowClassName[RecordType]): Self = this.set("rowClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableLayout(value: TableLayout): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
  }
  
}

