package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.typesMod.Descriptor
import typingsSlinky.reactNavigationCore.typesMod.EventConsumer
import typingsSlinky.reactNavigationCore.typesMod.EventEmitter
import typingsSlinky.reactNavigationCore.typesMod.PrivateValueStore
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptors[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] extends StObject {
  
  var descriptors: Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ] = js.native
  
  var navigation: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers = js.native
  
  var state: State = js.native
}
object Descriptors {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](
    descriptors: Record[
      String, 
      Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
    ],
    navigation: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers,
    state: State
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  }
  
  @scala.inline
  implicit class DescriptorsMutableBuilder[Self <: Descriptors[_, _, _, _], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, _] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] (val x: Self with (Descriptors[State, EventMap, ActionHelpers, ScreenOptions])) extends AnyVal {
    
    @scala.inline
    def setDescriptors(
      value: Record[
          String, 
          Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(
      value: CanGoBack with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers
    ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
