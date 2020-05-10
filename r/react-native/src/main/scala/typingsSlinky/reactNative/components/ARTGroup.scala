package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ART.GroupCls
import typingsSlinky.reactNative.mod.ARTGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ARTGroup {
  @JSImport("react-native", "ART.Group")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTGroupProps): SharedBuilder_ARTGroupProps159272223[GroupCls] = new SharedBuilder_ARTGroupProps159272223[GroupCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ARTGroup.type): SharedBuilder_ARTGroupProps159272223[GroupCls] = new SharedBuilder_ARTGroupProps159272223[GroupCls](js.Array(this.component, js.Dictionary.empty))()
}

