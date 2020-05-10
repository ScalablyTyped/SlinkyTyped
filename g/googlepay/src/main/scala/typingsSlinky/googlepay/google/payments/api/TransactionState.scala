package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum strings for the state of the transaction.
  *
  * Options:
  *
  * - `SUCCESS`:
  *   Indicates the transaction was successful and the payment sheet should
  *   be dismissed.
  *
  * - `ERROR`:
  *   Indicates there's an error in the flow.
  *
  *   The Google Pay UI will show the merchant error message and allow user
  *   to retry.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.SUCCESS
  - typingsSlinky.googlepay.googlepayStrings.ERROR
*/
trait TransactionState extends js.Object

object TransactionState {
  @scala.inline
  def ERROR: typingsSlinky.googlepay.googlepayStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.ERROR]
  @scala.inline
  def SUCCESS: typingsSlinky.googlepay.googlepayStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.SUCCESS]
}

