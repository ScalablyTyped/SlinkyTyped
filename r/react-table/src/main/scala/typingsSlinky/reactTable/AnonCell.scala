package typingsSlinky.reactTable

import typingsSlinky.reactTable.mod.Cell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCell[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D, _] = js.native
}

object AnonCell {
  @scala.inline
  def apply[D](cell: Cell[D, _]): AnonCell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell[D]]
  }
  @scala.inline
  implicit class AnonCellOps[Self[d] <: AnonCell[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withCell(value: Cell[D, _]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

