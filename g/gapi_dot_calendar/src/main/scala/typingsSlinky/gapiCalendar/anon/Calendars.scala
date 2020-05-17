package typingsSlinky.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendars extends js.Object {
  var calendars: js.Array[String] = js.native
  var errors: js.UndefOr[js.Array[Domain]] = js.native
}

object Calendars {
  @scala.inline
  def apply(calendars: js.Array[String]): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
  @scala.inline
  implicit class CalendarsOps[Self <: Calendars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[Domain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

