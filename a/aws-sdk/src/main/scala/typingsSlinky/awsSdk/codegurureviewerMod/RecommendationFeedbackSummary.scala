package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationFeedbackSummary extends StObject {
  
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. 
    */
  var Reactions: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Reactions] = js.native
  
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.RecommendationId] = js.native
  
  /**
    *  The ID of the user that gave the feedback.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.UserId] = js.native
}
object RecommendationFeedbackSummary {
  
  @scala.inline
  def apply(): RecommendationFeedbackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationFeedbackSummary]
  }
  
  @scala.inline
  implicit class RecommendationFeedbackSummaryMutableBuilder[Self <: RecommendationFeedbackSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReactions(value: Reactions): Self = StObject.set(x, "Reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsUndefined: Self = StObject.set(x, "Reactions", js.undefined)
    
    @scala.inline
    def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "Reactions", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
