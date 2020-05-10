package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansPurchaseRecommendationResponse extends js.Object {
  /**
    * Information regarding this specific recommendation set.
    */
  var Metadata: js.UndefOr[SavingsPlansPurchaseRecommendationMetadata] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
    */
  var SavingsPlansPurchaseRecommendation: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendation] = js.native
}

object GetSavingsPlansPurchaseRecommendationResponse {
  @scala.inline
  def apply(): GetSavingsPlansPurchaseRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationResponse]
  }
  @scala.inline
  implicit class GetSavingsPlansPurchaseRecommendationResponseOps[Self <: GetSavingsPlansPurchaseRecommendationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: SavingsPlansPurchaseRecommendationMetadata): Self = {
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
    def withSavingsPlansPurchaseRecommendation(value: SavingsPlansPurchaseRecommendation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansPurchaseRecommendation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendation")(js.undefined)
        ret
    }
  }
  
}

