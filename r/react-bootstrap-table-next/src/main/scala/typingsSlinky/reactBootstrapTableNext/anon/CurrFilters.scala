package typingsSlinky.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrFilters extends js.Object {
  var currFilters: js.Any = js.native
}

object CurrFilters {
  @scala.inline
  def apply(currFilters: js.Any): CurrFilters = {
    val __obj = js.Dynamic.literal(currFilters = currFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrFilters]
  }
  @scala.inline
  implicit class CurrFiltersOps[Self <: CurrFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrFilters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currFilters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

