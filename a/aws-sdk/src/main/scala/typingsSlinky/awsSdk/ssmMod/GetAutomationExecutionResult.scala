package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutomationExecutionResult extends js.Object {
  /**
    * Detailed information about the current state of an automation execution.
    */
  var AutomationExecution: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecution] = js.native
}

object GetAutomationExecutionResult {
  @scala.inline
  def apply(): GetAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutomationExecutionResult]
  }
  @scala.inline
  implicit class GetAutomationExecutionResultOps[Self <: GetAutomationExecutionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationExecution(value: AutomationExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecution")(js.undefined)
        ret
    }
  }
  
}

