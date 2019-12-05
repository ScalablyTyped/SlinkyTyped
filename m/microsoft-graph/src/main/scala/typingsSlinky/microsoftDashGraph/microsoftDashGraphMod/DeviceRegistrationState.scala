package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notRegistered
  - typings.microsoftDashGraph.microsoftDashGraphStrings.registered
  - typings.microsoftDashGraph.microsoftDashGraphStrings.revoked
  - typings.microsoftDashGraph.microsoftDashGraphStrings.keyConflict
  - typings.microsoftDashGraph.microsoftDashGraphStrings.approvalPending
  - typings.microsoftDashGraph.microsoftDashGraphStrings.certificateReset
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notRegisteredPendingEnrollment
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
*/
trait DeviceRegistrationState extends js.Object

object DeviceRegistrationState {
  @scala.inline
  def approvalPending: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.approvalPending = this.cast("approvalPending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateReset: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.certificateReset = this.cast("certificateReset")
  @scala.inline
  def keyConflict: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.keyConflict = this.cast("keyConflict")
  @scala.inline
  def notRegistered: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.notRegistered = this.cast("notRegistered")
  @scala.inline
  def notRegisteredPendingEnrollment: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.notRegisteredPendingEnrollment = this.cast("notRegisteredPendingEnrollment")
  @scala.inline
  def registered: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.registered = this.cast("registered")
  @scala.inline
  def revoked: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.revoked = this.cast("revoked")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

