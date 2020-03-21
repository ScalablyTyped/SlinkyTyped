package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment status.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def CONFIRMED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def EXPIRED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED = this.cast("EXPIRED")
  @scala.inline
  def NEW: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW = this.cast("NEW")
  @scala.inline
  def PENDING: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def RESOLVED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED = this.cast("RESOLVED")
  @scala.inline
  def UNRESOLVED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED = this.cast("UNRESOLVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

