package typingsSlinky.expo.components

import typingsSlinky.expo.globalsWebMod.Icon.MaterialCommunityIcons
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconMaterialCommunityIcons {
  @JSImport("expo/build/globals.web", "Icon.MaterialCommunityIcons")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1765893822[MaterialCommunityIcons] = new SharedBuilder_IconProps1765893822[MaterialCommunityIcons](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1765893822[MaterialCommunityIcons] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1765893822[MaterialCommunityIcons](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}

