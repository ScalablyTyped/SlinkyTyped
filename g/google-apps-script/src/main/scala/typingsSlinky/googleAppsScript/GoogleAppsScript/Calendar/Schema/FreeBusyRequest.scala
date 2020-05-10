package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyRequest extends js.Object {
  var calendarExpansionMax: js.UndefOr[Double] = js.native
  var groupExpansionMax: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.native
  var timeMax: js.UndefOr[String] = js.native
  var timeMin: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object FreeBusyRequest {
  @scala.inline
  def apply(): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyRequest]
  }
  @scala.inline
  implicit class FreeBusyRequestOps[Self <: FreeBusyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarExpansionMax(value: Double): Self = {
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
    def withGroupExpansionMax(value: Double): Self = {
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
    def withItems(value: js.Array[FreeBusyRequestItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(js.undefined)
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

