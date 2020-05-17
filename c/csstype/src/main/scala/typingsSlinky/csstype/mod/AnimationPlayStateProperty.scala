package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.csstypeStrings.paused
  - typingsSlinky.csstype.csstypeStrings.running
  - java.lang.String
*/
trait AnimationPlayStateProperty extends js.Object

object AnimationPlayStateProperty {
  @scala.inline
  def paused: typingsSlinky.csstype.csstypeStrings.paused = "paused".asInstanceOf[typingsSlinky.csstype.csstypeStrings.paused]
  @scala.inline
  def running: typingsSlinky.csstype.csstypeStrings.running = "running".asInstanceOf[typingsSlinky.csstype.csstypeStrings.running]
  @scala.inline
  implicit def apply(value: Globals): AnimationPlayStateProperty = value.asInstanceOf[AnimationPlayStateProperty]
  @scala.inline
  implicit def apply(value: String): AnimationPlayStateProperty = value.asInstanceOf[AnimationPlayStateProperty]
}

