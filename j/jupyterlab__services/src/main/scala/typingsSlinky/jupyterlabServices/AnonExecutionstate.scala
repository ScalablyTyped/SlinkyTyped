package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExecutionstate extends js.Object {
  var execution_state: Status = js.native
}

object AnonExecutionstate {
  @scala.inline
  def apply(execution_state: Status): AnonExecutionstate = {
    val __obj = js.Dynamic.literal(execution_state = execution_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecutionstate]
  }
  @scala.inline
  implicit class AnonExecutionstateOps[Self <: AnonExecutionstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution_state(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

