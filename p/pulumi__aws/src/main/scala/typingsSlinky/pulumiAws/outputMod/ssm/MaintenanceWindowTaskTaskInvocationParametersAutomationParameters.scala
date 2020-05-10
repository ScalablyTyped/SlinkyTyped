package typingsSlinky.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends js.Object {
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[String] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  ] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

