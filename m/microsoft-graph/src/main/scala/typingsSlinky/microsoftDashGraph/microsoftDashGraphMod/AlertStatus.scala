package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.newAlert
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inProgress
  - typings.microsoftDashGraph.microsoftDashGraphStrings.resolved
  - typings.microsoftDashGraph.microsoftDashGraphStrings.dismissed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait AlertStatus extends js.Object

object AlertStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dismissed: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def inProgress: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def newAlert: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.newAlert = this.cast("newAlert")
  @scala.inline
  def resolved: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.resolved = this.cast("resolved")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

