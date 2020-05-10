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
  def completed: typingsSlinky.auth0.auth0Strings.completed = "completed".asInstanceOf[typingsSlinky.auth0.auth0Strings.completed]
  @scala.inline
  def failed: typingsSlinky.auth0.auth0Strings.failed = "failed".asInstanceOf[typingsSlinky.auth0.auth0Strings.failed]
  @scala.inline
  def pending: typingsSlinky.auth0.auth0Strings.pending = "pending".asInstanceOf[typingsSlinky.auth0.auth0Strings.pending]
  @scala.inline
  def processing: typingsSlinky.auth0.auth0Strings.processing = "processing".asInstanceOf[typingsSlinky.auth0.auth0Strings.processing]
}

