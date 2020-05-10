package typingsSlinky.reactNativeTabNavigator.components

import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabNavigatorItem {
  @JSImport("react-native-tab-navigator", "TabNavigator.Item")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabNavigatorItemProps): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabNavigatorItem.type): SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item] = new SharedBuilder_TabNavigatorItemProps359944313[typingsSlinky.reactNativeTabNavigator.mod.TabNavigator.Item](js.Array(this.component, js.Dictionary.empty))()
}

