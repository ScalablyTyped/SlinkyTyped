package typingsSlinky.expo.components

import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Octicons {
  @JSImport("expo/build/globals.web", "Icon.Octicons")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1765893822[typingsSlinky.expo.globalsWebMod.Icon.Octicons] = new SharedBuilder_IconProps1765893822[typingsSlinky.expo.globalsWebMod.Icon.Octicons](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1765893822[typingsSlinky.expo.globalsWebMod.Icon.Octicons] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1765893822[typingsSlinky.expo.globalsWebMod.Icon.Octicons](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  object Button {
    @JSImport("expo/build/globals.web", "Icon.Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expo.globalsWebMod.Icon.Octicons.Button] = new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expo.globalsWebMod.Icon.Octicons.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expo.globalsWebMod.Icon.Octicons.Button] = {
        val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expo.globalsWebMod.Icon.Octicons.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
    }
  }
  
  object TabBarItem {
    @JSImport("expo/build/globals.web", "Icon.TabBarItem")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItem] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItem] = {
        val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
        new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object TabBarItemIOS {
    @JSImport("expo/build/globals.web", "Icon.TabBarItemIOS")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItemIOS] = {
        val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
        new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expo.globalsWebMod.Icon.Octicons.TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object ToolbarAndroid {
    @JSImport("expo/build/globals.web", "Icon.ToolbarAndroid")
    @js.native
    object component extends js.Object
    
    def withProps(p: ToolbarAndroidProps): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expo.globalsWebMod.Icon.Octicons.ToolbarAndroid] = new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expo.globalsWebMod.Icon.Octicons.ToolbarAndroid](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      iconColor: String,
      iconSize: Double,
      logoName: String,
      navIconName: String,
      overflowIconName: String
    ): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expo.globalsWebMod.Icon.Octicons.ToolbarAndroid] = {
        val __props = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
        new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expo.globalsWebMod.Icon.Octicons.ToolbarAndroid](js.Array(this.component, __props.asInstanceOf[ToolbarAndroidProps]))
    }
  }
  
}

