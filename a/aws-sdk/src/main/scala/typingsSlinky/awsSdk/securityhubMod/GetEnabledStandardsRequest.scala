package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsRequest extends js.Object {
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the GetEnabledStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of the standards subscription ARNs for the standards to retrieve.
    */
  var StandardsSubscriptionArns: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptionArns] = js.native
}

object GetEnabledStandardsRequest {
  @scala.inline
  def apply(): GetEnabledStandardsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsRequest]
  }
  @scala.inline
  implicit class GetEnabledStandardsRequestOps[Self <: GetEnabledStandardsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardsSubscriptionArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionArns")(js.undefined)
        ret
    }
  }
  
}

