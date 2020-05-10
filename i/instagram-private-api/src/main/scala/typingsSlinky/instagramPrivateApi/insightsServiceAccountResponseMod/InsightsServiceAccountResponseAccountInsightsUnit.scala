package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseAccountInsightsUnit extends js.Object {
  var account_actions_graph: InsightsServiceAccountResponseAccountActionsGraph = js.native
  var account_discovery_graph: InsightsServiceAccountResponseAccountDiscoveryGraph = js.native
  var aymt_instagram_account_insights_channel: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = js.native
  var call_metric_count: Double = js.native
  var call_metric_delta: Double = js.native
  var email_metric_count: Double = js.native
  var email_metric_delta: Double = js.native
  var get_direction_metric_count: Double = js.native
  var get_direction_metric_delta: Double = js.native
  var graph: InsightsServiceAccountResponseGraph = js.native
  var hashtags_impressions: InsightsServiceAccountResponseHashtagsImpressions = js.native
  var hashtags_reach: InsightsServiceAccountResponseHashtagsReach = js.native
  var impressions_metric_count: Double = js.native
  var impressions_metric_delta: Double = js.native
  var last_week_impressions: Double = js.native
  var metric_graph: InsightsServiceAccountResponseMetricGraph = js.native
  var profile_visits_metric_count: Double = js.native
  var profile_visits_metric_delta: Double = js.native
  var reach_metric_count: Double = js.native
  var reach_metric_delta: Double = js.native
  var text_metric_count: Double = js.native
  var text_metric_delta: Double = js.native
  var website_visits_metric_count: Double = js.native
  var website_visits_metric_delta: Double = js.native
}

object InsightsServiceAccountResponseAccountInsightsUnit {
  @scala.inline
  def apply(
    account_actions_graph: InsightsServiceAccountResponseAccountActionsGraph,
    account_discovery_graph: InsightsServiceAccountResponseAccountDiscoveryGraph,
    aymt_instagram_account_insights_channel: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel,
    call_metric_count: Double,
    call_metric_delta: Double,
    email_metric_count: Double,
    email_metric_delta: Double,
    get_direction_metric_count: Double,
    get_direction_metric_delta: Double,
    graph: InsightsServiceAccountResponseGraph,
    hashtags_impressions: InsightsServiceAccountResponseHashtagsImpressions,
    hashtags_reach: InsightsServiceAccountResponseHashtagsReach,
    impressions_metric_count: Double,
    impressions_metric_delta: Double,
    last_week_impressions: Double,
    metric_graph: InsightsServiceAccountResponseMetricGraph,
    profile_visits_metric_count: Double,
    profile_visits_metric_delta: Double,
    reach_metric_count: Double,
    reach_metric_delta: Double,
    text_metric_count: Double,
    text_metric_delta: Double,
    website_visits_metric_count: Double,
    website_visits_metric_delta: Double
  ): InsightsServiceAccountResponseAccountInsightsUnit = {
    val __obj = js.Dynamic.literal(account_actions_graph = account_actions_graph.asInstanceOf[js.Any], account_discovery_graph = account_discovery_graph.asInstanceOf[js.Any], aymt_instagram_account_insights_channel = aymt_instagram_account_insights_channel.asInstanceOf[js.Any], call_metric_count = call_metric_count.asInstanceOf[js.Any], call_metric_delta = call_metric_delta.asInstanceOf[js.Any], email_metric_count = email_metric_count.asInstanceOf[js.Any], email_metric_delta = email_metric_delta.asInstanceOf[js.Any], get_direction_metric_count = get_direction_metric_count.asInstanceOf[js.Any], get_direction_metric_delta = get_direction_metric_delta.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], hashtags_reach = hashtags_reach.asInstanceOf[js.Any], impressions_metric_count = impressions_metric_count.asInstanceOf[js.Any], impressions_metric_delta = impressions_metric_delta.asInstanceOf[js.Any], last_week_impressions = last_week_impressions.asInstanceOf[js.Any], metric_graph = metric_graph.asInstanceOf[js.Any], profile_visits_metric_count = profile_visits_metric_count.asInstanceOf[js.Any], profile_visits_metric_delta = profile_visits_metric_delta.asInstanceOf[js.Any], reach_metric_count = reach_metric_count.asInstanceOf[js.Any], reach_metric_delta = reach_metric_delta.asInstanceOf[js.Any], text_metric_count = text_metric_count.asInstanceOf[js.Any], text_metric_delta = text_metric_delta.asInstanceOf[js.Any], website_visits_metric_count = website_visits_metric_count.asInstanceOf[js.Any], website_visits_metric_delta = website_visits_metric_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountInsightsUnit]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountInsightsUnitOps[Self <: InsightsServiceAccountResponseAccountInsightsUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_actions_graph(value: InsightsServiceAccountResponseAccountActionsGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_actions_graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_discovery_graph(value: InsightsServiceAccountResponseAccountDiscoveryGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_discovery_graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAymt_instagram_account_insights_channel(value: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_instagram_account_insights_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCall_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCall_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet_direction_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_direction_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet_direction_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_direction_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: InsightsServiceAccountResponseGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashtags_impressions(value: InsightsServiceAccountResponseHashtagsImpressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags_impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashtags_reach(value: InsightsServiceAccountResponseHashtagsReach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags_reach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpressions_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpressions_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_week_impressions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_week_impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric_graph(value: InsightsServiceAccountResponseMetricGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric_graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_visits_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_visits_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_visits_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_visits_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite_visits_metric_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website_visits_metric_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite_visits_metric_delta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website_visits_metric_delta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

