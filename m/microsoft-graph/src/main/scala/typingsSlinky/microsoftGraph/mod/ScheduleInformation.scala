package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleInformation extends js.Object {
  /**
    * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots.
    * Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working
    * elsewhere.
    */
  var availabilityView: js.UndefOr[String] = js.native
  // Error information from attempting to get the availability of the user, distribution list, or resource.
  var error: js.UndefOr[FreeBusyError] = js.native
  // An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
  var scheduleId: js.UndefOr[String] = js.native
  // Contains the items that describe the availability of the user or resource.
  var scheduleItems: js.UndefOr[js.Array[ScheduleItem]] = js.native
  /**
    * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's
    * mailboxSettings.
    */
  var workingHours: js.UndefOr[WorkingHours] = js.native
}

object ScheduleInformation {
  @scala.inline
  def apply(): ScheduleInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleInformation]
  }
  @scala.inline
  implicit class ScheduleInformationOps[Self <: ScheduleInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityView")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: FreeBusyError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleItems(value: js.Array[ScheduleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingHours(value: WorkingHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHours")(js.undefined)
        ret
    }
  }
  
}

