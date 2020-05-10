package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseTopPostsUnit extends js.Object {
  var last_week_posts_count: Double = js.native
  var top_posts: InsightsServiceAccountResponseTopPosts = js.native
  var week_over_week_posts_delta: Double = js.native
}

object InsightsServiceAccountResponseTopPostsUnit {
  @scala.inline
  def apply(
    last_week_posts_count: Double,
    top_posts: InsightsServiceAccountResponseTopPosts,
    week_over_week_posts_delta: Double
  ): InsightsServiceAccountResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(last_week_posts_count = last_week_posts_count.asInstanceOf[js.Any], top_posts = top_posts.asInstanceOf[js.Any], week_over_week_posts_delta = week_over_week_posts_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTopPostsUnit]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseTopPostsUnitOps[Self <: InsightsServiceAccountResponseTopPostsUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_week_posts_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_week_posts_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop_posts(value: InsightsServiceAccountResponseTopPosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek_over_week_posts_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week_over_week_posts_delta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

