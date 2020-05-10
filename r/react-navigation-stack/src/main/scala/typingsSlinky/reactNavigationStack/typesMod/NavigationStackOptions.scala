package typingsSlinky.reactNavigationStack.typesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.AnonHorizontal
import typingsSlinky.reactNavigationStack.AnonTintColor
import typingsSlinky.reactNavigationStack.TextPropschildrenstring
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.inverted
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationStackOptions extends js.Object {
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.native
  var gestureDirection: js.UndefOr[inverted | normal] = js.native
  var gestureResponseDistance: js.UndefOr[AnonHorizontal] = js.native
  var gesturesEnabled: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[(js.Function1[/* props */ HeaderProps, TagMod[Any]]) | Null] = js.native
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.native
  var headerBackImage: js.UndefOr[js.Function1[/* props */ AnonTintColor, TagMod[Any]]] = js.native
  var headerBackTitle: js.UndefOr[String | Null] = js.native
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var headerBackground: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.native
  var headerForceInset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
  ] = js.native
  var headerLeft: js.UndefOr[(js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any]] = js.native
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var headerPressColorAndroid: js.UndefOr[String] = js.native
  var headerRight: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.native
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var headerShown: js.UndefOr[Boolean] = js.native
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var headerTintColor: js.UndefOr[String] = js.native
  var headerTitle: js.UndefOr[(js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any]] = js.native
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.native
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var headerTransparent: js.UndefOr[Boolean] = js.native
  var headerTruncatedBackTitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object NavigationStackOptions {
  @scala.inline
  def apply(): NavigationStackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackOptions]
  }
  @scala.inline
  implicit class NavigationStackOptionsOps[Self <: NavigationStackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableKeyboardHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureDirection(value: inverted | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureResponseDistance(value: AnonHorizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureResponseDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureResponseDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureResponseDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withGesturesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGesturesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: /* props */ HeaderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
        ret
    }
    @scala.inline
    def withHeaderBackAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackAllowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackAllowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackImage(value: /* props */ AnonTintColor => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderBackImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackImage")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitle")(null)
        ret
    }
    @scala.inline
    def withHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitleStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderBackgroundReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBackgroundFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderBackground(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderForceInset(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerForceInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderForceInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerForceInset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLeftFunction1(value: /* props */ HeaderBackButtonProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderLeft(value: (js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderLeftContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftContainerStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderPressColorAndroid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPressColorAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPressColorAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPressColorAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRightReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRightFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderRight(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRightContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRightContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRightContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRightContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRightContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRightContainerStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerShown")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTitleFunction1(value: /* props */ TextPropschildrenstring => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderTitle(value: (js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleAllowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitleAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleAllowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitleContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleContainerStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTruncatedBackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTruncatedBackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTruncatedBackTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTruncatedBackTitle")(js.undefined)
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
  }
  
}

