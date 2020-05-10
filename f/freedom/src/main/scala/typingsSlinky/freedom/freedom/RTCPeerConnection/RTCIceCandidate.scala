package typingsSlinky.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceCandidate extends js.Object {
  var candidate: String = js.native
  var sdpMLineIndex: js.UndefOr[Double] = js.native
  var sdpMid: js.UndefOr[String] = js.native
}

object RTCIceCandidate {
  @scala.inline
  def apply(candidate: String): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidate]
  }
  @scala.inline
  implicit class RTCIceCandidateOps[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdpMLineIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpMLineIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMLineIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(js.undefined)
        ret
    }
  }
  
}

