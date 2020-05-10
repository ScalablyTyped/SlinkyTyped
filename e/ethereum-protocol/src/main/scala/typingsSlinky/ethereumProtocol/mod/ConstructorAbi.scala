package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.ethereumProtocol.mod.AbiType.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorAbi extends FunctionAbi {
  var inputs: js.Array[DataItem] = js.native
  var payable: Boolean = js.native
  var stateMutability: ConstructorStateMutability = js.native
  var `type`: Constructor = js.native
}

object ConstructorAbi {
  @scala.inline
  def apply(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorAbi]
  }
  @scala.inline
  implicit class ConstructorAbiOps[Self <: ConstructorAbi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[DataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMutability(value: ConstructorStateMutability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMutability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Constructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

