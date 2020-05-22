package typingsSlinky.baseui.appNavBarMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppNavBarPropsT extends js.Object {
  var appDisplayName: js.UndefOr[TagMod[Any]] = js.undefined
  // eslint-disable-next-line flowtype/no-weak-type;
  var mainNav: js.UndefOr[js.Array[MainNavItemT]] = js.undefined
  var userImgUrl: js.UndefOr[String] = js.undefined
  var userNav: js.UndefOr[js.Array[UserNavItemT]] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var usernameSubtitle: js.UndefOr[TagMod[Any]] = js.undefined
  def isNavItemActive(params: Item): Boolean
  def onNavItemSelect(params: Item): js.Any
}

object AppNavBarPropsT {
  @scala.inline
  def apply(
    isNavItemActive: Item => Boolean,
    onNavItemSelect: Item => js.Any,
    appDisplayName: TagMod[Any] = null,
    mainNav: js.Array[MainNavItemT] = null,
    userImgUrl: String = null,
    userNav: js.Array[UserNavItemT] = null,
    username: String = null,
    usernameSubtitle: TagMod[Any] = null
  ): AppNavBarPropsT = {
    val __obj = js.Dynamic.literal(isNavItemActive = js.Any.fromFunction1(isNavItemActive), onNavItemSelect = js.Any.fromFunction1(onNavItemSelect))
    if (appDisplayName != null) __obj.updateDynamic("appDisplayName")(appDisplayName.asInstanceOf[js.Any])
    if (mainNav != null) __obj.updateDynamic("mainNav")(mainNav.asInstanceOf[js.Any])
    if (userImgUrl != null) __obj.updateDynamic("userImgUrl")(userImgUrl.asInstanceOf[js.Any])
    if (userNav != null) __obj.updateDynamic("userNav")(userNav.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (usernameSubtitle != null) __obj.updateDynamic("usernameSubtitle")(usernameSubtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNavBarPropsT]
  }
}

