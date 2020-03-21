package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.pending
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.active
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.warning
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deleted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.lockedOut
*/
trait DeviceManagementSubscriptionState extends js.Object

object DeviceManagementSubscriptionState {
  @scala.inline
  def active: typingsSlinky.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def blocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typingsSlinky.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def disabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def lockedOut: typingsSlinky.microsoftGraph.microsoftGraphStrings.lockedOut = this.cast("lockedOut")
  @scala.inline
  def pending: typingsSlinky.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
  @scala.inline
  def warning: typingsSlinky.microsoftGraph.microsoftGraphStrings.warning = this.cast("warning")
}

