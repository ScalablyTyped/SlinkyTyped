package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/decision", JSImport.Namespace)
@js.native
object decisionMod extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
  */
  trait TransactionDecisionArgument extends js.Object
  
}

