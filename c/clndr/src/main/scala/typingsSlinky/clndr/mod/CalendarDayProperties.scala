package typingsSlinky.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarDayProperties extends js.Object {
  var isAdjacentMonth: Boolean = js.native
  var isInactive: Boolean = js.native
  var isToday: Boolean = js.native
}

object CalendarDayProperties {
  @scala.inline
  def apply(isAdjacentMonth: Boolean, isInactive: Boolean, isToday: Boolean): CalendarDayProperties = {
    val __obj = js.Dynamic.literal(isAdjacentMonth = isAdjacentMonth.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayProperties]
  }
  @scala.inline
  implicit class CalendarDayPropertiesOps[Self <: CalendarDayProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAdjacentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdjacentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToday")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

