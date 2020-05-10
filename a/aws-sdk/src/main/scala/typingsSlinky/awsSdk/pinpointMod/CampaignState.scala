package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignState extends js.Object {
  /**
    * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign. If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a status of COMPLETED.
    */
  var CampaignStatus: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.CampaignStatus] = js.native
}

object CampaignState {
  @scala.inline
  def apply(): CampaignState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignState]
  }
  @scala.inline
  implicit class CampaignStateOps[Self <: CampaignState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignStatus(value: CampaignStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignStatus")(js.undefined)
        ret
    }
  }
  
}

