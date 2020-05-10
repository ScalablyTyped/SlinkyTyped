package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceStatusResponse extends js.Object {
  /**
    * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of PolicyComplianceStatus objects.
    */
  var PolicyComplianceStatusList: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyComplianceStatusList] = js.native
}

object ListComplianceStatusResponse {
  @scala.inline
  def apply(): ListComplianceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceStatusResponse]
  }
  @scala.inline
  implicit class ListComplianceStatusResponseOps[Self <: ListComplianceStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withPolicyComplianceStatusList(value: PolicyComplianceStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyComplianceStatusList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyComplianceStatusList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyComplianceStatusList")(js.undefined)
        ret
    }
  }
  
}

