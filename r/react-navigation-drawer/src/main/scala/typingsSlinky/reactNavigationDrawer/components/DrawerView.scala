package typingsSlinky.reactNavigationDrawer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typingsSlinky.reactNavigationDrawer.drawerViewMod.Props
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsSlinky.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerView {
  
  @JSImport("react-navigation-drawer", "DrawerView")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, typingsSlinky.reactNavigationDrawer.mod.DrawerView] = new Default[tag.type, typingsSlinky.reactNavigationDrawer.mod.DrawerView](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    `lazy`: Boolean,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentCompo,
    screenProps: js.Any
  ): Default[tag.type, typingsSlinky.reactNavigationDrawer.mod.DrawerView] = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __props.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNavigationDrawer.mod.DrawerView](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
