package typingsSlinky.reactRouterNavigation.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[String] = js.undefined
  var backButtonTitle: js.UndefOr[String] = js.undefined
  // Left button
  var hideBackButton: js.UndefOr[Boolean] = js.undefined
  // General
  var hideNavBar: js.UndefOr[Boolean] = js.undefined
  var navBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.undefined
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.undefined
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.undefined
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.undefined
  // Title
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    renderLeftButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderNavBar: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderRightButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderTitle: /* props */ CardSubViewProps => TagMod[Any] = null,
    title: String = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navBarStyle)) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

