package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHex extends js.Object {
  var hex: String = js.native
}

object AnonHex {
  @scala.inline
  def apply(hex: String): AnonHex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHex]
  }
  @scala.inline
  implicit class AnonHexOps[Self <: AnonHex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

