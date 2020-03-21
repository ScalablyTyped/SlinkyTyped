package typingsSlinky.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.strict
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.standard
  - typingsSlinky.eventTargetShim.eventTargetShimStrings.loose
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loose: typingsSlinky.eventTargetShim.eventTargetShimStrings.loose = this.cast("loose")
  @scala.inline
  def standard: typingsSlinky.eventTargetShim.eventTargetShimStrings.standard = this.cast("standard")
  @scala.inline
  def strict: typingsSlinky.eventTargetShim.eventTargetShimStrings.strict = this.cast("strict")
}

