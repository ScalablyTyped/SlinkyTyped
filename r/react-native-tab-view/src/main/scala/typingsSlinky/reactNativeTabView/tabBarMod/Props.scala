package typingsSlinky.reactNativeTabView.tabBarMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.anon.Color
import typingsSlinky.reactNativeTabView.typesMod.Event
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   scrollEnabled ? :boolean,   bounces ? :boolean,   activeColor ? :string,   inactiveColor ? :string,   pressColor ? :string,   pressOpacity ? :number, getLabelText (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getAccessible (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): boolean | undefined, getAccessibilityLabel (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getTestID (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, renderLabel ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderIcon ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderBadge ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): react.react.ReactNode, renderIndicator (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarIndicator.Props<T>): react.react.ReactNode, onTabPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Event): void, onTabLongPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): void,   tabStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   labelStyle ? :react-native.react-native.StyleProp<react-native.react-native.TextStyle>,   contentContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.native
  var bounces: js.UndefOr[Boolean] = js.native
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveColor: js.UndefOr[String] = js.native
  var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var layout: Layout = js.native
  var navigationState: NavigationState[T] = js.native
  var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.native
  var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] with Event, Unit]] = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var pressColor: js.UndefOr[String] = js.native
  var pressOpacity: js.UndefOr[Double] = js.native
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], TagMod[Any]]] = js.native
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, TagMod[Any]]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, TagMod[Any]]] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String] = js.native
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean] = js.native
  def getLabelText(scene: Scene[T]): js.UndefOr[String] = js.native
  def getTestID(scene: Scene[T]): js.UndefOr[String] = js.native
  def jumpTo(key: String): Unit = js.native
  def renderIndicator(props: typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props[T]): TagMod[Any] = js.native
}

object Props {
  @scala.inline
  def apply[T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    jumpTo: String => Unit,
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    renderIndicator: typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props[T] => TagMod[Any]
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self[t] <: Props[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetAccessibilityLabel(value: Scene[T] => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAccessible(value: Scene[T] => js.UndefOr[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: Scene[T] => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTestID(value: Scene[T] => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTestID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJumpTo(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationState(value: NavigationState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderIndicator(value: typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withActiveColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBounces(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounces: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withInactiveColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorContainerStyle")(null)
        ret
    }
    @scala.inline
    def withIndicatorStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(null)
        ret
    }
    @scala.inline
    def withLabelStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(null)
        ret
    }
    @scala.inline
    def withOnTabLongPress(value: /* scene */ Scene[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabLongPress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabPress(value: /* scene */ Scene[T] with Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabPress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabPress")(js.undefined)
        ret
    }
    @scala.inline
    def withPressColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPressOpacity(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressOpacity: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBadge(value: /* scene */ Scene[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBadge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBadge: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderIcon(value: /* scene */ Scene[T] with Color => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderIcon: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLabel(value: /* scene */ Scene[T] with Color => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTabStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStyle")(null)
        ret
    }
  }
  
}

