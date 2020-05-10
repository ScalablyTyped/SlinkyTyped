package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomerGatewayResult extends js.Object {
  /**
    * Information about the customer gateway.
    */
  var CustomerGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CustomerGateway] = js.native
}

object CreateCustomerGatewayResult {
  @scala.inline
  def apply(): CreateCustomerGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerGatewayResult]
  }
  @scala.inline
  implicit class CreateCustomerGatewayResultOps[Self <: CreateCustomerGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGateway(value: CustomerGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGateway")(js.undefined)
        ret
    }
  }
  
}

