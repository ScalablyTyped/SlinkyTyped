package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.auth0.auth0Strings.pending
  - typingsSlinky.auth0.auth0Strings.processing
  - typingsSlinky.auth0.auth0Strings.completed
  - typingsSlinky.auth0.auth0Strings.failed
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.auth0.auth0Strings.completed = this.cast("completed")
  @scala.inline
  def failed: typingsSlinky.auth0.auth0Strings.failed = this.cast("failed")
  @scala.inline
  def pending: typingsSlinky.auth0.auth0Strings.pending = this.cast("pending")
  @scala.inline
  def processing: typingsSlinky.auth0.auth0Strings.processing = this.cast("processing")
}

