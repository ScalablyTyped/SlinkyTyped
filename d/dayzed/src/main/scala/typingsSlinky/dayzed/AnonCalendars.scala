package typingsSlinky.dayzed

import typingsSlinky.dayzed.mod.Calendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalendars extends js.Object {
  var calendars: js.Array[Calendar] = js.native
  var offset: js.UndefOr[Double] = js.native
}

object AnonCalendars {
  @scala.inline
  def apply(calendars: js.Array[Calendar]): AnonCalendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendars]
  }
  @scala.inline
  implicit class AnonCalendarsOps[Self <: AnonCalendars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: js.Array[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

