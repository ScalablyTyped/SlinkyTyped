package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag. Specify tags by using a key-value mapping.
    */
  var Filters: js.UndefOr[InstanceInformationStringFilterList] = js.native
  /**
    * This is a legacy method. We recommend that you don't use this method. Instead, use the InstanceInformationFilter action. The InstanceInformationFilter action enables you to return instance information by using tags that are specified as a key-value mapping.  If you do use this method, then you can't use the InstanceInformationFilter action. Using this method and the InstanceInformationFilter action causes an exception error. 
    */
  var InstanceInformationFilterList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceInformationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. 
    */
  var MaxResults: js.UndefOr[MaxResultsEC2Compatible] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceInformationRequest {
  @scala.inline
  def apply(): DescribeInstanceInformationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationRequest]
  }
  @scala.inline
  implicit class DescribeInstanceInformationRequestOps[Self <: DescribeInstanceInformationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: InstanceInformationStringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInformationFilterList(value: InstanceInformationFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInformationFilterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInformationFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInformationFilterList")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultsEC2Compatible): Self = {
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

