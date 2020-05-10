package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to delete.
    */
  var campaignArn: Arn = js.native
}

object DeleteCampaignRequest {
  @scala.inline
  def apply(campaignArn: Arn): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  @scala.inline
  implicit class DeleteCampaignRequestOps[Self <: DeleteCampaignRequest] (val x: Self) extends AnyVal {
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
  }
  
}

