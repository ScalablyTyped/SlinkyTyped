package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignStateMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXECUTING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PAUSED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PENDING_NEXT_RUN
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SCHEDULED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignState extends js.Object {
  /**
    * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
    *
    * Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
    */
  var CampaignStatus: js.UndefOr[SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String] = js.native
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
    def withCampaignStatus(value: SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String): Self = {
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

