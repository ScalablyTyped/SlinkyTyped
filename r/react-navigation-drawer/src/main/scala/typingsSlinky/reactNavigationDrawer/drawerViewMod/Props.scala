package typingsSlinky.reactNavigationDrawer.drawerViewMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.DrawerOptionscontentCompo
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsSlinky.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: SceneDescriptorMap
  var `lazy`: Boolean
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  var navigationConfig: DrawerOptionscontentCompo
  var screenProps: js.Any
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    `lazy`: Boolean,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentCompo,
    screenProps: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

