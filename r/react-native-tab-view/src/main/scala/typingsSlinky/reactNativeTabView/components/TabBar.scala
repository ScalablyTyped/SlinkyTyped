package typingsSlinky.reactNativeTabView.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.anon.Color
import typingsSlinky.reactNativeTabView.anon.Key
import typingsSlinky.reactNativeTabView.tabBarItemMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Event
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  @JSImport("react-native-tab-view", "TabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: Route */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTabView.mod.TabBar[T]] {
    
    @scala.inline
    def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    @scala.inline
    def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorContainerStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorContainerStyleNull: this.type = set("indicatorContainerStyle", null)
    
    @scala.inline
    def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    @scala.inline
    def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    
    @scala.inline
    def onTabLongPress(value: /* scene */ Scene[T] => Unit): this.type = set("onTabLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTabPress(value: /* scene */ Scene[T] with Event => Unit): this.type = set("onTabPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def pressColor(value: String): this.type = set("pressColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pressOpacity(value: Double): this.type = set("pressOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderBadge(value: /* scene */ Scene[T] => ReactElement): this.type = set("renderBadge", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderIcon(value: /* scene */ Scene[T] with Color => ReactElement): this.type = set("renderIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderLabel(value: /* scene */ Scene[T] with Color => ReactElement): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabBarItem(value: /* props */ Props[T] with Key => ReactElement): this.type = set("renderTabBarItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyleNull: this.type = set("tabStyle", null)
  }
  
  def withProps[T /* <: Route */](p: typingsSlinky.reactNativeTabView.tabBarMod.Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: Route */](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    jumpTo: String => Unit,
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    renderIndicator: typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactElement
  ): Builder[T] = {
    val __props = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderIndicator = js.Any.fromFunction1(renderIndicator))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactNativeTabView.tabBarMod.Props[T]]))
  }
}
