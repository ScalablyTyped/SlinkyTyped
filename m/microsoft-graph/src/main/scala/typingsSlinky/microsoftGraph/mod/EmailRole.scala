package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sender
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.recipient
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EmailRole extends js.Object

object EmailRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def recipient: typingsSlinky.microsoftGraph.microsoftGraphStrings.recipient = this.cast("recipient")
  @scala.inline
  def sender: typingsSlinky.microsoftGraph.microsoftGraphStrings.sender = this.cast("sender")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

