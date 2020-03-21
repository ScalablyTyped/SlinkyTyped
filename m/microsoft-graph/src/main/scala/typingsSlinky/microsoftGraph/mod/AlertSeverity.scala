package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.informational
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.low
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.medium
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.high
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertSeverity extends js.Object

object AlertSeverity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def informational: typingsSlinky.microsoftGraph.microsoftGraphStrings.informational = this.cast("informational")
  @scala.inline
  def low: typingsSlinky.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

