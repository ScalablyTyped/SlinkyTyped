package typingsSlinky.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.record
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.intercept
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough
*/
trait ACTION extends js.Object

object ACTION {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intercept: typingsSlinky.pollyjsCore.pollyjsCoreStrings.intercept = this.cast("intercept")
  @scala.inline
  def passthrough: typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typingsSlinky.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay = this.cast("replay")
}

