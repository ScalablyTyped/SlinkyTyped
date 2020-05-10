package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEventDateTime extends js.Object {
  /**
    * The date, in the format &quot;yyyy-mm-dd&quot;, if this is an all-day
    * event.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The time, as a combined date-time value (formatted according to RFC3339).
    * A time zone offset is required unless a time zone is explicitly specified
    * in timeZone.
    */
  var dateTime: js.UndefOr[String] = js.native
  /**
    * The time zone in which the time is specified. (Formatted as an IANA Time
    * Zone Database name, e.g. &quot;Europe/Zurich&quot;.) For recurring events
    * this field is required and specifies the time zone in which the
    * recurrence is expanded. For single events this field is optional and
    * indicates a custom time zone for the event start/end.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaEventDateTime {
  @scala.inline
  def apply(): SchemaEventDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventDateTime]
  }
  @scala.inline
  implicit class SchemaEventDateTimeOps[Self <: SchemaEventDateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

