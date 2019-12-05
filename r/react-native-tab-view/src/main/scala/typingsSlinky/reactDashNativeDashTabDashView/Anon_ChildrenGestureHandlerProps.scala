package typingsSlinky.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.EventEmitterProps
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Layout
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenGestureHandlerProps[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var layout: Layout
  var navigationState: NavigationState[T]
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  def children(props: EventEmitterProps with Anon_Children): TagMod[Any]
  def onIndexChange(index: Double): Unit
}

object Anon_ChildrenGestureHandlerProps {
  @scala.inline
  def apply[T /* <: Route */](
    children: EventEmitterProps with Anon_Children => TagMod[Any],
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenGestureHandlerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenGestureHandlerProps[T]]
  }
}

