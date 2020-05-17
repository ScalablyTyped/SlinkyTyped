package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.ColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseResizeColumnsState[D /* <: js.Object */] extends js.Object {
  var columnResizing: ColumnWidth = js.native
}

object UseResizeColumnsState {
  @scala.inline
  def apply[D](columnResizing: ColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
  @scala.inline
  implicit class UseResizeColumnsStateOps[Self[d] <: UseResizeColumnsState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withColumnResizing(value: ColumnWidth): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

