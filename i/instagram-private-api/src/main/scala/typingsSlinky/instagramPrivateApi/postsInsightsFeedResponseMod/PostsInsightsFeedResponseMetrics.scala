package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseMetrics extends js.Object {
  var impression_count: Double = js.native
  var owner_account_follows_count: Double = js.native
  var owner_profile_views_count: Double = js.native
  var profile_actions: PostsInsightsFeedResponseProfileActions = js.native
  var reach_count: Double = js.native
  var share_count: PostsInsightsFeedResponseShareCount = js.native
}

object PostsInsightsFeedResponseMetrics {
  @scala.inline
  def apply(
    impression_count: Double,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: PostsInsightsFeedResponseProfileActions,
    reach_count: Double,
    share_count: PostsInsightsFeedResponseShareCount
  ): PostsInsightsFeedResponseMetrics = {
    val __obj = js.Dynamic.literal(impression_count = impression_count.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseMetrics]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseMetricsOps[Self <: PostsInsightsFeedResponseMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpression_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impression_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner_account_follows_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_account_follows_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner_profile_views_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_profile_views_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_actions(value: PostsInsightsFeedResponseProfileActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare_count(value: PostsInsightsFeedResponseShareCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

