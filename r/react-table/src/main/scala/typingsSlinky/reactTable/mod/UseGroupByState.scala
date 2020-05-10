package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByState[D /* <: js.Object */] extends js.Object {
  var groupBy: js.Array[IdType[D]] = js.native
}

object UseGroupByState {
  @scala.inline
  def apply[D](groupBy: js.Array[IdType[D]]): UseGroupByState[D] = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByState[D]]
  }
  @scala.inline
  implicit class UseGroupByStateOps[Self[d] <: UseGroupByState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGroupBy(value: js.Array[IdType[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

