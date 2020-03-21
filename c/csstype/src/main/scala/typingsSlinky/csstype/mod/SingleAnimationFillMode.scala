package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.backwards
  - typingsSlinky.csstype.csstypeStrings.both
  - typingsSlinky.csstype.csstypeStrings.forwards
  - typingsSlinky.csstype.csstypeStrings.none
*/
trait SingleAnimationFillMode
  extends _SingleAnimation
     with _AnimationFillModeProperty

object SingleAnimationFillMode {
  @scala.inline
  def backwards: typingsSlinky.csstype.csstypeStrings.backwards = this.cast("backwards")
  @scala.inline
  def both: typingsSlinky.csstype.csstypeStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forwards: typingsSlinky.csstype.csstypeStrings.forwards = this.cast("forwards")
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = this.cast("none")
}

