package typingsSlinky.flightplan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExec extends js.Object {
  var exec: js.Any = js.native
}

object AnonExec {
  @scala.inline
  def apply(exec: js.Any): AnonExec = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExec]
  }
  @scala.inline
  implicit class AnonExecOps[Self <: AnonExec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

