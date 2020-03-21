package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.noncompliant_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.noncompliant_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.conflict
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.error
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inGracePeriod
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.configManager
*/
trait ComplianceState extends js.Object

object ComplianceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def configManager: typingsSlinky.microsoftGraph.microsoftGraphStrings.configManager = this.cast("configManager")
  @scala.inline
  def conflict: typingsSlinky.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typingsSlinky.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def inGracePeriod: typingsSlinky.microsoftGraph.microsoftGraphStrings.inGracePeriod = this.cast("inGracePeriod")
  @scala.inline
  def noncompliant: noncompliant_ = this.cast("noncompliant")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

