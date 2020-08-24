package typingsSlinky.rcTable.anon

import slinky.core.ReactComponentClass
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  var cell: js.UndefOr[CustomizeComponent] = js.native
  var row: js.UndefOr[CustomizeComponent] = js.native
  var wrapper: js.UndefOr[CustomizeComponent] = js.native
}

object Cell {
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
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
    def setCellFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCell(value: CustomizeComponent): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setRowFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: CustomizeComponent): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setWrapperFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: CustomizeComponent): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

