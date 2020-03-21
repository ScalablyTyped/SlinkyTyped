package typingsSlinky.reactNative.mod.Animated

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.createAnimatedComponent")
@js.native
object createAnimatedComponent extends js.Object {
  def apply(component: ComponentClass[ComponentProps[_], ComponentState]): AnimatedComponent[
    ReactComponentClass[ComponentProps[_]] | InstanceType[ReactComponentClass[ComponentProps[_]]]
  ] = js.native
  def apply(component: FunctionComponent[ComponentProps[_]]): AnimatedComponent[
    ReactComponentClass[ComponentProps[_]] | InstanceType[ReactComponentClass[ComponentProps[_]]]
  ] = js.native
  def apply[T /* <: ReactComponentClass[ComponentProps[T]] */](component: T): AnimatedComponent[T | InstanceType[T]] = js.native
}

