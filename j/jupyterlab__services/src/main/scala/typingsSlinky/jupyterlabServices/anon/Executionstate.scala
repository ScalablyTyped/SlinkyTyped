package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executionstate extends js.Object {
  var execution_state: Status
}

object Executionstate {
  @scala.inline
  def apply(execution_state: Status): Executionstate = {
    val __obj = js.Dynamic.literal(execution_state = execution_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executionstate]
  }
}

