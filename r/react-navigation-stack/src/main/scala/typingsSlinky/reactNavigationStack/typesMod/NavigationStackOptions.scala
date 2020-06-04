package typingsSlinky.reactNavigationStack.typesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableKeyboardHandling(value: Boolean): Self = this.set("disableKeyboardHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableKeyboardHandling: Self = this.set("disableKeyboardHandling", js.undefined)
    @scala.inline
    def setGestureDirection(value: inverted | normal): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureDirection: Self = this.set("gestureDirection", js.undefined)
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = this.set("gestureResponseDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureResponseDistance: Self = this.set("gestureResponseDistance", js.undefined)
    @scala.inline
    def setGesturesEnabled(value: Boolean): Self = this.set("gesturesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGesturesEnabled: Self = this.set("gesturesEnabled", js.undefined)
    @scala.inline
    def setHeader(value: /* props */ HeaderProps => TagMod[Any]): Self = this.set("header", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = this.set("headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackAllowFontScaling: Self = this.set("headerBackAllowFontScaling", js.undefined)
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColor => TagMod[Any]): Self = this.set("headerBackImage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderBackImage: Self = this.set("headerBackImage", js.undefined)
    @scala.inline
    def setHeaderBackTitle(value: String): Self = this.set("headerBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitle: Self = this.set("headerBackTitle", js.undefined)
    @scala.inline
    def setHeaderBackTitleNull: Self = this.set("headerBackTitle", null)
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = this.set("headerBackTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitleStyle: Self = this.set("headerBackTitleStyle", js.undefined)
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = this.set("headerBackTitleStyle", null)
    @scala.inline
    def setHeaderBackgroundReactElement(value: ReactElement): Self = this.set("headerBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderBackgroundFunction0(value: () => TagMod[Any]): Self = this.set("headerBackground", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaderBackground(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = this.set("headerBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackground: Self = this.set("headerBackground", js.undefined)
    @scala.inline
    def setHeaderForceInset(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
    ): Self = this.set("headerForceInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderForceInset: Self = this.set("headerForceInset", js.undefined)
    @scala.inline
    def setHeaderLeftReactElement(value: ReactElement): Self = this.set("headerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderLeftFunction1(value: /* props */ HeaderBackButtonProps => TagMod[Any]): Self = this.set("headerLeft", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderLeft(value: (js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any]): Self = this.set("headerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    @scala.inline
    def setHeaderLeftContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("headerLeftContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderLeftContainerStyle: Self = this.set("headerLeftContainerStyle", js.undefined)
    @scala.inline
    def setHeaderLeftContainerStyleNull: Self = this.set("headerLeftContainerStyle", null)
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = this.set("headerPressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderPressColorAndroid: Self = this.set("headerPressColorAndroid", js.undefined)
    @scala.inline
    def setHeaderRightReactElement(value: ReactElement): Self = this.set("headerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderRightFunction0(value: () => TagMod[Any]): Self = this.set("headerRight", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaderRight(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = this.set("headerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
    @scala.inline
    def setHeaderRightContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("headerRightContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRightContainerStyle: Self = this.set("headerRightContainerStyle", js.undefined)
    @scala.inline
    def setHeaderRightContainerStyleNull: Self = this.set("headerRightContainerStyle", null)
    @scala.inline
    def setHeaderShown(value: Boolean): Self = this.set("headerShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderShown: Self = this.set("headerShown", js.undefined)
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    @scala.inline
    def setHeaderTintColor(value: String): Self = this.set("headerTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTintColor: Self = this.set("headerTintColor", js.undefined)
    @scala.inline
    def setHeaderTitleReactElement(value: ReactElement): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ TextPropschildrenstring => TagMod[Any]): Self = this.set("headerTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderTitle(value: (js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any]): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = this.set("headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleAllowFontScaling: Self = this.set("headerTitleAllowFontScaling", js.undefined)
    @scala.inline
    def setHeaderTitleContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("headerTitleContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleContainerStyle: Self = this.set("headerTitleContainerStyle", js.undefined)
    @scala.inline
    def setHeaderTitleContainerStyleNull: Self = this.set("headerTitleContainerStyle", null)
    @scala.inline
    def setHeaderTitleStyle(value: StyleProp[TextStyle]): Self = this.set("headerTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitleStyle: Self = this.set("headerTitleStyle", js.undefined)
    @scala.inline
    def setHeaderTitleStyleNull: Self = this.set("headerTitleStyle", null)
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = this.set("headerTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTransparent: Self = this.set("headerTransparent", js.undefined)
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = this.set("headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTruncatedBackTitle: Self = this.set("headerTruncatedBackTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

