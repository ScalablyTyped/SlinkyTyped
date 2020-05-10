package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.pending
  - typingsSlinky.coinbase.coinbaseStrings.completed
  - typingsSlinky.coinbase.coinbaseStrings.failed
  - typingsSlinky.coinbase.coinbaseStrings.expired
  - typingsSlinky.coinbase.coinbaseStrings.canceled
  - typingsSlinky.coinbase.coinbaseStrings.waiting_for_signature
  - typingsSlinky.coinbase.coinbaseStrings.waiting_for_clearing
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def canceled: typingsSlinky.coinbase.coinbaseStrings.canceled = "canceled".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.canceled]
  @scala.inline
  def completed: typingsSlinky.coinbase.coinbaseStrings.completed = "completed".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.completed]
  @scala.inline
  def expired: typingsSlinky.coinbase.coinbaseStrings.expired = "expired".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.expired]
  @scala.inline
  def failed: typingsSlinky.coinbase.coinbaseStrings.failed = "failed".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.failed]
  @scala.inline
  def pending: typingsSlinky.coinbase.coinbaseStrings.pending = "pending".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.pending]
  @scala.inline
  def waiting_for_clearing: typingsSlinky.coinbase.coinbaseStrings.waiting_for_clearing = "waiting_for_clearing".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.waiting_for_clearing]
  @scala.inline
  def waiting_for_signature: typingsSlinky.coinbase.coinbaseStrings.waiting_for_signature = "waiting_for_signature".asInstanceOf[typingsSlinky.coinbase.coinbaseStrings.waiting_for_signature]
}

