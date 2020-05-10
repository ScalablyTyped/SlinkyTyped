package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomerGatewaysResult extends js.Object {
  /**
    * Information about one or more customer gateways.
    */
  var CustomerGateways: js.UndefOr[CustomerGatewayList] = js.native
}

object DescribeCustomerGatewaysResult {
  @scala.inline
  def apply(): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
  @scala.inline
  implicit class DescribeCustomerGatewaysResultOps[Self <: DescribeCustomerGatewaysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGateways(value: CustomerGatewayList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGateways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGateways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGateways")(js.undefined)
        ret
    }
  }
  
}

