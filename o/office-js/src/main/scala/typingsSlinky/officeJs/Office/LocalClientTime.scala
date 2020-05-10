package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a date and time in the local client's time zone. Read mode only.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait LocalClientTime extends js.Object {
  /**
    * Integer value representing the day of the month.
    */
  var date: Double = js.native
  /**
    * Integer value representing the hour on a 24-hour clock.
    */
  var hours: Double = js.native
  /**
    * Integer value representing the milliseconds.
    */
  var milliseconds: Double = js.native
  /**
    * Integer value representing the minutes.
    */
  var minutes: Double = js.native
  /**
    * Integer value representing the month, beginning with 0 for January to 11 for December.
    */
  var month: Double = js.native
  /**
    * Integer value representing the seconds.
    */
  var seconds: Double = js.native
  /**
    * Integer value representing the number of minutes difference between the local time zone and UTC.
    */
  var timezoneOffset: Double = js.native
  /**
    * Integer value representing the year.
    */
  var year: Double = js.native
}

object LocalClientTime {
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    month: Double,
    seconds: Double,
    timezoneOffset: Double,
    year: Double
  ): LocalClientTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalClientTime]
  }
  @scala.inline
  implicit class LocalClientTimeOps[Self <: LocalClientTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezoneOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

