package typingsSlinky.actionsOnGoogle.requirementsMod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/requirements", "TransactionRequirements")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
  *     if using ordersv3
  * @public
  */
class TransactionRequirements () extends Helper[
      actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK, 
      GoogleActionsV2TransactionRequirementsCheckSpec | GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
    ] {
  def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
  def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
}

