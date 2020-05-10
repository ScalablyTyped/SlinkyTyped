package typingsSlinky.rcTable.headerRowMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.rcTable.interfaceMod.CellType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent = js.native
  var cells: js.Array[CellType[RecordType]] = js.native
  var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
  var index: Double = js.native
  var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]] = js.native
  var rowComponent: CustomizeComponent = js.native
  var stickyOffsets: StickyOffsets = js.native
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
  @scala.inline
  implicit class RowPropsOps[Self[recordtype] <: RowProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponent(value: CustomizeComponent): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCells(value: js.Array[CellType[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
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
    def withRowComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponentComponentClass(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponent(value: CustomizeComponent): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyOffsets(value: StickyOffsets): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyOffsets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

