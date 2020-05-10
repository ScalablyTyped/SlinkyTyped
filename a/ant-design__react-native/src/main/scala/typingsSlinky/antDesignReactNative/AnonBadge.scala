package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBadge extends js.Object {
  var badge: RegisteredStyle[ViewStyle] = js.native
  var badgeText: RegisteredStyle[TextStyle] = js.native
  var barIcon: RegisteredStyle[ImageStyle] = js.native
  var barItem: RegisteredStyle[ViewStyle] = js.native
  var barItemSelected: RegisteredStyle[ViewStyle] = js.native
  var barItemTitle: RegisteredStyle[TextStyle] = js.native
  var content: RegisteredStyle[ViewStyle] = js.native
  var contentItem: RegisteredStyle[ViewStyle] = js.native
  var contentItemSelected: RegisteredStyle[ViewStyle] = js.native
  var tabbar: RegisteredStyle[ViewStyle] = js.native
  var tabs: RegisteredStyle[ViewStyle] = js.native
}

object AnonBadge {
  @scala.inline
  def apply(
    badge: RegisteredStyle[ViewStyle],
    badgeText: RegisteredStyle[TextStyle],
    barIcon: RegisteredStyle[ImageStyle],
    barItem: RegisteredStyle[ViewStyle],
    barItemSelected: RegisteredStyle[ViewStyle],
    barItemTitle: RegisteredStyle[TextStyle],
    content: RegisteredStyle[ViewStyle],
    contentItem: RegisteredStyle[ViewStyle],
    contentItemSelected: RegisteredStyle[ViewStyle],
    tabbar: RegisteredStyle[ViewStyle],
    tabs: RegisteredStyle[ViewStyle]
  ): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeText = badgeText.asInstanceOf[js.Any], barIcon = barIcon.asInstanceOf[js.Any], barItem = barItem.asInstanceOf[js.Any], barItemSelected = barItemSelected.asInstanceOf[js.Any], barItemTitle = barItemTitle.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], contentItemSelected = contentItemSelected.asInstanceOf[js.Any], tabbar = tabbar.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
  @scala.inline
  implicit class AnonBadgeOps[Self <: AnonBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadgeText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarIcon(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItemSelected(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItemSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarItemTitle(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barItemTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentItemSelected(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentItemSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabbar(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

