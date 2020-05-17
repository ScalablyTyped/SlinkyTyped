package typingsSlinky.reactNavigationDrawer.drawerViewMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerState
import typingsSlinky.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var descriptors: SceneDescriptorMap = js.native
  var `lazy`: Boolean = js.native
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams] = js.native
  var navigationConfig: DrawerOptionscontentCompo = js.native
  var screenProps: js.Any = js.native
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
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptors(value: SceneDescriptorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationConfig(value: DrawerOptionscontentCompo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

