package typingsSlinky.reactDashNavigationDashStack

import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.CompositeAnimation
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.TimingAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.ValueXY
import typingsSlinky.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ConfigDuration extends js.Object {
  var duration: Double = js.native
  var easing: EasingFunction = js.native
  def timing(value: ValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: Value, config: TimingAnimationConfig): CompositeAnimation = js.native
}

