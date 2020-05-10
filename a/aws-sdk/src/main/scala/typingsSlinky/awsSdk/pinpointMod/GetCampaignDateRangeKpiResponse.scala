package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignDateRangeKpiResponse extends js.Object {
  var CampaignDateRangeKpiResponse: typingsSlinky.awsSdk.pinpointMod.CampaignDateRangeKpiResponse = js.native
}

object GetCampaignDateRangeKpiResponse {
  @scala.inline
  def apply(CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse): GetCampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(CampaignDateRangeKpiResponse = CampaignDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignDateRangeKpiResponse]
  }
  @scala.inline
  implicit class GetCampaignDateRangeKpiResponseOps[Self <: GetCampaignDateRangeKpiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignDateRangeKpiResponse(value: CampaignDateRangeKpiResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignDateRangeKpiResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

