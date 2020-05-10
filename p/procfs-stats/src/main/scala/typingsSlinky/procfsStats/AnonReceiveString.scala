package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReceiveString extends js.Object {
  var Receive: String = js.native
}

object AnonReceiveString {
  @scala.inline
  def apply(Receive: String): AnonReceiveString = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReceiveString]
  }
  @scala.inline
  implicit class AnonReceiveStringOps[Self <: AnonReceiveString] (val x: Self) extends AnyVal {
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
  }
  
}

