package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.anon.PartialStateNavigationSta
import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.ChildActionListener
import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typingsSlinky.reactNavigationCore.typesMod.EventMapCore
import typingsSlinky.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.reactNavigationRouters.typesMod.RouterConfigOptions
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnActionMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnAction", JSImport.Default)
  @js.native
  def default(
    hasRouterGetStateSetStateKeyActionListenersBeforeRemoveListenersRouterConfigOptionsEmitter: Options
  ): js.Function2[
    /* action */ NavigationAction, 
    /* visitedNavigators */ js.UndefOr[Set[String]], 
    Boolean
  ] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var actionListeners: js.Array[ChildActionListener] = js.native
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]] = js.native
    
    var emitter: NavigationEventEmitter[EventMapCore[_]] = js.native
    
    def getState(): NavigationState[ParamListBase] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var router: Router[NavigationState[ParamListBase], NavigationAction] = js.native
    
    var routerConfigOptions: RouterConfigOptions = js.native
    
    def setState(state: PartialStateNavigationSta): Unit = js.native
    def setState(state: NavigationState[ParamListBase]): Unit = js.native
  }
}
