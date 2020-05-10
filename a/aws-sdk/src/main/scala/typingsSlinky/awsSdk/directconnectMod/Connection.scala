package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.native
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.native
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.native
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[js.Date] = js.native
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.native
  /**
    * The ID of the AWS account that owns the connection.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The name of the AWS Direct Connect service provider associated with the connection.
    */
  var partnerName: js.UndefOr[PartnerName] = js.native
  /**
    * The name of the service provider associated with the connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsDevice(value: AwsDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsDeviceV2(value: AwsDeviceV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDeviceV2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsDeviceV2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDeviceV2")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidth(value: Bandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionName(value: ConnectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionState(value: ConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLogicalRedundancy(value: HasLogicalRedundancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLogicalRedundancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLogicalRedundancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLogicalRedundancy")(js.undefined)
        ret
    }
    @scala.inline
    def withJumboFrameCapable(value: JumboFrameCapable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumboFrameCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withLagId(value: LagId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaIssueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaIssueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaIssueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaIssueTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LocationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerName(value: PartnerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
    @scala.inline
    def withVlan(value: VLAN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(js.undefined)
        ret
    }
  }
  
}

