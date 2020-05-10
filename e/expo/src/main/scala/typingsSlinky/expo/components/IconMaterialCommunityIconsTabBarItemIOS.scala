package typingsSlinky.expo.components

import typingsSlinky.expo.globalsWebMod.Icon.MaterialCommunityIcons.TabBarItemIOS
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconMaterialCommunityIconsTabBarItemIOS {
  @JSImport("expo/build/globals.web", "Icon.MaterialCommunityIcons.TabBarItemIOS")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS] = {
    val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
  }
}

