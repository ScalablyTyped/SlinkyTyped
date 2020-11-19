package typingsSlinky.reactNativeVectorIcons.components

import typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default
import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FontAwesome {
  
  @JSImport("react-native-vector-icons/FontAwesome", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1765893822[default] = new SharedBuilder_IconProps1765893822[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1765893822[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1765893822[default](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  object Button {
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: IconButtonProps): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.Button] = new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps_1587742882[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.Button] = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps_1587742882[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
    }
  }
  
  object TabBarItem {
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.TabBarItem")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItem](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object TabBarItemIOS {
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.TabBarItemIOS")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabBarItemIOSProps): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS] = new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(iconName: String): SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS] = {
      val __props = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
      new SharedBuilder_TabBarItemIOSProps_163491253[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.TabBarItemIOS](js.Array(this.component, __props.asInstanceOf[TabBarItemIOSProps]))
    }
  }
  
  object ToolbarAndroid {
    
    @JSImport("react-native-vector-icons/FontAwesome", "default.ToolbarAndroid")
    @js.native
    object component extends js.Object
    
    def withProps(p: ToolbarAndroidProps): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.ToolbarAndroid] = new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.ToolbarAndroid](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      iconColor: String,
      iconSize: Double,
      logoName: String,
      navIconName: String,
      overflowIconName: String
    ): SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.ToolbarAndroid] = {
      val __props = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
      new SharedBuilder_ToolbarAndroidProps2005905226[typingsSlinky.reactNativeVectorIcons.fontAwesomeMod.default.ToolbarAndroid](js.Array(this.component, __props.asInstanceOf[ToolbarAndroidProps]))
    }
  }
}
