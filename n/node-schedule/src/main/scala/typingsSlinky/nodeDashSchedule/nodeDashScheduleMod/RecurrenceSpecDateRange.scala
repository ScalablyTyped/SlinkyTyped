package typingsSlinky.nodeDashSchedule.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceSpecDateRange extends js.Object {
  /**
    * Ending date in date range.
    */
  var end: js.Date | String | Double
  /**
    * Cron expression string.
    */
  var rule: String
  /**
    * Starting date in date range.
    */
  var start: js.Date | String | Double
  /**
    * Timezone
    */
  var tz: js.UndefOr[Timezone] = js.undefined
}

object RecurrenceSpecDateRange {
  @scala.inline
  def apply(
    end: js.Date | String | Double,
    rule: String,
    start: js.Date | String | Double,
    tz: Timezone = null
  ): RecurrenceSpecDateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSpecDateRange]
  }
}

