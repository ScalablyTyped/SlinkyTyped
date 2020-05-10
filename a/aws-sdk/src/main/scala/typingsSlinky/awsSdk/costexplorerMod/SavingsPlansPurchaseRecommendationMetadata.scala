package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationMetadata extends js.Object {
  /**
    * The timestamp showing when the recommendations were generated.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    * The unique identifier for the recommendation set.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationMetadata {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationMetadata]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationMetadataOps[Self <: SavingsPlansPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerationTimestamp(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationId")(js.undefined)
        ret
    }
  }
  
}

