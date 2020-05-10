package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReceive extends js.Object {
  var Receive: String = js.native
  var Transmit: String = js.native
}

object AnonReceive {
  @scala.inline
  def apply(Receive: String, Transmit: String): AnonReceive = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any], Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReceive]
  }
  @scala.inline
  implicit class AnonReceiveOps[Self <: AnonReceive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transmit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

