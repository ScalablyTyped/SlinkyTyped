package typingsSlinky.reactDashNavigationDashDrawer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigationDashDrawer.Anon_Focused
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerNavigatorItemsProps
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.Scene
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.ThemedColor
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DrawerNavigatorItemsProps_960062686[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    drawerPosition: left | right,
    getLabel: Scene => TagMod[Any],
    items: js.Array[NavigationRoute[NavigationParams]],
    onItemPress: Anon_Focused => Unit,
    renderIcon: Scene => TagMod[Any],
    screenProps: js.Any,
    activeBackgroundColor: String | ThemedColor = null,
    activeItemKey: String = null,
    activeLabelStyle: StyleProp[TextStyle] = null,
    activeTintColor: String | ThemedColor = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    inactiveBackgroundColor: String | ThemedColor = null,
    inactiveLabelStyle: StyleProp[TextStyle] = null,
    inactiveTintColor: String | ThemedColor = null,
    itemStyle: StyleProp[ViewStyle] = null,
    itemsContainerStyle: StyleProp[ViewStyle] = null,
    labelStyle: StyleProp[TextStyle] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor.asInstanceOf[js.Any])
    if (activeItemKey != null) __obj.updateDynamic("activeItemKey")(activeItemKey.asInstanceOf[js.Any])
    if (activeLabelStyle != null) __obj.updateDynamic("activeLabelStyle")(activeLabelStyle.asInstanceOf[js.Any])
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor.asInstanceOf[js.Any])
    if (inactiveLabelStyle != null) __obj.updateDynamic("inactiveLabelStyle")(inactiveLabelStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (itemsContainerStyle != null) __obj.updateDynamic("itemsContainerStyle")(itemsContainerStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerNavigatorItemsProps
}

