package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsControlsRequest extends js.Object {
  /**
    * The maximum number of security standard controls to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the DescribeStandardsControls operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}

object DescribeStandardsControlsRequest {
  @scala.inline
  def apply(StandardsSubscriptionArn: NonEmptyString): DescribeStandardsControlsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsRequest]
  }
  @scala.inline
  implicit class DescribeStandardsControlsRequestOps[Self <: DescribeStandardsControlsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsSubscriptionArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

