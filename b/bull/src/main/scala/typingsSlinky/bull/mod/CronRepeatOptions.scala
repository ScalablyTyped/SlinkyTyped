package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronRepeatOptions extends RepeatOptions {
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: String
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[js.Date | String | Double] = js.undefined
}

object CronRepeatOptions {
  @scala.inline
  def apply(
    cron: String,
    endDate: js.Date | String | Double = null,
    limit: js.UndefOr[Double] = js.undefined,
    startDate: js.Date | String | Double = null,
    tz: String = null
  ): CronRepeatOptions = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronRepeatOptions]
  }
}

