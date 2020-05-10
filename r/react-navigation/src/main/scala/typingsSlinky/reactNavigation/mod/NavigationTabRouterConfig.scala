package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.history
import typingsSlinky.reactNavigation.reactNavigationStrings.initialRoute
import typingsSlinky.reactNavigation.reactNavigationStrings.none
import typingsSlinky.reactNavigation.reactNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTabRouterConfig extends js.Object {
   // todo: type these as the real route names rather than 'string'
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  var order: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
   // defaults to 'initialRoute'
  var resetOnBlur: js.UndefOr[Boolean] = js.native
}

object NavigationTabRouterConfig {
  @scala.inline
  def apply(): NavigationTabRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationTabRouterConfig]
  }
  @scala.inline
  implicit class NavigationTabRouterConfigOps[Self <: NavigationTabRouterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackBehavior(value: none | initialRoute | history | order): Self = {
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
    def withInitialRouteParams(value: NavigationParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: NavigationPathsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
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
  }
  
}

