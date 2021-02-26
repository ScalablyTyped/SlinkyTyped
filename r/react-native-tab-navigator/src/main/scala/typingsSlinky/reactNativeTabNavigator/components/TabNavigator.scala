package typingsSlinky.reactNativeTabNavigator.components

import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorItemProps
import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNavigator {
  
  object Item {
    
    @JSImport("react-native-tab-navigator", "TabNavigator.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabNavigatorItemProps): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-tab-navigator", "TabNavigator")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabNavigator.type): SharedBuilder_TabNavigatorProps_1107387328[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator] = new SharedBuilder_TabNavigatorProps_1107387328[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabNavigatorProps): SharedBuilder_TabNavigatorProps_1107387328[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator] = new SharedBuilder_TabNavigatorProps_1107387328[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator](js.Array(this.component, p.asInstanceOf[js.Any]))
}
