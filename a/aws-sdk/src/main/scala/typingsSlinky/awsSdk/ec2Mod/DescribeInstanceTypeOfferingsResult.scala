package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceTypeOfferingsResult extends js.Object {
  /**
    * The instance types offered.
    */
  var InstanceTypeOfferings: js.UndefOr[InstanceTypeOfferingsList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeInstanceTypeOfferingsResult {
  @scala.inline
  def apply(): DescribeInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypeOfferingsResult]
  }
  @scala.inline
  implicit class DescribeInstanceTypeOfferingsResultOps[Self <: DescribeInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTypeOfferings(value: InstanceTypeOfferingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeOfferings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypeOfferings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTypeOfferings")(js.undefined)
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

