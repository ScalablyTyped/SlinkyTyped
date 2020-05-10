package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionTrace extends js.Object {
  var gas: Double = js.native
  var returnValue: js.Any = js.native
  var structLogs: js.Array[StructLog] = js.native
}

object TransactionTrace {
  @scala.inline
  def apply(gas: Double, returnValue: js.Any, structLogs: js.Array[StructLog]): TransactionTrace = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], structLogs = structLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTrace]
  }
  @scala.inline
  implicit class TransactionTraceOps[Self <: TransactionTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructLogs(value: js.Array[StructLog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structLogs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

