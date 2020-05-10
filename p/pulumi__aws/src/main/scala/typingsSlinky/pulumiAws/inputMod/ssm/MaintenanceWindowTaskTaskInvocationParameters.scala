package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type. Documented below.
    */
  var automationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]] = js.native
  /**
    * The parameters for a LAMBDA task type. Documented below.
    */
  var lambdaParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]] = js.native
  /**
    * The parameters for a RUN_COMMAND task type. Documented below.
    */
  var runCommandParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]] = js.native
  /**
    * The parameters for a STEP_FUNCTIONS task type. Documented below.
    */
  var stepFunctionsParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParameters {
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRunCommandParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCommandParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunCommandParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCommandParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStepFunctionsParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepFunctionsParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepFunctionsParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepFunctionsParameters")(js.undefined)
        ret
    }
  }
  
}

