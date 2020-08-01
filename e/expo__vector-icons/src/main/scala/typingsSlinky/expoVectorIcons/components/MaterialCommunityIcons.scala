package typingsSlinky.expoVectorIcons.components

import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialCommunityIcons {
  @JSImport("@expo/vector-icons", "MaterialCommunityIcons")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1765893822[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons] = new SharedBuilder_IconProps1765893822[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1765893822[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1765893822[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  object Button {
    @JSImport("@expo/vector-icons", "Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.Button] = new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.Button] = {
        val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
    }
  }
  
  object TabBarItem {
    @JSImport("@expo/vector-icons", "TabBarItem")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItem] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItem] = {
        val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
        new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object TabBarItemIOS {
    @JSImport("@expo/vector-icons", "TabBarItemIOS")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItemIOS] = {
        val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
        new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object ToolbarAndroid {
    @JSImport("@expo/vector-icons", "ToolbarAndroid")
    @js.native
    object component extends js.Object
    
    def withProps(p: ToolbarAndroidProps): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.ToolbarAndroid] = new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.ToolbarAndroid](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      iconColor: String,
      iconSize: Double,
      logoName: String,
      navIconName: String,
      overflowIconName: String
    ): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.ToolbarAndroid] = {
        val __props = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
        new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.expoVectorIcons.mod.MaterialCommunityIcons.ToolbarAndroid](js.Array(this.component, __props.asInstanceOf[ToolbarAndroidProps]))
    }
  }
  
}

