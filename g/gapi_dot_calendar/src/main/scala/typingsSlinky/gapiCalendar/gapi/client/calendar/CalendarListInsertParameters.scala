package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListInsertParameters extends js.Object {
  // Parameters
  // Optional query parameters
  var colorRgbFormat: js.UndefOr[Boolean] = js.native
  // CalendarList resource
  var resource: CalendarListInput = js.native
}

object CalendarListInsertParameters {
  @scala.inline
  def apply(resource: CalendarListInput): CalendarListInsertParameters = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInsertParameters]
  }
  @scala.inline
  implicit class CalendarListInsertParametersOps[Self <: CalendarListInsertParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: CalendarListInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorRgbFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgbFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRgbFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRgbFormat")(js.undefined)
        ret
    }
  }
  
}

