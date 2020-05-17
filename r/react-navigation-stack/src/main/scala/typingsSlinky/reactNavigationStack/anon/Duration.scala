package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.Animated.ValueXY
import typingsSlinky.reactNative.mod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var damping: js.UndefOr[scala.Nothing] = js.native
  var duration: Double = js.native
  var easing: EasingFunction = js.native
  var mass: js.UndefOr[scala.Nothing] = js.native
  var overshootClamping: js.UndefOr[scala.Nothing] = js.native
  var restDisplacementThreshold: js.UndefOr[scala.Nothing] = js.native
  var restSpeedThreshold: js.UndefOr[scala.Nothing] = js.native
  var stiffness: js.UndefOr[scala.Nothing] = js.native
  def timing(value: ValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: Value, config: TimingAnimationConfig): CompositeAnimation = js.native
}

