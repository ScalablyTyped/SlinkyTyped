package typingsSlinky.reactNavigationStack.typesMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.Horizontal
import typingsSlinky.reactNavigationStack.anon.TextPropschildrenstring
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.inverted
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackOptions extends js.Object {
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var gestureDirection: js.UndefOr[inverted | normal] = js.undefined
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
  var gesturesEnabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[(js.Function1[/* props */ HeaderProps, TagMod[Any]]) | Null] = js.undefined
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColor, TagMod[Any]]] = js.undefined
  var headerBackTitle: js.UndefOr[String | Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerBackground: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
  var headerForceInset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
  ] = js.undefined
  var headerLeft: js.UndefOr[(js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  var headerRight: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerShown: js.UndefOr[Boolean] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTintColor: js.UndefOr[String] = js.undefined
  var headerTitle: js.UndefOr[(js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationStackOptions {
  @scala.inline
  def apply(
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    gestureDirection: inverted | normal = null,
    gestureResponseDistance: Horizontal = null,
    gesturesEnabled: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Null | (/* props */ HeaderProps => TagMod[Any])] = js.undefined,
    headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerBackImage: /* props */ TintColor => TagMod[Any] = null,
    headerBackTitle: js.UndefOr[Null | String] = js.undefined,
    headerBackTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    headerBackground: js.Function0[TagMod[Any]] | TagMod[Any] = null,
    headerForceInset: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any = null,
    headerLeft: (js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any] = null,
    headerLeftContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    headerPressColorAndroid: String = null,
    headerRight: js.Function0[TagMod[Any]] | TagMod[Any] = null,
    headerRightContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    headerShown: js.UndefOr[Boolean] = js.undefined,
    headerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    headerTintColor: String = null,
    headerTitle: (js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any] = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    headerTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null,
    title: String = null
  ): NavigationStackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.get.asInstanceOf[js.Any])
    if (gestureDirection != null) __obj.updateDynamic("gestureDirection")(gestureDirection.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(gesturesEnabled)) __obj.updateDynamic("gesturesEnabled")(gesturesEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(if (header != null) js.Any.fromFunction1(header.asInstanceOf[/* props */ HeaderProps => TagMod[Any]]) else null)
    if (!js.isUndefined(headerBackAllowFontScaling)) __obj.updateDynamic("headerBackAllowFontScaling")(headerBackAllowFontScaling.get.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(js.Any.fromFunction1(headerBackImage))
    if (!js.isUndefined(headerBackTitle)) __obj.updateDynamic("headerBackTitle")(headerBackTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleStyle)) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(headerBackground.asInstanceOf[js.Any])
    if (headerForceInset != null) __obj.updateDynamic("headerForceInset")(headerForceInset.asInstanceOf[js.Any])
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(headerLeftContainerStyle)) __obj.updateDynamic("headerLeftContainerStyle")(headerLeftContainerStyle.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(headerRightContainerStyle)) __obj.updateDynamic("headerRightContainerStyle")(headerRightContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerShown)) __obj.updateDynamic("headerShown")(headerShown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerStyle)) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleContainerStyle)) __obj.updateDynamic("headerTitleContainerStyle")(headerTitleContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleStyle)) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.get.asInstanceOf[js.Any])
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackOptions]
  }
}

