package typingsSlinky.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsSummary extends js.Object {
  /** Click analytics over all time. */
  var allTime: js.UndefOr[AnalyticsSnapshot] = js.native
  /** Click analytics over the last day. */
  var day: js.UndefOr[AnalyticsSnapshot] = js.native
  /** Click analytics over the last month. */
  var month: js.UndefOr[AnalyticsSnapshot] = js.native
  /** Click analytics over the last two hours. */
  var twoHours: js.UndefOr[AnalyticsSnapshot] = js.native
  /** Click analytics over the last week. */
  var week: js.UndefOr[AnalyticsSnapshot] = js.native
}

object AnalyticsSummary {
  @scala.inline
  def apply(): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSummary]
  }
  @scala.inline
  implicit class AnalyticsSummaryOps[Self <: AnalyticsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTime(value: AnalyticsSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: AnalyticsSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: AnalyticsSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withTwoHours(value: AnalyticsSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwoHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoHours")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: AnalyticsSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
  }
  
}

