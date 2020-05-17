package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyQueryParameters extends js.Object {
  var calendarExpansionMax: js.UndefOr[integer] = js.native
  var groupExpansionMax: js.UndefOr[integer] = js.native
  var items: js.Array[Id] = js.native
  var timeMax: datetime = js.native
  var timeMin: datetime = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object FreeBusyQueryParameters {
  @scala.inline
  def apply(items: js.Array[Id], timeMax: datetime, timeMin: datetime): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
  @scala.inline
  implicit class FreeBusyQueryParametersOps[Self <: FreeBusyQueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeMax(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeMin(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarExpansionMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarExpansionMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarExpansionMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarExpansionMax")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpansionMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpansionMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupExpansionMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpansionMax")(js.undefined)
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

