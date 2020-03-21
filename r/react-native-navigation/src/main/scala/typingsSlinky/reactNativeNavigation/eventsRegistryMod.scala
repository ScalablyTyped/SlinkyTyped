package typingsSlinky.reactNativeNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.EmitterSubscription
import typingsSlinky.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsSlinky.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsSlinky.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typingsSlinky.reactNativeNavigation.eventsMod.BottomTabSelectedEvent
import typingsSlinky.reactNativeNavigation.eventsMod.CommandCompletedEvent
import typingsSlinky.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/EventsRegistry", JSImport.Namespace)
@js.native
object eventsRegistryMod extends js.Object {
  @js.native
  class EventsRegistry protected () extends js.Object {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
    var commandsObserver: js.Any = js.native
    var componentEventsObserver: js.Any = js.native
    var nativeEventsReceiver: js.Any = js.native
    def bindComponent(component: ReactComponentClass[_]): EventSubscription = js.native
    def bindComponent(component: ReactComponentClass[_], componentId: String): EventSubscription = js.native
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    def registerBottomTabSelectedListener(callback: js.Function1[/* event */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    def registerCommandCompletedListener(callback: js.Function1[/* event */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    def registerCommandListener(callback: js.Function2[/* name */ String, /* params */ js.Any, Unit]): EventSubscription = js.native
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
  
}

