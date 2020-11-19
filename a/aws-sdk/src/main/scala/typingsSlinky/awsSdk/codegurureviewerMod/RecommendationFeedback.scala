package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationFeedback extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The time at which the feedback was created. 
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.native
  
  /**
    *  The time at which the feedback was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.native
  
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. 
    */
  var Reactions: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Reactions] = js.native
  
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.RecommendationId] = js.native
  
  /**
    *  The ID of the user that made the API call.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.UserId] = js.native
}
object RecommendationFeedback {
  
  @scala.inline
  def apply(): RecommendationFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationFeedback]
  }
  
  @scala.inline
  implicit class RecommendationFeedbackOps[Self <: RecommendationFeedback] (val x: Self) extends AnyVal {
    
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
    def setCodeReviewArn(value: Arn): Self = this.set("CodeReviewArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeReviewArn: Self = this.set("CodeReviewArn", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: js.Date): Self = this.set("CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimeStamp: Self = this.set("CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimeStamp(value: js.Date): Self = this.set("LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimeStamp: Self = this.set("LastUpdatedTimeStamp", js.undefined)
    
    @scala.inline
    def setReactionsVarargs(value: Reaction*): Self = this.set("Reactions", js.Array(value :_*))
    
    @scala.inline
    def setReactions(value: Reactions): Self = this.set("Reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactions: Self = this.set("Reactions", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = this.set("RecommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationId: Self = this.set("RecommendationId", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
