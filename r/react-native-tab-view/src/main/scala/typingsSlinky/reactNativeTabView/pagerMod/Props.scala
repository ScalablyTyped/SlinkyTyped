package typingsSlinky.reactNativeTabView.pagerMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNativeTabView.anon.Damping
import typingsSlinky.reactNativeTabView.anon.Duration
import typingsSlinky.reactNativeTabView.anon.EventEmitterPropsposition
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   layout  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Layout,   removeClippedSubviews ? :boolean, children (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void}): react.react.ReactNode,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = js.native
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  var layout: Layout = js.native
  var navigationState: NavigationState[T] = js.native
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var springConfig: Damping = js.native
  var springVelocityScale: js.UndefOr[Double] = js.native
  var swipeEnabled: Boolean = js.native
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  var timingConfig: Duration = js.native
  def children(props: EventEmitterPropsposition): TagMod[Any] = js.native
  def onIndexChange(index: Double): Unit = js.native
}

object Props {
  @scala.inline
  def apply[T](
    children: EventEmitterPropsposition => TagMod[Any],
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration
  ): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self[t] <: Props[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: EventEmitterPropsposition => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandlerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: none | `on-drag` | auto): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
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
    def withOnIndexChange(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpringConfig(value: Damping): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimingConfig(value: Duration): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeEnd(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringVelocityScale(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringVelocityScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeVelocityImpact(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeVelocityImpact: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(js.undefined)
        ret
    }
  }
  
}

