package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseBusinessManager extends js.Object {
  var account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit = js.native
  var account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit = js.native
  var followers_unit: InsightsServiceAccountResponseFollowersUnit = js.native
  var promotions_unit: InsightsServiceAccountResponsePromotionsUnit = js.native
  var status: InsightsServiceAccountResponseStatus = js.native
  var stories_unit: InsightsServiceAccountResponseStoriesUnit = js.native
  var top_posts_unit: InsightsServiceAccountResponseTopPostsUnit = js.native
}

object InsightsServiceAccountResponseBusinessManager {
  @scala.inline
  def apply(
    account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit,
    account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit,
    followers_unit: InsightsServiceAccountResponseFollowersUnit,
    promotions_unit: InsightsServiceAccountResponsePromotionsUnit,
    status: InsightsServiceAccountResponseStatus,
    stories_unit: InsightsServiceAccountResponseStoriesUnit,
    top_posts_unit: InsightsServiceAccountResponseTopPostsUnit
  ): InsightsServiceAccountResponseBusinessManager = {
    val __obj = js.Dynamic.literal(account_insights_unit = account_insights_unit.asInstanceOf[js.Any], account_summary_unit = account_summary_unit.asInstanceOf[js.Any], followers_unit = followers_unit.asInstanceOf[js.Any], promotions_unit = promotions_unit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories_unit = stories_unit.asInstanceOf[js.Any], top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessManager]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseBusinessManagerOps[Self <: InsightsServiceAccountResponseBusinessManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_insights_unit(value: InsightsServiceAccountResponseAccountInsightsUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_insights_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_summary_unit(value: InsightsServiceAccountResponseAccountSummaryUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_summary_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers_unit(value: InsightsServiceAccountResponseFollowersUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotions_unit(value: InsightsServiceAccountResponsePromotionsUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: InsightsServiceAccountResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories_unit(value: InsightsServiceAccountResponseStoriesUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop_posts_unit(value: InsightsServiceAccountResponseTopPostsUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_posts_unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

