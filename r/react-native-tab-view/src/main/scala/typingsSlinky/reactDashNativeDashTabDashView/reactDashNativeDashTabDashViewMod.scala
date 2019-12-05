package typingsSlinky.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTabBarMod.default
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view", JSImport.Namespace)
@js.native
object reactDashNativeDashTabDashViewMod extends js.Object {
  @js.native
  class TabBar[T /* <: Route */] () extends default[T]
  
  @js.native
  class TabView[T /* <: Route */] ()
    extends typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTabViewMod.default[T]
  
  def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ReactComponentClass[T]]): js.Function1[/* hasRouteJumpToPosition */ T, Element] = js.native
  /* static members */
  @js.native
  object TabBar extends js.Object {
    var defaultProps: Anon_GetAccessibilityLabel = js.native
  }
  
  /* static members */
  @js.native
  object TabView extends js.Object {
    var defaultProps: Anon_GestureHandlerProps = js.native
  }
  
}

