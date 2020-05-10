package typingsSlinky.reactNativeVectorIcons.components

import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.materialIconsMod.default.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialIconsButton {
  @JSImport("react-native-vector-icons/MaterialIcons", "default.Button")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_1587742882[Button] = new SharedBuilder_IconButtonProps_1587742882[Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconButtonProps_1587742882[Button] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconButtonProps_1587742882[Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
  }
}

