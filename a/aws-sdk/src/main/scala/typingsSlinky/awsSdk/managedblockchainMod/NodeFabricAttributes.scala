package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeFabricAttributes extends js.Object {
  /**
    * The endpoint that identifies the peer node for all services except peer channel-based event services.
    */
  var PeerEndpoint: js.UndefOr[String] = js.native
  /**
    * The endpoint that identifies the peer node for peer channel-based event services.
    */
  var PeerEventEndpoint: js.UndefOr[String] = js.native
}

object NodeFabricAttributes {
  @scala.inline
  def apply(): NodeFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFabricAttributes]
  }
  @scala.inline
  implicit class NodeFabricAttributesOps[Self <: NodeFabricAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeerEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerEventEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerEventEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerEventEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerEventEndpoint")(js.undefined)
        ret
    }
  }
  
}

