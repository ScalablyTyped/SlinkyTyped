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
    def withDeserialization(value: BinaryError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvariantViolation(value: VMInvariantViolationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invariantViolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution(value: typingsSlinky.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: typingsSlinky.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
    @scala.inline
    def withVerification(value: typingsSlinky.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

