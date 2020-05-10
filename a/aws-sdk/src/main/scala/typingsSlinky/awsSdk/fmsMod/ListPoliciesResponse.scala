package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesResponse extends js.Object {
  /**
    * If you have more PolicySummary objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicySummary objects, submit another ListPolicies request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of PolicySummary objects.
    */
  var PolicyList: js.UndefOr[PolicySummaryList] = js.native
}

object ListPoliciesResponse {
  @scala.inline
  def apply(): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesResponse]
  }
  @scala.inline
  implicit class ListPoliciesResponseOps[Self <: ListPoliciesResponse] (val x: Self) extends AnyVal {
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
    def withPolicyList(value: PolicySummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyList")(js.undefined)
        ret
    }
  }
  
}

