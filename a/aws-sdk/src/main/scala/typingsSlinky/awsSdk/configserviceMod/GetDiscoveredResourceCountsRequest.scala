package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredResourceCountsRequest extends js.Object {
  /**
    * The maximum number of ResourceCount objects returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The comma-separated list that specifies the resource types that you want AWS Config to return (for example, "AWS::EC2::Instance", "AWS::IAM::User"). If a value for resourceTypes is not specified, AWS Config returns all resource types that AWS Config is recording in the region for your account.  If the configuration recorder is turned off, AWS Config returns an empty list of ResourceCount objects. If the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource type is not returned in the list of ResourceCount objects. 
    */
  var resourceTypes: js.UndefOr[ResourceTypes] = js.native
}

object GetDiscoveredResourceCountsRequest {
  @scala.inline
  def apply(): GetDiscoveredResourceCountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoveredResourceCountsRequest]
  }
  @scala.inline
  implicit class GetDiscoveredResourceCountsRequestOps[Self <: GetDiscoveredResourceCountsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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
    @scala.inline
    def withResourceTypes(value: ResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypes")(js.undefined)
        ret
    }
  }
  
}

