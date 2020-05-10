package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeTimeZone extends js.Object {
  /**
    * A single point of time in a combined date and time representation ({date}T{time}; for example,
    * 2017-08-29T04:00:00.0000000).
    */
  var dateTime: js.UndefOr[String] = js.native
  // Represents a time zone, for example, 'Pacific Standard Time'. See below for more possible values.
  var timeZone: js.UndefOr[String] = js.native
}

object DateTimeTimeZone {
  @scala.inline
  def apply(): DateTimeTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeTimeZone]
  }
  @scala.inline
  implicit class DateTimeTimeZoneOps[Self <: DateTimeTimeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

