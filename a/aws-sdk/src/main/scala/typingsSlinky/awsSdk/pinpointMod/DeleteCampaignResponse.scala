package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCampaignResponse extends js.Object {
  var CampaignResponse: typingsSlinky.awsSdk.pinpointMod.CampaignResponse = js.native
}

object DeleteCampaignResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): DeleteCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignResponse]
  }
  @scala.inline
  implicit class DeleteCampaignResponseOps[Self <: DeleteCampaignResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignResponse(value: CampaignResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

