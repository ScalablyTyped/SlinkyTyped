package typingsSlinky.libraCore.vmErrorsPbMod.ExecutionStatus

import typingsSlinky.libraCore.vmErrorsPbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.AsObject] = js.native
  var assertionFailure: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.AssertionFailure.AsObject] = js.native
  var referenceError: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject] = js.native
  var runtimeStatus: RuntimeStatus = js.native
}

object AsObject {
  @scala.inline
  def apply(runtimeStatus: RuntimeStatus): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntimeStatus(value: RuntimeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArithmeticError(value: typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arithmeticError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArithmeticError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arithmeticError")(js.undefined)
        ret
    }
    @scala.inline
    def withAssertionFailure(value: typingsSlinky.libraCore.vmErrorsPbMod.AssertionFailure.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertionFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssertionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceError(value: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceError")(js.undefined)
        ret
    }
  }
  
}

