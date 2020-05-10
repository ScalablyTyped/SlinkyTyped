package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRightsizingRecommendationResponse extends js.Object {
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[RightsizingRecommendationMetadata] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * Recommendations to rightsize resources.
    */
  var RightsizingRecommendations: js.UndefOr[RightsizingRecommendationList] = js.native
  /**
    * Summary of this recommendation set.
    */
  var Summary: js.UndefOr[RightsizingRecommendationSummary] = js.native
}

object GetRightsizingRecommendationResponse {
  @scala.inline
  def apply(): GetRightsizingRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRightsizingRecommendationResponse]
  }
  @scala.inline
  implicit class GetRightsizingRecommendationResponseOps[Self <: GetRightsizingRecommendationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: RightsizingRecommendationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRightsizingRecommendations(value: RightsizingRecommendationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightsizingRecommendations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightsizingRecommendations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightsizingRecommendations")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: RightsizingRecommendationSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(js.undefined)
        ret
    }
  }
  
}

