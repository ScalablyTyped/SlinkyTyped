package typingsSlinky.iotaLibJs.anon

import typingsSlinky.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inputs extends js.Object {
  var inputs: js.Array[InputObject] = js.native
}

object Inputs {
  @scala.inline
  def apply(inputs: js.Array[InputObject]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  @scala.inline
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[InputObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

