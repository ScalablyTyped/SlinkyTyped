package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.nonCompliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.error
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.conflict
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notAssigned
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def conflict: typingsSlinky.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typingsSlinky.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def nonCompliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.nonCompliant = this.cast("nonCompliant")
  @scala.inline
  def notApplicable: typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notAssigned: typingsSlinky.microsoftGraph.microsoftGraphStrings.notAssigned = this.cast("notAssigned")
  @scala.inline
  def remediated: typingsSlinky.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

