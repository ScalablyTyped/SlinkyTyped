package typingsSlinky.reactNativeTabNavigator.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[String | Double] = js.native
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Item title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[TextStyle] = js.native
}

object TabNavigatorItemProps {
  @scala.inline
  def apply(): TabNavigatorItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabNavigatorItemProps]
  }
  @scala.inline
  implicit class TabNavigatorItemPropsOps[Self <: TabNavigatorItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeText(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBadge(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBadge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderIcon(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSelectedIcon(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectedIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderSelectedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTitleStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(js.undefined)
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
    def withTitleStyle(value: TextStyle): Self = {
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
  }
  
}

