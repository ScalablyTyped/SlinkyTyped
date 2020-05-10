package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceRange extends js.Object {
  /**
    * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence
    * of the meeting may not be this date. Required if type is endDate.
    */
  var endDate: js.UndefOr[String] = js.native
  // The number of times to repeat the event. Required and must be positive if type is numbered.
  var numberOfOccurrences: js.UndefOr[Double] = js.native
  // Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
  var recurrenceTimeZone: js.UndefOr[String] = js.native
  /**
    * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later,
    * depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event.
    * Required.
    */
  var startDate: js.UndefOr[String] = js.native
  // The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
  var `type`: js.UndefOr[RecurrenceRangeType] = js.native
}

object RecurrenceRange {
  @scala.inline
  def apply(): RecurrenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrenceRange]
  }
  @scala.inline
  implicit class RecurrenceRangeOps[Self <: RecurrenceRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfOccurrences(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfOccurrences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfOccurrences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfOccurrences")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RecurrenceRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

