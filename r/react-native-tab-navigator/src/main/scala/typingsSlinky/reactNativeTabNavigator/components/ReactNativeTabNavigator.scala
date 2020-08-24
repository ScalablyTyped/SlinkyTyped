package typingsSlinky.reactNativeTabNavigator.components

import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorItemProps
import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorProps
import typingsSlinky.reactNativeTabNavigator.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeTabNavigator {
  @JSImport("react-native-tab-navigator", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TabNavigatorProps): SharedBuilder_TabNavigatorProps_1107387328[default] = new SharedBuilder_TabNavigatorProps_1107387328[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeTabNavigator.type): SharedBuilder_TabNavigatorProps_1107387328[default] = new SharedBuilder_TabNavigatorProps_1107387328[default](js.Array(this.component, js.Dictionary.empty))()
  object Item {
    @JSImport("react-native-tab-navigator", "default.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: TabNavigatorItemProps): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Item.type): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

