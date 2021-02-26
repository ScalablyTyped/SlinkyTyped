package typingsSlinky.reactNativeNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ComponentProvider
import typingsSlinky.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsSlinky.reactNativeNavigation.storeMod.Store
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentWrapperMod {
  
  @JSImport("react-native-navigation/lib/dist/components/ComponentWrapper", "ComponentWrapper")
  @js.native
  class ComponentWrapper () extends StObject {
    
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ReactComponentClass[_] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ReactComponentClass[_] = js.native
    
    def wrapWithRedux(WrappedComponent: ReactComponentClass[_], ReduxProvider: js.Any, reduxStore: js.Any): ReactComponentClass[_] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, js.Any] {
    
    def setProps(newProps: Record[String, _]): Unit = js.native
  }
}
