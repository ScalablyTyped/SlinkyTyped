package typingsSlinky.rcTable.bodyContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
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
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any],
    expandIconColumnIndex: Double,
    expandRowByClick: Boolean,
    expandableType: ExpandableType,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any],
    fixColumn: Boolean,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[RecordType]],
    indentSize: Double,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    rowClassName: String | RowClassName[RecordType],
    tableLayout: TableLayout
  ): BodyContextProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContextProps[RecordType]]
  }
  @scala.inline
  implicit class BodyContextPropsOps[Self[recordtype] <: BodyContextProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withColumns(value: ColumnsType[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentWidth(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandIconColumnIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandRowByClick(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRowByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandableType(value: ExpandableType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedRowClassName")(js.Any.fromFunction3(value))
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
    def withFixColumn(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixHeader(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentSize(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTriggerExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerExpand")(js.Any.fromFunction2(value))
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
    def withTableLayout(value: TableLayout): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

