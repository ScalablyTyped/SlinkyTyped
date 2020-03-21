package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeUpgrade
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.other
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notCompliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notEnrolled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownLocation
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.mfaRequired
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.compromisedPassword
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp
*/
trait DeviceManagementExchangeAccessStateReason extends js.Object

object DeviceManagementExchangeAccessStateReason {
  @scala.inline
  def azureADBlockDueToAccessPolicy: typingsSlinky.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy = this.cast("azureADBlockDueToAccessPolicy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def compromisedPassword: typingsSlinky.microsoftGraph.microsoftGraphStrings.compromisedPassword = this.cast("compromisedPassword")
  @scala.inline
  def deviceNotKnownWithManagedApp: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp = this.cast("deviceNotKnownWithManagedApp")
  @scala.inline
  def exchangeDeviceRule: typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule = this.cast("exchangeDeviceRule")
  @scala.inline
  def exchangeGlobalRule: typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule = this.cast("exchangeGlobalRule")
  @scala.inline
  def exchangeIndividualRule: typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule = this.cast("exchangeIndividualRule")
  @scala.inline
  def exchangeMailboxPolicy: typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy = this.cast("exchangeMailboxPolicy")
  @scala.inline
  def exchangeUpgrade: typingsSlinky.microsoftGraph.microsoftGraphStrings.exchangeUpgrade = this.cast("exchangeUpgrade")
  @scala.inline
  def mfaRequired: typingsSlinky.microsoftGraph.microsoftGraphStrings.mfaRequired = this.cast("mfaRequired")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notCompliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.notCompliant = this.cast("notCompliant")
  @scala.inline
  def notEnrolled: typingsSlinky.microsoftGraph.microsoftGraphStrings.notEnrolled = this.cast("notEnrolled")
  @scala.inline
  def other: typingsSlinky.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownLocation: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownLocation = this.cast("unknownLocation")
}

