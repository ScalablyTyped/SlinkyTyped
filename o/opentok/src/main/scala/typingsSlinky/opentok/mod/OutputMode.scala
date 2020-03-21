package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.opentokStrings.composed
  - typingsSlinky.opentok.opentokStrings.individual
*/
trait OutputMode extends js.Object

object OutputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typingsSlinky.opentok.opentokStrings.composed = this.cast("composed")
  @scala.inline
  def individual: typingsSlinky.opentok.opentokStrings.individual = this.cast("individual")
}

