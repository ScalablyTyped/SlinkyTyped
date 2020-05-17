package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellState[D /* <: js.Object */] extends js.Object {
  var cellState: UseRowStateLocalState[D, _] = js.native
}

object CellState {
  @scala.inline
  def apply[D](cellState: UseRowStateLocalState[D, _]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
  @scala.inline
  implicit class CellStateOps[Self[d] <: CellState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withCellState(value: UseRowStateLocalState[D, _]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

