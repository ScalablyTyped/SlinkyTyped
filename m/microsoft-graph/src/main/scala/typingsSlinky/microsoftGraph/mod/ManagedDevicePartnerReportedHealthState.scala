package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.activated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deactivated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.secured
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.lowSeverity
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumSeverity
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.highSeverity
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unresponsive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.compromised
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.misconfigured
*/
trait ManagedDevicePartnerReportedHealthState extends js.Object

object ManagedDevicePartnerReportedHealthState {
  @scala.inline
  def activated: typingsSlinky.microsoftGraph.microsoftGraphStrings.activated = this.cast("activated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compromised: typingsSlinky.microsoftGraph.microsoftGraphStrings.compromised = this.cast("compromised")
  @scala.inline
  def deactivated: typingsSlinky.microsoftGraph.microsoftGraphStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def highSeverity: typingsSlinky.microsoftGraph.microsoftGraphStrings.highSeverity = this.cast("highSeverity")
  @scala.inline
  def lowSeverity: typingsSlinky.microsoftGraph.microsoftGraphStrings.lowSeverity = this.cast("lowSeverity")
  @scala.inline
  def mediumSeverity: typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumSeverity = this.cast("mediumSeverity")
  @scala.inline
  def misconfigured: typingsSlinky.microsoftGraph.microsoftGraphStrings.misconfigured = this.cast("misconfigured")
  @scala.inline
  def secured: typingsSlinky.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typingsSlinky.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

