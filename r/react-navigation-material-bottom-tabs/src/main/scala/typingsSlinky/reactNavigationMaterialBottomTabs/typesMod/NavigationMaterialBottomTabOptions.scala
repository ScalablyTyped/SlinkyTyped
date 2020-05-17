package typingsSlinky.reactNavigationMaterialBottomTabs.typesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationMaterialBottomTabs.anon.DefaultHandler
import typingsSlinky.reactNavigationMaterialBottomTabs.anon.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationMaterialBottomTabOptions extends js.Object {
  var tabBarAccessibilityLabel: js.UndefOr[String] = js.native
  var tabBarBadge: js.UndefOr[Boolean | Double | String] = js.native
  var tabBarColor: js.UndefOr[String] = js.native
  var tabBarIcon: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ Focused, TagMod[Any]])] = js.native
  var tabBarLabel: js.UndefOr[TagMod[Any]] = js.native
  var tabBarOnPress: js.UndefOr[js.Function1[/* props */ DefaultHandler, Unit]] = js.native
  var tabBarTestID: js.UndefOr[String] = js.native
  var tabBarVisible: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object NavigationMaterialBottomTabOptions {
  @scala.inline
  def apply(): NavigationMaterialBottomTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationMaterialBottomTabOptions]
  }
  @scala.inline
  implicit class NavigationMaterialBottomTabOptionsOps[Self <: NavigationMaterialBottomTabOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabBarAccessibilityLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarAccessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarAccessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarBadge(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBadge")(js.undefined)
        ret
    }
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
    def withTabBarIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarIconFunction1(value: /* props */ Focused => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabBarIcon(value: TagMod[Any] | (js.Function1[/* props */ Focused, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarOnPress(value: /* props */ DefaultHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarOnPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabBarOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarOnPress")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTestID")(js.undefined)
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

