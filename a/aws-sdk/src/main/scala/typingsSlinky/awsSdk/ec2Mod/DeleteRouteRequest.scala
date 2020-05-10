package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequest extends js.Object {
  /**
    * The IPv4 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typingsSlinky.awsSdk.ec2Mod.RouteTableId = js.native
}

object DeleteRouteRequest {
  @scala.inline
  def apply(RouteTableId: RouteTableId): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequest]
  }
  @scala.inline
  implicit class DeleteRouteRequestOps[Self <: DeleteRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteTableId(value: RouteTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpv6CidrBlock")(js.undefined)
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
  }
  
}

