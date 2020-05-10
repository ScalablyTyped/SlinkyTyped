package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastDeregisteredGroupSources extends js.Object {
  /**
    * The network interface IDs of the non-registered members.
    */
  var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastDeregisteredGroupSources {
  @scala.inline
  def apply(): TransitGatewayMulticastDeregisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDeregisteredGroupSources]
  }
  @scala.inline
  implicit class TransitGatewayMulticastDeregisteredGroupSourcesOps[Self <: TransitGatewayMulticastDeregisteredGroupSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeregisteredNetworkInterfaceIds(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeregisteredNetworkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeregisteredNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeregisteredNetworkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayMulticastDomainId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayMulticastDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomainId")(js.undefined)
        ret
    }
  }
  
}

