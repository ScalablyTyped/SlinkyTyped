package typingsSlinky.reactDashNativeDashNavigation

import typingsSlinky.reactDashNative.reactDashNativeMod.ComponentProvider
import typingsSlinky.reactDashNativeDashNavigation.libDistAdaptersAppRegistryServiceMod.AppRegistryService
import typingsSlinky.reactDashNativeDashNavigation.libDistComponentsComponentWrapperMod.ComponentWrapper
import typingsSlinky.reactDashNativeDashNavigation.libDistComponentsStoreMod.Store
import typingsSlinky.reactDashNativeDashNavigation.libDistEventsComponentEventsObserverMod.ComponentEventsObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/components/ComponentRegistry", JSImport.Namespace)
@js.native
object libDistComponentsComponentRegistryMod extends js.Object {
  @js.native
  class ComponentRegistry protected () extends js.Object {
    def this(
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      componentWrapper: ComponentWrapper,
      appRegistryService: AppRegistryService
    ) = this()
    var appRegistryService: js.Any = js.native
    var componentEventsObserver: js.Any = js.native
    var componentWrapper: js.Any = js.native
    var store: js.Any = js.native
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
  }
  
}

