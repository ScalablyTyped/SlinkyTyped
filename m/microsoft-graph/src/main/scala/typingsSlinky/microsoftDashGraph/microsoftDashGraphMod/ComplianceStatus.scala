package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notApplicable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remediated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.nonCompliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.error
  - typings.microsoftDashGraph.microsoftDashGraphStrings.conflict
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notAssigned
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def conflict: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.error = this.cast("error")
  @scala.inline
  def nonCompliant: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.nonCompliant = this.cast("nonCompliant")
  @scala.inline
  def notApplicable: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notAssigned: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.notAssigned = this.cast("notAssigned")
  @scala.inline
  def remediated: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

