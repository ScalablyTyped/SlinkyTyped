package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppDiagnosticStatus extends js.Object {
  // Instruction on how to mitigate a failed validation
  var mitigationInstruction: js.UndefOr[String] = js.native
  // The state of the operation
  var state: js.UndefOr[String] = js.native
  // The validation friendly name
  var validationName: js.UndefOr[String] = js.native
}

object ManagedAppDiagnosticStatus {
  @scala.inline
  def apply(): ManagedAppDiagnosticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppDiagnosticStatus]
  }
  @scala.inline
  implicit class ManagedAppDiagnosticStatusOps[Self <: ManagedAppDiagnosticStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMitigationInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mitigationInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMitigationInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mitigationInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationName")(js.undefined)
        ret
    }
  }
  
}

