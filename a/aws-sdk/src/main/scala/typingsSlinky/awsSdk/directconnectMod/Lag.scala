package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lag extends js.Object {
  /**
    * Indicates whether the LAG can host other connections.
    */
  var allowsHostedConnections: js.UndefOr[BooleanFlag] = js.native
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.native
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The connections bundled by the LAG.
    */
  var connections: js.UndefOr[ConnectionList] = js.native
  /**
    * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: js.UndefOr[Bandwidth] = js.native
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
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
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.native
  /**
    * The state of the LAG. The following are the possible values:    requested: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization (LOA) is available.    pending: The LAG has been approved and is being initialized.    available: The network link is established and the LAG is ready for use.    down: The network link is down.    deleting: The LAG is being deleted.    deleted: The LAG is deleted.    unknown: The state of the LAG is not available.  
    */
  var lagState: js.UndefOr[LagState] = js.native
  /**
    * The location of the LAG.
    */
  var location: js.UndefOr[LocationCode] = js.native
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.native
  /**
    * The number of physical connections bundled by the LAG, up to a maximum of 10.
    */
  var numberOfConnections: js.UndefOr[Count] = js.native
  /**
    * The ID of the AWS account that owns the LAG.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Lag {
  @scala.inline
  def apply(): Lag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lag]
  }
  @scala.inline
  implicit class LagOps[Self <: Lag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowsHostedConnections(value: BooleanFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsHostedConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsHostedConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsHostedConnections")(js.undefined)
        ret
    }
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
    def withConnections(value: ConnectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionsBandwidth(value: Bandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionsBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsBandwidth")(js.undefined)
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
    def withLagName(value: LagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagName")(js.undefined)
        ret
    }
    @scala.inline
    def withLagState(value: LagState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagState")(js.undefined)
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
    def withMinimumLinks(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfConnections(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfConnections")(js.undefined)
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
  }
  
}

