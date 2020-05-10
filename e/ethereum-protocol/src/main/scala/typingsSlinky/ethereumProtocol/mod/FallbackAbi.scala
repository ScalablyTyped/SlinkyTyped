package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.ethereumProtocol.mod.AbiType.Fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FallbackAbi extends FunctionAbi {
  var payable: Boolean = js.native
  var `type`: Fallback = js.native
}

object FallbackAbi {
  @scala.inline
  def apply(payable: Boolean, `type`: Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackAbi]
  }
  @scala.inline
  implicit class FallbackAbiOps[Self <: FallbackAbi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Fallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

