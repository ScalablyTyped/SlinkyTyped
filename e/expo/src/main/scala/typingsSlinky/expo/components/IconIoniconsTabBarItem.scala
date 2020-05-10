package typingsSlinky.expo.components

import typingsSlinky.expo.globalsWebMod.Icon.Ionicons.TabBarItem
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconIoniconsTabBarItem {
  @JSImport("expo/build/globals.web", "Icon.Ionicons.TabBarItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItem] = new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[TabBarItem] = {
    val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    new SharedBuilder_TabBarItemIOSProps_163491253[TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
  }
}

