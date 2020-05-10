package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ARTGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Group {
  @JSImport("react-native", "Group")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTGroupProps): SharedBuilder_ARTGroupProps159272223[typingsSlinky.reactNative.mod.Group] = new SharedBuilder_ARTGroupProps159272223[typingsSlinky.reactNative.mod.Group](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Group.type): SharedBuilder_ARTGroupProps159272223[typingsSlinky.reactNative.mod.Group] = new SharedBuilder_ARTGroupProps159272223[typingsSlinky.reactNative.mod.Group](js.Array(this.component, js.Dictionary.empty))()
}

