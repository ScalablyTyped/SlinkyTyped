package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTIONS task.
    */
  var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.native
  /**
    * The name of the STEP_FUNCTIONS task.
    */
  var Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.native
}

object MaintenanceWindowStepFunctionsParameters {
  @scala.inline
  def apply(): MaintenanceWindowStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowStepFunctionsParametersOps[Self <: MaintenanceWindowStepFunctionsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: MaintenanceWindowStepFunctionsInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MaintenanceWindowStepFunctionsName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

