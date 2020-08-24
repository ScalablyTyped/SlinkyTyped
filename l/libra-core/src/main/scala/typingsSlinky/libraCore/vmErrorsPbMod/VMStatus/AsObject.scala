package typingsSlinky.libraCore.vmErrorsPbMod.VMStatus

import typingsSlinky.libraCore.vmErrorsPbMod.BinaryError
import typingsSlinky.libraCore.vmErrorsPbMod.VMInvariantViolationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var deserialization: BinaryError = js.native
  var execution: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject] = js.native
  var invariantViolation: VMInvariantViolationError = js.native
  var validation: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject] = js.native
  var verification: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(deserialization: BinaryError, invariantViolation: VMInvariantViolationError): AsObject = {
    val __obj = js.Dynamic.literal(deserialization = deserialization.asInstanceOf[js.Any], invariantViolation = invariantViolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeserialization(value: BinaryError): Self = this.set("deserialization", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvariantViolation(value: VMInvariantViolationError): Self = this.set("invariantViolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution(value: typingsSlinky.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject): Self = this.set("execution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution: Self = this.set("execution", js.undefined)
    @scala.inline
    def setValidation(value: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
    @scala.inline
    def setVerification(value: typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject): Self = this.set("verification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
  
}

