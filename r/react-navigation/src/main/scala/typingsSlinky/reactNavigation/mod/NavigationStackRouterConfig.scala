package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationStackRouterConfig extends js.Object {
  var initialRouteKey: js.UndefOr[String] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
}

object NavigationStackRouterConfig {
  @scala.inline
  def apply(): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
  @scala.inline
  implicit class NavigationStackRouterConfigOps[Self <: NavigationStackRouterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRouteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRouteKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRouteKey")(js.undefined)
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
  }
  
}

