package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerStatusChange extends Event {
  /* Properties */
  var endpoint: Endpoint = js.native
  var peer: Peer = js.native
}

object PeerStatusChange {
  @scala.inline
  def apply(application: String, endpoint: Endpoint, peer: Peer, timestamp: js.Date, `type`: String): PeerStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStatusChange]
  }
  @scala.inline
  implicit class PeerStatusChangeOps[Self <: PeerStatusChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeer(value: Peer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

