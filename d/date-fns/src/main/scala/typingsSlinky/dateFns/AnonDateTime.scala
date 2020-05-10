package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateTime extends js.Object {
  def date(args: js.Any*): js.Any = js.native
  def dateTime(args: js.Any*): js.Any = js.native
  def time(args: js.Any*): js.Any = js.native
}

object AnonDateTime {
  @scala.inline
  def apply(
    date: /* repeated */ js.Any => js.Any,
    dateTime: /* repeated */ js.Any => js.Any,
    time: /* repeated */ js.Any => js.Any
  ): AnonDateTime = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), time = js.Any.fromFunction1(time))
    __obj.asInstanceOf[AnonDateTime]
  }
  @scala.inline
  implicit class AnonDateTimeOps[Self <: AnonDateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateTime(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTime(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

