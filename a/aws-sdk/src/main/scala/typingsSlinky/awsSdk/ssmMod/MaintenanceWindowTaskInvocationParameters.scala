package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type.
    */
  var Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.native
  /**
    * The parameters for a LAMBDA task type.
    */
  var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.native
  /**
    * The parameters for a RUN_COMMAND task type.
    */
  var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.native
  /**
    * The parameters for a STEP_FUNCTIONS task type.
    */
  var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.native
}

object MaintenanceWindowTaskInvocationParameters {
  @scala.inline
  def apply(): MaintenanceWindowTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskInvocationParametersOps[Self <: MaintenanceWindowTaskInvocationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomation(value: MaintenanceWindowAutomationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automation")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: MaintenanceWindowLambdaParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withRunCommand(value: MaintenanceWindowRunCommandParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withStepFunctions(value: MaintenanceWindowStepFunctionsParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepFunctions")(js.undefined)
        ret
    }
  }
  
}

