package typingsSlinky.reactNavigationDrawer.typesMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationDrawer.AnonFocused
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerNavigatorItemsProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.native
  var activeItemKey: js.UndefOr[String | Null] = js.native
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.native
  var drawerPosition: left | right = js.native
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.native
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var items: js.Array[NavigationRoute[NavigationParams]] = js.native
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var screenProps: js.Any = js.native
  def getLabel(scene: Scene): TagMod[Any] = js.native
  def onItemPress(scene: AnonFocused): Unit = js.native
  def renderIcon(scene: Scene): TagMod[Any] = js.native
}

object DrawerNavigatorItemsProps {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => TagMod[Any],
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: AnonFocused => Unit,
    renderIcon: Scene => TagMod[Any],
    screenProps: js.Any
  ): DrawerNavigatorItemsProps = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigatorItemsProps]
  }
  @scala.inline
  implicit class DrawerNavigatorItemsPropsOps[Self <: DrawerNavigatorItemsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: Scene => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[NavigationRoute[NavigationParams]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnItemPress(value: AnonFocused => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderIcon(value: Scene => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScreenProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveBackgroundColor(value: String | ThemedColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveItemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveItemKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItemKey")(null)
        ret
    }
    @scala.inline
    def withActiveLabelStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveLabelStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLabelStyle")(null)
        ret
    }
    @scala.inline
    def withActiveTintColor(value: String | ThemedColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withInactiveBackgroundColor(value: String | ThemedColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveLabelStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveLabelStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveLabelStyle")(null)
        ret
    }
    @scala.inline
    def withInactiveTintColor(value: String | ThemedColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(null)
        ret
    }
    @scala.inline
    def withItemsContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsContainerStyle")(null)
        ret
    }
    @scala.inline
    def withLabelStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(null)
        ret
    }
  }
  
}

