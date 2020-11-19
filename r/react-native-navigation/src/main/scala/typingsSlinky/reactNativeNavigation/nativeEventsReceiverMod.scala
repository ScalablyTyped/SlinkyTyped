package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNative.mod.EmitterSubscription
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsSlinky.reactNativeNavigation.eventsMod.BottomTabLongPressedEvent
import typingsSlinky.reactNativeNavigation.eventsMod.BottomTabPressedEvent
import typingsSlinky.reactNativeNavigation.eventsMod.BottomTabSelectedEvent
import typingsSlinky.reactNativeNavigation.eventsMod.CommandCompletedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/adapters/NativeEventsReceiver", JSImport.Namespace)
@js.native
object nativeEventsReceiverMod extends js.Object {
  
  @js.native
  class NativeEventsReceiver () extends js.Object {
    
    var emitter: js.Any = js.native
    
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    
    def registerBottomTabLongPressedListener(callback: js.Function1[/* data */ BottomTabLongPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabPressedListener(callback: js.Function1[/* data */ BottomTabPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabSelectedListener(callback: js.Function1[/* data */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandCompletedListener(callback: js.Function1[/* data */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalAttemptedToDismissListener(callback: js.Function1[/* event */ ModalAttemptedToDismissEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerScreenPoppedListener(callback: js.Function1[/* event */ ScreenPoppedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
}
