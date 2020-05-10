package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGlobalFiltersState[D /* <: js.Object */] extends js.Object {
  var globalFilter: js.Any = js.native
}

object UseGlobalFiltersState {
  @scala.inline
  def apply[D](globalFilter: js.Any): UseGlobalFiltersState[D] = {
    val __obj = js.Dynamic.literal(globalFilter = globalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersState[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersStateOps[Self[d] <: UseGlobalFiltersState[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withGlobalFilter(value: js.Any): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

