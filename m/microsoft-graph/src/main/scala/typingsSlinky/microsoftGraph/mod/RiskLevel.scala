package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.low
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.medium
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.high
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.hidden
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskLevel extends js.Object

object RiskLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsSlinky.microsoftGraph.microsoftGraphStrings.hidden = this.cast("hidden")
  @scala.inline
  def high: typingsSlinky.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

