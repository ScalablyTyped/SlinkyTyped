package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostedConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection. 
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The name of the hosted connection.
    */
  var connectionName: ConnectionName = js.native
  /**
    * The ID of the AWS account ID of the customer for the connection.
    */
  var ownerAccount: OwnerAccount = js.native
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The dedicated VLAN provisioned to the hosted connection.
    */
  var vlan: VLAN = js.native
}

object AllocateHostedConnectionRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionId: ConnectionId,
    connectionName: ConnectionName,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostedConnectionRequest]
  }
  @scala.inline
  implicit class AllocateHostedConnectionRequestOps[Self <: AllocateHostedConnectionRequest] (val x: Self) extends AnyVal {
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
    def withConnectionId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

