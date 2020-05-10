package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransmit extends js.Object {
  var Transmit: String = js.native
}

object AnonTransmit {
  @scala.inline
  def apply(Transmit: String): AnonTransmit = {
    val __obj = js.Dynamic.literal(Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransmit]
  }
  @scala.inline
  implicit class AnonTransmitOps[Self <: AnonTransmit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransmit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transmit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

