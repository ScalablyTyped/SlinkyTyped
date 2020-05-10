package typingsSlinky.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IceCandidate extends js.Object {
  var candidate: String = js.native
  var sdpMLineIndex: Double = js.native
  var sdpMid: String = js.native
}

object IceCandidate {
  @scala.inline
  def apply(candidate: String, sdpMLineIndex: Double, sdpMid: String): IceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], sdpMLineIndex = sdpMLineIndex.asInstanceOf[js.Any], sdpMid = sdpMid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidate]
  }
  @scala.inline
  implicit class IceCandidateOps[Self <: IceCandidate] (val x: Self) extends AnyVal {
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
    def withSdpMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpMid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

