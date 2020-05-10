package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationState[D /* <: js.Object */] extends js.Object {
  var pageIndex: Double = js.native
  var pageSize: Double = js.native
}

object UsePaginationState {
  @scala.inline
  def apply[D](pageIndex: Double, pageSize: Double): UsePaginationState[D] = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationState[D]]
  }
  @scala.inline
  implicit class UsePaginationStateOps[Self[d] <: UsePaginationState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withPageIndex(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

