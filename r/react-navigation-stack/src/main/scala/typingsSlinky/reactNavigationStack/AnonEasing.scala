package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.Animated.ValueXY
import typingsSlinky.reactNative.mod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEasing extends js.Object {
  var duration: Double = js.native
  var easing: EasingFunction = js.native
  def timing(value: ValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: Value, config: TimingAnimationConfig): CompositeAnimation = js.native
}

