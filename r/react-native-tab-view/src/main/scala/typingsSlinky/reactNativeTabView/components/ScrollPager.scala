package typingsSlinky.reactNativeTabView.components

import org.scalablytyped.runtime.Instantiable0
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.EventEmitterPropsposition
import typingsSlinky.reactNativeTabView.anon.Overscroll
import typingsSlinky.reactNativeTabView.pagerMod.Props
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollPager {
  @JSImport("react-native-tab-view", "ScrollPager")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTabView.mod.ScrollPager[T]] {
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
  
  def withProps[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](p: Props[T] with Overscroll): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.reactNativeTabView.typesMod.Route */ T](
    children: EventEmitterPropsposition => ReactElement,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration
  ): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T] with Overscroll]))
  }
}

