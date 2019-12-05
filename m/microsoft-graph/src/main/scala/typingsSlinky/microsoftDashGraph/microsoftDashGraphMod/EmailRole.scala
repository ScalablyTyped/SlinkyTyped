package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sender
  - typings.microsoftDashGraph.microsoftDashGraphStrings.recipient
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait EmailRole extends js.Object

object EmailRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def recipient: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.recipient = this.cast("recipient")
  @scala.inline
  def sender: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.sender = this.cast("sender")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

