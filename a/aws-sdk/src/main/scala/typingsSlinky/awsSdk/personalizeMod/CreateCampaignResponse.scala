package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCampaignResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}

object CreateCampaignResponse {
  @scala.inline
  def apply(): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCampaignResponse]
  }
  @scala.inline
  implicit class CreateCampaignResponseOps[Self <: CreateCampaignResponse] (val x: Self) extends AnyVal {
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
    def withoutCampaignArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignArn")(js.undefined)
        ret
    }
  }
  
}

