package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interconnect extends js.Object {
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
    * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.native
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
  /**
    * The name of the interconnect.
    */
  var interconnectName: js.UndefOr[InterconnectName] = js.native
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.native
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
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The tags associated with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Interconnect {
  @scala.inline
  def apply(): Interconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interconnect]
  }
  @scala.inline
  implicit class InterconnectOps[Self <: Interconnect] (val x: Self) extends AnyVal {
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
    def withInterconnectId(value: InterconnectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(js.undefined)
        ret
    }
    @scala.inline
    def withInterconnectName(value: InterconnectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectName")(js.undefined)
        ret
    }
    @scala.inline
    def withInterconnectState(value: InterconnectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectState")(js.undefined)
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

