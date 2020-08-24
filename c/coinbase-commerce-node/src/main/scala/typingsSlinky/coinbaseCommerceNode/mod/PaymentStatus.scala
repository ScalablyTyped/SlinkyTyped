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
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED]
  @scala.inline
  def COMPLETED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.COMPLETED]
  @scala.inline
  def EXPIRED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED]
  @scala.inline
  def NEW: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW = "NEW".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW]
  @scala.inline
  def PENDING: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING]
  @scala.inline
  def RESOLVED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED = "RESOLVED".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED]
  @scala.inline
  def UNRESOLVED: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED = "UNRESOLVED".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED]
}

