package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstanceRecurrenceRequest extends js.Object {
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.native
  /**
    * The interval quantity. The interval unit depends on the value of Frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.native
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
    */
  var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.native
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this value with a daily schedule.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.native
  /**
    * The unit for OccurrenceDays (DayOfWeek or DayOfMonth). This value is required for a monthly schedule. You can't specify DayOfWeek with a weekly schedule. You can't specify this value with a daily schedule.
    */
  var OccurrenceUnit: js.UndefOr[String] = js.native
}

object ScheduledInstanceRecurrenceRequest {
  @scala.inline
  def apply(): ScheduledInstanceRecurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrenceRequest]
  }
  @scala.inline
  implicit class ScheduledInstanceRecurrenceRequestOps[Self <: ScheduledInstanceRecurrenceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceDays(value: OccurrenceDayRequestSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceDays")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceRelativeToEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceRelativeToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceRelativeToEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceRelativeToEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceUnit")(js.undefined)
        ret
    }
  }
  
}

