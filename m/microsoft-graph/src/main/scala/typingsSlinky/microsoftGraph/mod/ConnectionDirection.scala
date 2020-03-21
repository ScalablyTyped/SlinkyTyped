package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inbound
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.outbound
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConnectionDirection extends js.Object

object ConnectionDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound: typingsSlinky.microsoftGraph.microsoftGraphStrings.inbound = this.cast("inbound")
  @scala.inline
  def outbound: typingsSlinky.microsoftGraph.microsoftGraphStrings.outbound = this.cast("outbound")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

