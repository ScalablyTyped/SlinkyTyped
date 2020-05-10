package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of MemberAccountStatus objects.
    */
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleDetailedStatus] = js.native
}

object GetOrganizationConfigRuleDetailedStatusResponse {
  @scala.inline
  def apply(): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
  @scala.inline
  implicit class GetOrganizationConfigRuleDetailedStatusResponseOps[Self <: GetOrganizationConfigRuleDetailedStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withOrganizationConfigRuleDetailedStatus(value: OrganizationConfigRuleDetailedStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleDetailedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationConfigRuleDetailedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleDetailedStatus")(js.undefined)
        ret
    }
  }
  
}

