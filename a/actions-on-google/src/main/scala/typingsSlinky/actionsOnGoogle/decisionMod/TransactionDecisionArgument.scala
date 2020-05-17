package typingsSlinky.actionsOnGoogle.decisionMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
*/
trait TransactionDecisionArgument extends js.Object

object TransactionDecisionArgument {
  @scala.inline
  implicit def apply(value: GoogleActionsTransactionsV3TransactionDecisionValue): TransactionDecisionArgument = value.asInstanceOf[TransactionDecisionArgument]
  @scala.inline
  implicit def apply(value: GoogleActionsV2TransactionDecisionValue): TransactionDecisionArgument = value.asInstanceOf[TransactionDecisionArgument]
}

