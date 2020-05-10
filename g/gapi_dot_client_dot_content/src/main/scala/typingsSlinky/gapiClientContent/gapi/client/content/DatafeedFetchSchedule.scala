package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedFetchSchedule extends js.Object {
  /** The day of the month the feed file should be fetched (1-31). */
  var dayOfMonth: js.UndefOr[Double] = js.native
  /**
    * The URL where the feed file can be fetched. Google Merchant Center will support automatic scheduled uploads using the HTTP, HTTPS, FTP, or SFTP
    * protocols, so the value will need to be a valid link using one of those four protocols.
    */
  var fetchUrl: js.UndefOr[String] = js.native
  /** The hour of the day the feed file should be fetched (0-23). */
  var hour: js.UndefOr[Double] = js.native
  /** The minute of the hour the feed file should be fetched (0-59). Read-only. */
  var minuteOfHour: js.UndefOr[Double] = js.native
  /** An optional password for fetch_url. */
  var password: js.UndefOr[String] = js.native
  /** Whether the scheduled fetch is paused or not. */
  var paused: js.UndefOr[Boolean] = js.native
  /** Time zone used for schedule. UTC by default. E.g., "America/Los_Angeles". */
  var timeZone: js.UndefOr[String] = js.native
  /** An optional user name for fetch_url. */
  var username: js.UndefOr[String] = js.native
  /** The day of the week the feed file should be fetched. */
  var weekday: js.UndefOr[String] = js.native
}

object DatafeedFetchSchedule {
  @scala.inline
  def apply(): DatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedFetchSchedule]
  }
  @scala.inline
  implicit class DatafeedFetchScheduleOps[Self <: DatafeedFetchSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteOfHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteOfHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteOfHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteOfHour")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
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
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(js.undefined)
        ret
    }
  }
  
}

