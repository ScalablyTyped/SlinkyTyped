package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.truePositive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.falsePositive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.benignPositive
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertFeedback extends js.Object

object AlertFeedback {
  @scala.inline
  def benignPositive: typingsSlinky.microsoftGraph.microsoftGraphStrings.benignPositive = this.cast("benignPositive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falsePositive: typingsSlinky.microsoftGraph.microsoftGraphStrings.falsePositive = this.cast("falsePositive")
  @scala.inline
  def truePositive: typingsSlinky.microsoftGraph.microsoftGraphStrings.truePositive = this.cast("truePositive")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

