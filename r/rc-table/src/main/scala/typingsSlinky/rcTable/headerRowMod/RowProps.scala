package typingsSlinky.rcTable.headerRowMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcTable.interfaceMod.CellType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent
  var cells: js.Array[CellType[RecordType]]
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var index: Double
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]]
  var rowComponent: CustomizeComponent
  var stickyOffsets: StickyOffsets
}

object RowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    cells: js.Array[CellType[RecordType]],
    flattenColumns: js.Array[ColumnType[RecordType]],
    index: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    rowComponent: CustomizeComponent,
    stickyOffsets: StickyOffsets
  ): RowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps[RecordType]]
  }
}

