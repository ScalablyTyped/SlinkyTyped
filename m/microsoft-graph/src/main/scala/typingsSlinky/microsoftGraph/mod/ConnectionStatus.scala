package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.attempted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.succeeded
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def attempted: typingsSlinky.microsoftGraph.microsoftGraphStrings.attempted = this.cast("attempted")
  @scala.inline
  def blocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def succeeded: typingsSlinky.microsoftGraph.microsoftGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

