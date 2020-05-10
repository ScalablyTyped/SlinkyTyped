package typingsSlinky.iotaLibJs

import typingsSlinky.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInputsArray extends js.Object {
  var inputs: js.Array[TransactionObject] = js.native
}

object AnonInputsArray {
  @scala.inline
  def apply(inputs: js.Array[TransactionObject]): AnonInputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputsArray]
  }
  @scala.inline
  implicit class AnonInputsArrayOps[Self <: AnonInputsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[TransactionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

