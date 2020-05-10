package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCampaignsResponse extends CampaignsResponse {
  /**
    * A list of campaigns.
    */
  @JSName("Item")
  var Item_UnmarshalledCampaignsResponse: js.UndefOr[js.Array[UnmarshalledCampaignResponse]] = js.native
}

object UnmarshalledCampaignsResponse {
  @scala.inline
  def apply(): UnmarshalledCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCampaignsResponse]
  }
  @scala.inline
  implicit class UnmarshalledCampaignsResponseOps[Self <: UnmarshalledCampaignsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledCampaignResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}

