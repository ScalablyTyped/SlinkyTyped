package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bull.bullStrings.completed
  - typingsSlinky.bull.bullStrings.waiting
  - typingsSlinky.bull.bullStrings.active
  - typingsSlinky.bull.bullStrings.delayed
  - typingsSlinky.bull.bullStrings.failed
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def active: typingsSlinky.bull.bullStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.bull.bullStrings.completed = this.cast("completed")
  @scala.inline
  def delayed: typingsSlinky.bull.bullStrings.delayed = this.cast("delayed")
  @scala.inline
  def failed: typingsSlinky.bull.bullStrings.failed = this.cast("failed")
  @scala.inline
  def waiting: typingsSlinky.bull.bullStrings.waiting = this.cast("waiting")
}

