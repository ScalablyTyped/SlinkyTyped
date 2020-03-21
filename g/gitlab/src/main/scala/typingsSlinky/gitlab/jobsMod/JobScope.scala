package typingsSlinky.gitlab.jobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gitlab.gitlabStrings.created
  - typingsSlinky.gitlab.gitlabStrings.pending
  - typingsSlinky.gitlab.gitlabStrings.running
  - typingsSlinky.gitlab.gitlabStrings.failed
  - typingsSlinky.gitlab.gitlabStrings.success
  - typingsSlinky.gitlab.gitlabStrings.canceled
  - typingsSlinky.gitlab.gitlabStrings.skipped
  - typingsSlinky.gitlab.gitlabStrings.manual
*/
trait JobScope extends js.Object

object JobScope {
  @scala.inline
  def canceled: typingsSlinky.gitlab.gitlabStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsSlinky.gitlab.gitlabStrings.created = this.cast("created")
  @scala.inline
  def failed: typingsSlinky.gitlab.gitlabStrings.failed = this.cast("failed")
  @scala.inline
  def manual: typingsSlinky.gitlab.gitlabStrings.manual = this.cast("manual")
  @scala.inline
  def pending: typingsSlinky.gitlab.gitlabStrings.pending = this.cast("pending")
  @scala.inline
  def running: typingsSlinky.gitlab.gitlabStrings.running = this.cast("running")
  @scala.inline
  def skipped: typingsSlinky.gitlab.gitlabStrings.skipped = this.cast("skipped")
  @scala.inline
  def success: typingsSlinky.gitlab.gitlabStrings.success = this.cast("success")
}

