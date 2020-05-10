package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateConnectionOnInterconnectRequest extends js.Object {
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection.
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The name of the provisioned connection.
    */
  var connectionName: ConnectionName = js.native
  /**
    * The ID of the interconnect on which the connection will be provisioned.
    */
  var interconnectId: InterconnectId = js.native
  /**
    * The ID of the AWS account of the customer for whom the connection will be provisioned.
    */
  var ownerAccount: OwnerAccount = js.native
  /**
    * The dedicated VLAN provisioned to the connection.
    */
  var vlan: VLAN = js.native
}

object AllocateConnectionOnInterconnectRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionName: ConnectionName,
    interconnectId: InterconnectId,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateConnectionOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], interconnectId = interconnectId.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateConnectionOnInterconnectRequest]
  }
  @scala.inline
  implicit class AllocateConnectionOnInterconnectRequestOps[Self <: AllocateConnectionOnInterconnectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: Bandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterconnectId(value: InterconnectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVlan(value: VLAN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

