package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmRequest extends js.Object {
  /**
    * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use DescribeClusters.
    */
  var AvailabilityZone: ExternalAz = js.native
  /**
    * The identifier (ID) of the HSM's cluster. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  /**
    * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from that subnet.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.IpAddress] = js.native
}

object CreateHsmRequest {
  @scala.inline
  def apply(AvailabilityZone: ExternalAz, ClusterId: ClusterId): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  @scala.inline
  implicit class CreateHsmRequestOps[Self <: CreateHsmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: ExternalAz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
  }
  
}

