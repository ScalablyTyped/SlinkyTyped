package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.AnonCellState
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateState[D /* <: js.Object */] extends js.Object {
  var rowState: Record[String, AnonCellState[D]] = js.native
}

object UseRowStateState {
  @scala.inline
  def apply[D](rowState: Record[String, AnonCellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
  @scala.inline
  implicit class UseRowStateStateOps[Self[d] <: UseRowStateState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withRowState(value: Record[String, AnonCellState[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

