package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.Instantiable0
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.Overscroll
import typingsSlinky.reactNativeTabView.pagerMod.Props
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.scrollPagerMod.default
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollPager {
  @JSImport("react-native-tab-view/lib/typescript/src/ScrollPager", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: Route] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def onSwipeEnd(value: () => Unit): this.type = set("onSwipeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeStart(value: () => Unit): this.type = set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def overscroll(value: Boolean): this.type = set("overscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def springVelocityScale(value: Double): this.type = set("springVelocityScale", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeVelocityImpact(value: Double): this.type = set("swipeVelocityImpact", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: Route](p: Props[T] with Overscroll): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: Route](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration
  ): Builder[T] = {
    val __props = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T] with Overscroll]))
  }
}

