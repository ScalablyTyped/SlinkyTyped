package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.CubicBezierTimingFunction
  - typingsSlinky.csstype.mod.StepTimingFunction
  - typingsSlinky.csstype.csstypeStrings.linear
*/
trait TimingFunction
  extends SingleAnimation
     with AnimationTimingFunctionProperty
     with SingleTransition
     with TransitionTimingFunctionProperty

object TimingFunction {
  @scala.inline
  def linear: typingsSlinky.csstype.csstypeStrings.linear = "linear".asInstanceOf[typingsSlinky.csstype.csstypeStrings.linear]
  @scala.inline
  implicit def apply(value: CubicBezierTimingFunction): TimingFunction = value.asInstanceOf[TimingFunction]
  @scala.inline
  implicit def apply(value: StepTimingFunction): TimingFunction = value.asInstanceOf[TimingFunction]
}

