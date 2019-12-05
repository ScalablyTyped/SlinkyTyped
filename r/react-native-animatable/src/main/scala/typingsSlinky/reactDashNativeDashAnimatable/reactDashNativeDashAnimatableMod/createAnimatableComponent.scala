package typingsSlinky.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod

import typingsSlinky.react.reactMod.ClassicComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashNativeDashAnimatable.Anon_Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  def apply[P /* <: Anon_Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Anon_Style */, S](Component: ComponentClass[P, ComponentState]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Anon_Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}

