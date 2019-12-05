package typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus

import typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.AsObject
  ] = js.undefined
  var assertionFailure: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.AssertionFailure.AsObject
  ] = js.undefined
  var referenceError: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.AsObject
  ] = js.undefined
  var runtimeStatus: RuntimeStatus
}

object AsObject {
  @scala.inline
  def apply(
    runtimeStatus: RuntimeStatus,
    arithmeticError: typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.AsObject = null,
    assertionFailure: typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.AssertionFailure.AsObject = null,
    referenceError: typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
    if (arithmeticError != null) __obj.updateDynamic("arithmeticError")(arithmeticError.asInstanceOf[js.Any])
    if (assertionFailure != null) __obj.updateDynamic("assertionFailure")(assertionFailure.asInstanceOf[js.Any])
    if (referenceError != null) __obj.updateDynamic("referenceError")(referenceError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

