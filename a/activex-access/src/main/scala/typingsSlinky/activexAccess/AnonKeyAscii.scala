package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyAscii extends js.Object {
  var KeyAscii: Double = js.native
}

object AnonKeyAscii {
  @scala.inline
  def apply(KeyAscii: Double): AnonKeyAscii = {
    val __obj = js.Dynamic.literal(KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyAscii]
  }
  @scala.inline
  implicit class AnonKeyAsciiOps[Self <: AnonKeyAscii] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyAscii(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyAscii")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

