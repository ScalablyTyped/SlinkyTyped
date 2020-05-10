package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnRoute extends js.Object {
  /**
    * The ID of the Client VPN endpoint with which the route is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  var DestinationCidr: js.UndefOr[String] = js.native
  /**
    * Indicates how the route was associated with the Client VPN endpoint. associate indicates that the route was automatically added when the target network was associated with the Client VPN endpoint. add-route indicates that the route was manually added using the CreateClientVpnRoute action.
    */
  var Origin: js.UndefOr[String] = js.native
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.native
  /**
    * The ID of the subnet through which traffic is routed.
    */
  var TargetSubnet: js.UndefOr[String] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[String] = js.native
}

object ClientVpnRoute {
  @scala.inline
  def apply(): ClientVpnRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRoute]
  }
  @scala.inline
  implicit class ClientVpnRouteOps[Self <: ClientVpnRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientVpnEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpnEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidr")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ClientVpnRouteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSubnet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSubnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSubnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSubnet")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

