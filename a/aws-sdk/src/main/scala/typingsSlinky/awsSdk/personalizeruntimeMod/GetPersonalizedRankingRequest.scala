package typingsSlinky.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPersonalizedRankingRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
    */
  var campaignArn: Arn = js.native
  /**
    * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type. For more information, see Contextual Metadata.
    */
  var context: js.UndefOr[Context] = js.native
  /**
    * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.
    */
  var inputList: InputList = js.native
  /**
    * The user for which you want the campaign to provide a personalized ranking.
    */
  var userId: UserID = js.native
}

object GetPersonalizedRankingRequest {
  @scala.inline
  def apply(campaignArn: Arn, inputList: InputList, userId: UserID): GetPersonalizedRankingRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any], inputList = inputList.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonalizedRankingRequest]
  }
  @scala.inline
  implicit class GetPersonalizedRankingRequestOps[Self <: GetPersonalizedRankingRequest] (val x: Self) extends AnyVal {
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
    def withInputList(value: InputList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
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
  }
  
}

