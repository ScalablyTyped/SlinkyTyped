package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMovingAddressesResult extends js.Object {
  /**
    * The status for each Elastic IP address.
    */
  var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeMovingAddressesResult {
  @scala.inline
  def apply(): DescribeMovingAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesResult]
  }
  @scala.inline
  implicit class DescribeMovingAddressesResultOps[Self <: DescribeMovingAddressesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovingAddressStatuses(value: MovingAddressStatusSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovingAddressStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovingAddressStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovingAddressStatuses")(js.undefined)
        ret
    }
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
  }
  
}

