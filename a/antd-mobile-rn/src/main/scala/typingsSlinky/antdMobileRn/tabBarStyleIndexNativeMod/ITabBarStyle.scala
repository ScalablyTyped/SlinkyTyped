package typingsSlinky.antdMobileRn.tabBarStyleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabBarStyle extends js.Object {
  var badge: ViewStyle = js.native
  var badgeText: TextStyle = js.native
  var barIcon: ViewStyle = js.native
  var barItem: ViewStyle = js.native
  var barItemSelected: ViewStyle = js.native
  var barItemTitle: TextStyle = js.native
  var content: ViewStyle = js.native
  var contentItem: ViewStyle = js.native
  var contentItemSelected: ViewStyle = js.native
  var tabbar: ViewStyle = js.native
  var tabs: ViewStyle = js.native
}

object ITabBarStyle {
  @scala.inline
  def apply(
    badge: ViewStyle,
    badgeText: TextStyle,
    barIcon: ViewStyle,
    barItem: ViewStyle,
    barItemSelected: ViewStyle,
    barItemTitle: TextStyle,
    content: ViewStyle,
    contentItem: ViewStyle,
    contentItemSelected: ViewStyle,
    tabbar: ViewStyle,
    tabs: ViewStyle
  ): ITabBarStyle = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeText = badgeText.asInstanceOf[js.Any], barIcon = barIcon.asInstanceOf[js.Any], barItem = barItem.asInstanceOf[js.Any], barItemSelected = barItemSelected.asInstanceOf[js.Any], barItemTitle = barItemTitle.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], contentItemSelected = contentItemSelected.asInstanceOf[js.Any], tabbar = tabbar.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabBarStyle]
  }
  @scala.inline
  implicit class ITabBarStyleOps[Self <: ITabBarStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadgeText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarIcon(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItemSelected(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItemSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItemTitle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItemTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentItemSelected(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentItemSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabbar(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

