package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendationMetadata extends js.Object {
  /**
    *  The time stamp for when Amazon Web Services made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  /**
    *  How many days of previous usage that Amazon Web Services considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    *  The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.native
}

object RightsizingRecommendationMetadata {
  @scala.inline
  def apply(): RightsizingRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationMetadata]
  }
  @scala.inline
  implicit class RightsizingRecommendationMetadataOps[Self <: RightsizingRecommendationMetadata] (val x: Self) extends AnyVal {
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
    def withLookbackPeriodInDays(value: LookbackPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookbackPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbackPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookbackPeriodInDays")(js.undefined)
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

