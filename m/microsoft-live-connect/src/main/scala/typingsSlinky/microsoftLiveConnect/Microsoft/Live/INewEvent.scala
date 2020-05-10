package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new event.
  */
@js.native
trait INewEvent extends js.Object {
  /**
    * The user's availability status for the event. Valid values are:
    * - free
    * - busy
    * - tentative
    * - out_of_office
    * @default "free"
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * A description of the event, with a maximum length of 32,768
    * characters. This structure is required.
    */
  var description: String = js.native
  /**
    * The end time of the event. If no end time is specified, the default
    * value is 30 minutes after start_time. This structure is optional when
    * creating an event. When the event is being read, the time will be the
    * user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var end_time: js.UndefOr[js.Any] = js.native
  /**
    * A value that specifies whether the event is an all-day event. If the
    * event is an all-day event, this value is true; otherwise, it is
    * false. If this structure is missing, the default value is false.
    */
  var is_all_day_event: js.UndefOr[Boolean] = js.native
  /**
    * The name of the location at which the event will take place. The
    * maximum length is 1,000 characters.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the event, with a maximum length of 255 characters. This
    * structure is required.
    */
  var name: String = js.native
  /**
    * The time, in minutes, before the event for the reminder alarm.
    */
  var reminder_time: js.UndefOr[Double] = js.native
  /**
    * The start time of the event. When the event is being read, the time
    * will be the user's local time, in ISO 8601 format.
    * Can be a date string, or a Date object.
    */
  var start_time: js.Any = js.native
  /**
    * A value that specifies whether the event is publicly visible. Valid
    * values are:
    * - public  the event is visible to anyone who can view the calendar.
    * - private the event is visible only to the event owner.
    * @default "public"
    */
  var visibility: js.UndefOr[String] = js.native
}

object INewEvent {
  @scala.inline
  def apply(description: String, name: String, start_time: js.Any): INewEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewEvent]
  }
  @scala.inline
  implicit class INewEventOps[Self <: INewEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_time(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_all_day_event(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_all_day_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_all_day_event: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_all_day_event")(js.undefined)
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
    def withReminder_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminder_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminder_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminder_time")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

