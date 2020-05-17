package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.native
}

object RemoveWhereFilters {
  @scala.inline
  def apply(): RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveWhereFilters]
  }
  @scala.inline
  implicit class RemoveWhereFiltersOps[Self <: RemoveWhereFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveWhereFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhereFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveWhereFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhereFilters")(js.undefined)
        ret
    }
  }
  
}

