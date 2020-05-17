package typingsSlinky.reactNativeTabView.tabBarItemMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.anon.Focused
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.native
  var inactiveColor: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var navigationState: NavigationState[T] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var pressColor: js.UndefOr[String] = js.native
  var pressOpacity: js.UndefOr[Double] = js.native
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], TagMod[Any]]] = js.native
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Focused[T], TagMod[Any]]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Focused[T], TagMod[Any]]] = js.native
  var route: T = js.native
  var style: StyleProp[ViewStyle] = js.native
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String] = js.native
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean] = js.native
  def getLabelText(scene: Scene[T]): js.UndefOr[String] = js.native
  def getTestID(scene: Scene[T]): js.UndefOr[String] = js.native
  def onLongPress(): Unit = js.native
  def onPress(): Unit = js.native
}

object Props {
  @scala.inline
  def apply[T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: () => Unit,
    onPress: () => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
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
    def withNavigationState(value: NavigationState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLongPress(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
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
    def withRoute(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
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
    def withOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
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
    def withRenderIcon(value: /* scene */ Focused[T] => TagMod[Any]): Self[T] = {
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
    def withRenderLabel(value: /* scene */ Focused[T] => TagMod[Any]): Self[T] = {
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
  }
  
}

