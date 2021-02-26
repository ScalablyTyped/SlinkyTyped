package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecommendationFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: Arn = js.native
  
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all your feedback. 
    */
  var Reactions: typingsSlinky.awsSdk.codegurureviewerMod.Reactions = js.native
  
  /**
    *  The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. 
    */
  var RecommendationId: typingsSlinky.awsSdk.codegurureviewerMod.RecommendationId = js.native
}
object PutRecommendationFeedbackRequest {
  
  @scala.inline
  def apply(CodeReviewArn: Arn, Reactions: Reactions, RecommendationId: RecommendationId): PutRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], Reactions = Reactions.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecommendationFeedbackRequest]
  }
  
  @scala.inline
  implicit class PutRecommendationFeedbackRequestMutableBuilder[Self <: PutRecommendationFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: Reactions): Self = StObject.set(x, "Reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "Reactions", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
  }
}
