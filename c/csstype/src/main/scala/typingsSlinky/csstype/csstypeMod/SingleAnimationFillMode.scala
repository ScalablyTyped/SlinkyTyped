package typingsSlinky.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.backwards
  - typings.csstype.csstypeStrings.both
  - typings.csstype.csstypeStrings.forwards
  - typings.csstype.csstypeStrings.none
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

