package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CronRepeatOptions extends RepeatOptions {
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: String = js.native
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[js.Date | String | Double] = js.native
}

object CronRepeatOptions {
  @scala.inline
  def apply(cron: String): CronRepeatOptions = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronRepeatOptions]
  }
  @scala.inline
  implicit class CronRepeatOptionsOps[Self <: CronRepeatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCron(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date | String | Double): Self = {
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
  }
  
}

