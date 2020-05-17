package typingsSlinky.reactNativeAnimatable.mod

import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactNativeAnimatable.anon.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "createAnimatableComponent")
@js.native
object createAnimatableComponent extends js.Object {
  def apply[P /* <: Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Style */, S](Component: ComponentClass[P, js.Object]): AnimatableComponent[P, S] = js.native
  def apply[P /* <: Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
}

