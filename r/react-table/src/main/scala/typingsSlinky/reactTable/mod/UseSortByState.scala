package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByState[D /* <: js.Object */] extends js.Object {
  var sortBy: js.Array[SortingRule[D]] = js.native
}

object UseSortByState {
  @scala.inline
  def apply[D](sortBy: js.Array[SortingRule[D]]): UseSortByState[D] = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByState[D]]
  }
  @scala.inline
  implicit class UseSortByStateOps[Self[d] <: UseSortByState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withSortBy(value: js.Array[SortingRule[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

