package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextYear extends js.Object {
  var next: String = js.native
  var nextYear: String = js.native
  var prev: String = js.native
  var prevYear: String = js.native
}

object AnonNextYear {
  @scala.inline
  def apply(next: String, nextYear: String, prev: String, prevYear: String): AnonNextYear = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevYear = prevYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextYear]
  }
  @scala.inline
  implicit class AnonNextYearOps[Self <: AnonNextYear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

