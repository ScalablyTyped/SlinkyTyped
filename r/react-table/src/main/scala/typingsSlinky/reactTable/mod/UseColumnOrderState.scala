package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseColumnOrderState[D /* <: js.Object */] extends js.Object {
  var columnOrder: js.Array[IdType[D]] = js.native
}

object UseColumnOrderState {
  @scala.inline
  def apply[D](columnOrder: js.Array[IdType[D]]): UseColumnOrderState[D] = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseColumnOrderState[D]]
  }
  @scala.inline
  implicit class UseColumnOrderStateOps[Self[d] <: UseColumnOrderState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withColumnOrder(value: js.Array[IdType[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

