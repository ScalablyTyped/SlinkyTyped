package typingsSlinky.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrFilters extends js.Object {
  var currFilters: js.Any = js.native
}

object AnonCurrFilters {
  @scala.inline
  def apply(currFilters: js.Any): AnonCurrFilters = {
    val __obj = js.Dynamic.literal(currFilters = currFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrFilters]
  }
  @scala.inline
  implicit class AnonCurrFiltersOps[Self <: AnonCurrFilters] (val x: Self) extends AnyVal {
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

