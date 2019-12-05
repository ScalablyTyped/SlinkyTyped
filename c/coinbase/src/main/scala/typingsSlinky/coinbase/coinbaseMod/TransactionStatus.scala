package typingsSlinky.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.pending
  - typings.coinbase.coinbaseStrings.completed
  - typings.coinbase.coinbaseStrings.failed
  - typings.coinbase.coinbaseStrings.expired
  - typings.coinbase.coinbaseStrings.canceled
  - typings.coinbase.coinbaseStrings.waiting_for_signature
  - typings.coinbase.coinbaseStrings.waiting_for_clearing
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def canceled: typingsSlinky.coinbase.coinbaseStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.coinbase.coinbaseStrings.completed = this.cast("completed")
  @scala.inline
  def expired: typingsSlinky.coinbase.coinbaseStrings.expired = this.cast("expired")
  @scala.inline
  def failed: typingsSlinky.coinbase.coinbaseStrings.failed = this.cast("failed")
  @scala.inline
  def pending: typingsSlinky.coinbase.coinbaseStrings.pending = this.cast("pending")
  @scala.inline
  def waiting_for_clearing: typingsSlinky.coinbase.coinbaseStrings.waiting_for_clearing = this.cast("waiting_for_clearing")
  @scala.inline
  def waiting_for_signature: typingsSlinky.coinbase.coinbaseStrings.waiting_for_signature = this.cast("waiting_for_signature")
}

