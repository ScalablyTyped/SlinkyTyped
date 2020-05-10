package typingsSlinky.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var tabBarColor: js.UndefOr[String] = js.native
  var tabBarColorDark: js.UndefOr[String] = js.native
  var tabBarColorLight: js.UndefOr[String] = js.native
  var tabBarVisible: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabBarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarColorDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColorDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarColorDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColorDark")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarColorLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColorLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarColorLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarColorLight")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarVisible")(js.undefined)
        ret
    }
  }
  
}

