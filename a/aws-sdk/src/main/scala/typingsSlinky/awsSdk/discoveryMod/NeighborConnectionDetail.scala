package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeighborConnectionDetail extends js.Object {
  /**
    * The number of open network connections with the neighboring server.
    */
  var connectionsCount: Long = js.native
  /**
    * The destination network port for the connection.
    */
  var destinationPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The ID of the server that accepted the network connection.
    */
  var destinationServerId: ConfigurationId = js.native
  /**
    * The ID of the server that opened the network connection.
    */
  var sourceServerId: ConfigurationId = js.native
  /**
    * The network protocol used for the connection.
    */
  var transportProtocol: js.UndefOr[String] = js.native
}

object NeighborConnectionDetail {
  @scala.inline
  def apply(connectionsCount: Long, destinationServerId: ConfigurationId, sourceServerId: ConfigurationId): NeighborConnectionDetail = {
    val __obj = js.Dynamic.literal(connectionsCount = connectionsCount.asInstanceOf[js.Any], destinationServerId = destinationServerId.asInstanceOf[js.Any], sourceServerId = sourceServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborConnectionDetail]
  }
  @scala.inline
  implicit class NeighborConnectionDetailOps[Self <: NeighborConnectionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionsCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationServerId(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceServerId(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationPort(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportProtocol")(js.undefined)
        ret
    }
  }
  
}

