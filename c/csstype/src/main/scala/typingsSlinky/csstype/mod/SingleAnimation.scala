package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.TimingFunction
  - typingsSlinky.csstype.mod.SingleAnimationDirection
  - typingsSlinky.csstype.mod.SingleAnimationFillMode
  - typingsSlinky.csstype.csstypeStrings.infinite
  - typingsSlinky.csstype.csstypeStrings.none
  - typingsSlinky.csstype.csstypeStrings.paused
  - typingsSlinky.csstype.csstypeStrings.running
  - java.lang.String
  - scala.Double
*/
trait SingleAnimation extends AnimationProperty

object SingleAnimation {
  @scala.inline
  def infinite: typingsSlinky.csstype.csstypeStrings.infinite = "infinite".asInstanceOf[typingsSlinky.csstype.csstypeStrings.infinite]
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  def paused: typingsSlinky.csstype.csstypeStrings.paused = "paused".asInstanceOf[typingsSlinky.csstype.csstypeStrings.paused]
  @scala.inline
  def running: typingsSlinky.csstype.csstypeStrings.running = "running".asInstanceOf[typingsSlinky.csstype.csstypeStrings.running]
  @scala.inline
  implicit def apply(value: Double): SingleAnimation = value.asInstanceOf[SingleAnimation]
  @scala.inline
  implicit def apply(value: SingleAnimationDirection): SingleAnimation = value.asInstanceOf[SingleAnimation]
  @scala.inline
  implicit def apply(value: SingleAnimationFillMode): SingleAnimation = value.asInstanceOf[SingleAnimation]
  @scala.inline
  implicit def apply(value: String): SingleAnimation = value.asInstanceOf[SingleAnimation]
  @scala.inline
  implicit def apply(value: TimingFunction): SingleAnimation = value.asInstanceOf[SingleAnimation]
}

