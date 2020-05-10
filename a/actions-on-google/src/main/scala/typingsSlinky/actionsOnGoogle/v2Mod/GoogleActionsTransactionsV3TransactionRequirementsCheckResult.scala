package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  /**
    * Result type for transaction requirements check.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType] = js.native
}

object GoogleActionsTransactionsV3TransactionRequirementsCheckResult {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionRequirementsCheckResultOps[Self <: GoogleActionsTransactionsV3TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultType(value: GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType): Self = {
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

