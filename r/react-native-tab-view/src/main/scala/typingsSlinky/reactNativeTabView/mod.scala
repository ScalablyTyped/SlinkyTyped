package typingsSlinky.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.scrollPagerMod.default
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ScrollPager[T /* <: Route */] () extends default[T]
  
  @js.native
  class TabBar[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabBarMod.default[T]
  
  @js.native
  class TabView[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabViewMod.default[T]
  
  def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ReactComponentClass[T]]): js.Function1[/* hasRouteJumpToPosition */ T, ReactElement] = js.native
  /* static members */
  @js.native
  object ScrollPager extends js.Object {
    var defaultProps: AnonBounces = js.native
  }
  
  /* static members */
  @js.native
  object TabBar extends js.Object {
    var defaultProps: AnonGetAccessibilityLabel = js.native
  }
  
  /* static members */
  @js.native
  object TabView extends js.Object {
    var defaultProps: AnonGestureHandlerProps = js.native
  }
  
}

