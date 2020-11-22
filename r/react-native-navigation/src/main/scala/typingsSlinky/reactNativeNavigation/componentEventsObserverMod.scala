package typingsSlinky.reactNativeNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsSlinky.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typingsSlinky.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typingsSlinky.reactNativeNavigation.navigationComponentListenerMod.NavigationComponentListener
import typingsSlinky.reactNativeNavigation.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", JSImport.Namespace)
@js.native
object componentEventsObserverMod extends js.Object {
  
  @js.native
  class ComponentEventsObserver protected () extends js.Object {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    
    var alreadyRegistered: js.Any = js.native
    
    def bindComponent(component: ReactComponentClass[_]): EventSubscription = js.native
    def bindComponent(component: ReactComponentClass[_], componentId: String): EventSubscription = js.native
    
    var listeners: js.Any = js.native
    
    val nativeEventsReceiver: js.Any = js.native
    
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    
    def notifyScreenPopped(event: ScreenPoppedEvent): Unit = js.native
    
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    
    def registerComponentListener(listener: NavigationComponentListener, componentId: String): EventSubscription = js.native
    
    def registerOnceForAllComponentEvents(): Unit = js.native
    
    val store: js.Any = js.native
    
    var triggerOnAllListenersByComponentId: js.Any = js.native
    
    def unmounted(componentId: String): Unit = js.native
  }
}
