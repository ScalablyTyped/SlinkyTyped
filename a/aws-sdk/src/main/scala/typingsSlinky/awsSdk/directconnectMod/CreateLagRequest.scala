package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLagRequest extends js.Object {
  /**
    * The tags to associate with the automtically created LAGs.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.native
  /**
    * The ID of an existing connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth = js.native
  /**
    * The name of the LAG.
    */
  var lagName: LagName = js.native
  /**
    * The location for the LAG.
    */
  var location: LocationCode = js.native
  /**
    * The number of physical connections initially provisioned and bundled by the LAG.
    */
  var numberOfConnections: Count = js.native
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLagRequest {
  @scala.inline
  def apply(
    connectionsBandwidth: Bandwidth,
    lagName: LagName,
    location: LocationCode,
    numberOfConnections: Count
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], lagName = lagName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], numberOfConnections = numberOfConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLagRequest]
  }
  @scala.inline
  implicit class CreateLagRequestOps[Self <: CreateLagRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionsBandwidth(value: Bandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLagName(value: LagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LocationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfConnections(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildConnectionTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childConnectionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildConnectionTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childConnectionTags")(js.undefined)
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

