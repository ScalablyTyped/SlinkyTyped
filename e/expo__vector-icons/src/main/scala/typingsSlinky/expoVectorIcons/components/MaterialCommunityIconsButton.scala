package typingsSlinky.expoVectorIcons.components

import typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.Button
import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialCommunityIconsButton {
  @JSImport("@expo/vector-icons", "MaterialCommunityIcons.Button")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_1587742882[Button] = new SharedBuilder_IconButtonProps_1587742882[Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconButtonProps_1587742882[Button] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconButtonProps_1587742882[Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
  }
}

