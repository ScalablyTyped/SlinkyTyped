package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyResponse extends js.Object {
  /** List of free/busy information for calendars. */
  var calendars: js.UndefOr[Record[String, FreeBusyCalendar]] = js.native
  /** Expansion of groups. */
  var groups: js.UndefOr[Record[String, FreeBusyGroup]] = js.native
  /** Type of the resource ("calendar#freeBusy"). */
  var kind: js.UndefOr[String] = js.native
  /** The end of the interval. */
  var timeMax: js.UndefOr[String] = js.native
  /** The start of the interval. */
  var timeMin: js.UndefOr[String] = js.native
}

object FreeBusyResponse {
  @scala.inline
  def apply(): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyResponse]
  }
  @scala.inline
  implicit class FreeBusyResponseOps[Self <: FreeBusyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: Record[String, FreeBusyCalendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: Record[String, FreeBusyGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
  }
  
}

