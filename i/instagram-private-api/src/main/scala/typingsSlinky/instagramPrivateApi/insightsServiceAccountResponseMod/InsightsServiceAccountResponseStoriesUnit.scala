package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseStoriesUnit extends js.Object {
  var last_week_stories_count: Double = js.native
  var state: String = js.native
  var summary_stories: InsightsServiceAccountResponseSummaryStories = js.native
  var week_over_week_stories_delta: Double = js.native
}

object InsightsServiceAccountResponseStoriesUnit {
  @scala.inline
  def apply(
    last_week_stories_count: Double,
    state: String,
    summary_stories: InsightsServiceAccountResponseSummaryStories,
    week_over_week_stories_delta: Double
  ): InsightsServiceAccountResponseStoriesUnit = {
    val __obj = js.Dynamic.literal(last_week_stories_count = last_week_stories_count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], summary_stories = summary_stories.asInstanceOf[js.Any], week_over_week_stories_delta = week_over_week_stories_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseStoriesUnit]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseStoriesUnitOps[Self <: InsightsServiceAccountResponseStoriesUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_week_stories_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_week_stories_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary_stories(value: InsightsServiceAccountResponseSummaryStories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary_stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek_over_week_stories_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week_over_week_stories_delta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

