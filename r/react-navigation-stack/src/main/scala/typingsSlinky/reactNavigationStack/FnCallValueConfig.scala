package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.AnimatedValue
import typingsSlinky.reactNative.mod.Animated.AnimatedValueXY
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValueConfig extends js.Object {
  def apply(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def apply(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
}

