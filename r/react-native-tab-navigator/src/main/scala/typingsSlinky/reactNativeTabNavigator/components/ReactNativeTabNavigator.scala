package typingsSlinky.reactNativeTabNavigator.components

import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorItemProps
import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorProps
import typingsSlinky.reactNativeTabNavigator.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeTabNavigator {
  
  object Item {
    
    @JSImport("react-native-tab-navigator", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabNavigatorItemProps): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.default.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-tab-navigator", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeTabNavigator.type): SharedBuilder_TabNavigatorProps_1107387328[default] = new SharedBuilder_TabNavigatorProps_1107387328[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabNavigatorProps): SharedBuilder_TabNavigatorProps_1107387328[default] = new SharedBuilder_TabNavigatorProps_1107387328[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
