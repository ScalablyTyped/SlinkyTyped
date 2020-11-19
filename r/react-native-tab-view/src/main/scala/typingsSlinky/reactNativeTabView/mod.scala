package typingsSlinky.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.anon.Bounces
import typingsSlinky.reactNativeTabView.anon.GestureHandlerProps
import typingsSlinky.reactNativeTabView.anon.GetAccessibilityLabel
import typingsSlinky.reactNativeTabView.anon.PressColor
import typingsSlinky.reactNativeTabView.anon.SceneRendererPropsroutean
import typingsSlinky.reactNativeTabView.scrollPagerMod.default
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-tab-view", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ReactComponentClass[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, ReactElement] = js.native
  
  @js.native
  class ScrollPager[T /* <: Route */] () extends default[T]
  /* static members */
  @js.native
  object ScrollPager extends js.Object {
    
    var defaultProps: Bounces = js.native
  }
  
  @js.native
  class TabBar[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabBarMod.default[T]
  /* static members */
  @js.native
  object TabBar extends js.Object {
    
    var defaultProps: GetAccessibilityLabel = js.native
  }
  
  @js.native
  class TabBarIndicator[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabBarIndicatorMod.TabBarIndicator[T]
  
  @js.native
  class TabBarItem[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabBarItemMod.TabBarItem[T]
  
  @js.native
  class TabView[T /* <: Route */] ()
    extends typingsSlinky.reactNativeTabView.tabViewMod.default[T]
  /* static members */
  @js.native
  object TabView extends js.Object {
    
    var defaultProps: GestureHandlerProps = js.native
  }
  
  @js.native
  class TouchableItem ()
    extends typingsSlinky.reactNativeTabView.touchableItemMod.default
  /* static members */
  @js.native
  object TouchableItem extends js.Object {
    
    var defaultProps: PressColor = js.native
  }
}
