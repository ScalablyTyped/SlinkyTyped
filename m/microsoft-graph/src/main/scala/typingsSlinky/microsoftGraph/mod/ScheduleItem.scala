package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleItem extends js.Object {
  // The date, time, and time zone that the corresponding event ends.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  // The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
  var isPrivate: js.UndefOr[Boolean] = js.native
  // The location where the corresponding event is held or attended from. Optional.
  var location: js.UndefOr[String] = js.native
  // The date, time, and time zone that the corresponding event starts.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
  /**
    * The availability status of the user or resource during the corresponding event. The possible values are: free,
    * tentative, busy, oof, workingElsewhere, unknown.
    */
  var status: js.UndefOr[FreeBusyStatus] = js.native
  // The corresponding event's subject line. Optional.
  var subject: js.UndefOr[String] = js.native
}

object ScheduleItem {
  @scala.inline
  def apply(): ScheduleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleItem]
  }
  @scala.inline
  implicit class ScheduleItemOps[Self <: ScheduleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: FreeBusyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

