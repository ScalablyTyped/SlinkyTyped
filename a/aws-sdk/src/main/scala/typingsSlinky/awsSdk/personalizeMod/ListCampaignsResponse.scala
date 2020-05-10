package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCampaignsResponse extends js.Object {
  /**
    * A list of the campaigns.
    */
  var campaigns: js.UndefOr[Campaigns] = js.native
  /**
    * A token for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListCampaignsResponse {
  @scala.inline
  def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  @scala.inline
  implicit class ListCampaignsResponseOps[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaigns(value: Campaigns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaigns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaigns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaigns")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

