package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseExpandedState[D /* <: js.Object */] extends js.Object {
  var expanded: Record[IdType[D], Boolean] = js.native
}

object UseExpandedState {
  @scala.inline
  def apply[D](expanded: Record[IdType[D], Boolean]): UseExpandedState[D] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedState[D]]
  }
  @scala.inline
  implicit class UseExpandedStateOps[Self[d] <: UseExpandedState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withExpanded(value: Record[IdType[D], Boolean]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

