package typingsSlinky.expo.components

import typingsSlinky.expo.globalsWebMod.Icon.Entypo
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconEntypo {
  @JSImport("expo/build/globals.web", "Icon.Entypo")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1765893822[Entypo] = new SharedBuilder_IconProps1765893822[Entypo](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1765893822[Entypo] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1765893822[Entypo](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}

