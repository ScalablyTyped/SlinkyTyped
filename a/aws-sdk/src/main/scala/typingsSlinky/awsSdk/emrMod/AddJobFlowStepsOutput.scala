package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddJobFlowStepsOutput extends js.Object {
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.native
}

object AddJobFlowStepsOutput {
  @scala.inline
  def apply(): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
  @scala.inline
  implicit class AddJobFlowStepsOutputOps[Self <: AddJobFlowStepsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStepIds(value: StepIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepIds")(js.undefined)
        ret
    }
  }
  
}

