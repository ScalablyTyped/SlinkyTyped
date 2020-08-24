package typingsSlinky.reactNativeTabView.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.anon.Focused
import typingsSlinky.reactNativeTabView.tabBarItemMod.Props
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBarItem {
  @JSImport("react-native-tab-view", "TabBarItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTabView.mod.TabBarItem[T]] {
    @scala.inline
    def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def pressColor(value: String): this.type = set("pressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pressOpacity(value: Double): this.type = set("pressOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def renderBadge(value: /* scene */ Scene[T] => ReactElement): this.type = set("renderBadge", js.Any.fromFunction1(value))
    @scala.inline
    def renderIcon(value: /* scene */ Focused[T] => ReactElement): this.type = set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def renderLabel(value: /* scene */ Focused[T] => ReactElement): this.type = set("renderLabel", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: () => Unit,
    onPress: () => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T
  ): Builder[T] = {
    val __props = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}

