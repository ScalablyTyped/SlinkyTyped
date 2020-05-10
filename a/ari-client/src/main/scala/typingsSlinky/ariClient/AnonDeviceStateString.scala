package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeviceStateString extends js.Object {
  var deviceState: String = js.native
}

object AnonDeviceStateString {
  @scala.inline
  def apply(deviceState: String): AnonDeviceStateString = {
    val __obj = js.Dynamic.literal(deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceStateString]
  }
  @scala.inline
  implicit class AnonDeviceStateStringOps[Self <: AnonDeviceStateString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

