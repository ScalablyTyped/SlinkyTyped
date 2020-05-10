package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  /**
    * Result of the operation.
    */
  var resultType: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResultResultType] = js.native
}

object GoogleActionsV2TransactionRequirementsCheckResult {
  @scala.inline
  def apply(): GoogleActionsV2TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckResult]
  }
  @scala.inline
  implicit class GoogleActionsV2TransactionRequirementsCheckResultOps[Self <: GoogleActionsV2TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultType(value: GoogleActionsV2TransactionRequirementsCheckResultResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(js.undefined)
        ret
    }
  }
  
}

