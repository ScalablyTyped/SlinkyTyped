package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.opentokStrings.relayed
  - typingsSlinky.opentok.opentokStrings.routed
*/
trait MediaMode extends js.Object

object MediaMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relayed: typingsSlinky.opentok.opentokStrings.relayed = this.cast("relayed")
  @scala.inline
  def routed: typingsSlinky.opentok.opentokStrings.routed = this.cast("routed")
}

