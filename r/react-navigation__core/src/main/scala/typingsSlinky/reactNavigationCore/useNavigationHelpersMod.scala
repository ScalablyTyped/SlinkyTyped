package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.anon.DangerouslyGetParent
import typingsSlinky.reactNavigationCore.typesMod.EventConsumer
import typingsSlinky.reactNavigationCore.typesMod.EventEmitter
import typingsSlinky.reactNavigationCore.typesMod.PrivateValueStore
import typingsSlinky.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationHelpersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationHelpers", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, Action /* <: NavigationAction */, EventMap /* <: Record[String, _] */](hasOnActionGetStateEmitterRouter: Options[State, Action]): DangerouslyGetParent with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers = js.native
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends StObject {
    
    var emitter: NavigationEventEmitter[_] = js.native
    
    def getState(): State = js.native
    
    def onAction(action: NavigationAction): Boolean = js.native
    def onAction(action: NavigationAction, visitedNavigators: Set[String]): Boolean = js.native
    
    var router: Router[State, Action] = js.native
  }
}
