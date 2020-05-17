package typingsSlinky.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Next extends js.Object {
  var next: String = js.native
  var nextYear: String = js.native
  var prev: String = js.native
  var prevYear: String = js.native
}

object Next {
  @scala.inline
  def apply(next: String, nextYear: String, prev: String, prevYear: String): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevYear = prevYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
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

