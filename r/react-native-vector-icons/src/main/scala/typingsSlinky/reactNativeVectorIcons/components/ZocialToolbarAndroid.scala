package typingsSlinky.reactNativeVectorIcons.components

import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import typingsSlinky.reactNativeVectorIcons.zocialMod.default.ToolbarAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ZocialToolbarAndroid {
  @JSImport("react-native-vector-icons/Zocial", "default.ToolbarAndroid")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToolbarAndroidProps): SharedBuilder_ToolbarAndroidProps2005905226[ToolbarAndroid] = new SharedBuilder_ToolbarAndroidProps2005905226[ToolbarAndroid](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): SharedBuilder_ToolbarAndroidProps2005905226[ToolbarAndroid] = {
    val __props = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
    new SharedBuilder_ToolbarAndroidProps2005905226[ToolbarAndroid](js.Array(this.component, __props.asInstanceOf[ToolbarAndroidProps]))
  }
}

