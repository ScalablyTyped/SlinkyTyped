package typingsSlinky.reactNativeVectorIcons.components

import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.octiconsMod.default.TabBarItemIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OcticonsTabBarItemIOS {
  @JSImport("react-native-vector-icons/Octicons", "default.TabBarItemIOS")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS] = {
    val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
  }
}

