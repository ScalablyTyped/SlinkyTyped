package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAutomationExecutionRequest extends js.Object {
  /**
    * The execution ID of the Automation to stop.
    */
  var AutomationExecutionId: typingsSlinky.awsSdk.ssmMod.AutomationExecutionId = js.native
  /**
    * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
    */
  var Type: js.UndefOr[StopType] = js.native
}

object StopAutomationExecutionRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId): StopAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutomationExecutionRequest]
  }
  @scala.inline
  implicit class StopAutomationExecutionRequestOps[Self <: StopAutomationExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationExecutionId(value: AutomationExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: StopType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

