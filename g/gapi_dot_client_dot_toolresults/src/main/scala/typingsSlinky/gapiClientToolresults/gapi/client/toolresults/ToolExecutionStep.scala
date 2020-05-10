package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolExecutionStep extends js.Object {
  /**
    * A Tool execution.
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var toolExecution: js.UndefOr[ToolExecution] = js.native
}

object ToolExecutionStep {
  @scala.inline
  def apply(): ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecutionStep]
  }
  @scala.inline
  implicit class ToolExecutionStepOps[Self <: ToolExecutionStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToolExecution(value: ToolExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(js.undefined)
        ret
    }
  }
  
}

