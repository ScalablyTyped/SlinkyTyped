package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansPurchaseRecommendationMetadata extends js.Object {
  
  /**
    * Additional metadata that may be applicable to the recommendation.
    */
  var AdditionalMetadata: js.UndefOr[GenericString] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalMetadata(value: GenericString): Self = this.set("AdditionalMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMetadata: Self = this.set("AdditionalMetadata", js.undefined)
    
    @scala.inline
    def setGenerationTimestamp(value: GenericString): Self = this.set("GenerationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationTimestamp: Self = this.set("GenerationTimestamp", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: GenericString): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationId: Self = this.set("RecommendationId", js.undefined)
  }
}
