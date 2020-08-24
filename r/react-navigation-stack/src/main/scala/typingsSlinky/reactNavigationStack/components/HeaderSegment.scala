package typingsSlinky.reactNavigationStack.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.anon.Style
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.anon.TintColorString
import typingsSlinky.reactNavigationStack.headerSegmentMod.Props
import typingsSlinky.reactNavigationStack.headerSegmentMod.default
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.center
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.left
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderLeftButtonProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderSegment {
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderSegment", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def headerBackAllowFontScaling(value: Boolean): this.type = set("headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackImage(value: /* props */ TintColorString => ReactElement): this.type = set("headerBackImage", js.Any.fromFunction1(value))
    @scala.inline
    def headerBackTitle(value: String): this.type = set("headerBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackTitleStyle(value: StyleProp[TextStyle]): this.type = set("headerBackTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackTitleStyleNull: this.type = set("headerBackTitleStyle", null)
    @scala.inline
    def headerBackTitleVisible(value: Boolean): this.type = set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackground(value: /* props */ Style => ReactElement): this.type = set("headerBackground", js.Any.fromFunction1(value))
    @scala.inline
    def headerLeft(value: /* props */ StackHeaderLeftButtonProps => ReactElement): this.type = set("headerLeft", js.Any.fromFunction1(value))
    @scala.inline
    def headerLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): this.type = set("headerLeftContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerPressColorAndroid(value: String): this.type = set("headerPressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRight(value: /* props */ TintColor => ReactElement): this.type = set("headerRight", js.Any.fromFunction1(value))
    @scala.inline
    def headerRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): this.type = set("headerRightContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerStatusBarHeight(value: Double): this.type = set("headerStatusBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def headerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTintColor(value: String): this.type = set("headerTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTitleAlign(value: left | center): this.type = set("headerTitleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTitleAllowFontScaling(value: Boolean): this.type = set("headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): this.type = set("headerTitleContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTitleStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
    ): this.type = set("headerTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTransparent(value: Boolean): this.type = set("headerTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTruncatedBackTitle(value: String): this.type = set("headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def leftLabel(value: String): this.type = set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onGoBack(value: () => Unit): this.type = set("onGoBack", js.Any.fromFunction0(value))
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    headerTitle: StackHeaderTitleProps => ReactElement,
    insets: EdgeInsets,
    layout: Layout,
    scene: Scene[NavigationRoute[NavigationParams]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): Builder = {
    val __props = js.Dynamic.literal(headerTitle = js.Any.fromFunction1(headerTitle), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

