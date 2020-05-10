package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDeliverabilityCampaignRequest extends js.Object {
  /**
    * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
    */
  var CampaignId: typingsSlinky.awsSdk.pinpointemailMod.CampaignId = js.native
}

object GetDomainDeliverabilityCampaignRequest {
  @scala.inline
  def apply(CampaignId: CampaignId): GetDomainDeliverabilityCampaignRequest = {
    val __obj = js.Dynamic.literal(CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
  }
  @scala.inline
  implicit class GetDomainDeliverabilityCampaignRequestOps[Self <: GetDomainDeliverabilityCampaignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignId(value: CampaignId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

