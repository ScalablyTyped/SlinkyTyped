package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationSummary extends js.Object {
  /**
    * The AWS account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The resource type of the recommendation.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.native
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.native
}

object RecommendationSummary {
  @scala.inline
  def apply(): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSummary]
  }
  @scala.inline
  implicit class RecommendationSummaryOps[Self <: RecommendationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationResourceType(value: RecommendationSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaries(value: Summaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(js.undefined)
        ret
    }
  }
  
}

