package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightsizingRecommendationMetadata extends StObject {
  
  /**
    *  The timestamp for when AWS made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.native
  
  /**
    *  How many days of previous usage that AWS considers when making this recommendation.
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
  implicit class RightsizingRecommendationMetadataMutableBuilder[Self <: RightsizingRecommendationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerationTimestamp(value: GenericString): Self = StObject.set(x, "GenerationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationTimestampUndefined: Self = StObject.set(x, "GenerationTimestamp", js.undefined)
    
    @scala.inline
    def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: GenericString): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
