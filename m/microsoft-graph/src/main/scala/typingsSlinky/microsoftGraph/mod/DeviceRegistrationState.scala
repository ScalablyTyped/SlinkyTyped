package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notRegistered
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.registered
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.revoked
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.keyConflict
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.approvalPending
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.certificateReset
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait DeviceRegistrationState extends js.Object

object DeviceRegistrationState {
  @scala.inline
  def approvalPending: typingsSlinky.microsoftGraph.microsoftGraphStrings.approvalPending = this.cast("approvalPending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateReset: typingsSlinky.microsoftGraph.microsoftGraphStrings.certificateReset = this.cast("certificateReset")
  @scala.inline
  def keyConflict: typingsSlinky.microsoftGraph.microsoftGraphStrings.keyConflict = this.cast("keyConflict")
  @scala.inline
  def notRegistered: typingsSlinky.microsoftGraph.microsoftGraphStrings.notRegistered = this.cast("notRegistered")
  @scala.inline
  def notRegisteredPendingEnrollment: typingsSlinky.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment = this.cast("notRegisteredPendingEnrollment")
  @scala.inline
  def registered: typingsSlinky.microsoftGraph.microsoftGraphStrings.registered = this.cast("registered")
  @scala.inline
  def revoked: typingsSlinky.microsoftGraph.microsoftGraphStrings.revoked = this.cast("revoked")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

