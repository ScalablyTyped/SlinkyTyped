package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationFeedback extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) that identifies the code review. 
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
    *  The user principal that made the API call. 
    */
  var UserId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.UserId] = js.native
}

object RecommendationFeedback {
  @scala.inline
  def apply(
    CodeReviewArn: Arn = null,
    CreatedTimeStamp: js.Date = null,
    LastUpdatedTimeStamp: js.Date = null,
    Reactions: Reactions = null,
    RecommendationId: RecommendationId = null,
    UserId: UserId = null
  ): RecommendationFeedback = {
    val __obj = js.Dynamic.literal()
    if (CodeReviewArn != null) __obj.updateDynamic("CodeReviewArn")(CodeReviewArn.asInstanceOf[js.Any])
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp.asInstanceOf[js.Any])
    if (LastUpdatedTimeStamp != null) __obj.updateDynamic("LastUpdatedTimeStamp")(LastUpdatedTimeStamp.asInstanceOf[js.Any])
    if (Reactions != null) __obj.updateDynamic("Reactions")(Reactions.asInstanceOf[js.Any])
    if (RecommendationId != null) __obj.updateDynamic("RecommendationId")(RecommendationId.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationFeedback]
  }
}

