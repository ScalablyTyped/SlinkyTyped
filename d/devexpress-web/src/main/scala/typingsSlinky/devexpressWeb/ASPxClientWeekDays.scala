package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains days and groups of days for use in recurrence patterns.
  */
@js.native
trait ASPxClientWeekDays extends js.Object {
  /**
    * Specifies every day of the week.
    */
  var EveryDay: Double = js.native
  /**
    * Specifies Friday.
    */
  var Friday: Double = js.native
  /**
    * Specifies Monday.
    */
  var Monday: Double = js.native
  /**
    * Specifies Saturday.
    */
  var Saturday: Double = js.native
  /**
    * Specifies Sunday.
    */
  var Sunday: Double = js.native
  /**
    * Specifies Thursday.
    */
  var Thursday: Double = js.native
  /**
    * Specifies Tuesday.
    */
  var Tuesday: Double = js.native
  /**
    * Specifies Wednesday.
    */
  var Wednesday: Double = js.native
  /**
    * Specifies Saturday and Sunday.
    */
  var WeekendDays: Double = js.native
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    */
  var WorkDays: Double = js.native
}

object ASPxClientWeekDays {
  @scala.inline
  def apply(
    EveryDay: Double,
    Friday: Double,
    Monday: Double,
    Saturday: Double,
    Sunday: Double,
    Thursday: Double,
    Tuesday: Double,
    Wednesday: Double,
    WeekendDays: Double,
    WorkDays: Double
  ): ASPxClientWeekDays = {
    val __obj = js.Dynamic.literal(EveryDay = EveryDay.asInstanceOf[js.Any], Friday = Friday.asInstanceOf[js.Any], Monday = Monday.asInstanceOf[js.Any], Saturday = Saturday.asInstanceOf[js.Any], Sunday = Sunday.asInstanceOf[js.Any], Thursday = Thursday.asInstanceOf[js.Any], Tuesday = Tuesday.asInstanceOf[js.Any], Wednesday = Wednesday.asInstanceOf[js.Any], WeekendDays = WeekendDays.asInstanceOf[js.Any], WorkDays = WorkDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekDays]
  }
  @scala.inline
  implicit class ASPxClientWeekDaysOps[Self <: ASPxClientWeekDays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEveryDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EveryDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Friday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sunday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThursday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thursday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuesday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tuesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWednesday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wednesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekendDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeekendDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

