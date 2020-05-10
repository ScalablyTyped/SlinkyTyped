package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableState[D /* <: js.Object */] extends js.Object {
  var hiddenColumns: js.UndefOr[js.Array[IdType[D]]] = js.native
}

object TableState {
  @scala.inline
  def apply[D](): TableState[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableState[D]]
  }
  @scala.inline
  implicit class TableStateOps[Self[d] <: TableState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withHiddenColumns(value: js.Array[IdType[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenColumns: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumns")(js.undefined)
        ret
    }
  }
  
}

