package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.anon.NavigationRoute
import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.AddKeyedListener
import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.AddListener
import typingsSlinky.reactNavigationCore.typesMod.Descriptor
import typingsSlinky.reactNavigationCore.typesMod.EventMapBase
import typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers
import typingsSlinky.reactNavigationCore.typesMod.RouteConfig
import typingsSlinky.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useDescriptors", JSImport.Namespace)
@js.native
object useDescriptorsMod extends js.Object {
  
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    hasStateScreensNavigationScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter: Options[State, ScreenOptions, EventMap]
  ): Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ] = js.native
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends js.Object {
    
    var addKeyedListener: AddKeyedListener = js.native
    
    var addListener: AddListener = js.native
    
    var emitter: NavigationEventEmitter[_] = js.native
    
    def getState(): State = js.native
    
    var navigation: NavigationHelpers[ParamListBase, js.Object] = js.native
    
    def onAction(action: NavigationAction): Boolean = js.native
    def onAction(action: NavigationAction, visitedNavigators: Set[String]): Boolean = js.native
    
    def onRouteFocus(key: String): Unit = js.native
    
    var router: Router[State, NavigationAction] = js.native
    
    var screenOptions: js.UndefOr[ScreenOptions | (js.Function1[/* props */ NavigationRoute, ScreenOptions])] = js.native
    
    var screens: Record[String, RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]] = js.native
    
    def setState(state: State): Unit = js.native
    
    var state: State = js.native
  }
}
