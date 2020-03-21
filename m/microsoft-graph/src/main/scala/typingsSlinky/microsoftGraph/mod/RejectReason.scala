package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.busy
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.forbidden
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RejectReason extends js.Object

object RejectReason {
  @scala.inline
  def busy: typingsSlinky.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typingsSlinky.microsoftGraph.microsoftGraphStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

