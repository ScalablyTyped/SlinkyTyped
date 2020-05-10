package typingsSlinky.reactNativeWebrtc.mod

import typingsSlinky.reactNativeWebrtc.AnonIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOnConnectionStateChange extends js.Object {
  var target: AnonIceConnectionState = js.native
}

object EventOnConnectionStateChange {
  @scala.inline
  def apply(target: AnonIceConnectionState): EventOnConnectionStateChange = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnConnectionStateChange]
  }
  @scala.inline
  implicit class EventOnConnectionStateChangeOps[Self <: EventOnConnectionStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: AnonIceConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

