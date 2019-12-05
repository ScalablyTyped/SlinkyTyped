package typingsSlinky.reactDashNativeDashTabDashView

import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTabBarIndicatorMod.GetTabWidth
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetTabWidth[T /* <: Route */] extends js.Object {
  var getTabWidth: GetTabWidth
  var navigationState: NavigationState[T]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: String
}

object Anon_GetTabWidth {
  @scala.inline
  def apply[T /* <: Route */](
    getTabWidth: /* index */ Double => Double,
    navigationState: NavigationState[T],
    width: String,
    style: StyleProp[ViewStyle] = null
  ): Anon_GetTabWidth[T] = {
    val __obj = js.Dynamic.literal(getTabWidth = js.Any.fromFunction1(getTabWidth), navigationState = navigationState.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GetTabWidth[T]]
  }
}

