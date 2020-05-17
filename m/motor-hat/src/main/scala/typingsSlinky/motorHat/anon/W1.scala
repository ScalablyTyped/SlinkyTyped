package typingsSlinky.motorHat.anon

import typingsSlinky.motorHat.mod.PinDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W1 extends js.Object {
  /**
    * Pin definition for winding 1 of the stepper
    */
  var W1: PinDefinition = js.native
  /**
    * Pin definition for winding 2 of the stepper
    */
  var W2: PinDefinition = js.native
}

object W1 {
  @scala.inline
  def apply(W1: PinDefinition, W2: PinDefinition): W1 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[W1]
  }
  @scala.inline
  implicit class W1Ops[Self <: W1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withW1(value: PinDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW2(value: PinDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

