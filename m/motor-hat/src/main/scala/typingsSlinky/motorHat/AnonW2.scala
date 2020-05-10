package typingsSlinky.motorHat

import typingsSlinky.motorHat.mod.Motor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonW2 extends js.Object {
  var W1: Motor = js.native
  var W2: Motor = js.native
}

object AnonW2 {
  @scala.inline
  def apply(W1: Motor, W2: Motor): AnonW2 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonW2]
  }
  @scala.inline
  implicit class AnonW2Ops[Self <: AnonW2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withW1(value: Motor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW2(value: Motor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

