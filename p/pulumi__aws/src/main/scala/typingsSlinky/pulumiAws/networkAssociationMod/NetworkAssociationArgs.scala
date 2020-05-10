package typingsSlinky.pulumiAws.networkAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAssociationArgs extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Input[String] = js.native
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: Input[String] = js.native
}

object NetworkAssociationArgs {
  @scala.inline
  def apply(clientVpnEndpointId: Input[String], subnetId: Input[String]): NetworkAssociationArgs = {
    val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAssociationArgs]
  }
  @scala.inline
  implicit class NetworkAssociationArgsOps[Self <: NetworkAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientVpnEndpointId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

