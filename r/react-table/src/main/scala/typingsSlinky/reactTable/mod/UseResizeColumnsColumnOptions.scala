package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseResizeColumnsColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableResizing: js.UndefOr[Boolean] = js.native
}

object UseResizeColumnsColumnOptions {
  @scala.inline
  def apply[D](): UseResizeColumnsColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsColumnOptions[D]]
  }
  @scala.inline
  implicit class UseResizeColumnsColumnOptionsOps[Self[d] <: UseResizeColumnsColumnOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDisableResizing(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableResizing: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResizing")(js.undefined)
        ret
    }
  }
  
}

