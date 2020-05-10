package typingsSlinky.iron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyBits extends js.Object {
  var keyBits: Double = js.native
}

object AnonKeyBits {
  @scala.inline
  def apply(keyBits: Double): AnonKeyBits = {
    val __obj = js.Dynamic.literal(keyBits = keyBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyBits]
  }
  @scala.inline
  implicit class AnonKeyBitsOps[Self <: AnonKeyBits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

