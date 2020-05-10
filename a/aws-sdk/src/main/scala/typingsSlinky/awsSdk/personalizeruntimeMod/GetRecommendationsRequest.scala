package typingsSlinky.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
    */
  var campaignArn: Arn = js.native
  /**
    * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type. For more information, see Contextual Metadata.
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * The item ID to provide recommendations for. Required for RELATED_ITEMS recipe type.
    */
  var itemId: js.UndefOr[ItemID] = js.native
  /**
    * The number of results to return. The default is 25. The maximum is 500.
    */
  var numResults: js.UndefOr[NumResults] = js.native
  /**
    * The user ID to provide recommendations for. Required for USER_PERSONALIZATION recipe type.
    */
  var userId: js.UndefOr[UserID] = js.native
}

object GetRecommendationsRequest {
  @scala.inline
  def apply(campaignArn: Arn): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
  @scala.inline
  implicit class GetRecommendationsRequestOps[Self <: GetRecommendationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: ItemID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withNumResults(value: NumResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

