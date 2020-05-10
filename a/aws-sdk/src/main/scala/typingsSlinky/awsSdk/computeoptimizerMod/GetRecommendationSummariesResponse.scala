package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationSummariesResponse extends js.Object {
  /**
    * The token to use to advance to the next page of recommendation summaries. This value is null when there are no more pages of recommendation summaries to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that summarize a recommendation.
    */
  var recommendationSummaries: js.UndefOr[RecommendationSummaries] = js.native
}

object GetRecommendationSummariesResponse {
  @scala.inline
  def apply(): GetRecommendationSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationSummariesResponse]
  }
  @scala.inline
  implicit class GetRecommendationSummariesResponseOps[Self <: GetRecommendationSummariesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationSummaries(value: RecommendationSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSummaries")(js.undefined)
        ret
    }
  }
  
}

