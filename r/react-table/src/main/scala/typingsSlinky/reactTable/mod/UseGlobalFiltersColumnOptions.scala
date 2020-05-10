package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  disableGlobalFilter ? :boolean}> */
@js.native
trait UseGlobalFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableGlobalFilter: js.UndefOr[Boolean] = js.native
}

object UseGlobalFiltersColumnOptions {
  @scala.inline
  def apply[D](): UseGlobalFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersColumnOptions[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersColumnOptionsOps[Self[d] <: UseGlobalFiltersColumnOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDisableGlobalFilter(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGlobalFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalFilter")(js.undefined)
        ret
    }
  }
  
}

