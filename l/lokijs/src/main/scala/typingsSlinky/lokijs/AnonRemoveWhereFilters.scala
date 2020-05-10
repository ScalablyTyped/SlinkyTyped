package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.native
}

object AnonRemoveWhereFilters {
  @scala.inline
  def apply(): AnonRemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRemoveWhereFilters]
  }
  @scala.inline
  implicit class AnonRemoveWhereFiltersOps[Self <: AnonRemoveWhereFilters] (val x: Self) extends AnyVal {
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

