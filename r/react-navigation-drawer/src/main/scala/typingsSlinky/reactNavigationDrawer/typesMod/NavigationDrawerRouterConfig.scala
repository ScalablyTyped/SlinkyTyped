package typingsSlinky.reactNavigationDrawer.typesMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.history
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.initialRoute
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDrawerRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history] = js.native
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.native
  var contentOptions: js.UndefOr[js.Object] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var resetOnBlur: js.UndefOr[Boolean] = js.native
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.native
}

object NavigationDrawerRouterConfig {
  @scala.inline
  def apply(): NavigationDrawerRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationDrawerRouterConfig]
  }
  @scala.inline
  implicit class NavigationDrawerRouterConfigOps[Self <: NavigationDrawerRouterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackBehavior(value: none | initialRoute | history): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteName")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountInactiveRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountInactiveRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountInactiveRoutes")(js.undefined)
        ret
    }
  }
  
}

