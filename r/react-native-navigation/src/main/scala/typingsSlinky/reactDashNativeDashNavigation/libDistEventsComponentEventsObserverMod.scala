package typingsSlinky.reactDashNativeDashNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashNativeDashNavigation.libDistAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typingsSlinky.reactDashNativeDashNavigation.libDistComponentsStoreMod.Store
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidAppearEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ModalDismissedEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.PreviewCompletedEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typingsSlinky.reactDashNativeDashNavigation.libDistInterfacesEventSubscriptionMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", JSImport.Namespace)
@js.native
object libDistEventsComponentEventsObserverMod extends js.Object {
  @js.native
  class ComponentEventsObserver protected () extends js.Object {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    var alreadyRegistered: js.Any = js.native
    var listeners: js.Any = js.native
    val nativeEventsReceiver: js.Any = js.native
    val store: js.Any = js.native
    var triggerOnAllListenersByComponentId: js.Any = js.native
    def bindComponent(component: ReactComponentClass[_]): EventSubscription = js.native
    def bindComponent(component: ReactComponentClass[_], componentId: String): EventSubscription = js.native
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    def notifyModalDismissed(event: ModalDismissedEvent): Unit = js.native
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    def registerOnceForAllComponentEvents(): Unit = js.native
    def unmounted(componentId: String): Unit = js.native
  }
  
}

