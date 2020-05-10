package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomAvailabilityZoneMessage extends js.Object {
  /**
    * The name of the custom Availability Zone (AZ).
    */
  var CustomAvailabilityZoneName: String = js.native
  /**
    * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere cluster.
    */
  var ExistingVpnId: js.UndefOr[String] = js.native
  /**
    * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var NewVpnTunnelName: js.UndefOr[String] = js.native
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.native
}

object CreateCustomAvailabilityZoneMessage {
  @scala.inline
  def apply(CustomAvailabilityZoneName: String): CreateCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneName = CustomAvailabilityZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomAvailabilityZoneMessage]
  }
  @scala.inline
  implicit class CreateCustomAvailabilityZoneMessageOps[Self <: CreateCustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingVpnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistingVpnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingVpnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistingVpnId")(js.undefined)
        ret
    }
    @scala.inline
    def withNewVpnTunnelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewVpnTunnelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewVpnTunnelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewVpnTunnelName")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnTunnelOriginatorIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnTunnelOriginatorIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnTunnelOriginatorIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnTunnelOriginatorIP")(js.undefined)
        ret
    }
  }
  
}

