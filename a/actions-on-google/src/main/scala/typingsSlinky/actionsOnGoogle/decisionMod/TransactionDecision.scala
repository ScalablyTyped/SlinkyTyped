package typingsSlinky.actionsOnGoogle.decisionMod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/decision", "TransactionDecision")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
  *     if using ordersv3
  * @public
  */
class TransactionDecision () extends Helper[
      actionsDotintentDotTRANSACTION_DECISION, 
      GoogleActionsV2TransactionDecisionValueSpec | GoogleActionsTransactionsV3TransactionDecisionValueSpec
    ] {
  def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
  def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
}

