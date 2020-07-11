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
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps[_], RecordType] (val x: Self with RowProps[RecordType]) extends AnyVal {
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
    def setCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellComponent(value: CustomizeComponent): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellsVarargs(value: CellType[RecordType]*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[CellType[RecordType]]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = this.set("flattenColumns", js.Array(value :_*))
    @scala.inline
    def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = this.set("flattenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderRow", js.Any.fromFunction2(value))
    @scala.inline
    def setRowComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("rowComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowComponentComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("rowComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowComponent(value: CustomizeComponent): Self = this.set("rowComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStickyOffsets(value: StickyOffsets): Self = this.set("stickyOffsets", value.asInstanceOf[js.Any])
  }
  
}

