package typingsSlinky.cardValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Month extends js.Object {
  var month: String = js.native
  var year: String = js.native
}

object Month {
  @scala.inline
  def apply(month: String, year: String): Month = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
  @scala.inline
  implicit class MonthOps[Self <: Month] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

