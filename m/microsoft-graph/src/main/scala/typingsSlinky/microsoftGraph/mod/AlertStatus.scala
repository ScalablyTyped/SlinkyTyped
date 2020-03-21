package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.newAlert
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.resolved
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertStatus extends js.Object

object AlertStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dismissed: typingsSlinky.microsoftGraph.microsoftGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def inProgress: typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def newAlert: typingsSlinky.microsoftGraph.microsoftGraphStrings.newAlert = this.cast("newAlert")
  @scala.inline
  def resolved: typingsSlinky.microsoftGraph.microsoftGraphStrings.resolved = this.cast("resolved")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

