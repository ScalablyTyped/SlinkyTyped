package typingsSlinky.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPollyjsCore.atPollyjsCoreStrings.record
  - typings.atPollyjsCore.atPollyjsCoreStrings.replay
  - typings.atPollyjsCore.atPollyjsCoreStrings.passthrough
  - typings.atPollyjsCore.atPollyjsCoreStrings.stopped
*/
trait MODE extends js.Object

object MODE {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def passthrough: typingsSlinky.atPollyjsCore.atPollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typingsSlinky.atPollyjsCore.atPollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typingsSlinky.atPollyjsCore.atPollyjsCoreStrings.replay = this.cast("replay")
  @scala.inline
  def stopped: typingsSlinky.atPollyjsCore.atPollyjsCoreStrings.stopped = this.cast("stopped")
}

