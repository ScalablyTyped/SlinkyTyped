package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseMetrics extends js.Object {
  var hashtags_impressions: InsightsServicePostResponseHashtagsImpressions = js.native
  var impression_count: Double = js.native
  var impressions: InsightsServicePostResponseImpressions = js.native
  var owner_account_follows_count: Double = js.native
  var owner_profile_views_count: Double = js.native
  var profile_actions: InsightsServicePostResponseProfileActions = js.native
  var reach: InsightsServicePostResponseReach = js.native
  var reach_count: Double = js.native
  var share_count: InsightsServicePostResponseShareCount = js.native
}

object InsightsServicePostResponseMetrics {
  @scala.inline
  def apply(
    hashtags_impressions: InsightsServicePostResponseHashtagsImpressions,
    impression_count: Double,
    impressions: InsightsServicePostResponseImpressions,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: InsightsServicePostResponseProfileActions,
    reach: InsightsServicePostResponseReach,
    reach_count: Double,
    share_count: InsightsServicePostResponseShareCount
  ): InsightsServicePostResponseMetrics = {
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], impressions = impressions.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
  @scala.inline
  implicit class InsightsServicePostResponseMetricsOps[Self <: InsightsServicePostResponseMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtags_impressions(value: InsightsServicePostResponseHashtagsImpressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags_impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpression_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impression_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpressions(value: InsightsServicePostResponseImpressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(value.asInstanceOf[js.Any])
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
    def withProfile_actions(value: InsightsServicePostResponseProfileActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach(value: InsightsServicePostResponseReach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare_count(value: InsightsServicePostResponseShareCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

