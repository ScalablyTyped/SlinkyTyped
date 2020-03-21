package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.authentication
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.authorization
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.accountValidation
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userValidation
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceNotSupported
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inMaintenance
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.badRequest
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.featureNotSupported
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.clientDisconnected
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userAbandonment
*/
trait DeviceEnrollmentFailureReason extends js.Object

object DeviceEnrollmentFailureReason {
  @scala.inline
  def accountValidation: typingsSlinky.microsoftGraph.microsoftGraphStrings.accountValidation = this.cast("accountValidation")
  @scala.inline
  def authentication: typingsSlinky.microsoftGraph.microsoftGraphStrings.authentication = this.cast("authentication")
  @scala.inline
  def authorization: typingsSlinky.microsoftGraph.microsoftGraphStrings.authorization = this.cast("authorization")
  @scala.inline
  def badRequest: typingsSlinky.microsoftGraph.microsoftGraphStrings.badRequest = this.cast("badRequest")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clientDisconnected: typingsSlinky.microsoftGraph.microsoftGraphStrings.clientDisconnected = this.cast("clientDisconnected")
  @scala.inline
  def deviceNotSupported: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceNotSupported = this.cast("deviceNotSupported")
  @scala.inline
  def enrollmentRestrictionsEnforced: typingsSlinky.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced = this.cast("enrollmentRestrictionsEnforced")
  @scala.inline
  def featureNotSupported: typingsSlinky.microsoftGraph.microsoftGraphStrings.featureNotSupported = this.cast("featureNotSupported")
  @scala.inline
  def inMaintenance: typingsSlinky.microsoftGraph.microsoftGraphStrings.inMaintenance = this.cast("inMaintenance")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def userAbandonment: typingsSlinky.microsoftGraph.microsoftGraphStrings.userAbandonment = this.cast("userAbandonment")
  @scala.inline
  def userValidation: typingsSlinky.microsoftGraph.microsoftGraphStrings.userValidation = this.cast("userValidation")
}

