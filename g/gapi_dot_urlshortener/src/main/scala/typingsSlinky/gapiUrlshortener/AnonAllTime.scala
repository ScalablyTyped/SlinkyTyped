package typingsSlinky.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllTime extends js.Object {
  /**
    * Click analytics over all time.
    */
  var allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last day.
    */
  var day: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last month.
    */
  var month: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last two hours.
    */
  var twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last week.
    */
  var week: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
}

object AnonAllTime {
  @scala.inline
  def apply(
    allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    day: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    month: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  ): AnonAllTime = {
    val __obj = js.Dynamic.literal(allTime = allTime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], twoHours = twoHours.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllTime]
  }
  @scala.inline
  implicit class AnonAllTimeOps[Self <: AnonAllTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTime(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoHours(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

