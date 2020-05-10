package typingsSlinky.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCConfiguration extends js.Object {
  var iceServers: js.Array[RTCIceServer] = js.native
  var iceTransports: js.UndefOr[String] = js.native
  var peerIdentity: js.UndefOr[String] = js.native
}

object RTCConfiguration {
  @scala.inline
  def apply(iceServers: js.Array[RTCIceServer]): RTCConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
  @scala.inline
  implicit class RTCConfigurationOps[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceServers(value: js.Array[RTCIceServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIceTransports(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransports")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(js.undefined)
        ret
    }
  }
  
}

