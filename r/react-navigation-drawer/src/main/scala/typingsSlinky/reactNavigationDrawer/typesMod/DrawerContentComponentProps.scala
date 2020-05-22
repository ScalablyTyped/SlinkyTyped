package typingsSlinky.reactNavigationDrawer.typesMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationDrawer.anon.Focused
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerNavigatorItemsProps & {  navigation  :react-navigation.react-navigation.NavigationScreenProp<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerState, react-navigation.react-navigation.NavigationParams>,   descriptors  :react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.SceneDescriptorMap,   drawerOpenProgress  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any,   screenProps  :unknown} */
trait DrawerContentComponentProps extends js.Object {
  var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var activeItemKey: js.UndefOr[String | Null] = js.undefined
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var activeTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var descriptors: SceneDescriptorMap
  var drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var drawerPosition: left | right
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var items: js.Array[NavigationRoute[NavigationParams]]
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  var screenProps: js.Any
  def getLabel(scene: Scene): TagMod[Any]
  def onItemPress(scene: Focused): Unit
  def renderIcon(scene: Scene): TagMod[Any]
}

object DrawerContentComponentProps {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    drawerOpenProgress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    drawerPosition: left | right,
    getLabel: Scene => TagMod[Any],
    items: js.Array[NavigationRoute[NavigationParams]],
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    onItemPress: Focused => Unit,
    renderIcon: Scene => TagMod[Any],
    screenProps: js.Any,
    activeBackgroundColor: String | ThemedColor = null,
    activeItemKey: js.UndefOr[Null | String] = js.undefined,
    activeLabelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    activeTintColor: String | ThemedColor = null,
    iconContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inactiveBackgroundColor: String | ThemedColor = null,
    inactiveLabelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    inactiveTintColor: String | ThemedColor = null,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemsContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): DrawerContentComponentProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1(onItemPress), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(activeItemKey)) __obj.updateDynamic("activeItemKey")(activeItemKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeLabelStyle)) __obj.updateDynamic("activeLabelStyle")(activeLabelStyle.asInstanceOf[js.Any])
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(iconContainerStyle)) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveLabelStyle)) __obj.updateDynamic("inactiveLabelStyle")(inactiveLabelStyle.asInstanceOf[js.Any])
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsContainerStyle)) __obj.updateDynamic("itemsContainerStyle")(itemsContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerContentComponentProps]
  }
}

