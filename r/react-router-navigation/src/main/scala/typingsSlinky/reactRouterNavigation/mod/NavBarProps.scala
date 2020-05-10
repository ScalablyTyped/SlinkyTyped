package typingsSlinky.reactRouterNavigation.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[String] = js.native
  var backButtonTitle: js.UndefOr[String] = js.native
  // Left button
  var hideBackButton: js.UndefOr[Boolean] = js.native
  // General
  var hideNavBar: js.UndefOr[Boolean] = js.native
  var navBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.native
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.native
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.native
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, TagMod[Any]]] = js.native
  // Title
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object NavBarProps {
  @scala.inline
  def apply(): NavBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavBarProps]
  }
  @scala.inline
  implicit class NavBarPropsOps[Self <: NavBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackButtonTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHideBackButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBackButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNavBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNavBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNavBar")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBarStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBarStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarStyle")(null)
        ret
    }
    @scala.inline
    def withRenderLeftButton(value: /* props */ CardSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderLeftButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNavBar(value: /* props */ CardSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderNavBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavBar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderRightButton(value: /* props */ CardSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderRightButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTitle(value: /* props */ CardSubViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTitle")(js.undefined)
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
    @scala.inline
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
  }
  
}

