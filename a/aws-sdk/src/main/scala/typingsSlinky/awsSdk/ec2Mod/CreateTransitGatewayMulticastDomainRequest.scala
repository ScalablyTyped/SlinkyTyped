package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayMulticastDomainRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tags for the transit gateway multicast domain.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayId = js.native
}

object CreateTransitGatewayMulticastDomainRequest {
  @scala.inline
  def apply(TransitGatewayId: TransitGatewayId): CreateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainRequest]
  }
  @scala.inline
  implicit class CreateTransitGatewayMulticastDomainRequestOps[Self <: CreateTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayId(value: TransitGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
        ret
    }
  }
  
}

