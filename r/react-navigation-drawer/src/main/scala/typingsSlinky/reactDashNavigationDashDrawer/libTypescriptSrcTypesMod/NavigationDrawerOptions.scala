package typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerOptions extends js.Object {
  var drawerIcon: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ DrawerIconProps, TagMod[Any]])] = js.undefined
  var drawerLabel: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ DrawerLabelProps, TagMod[Any]])] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationDrawerOptions {
  @scala.inline
  def apply(
    drawerIcon: TagMod[Any] | (js.Function1[/* props */ DrawerIconProps, TagMod[Any]]) = null,
    drawerLabel: TagMod[Any] | (js.Function1[/* props */ DrawerLabelProps, TagMod[Any]]) = null,
    drawerLockMode: DrawerLockMode = null,
    title: String = null
  ): NavigationDrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (drawerIcon != null) __obj.updateDynamic("drawerIcon")(drawerIcon.asInstanceOf[js.Any])
    if (drawerLabel != null) __obj.updateDynamic("drawerLabel")(drawerLabel.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerOptions]
  }
}

