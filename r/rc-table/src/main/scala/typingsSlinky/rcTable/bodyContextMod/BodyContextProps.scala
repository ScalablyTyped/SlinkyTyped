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

trait BodyContextProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var componentWidth: Double
  var expandIcon: RenderExpandIcon[RecordType]
  var expandIconColumnIndex: Double
  var expandRowByClick: Boolean
  var expandableType: ExpandableType
  var expandedRowClassName: RowClassName[RecordType]
  var expandedRowRender: ExpandedRowRender[RecordType]
  var fixColumn: Boolean
  var fixHeader: Boolean
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var horizonScroll: Boolean
  var indentSize: Double
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var rowClassName: String | RowClassName[RecordType]
  var tableLayout: TableLayout
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
    horizonScroll: Boolean,
    indentSize: Double,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    rowClassName: String | RowClassName[RecordType],
    tableLayout: TableLayout
  ): BodyContextProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContextProps[RecordType]]
  }
}

