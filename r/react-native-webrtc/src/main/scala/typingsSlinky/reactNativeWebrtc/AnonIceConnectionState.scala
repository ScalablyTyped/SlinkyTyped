package typingsSlinky.reactNativeWebrtc

import typingsSlinky.reactNativeWebrtc.mod.RTCIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIceConnectionState extends js.Object {
  var iceConnectionState: RTCIceConnectionState = js.native
}

object AnonIceConnectionState {
  @scala.inline
  def apply(iceConnectionState: RTCIceConnectionState): AnonIceConnectionState = {
    val __obj = js.Dynamic.literal(iceConnectionState = iceConnectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIceConnectionState]
  }
  @scala.inline
  implicit class AnonIceConnectionStateOps[Self <: AnonIceConnectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceConnectionState(value: RTCIceConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

