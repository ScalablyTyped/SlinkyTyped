package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowSelectState[D /* <: js.Object */] extends js.Object {
  var selectedRowIds: Record[IdType[D], Boolean] = js.native
}

object UseRowSelectState {
  @scala.inline
  def apply[D](selectedRowIds: Record[IdType[D], Boolean]): UseRowSelectState[D] = {
    val __obj = js.Dynamic.literal(selectedRowIds = selectedRowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectState[D]]
  }
  @scala.inline
  implicit class UseRowSelectStateOps[Self[d] <: UseRowSelectState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withSelectedRowIds(value: Record[IdType[D], Boolean]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

