package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSmartHomeAppliancesResponse extends js.Object {
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The smart home appliances.
    */
  var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.native
}

object ListSmartHomeAppliancesResponse {
  @scala.inline
  def apply(): ListSmartHomeAppliancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
  }
  @scala.inline
  implicit class ListSmartHomeAppliancesResponseOps[Self <: ListSmartHomeAppliancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartHomeAppliances(value: SmartHomeApplianceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartHomeAppliances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartHomeAppliances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartHomeAppliances")(js.undefined)
        ret
    }
  }
  
}

