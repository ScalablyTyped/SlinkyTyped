package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNative.mod.ComponentProvider
import typingsSlinky.reactNativeNavigation.anon.TypeofTouchablePreview
import typingsSlinky.reactNativeNavigation.commandNameMod.CommandName
import typingsSlinky.reactNativeNavigation.constantsMod.NavigationConstants
import typingsSlinky.reactNativeNavigation.eventsRegistryMod.EventsRegistry
import typingsSlinky.reactNativeNavigation.layoutMod.Layout
import typingsSlinky.reactNativeNavigation.layoutMod.LayoutRoot
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import typingsSlinky.reactNativeNavigation.processorSubscriptionMod.ProcessorSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/Navigation", JSImport.Namespace)
@js.native
object navigationMod extends js.Object {
  
  @js.native
  class NavigationRoot () extends js.Object {
    
    val TouchablePreview: TypeofTouchablePreview = js.native
    
    /**
      * Method to be invoked when a layout is processed and is about to be created. This can be used to change layout options or even inject props to components.
      */
    def addLayoutProcessor(
      processor: js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
    ): ProcessorSubscription = js.native
    
    /**
      * Adds an option processor which allows option interpolation by optionPath.
      */
    def addOptionProcessor[T](optionPath: String, processor: js.Function2[/* value */ T, /* commandName */ CommandName, T]): ProcessorSubscription = js.native
    
    val commands: js.Any = js.native
    
    val commandsObserver: js.Any = js.native
    
    val componentEventsObserver: js.Any = js.native
    
    val componentRegistry: js.Any = js.native
    
    val componentWrapper: js.Any = js.native
    
    /**
      * Constants coming from native
      */
    def constants(): js.Promise[NavigationConstants] = js.native
    
    /**
      * Dismiss all Modals
      */
    def dismissAllModals(): js.Promise[_] = js.native
    def dismissAllModals(mergeOptions: Options): js.Promise[_] = js.native
    
    /**
      * Dismiss a modal by componentId. The dismissed modal can be anywhere in the stack.
      */
    def dismissModal(componentId: String): js.Promise[_] = js.native
    def dismissModal(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    /**
      * dismiss overlay by componentId
      */
    def dismissOverlay(componentId: String): js.Promise[_] = js.native
    
    /**
      * Obtain the events registry instance
      */
    def events(): EventsRegistry = js.native
    
    val eventsRegistry: js.Any = js.native
    
    /**
      * Resolves arguments passed on launch
      */
    def getLaunchArgs(): js.Promise[_] = js.native
    
    val layoutProcessorsStore: js.Any = js.native
    
    val layoutTreeCrawler: js.Any = js.native
    
    val layoutTreeParser: js.Any = js.native
    
    /**
      * Change a component's navigation options
      */
    def mergeOptions(componentId: String, options: Options): Unit = js.native
    
    val nativeCommandsSender: js.Any = js.native
    
    val nativeEventsReceiver: js.Any = js.native
    
    val optionProcessorsStore: js.Any = js.native
    
    /**
      * Pop a component from the stack, regardless of it's position.
      */
    def pop(componentId: String): js.Promise[_] = js.native
    def pop(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    /**
      * Pop the stack to a given component
      */
    def popTo(componentId: String): js.Promise[_] = js.native
    def popTo(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    /**
      * Pop the component's stack to root.
      */
    def popToRoot(componentId: String): js.Promise[_] = js.native
    def popToRoot(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    /**
      * Push a new layout into this screen's navigation stack.
      */
    def push[P](componentId: String, layout: Layout[P]): js.Promise[_] = js.native
    
    /**
      * Every navigation component in your app must be registered with a unique name.
      * The component itself is a traditional React component extending React.Component.
      */
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    
    /**
      * Utility helper function like registerComponent,
      * wraps the provided component with a react-redux Provider with the passed redux store
      */
    def registerComponentWithRedux(
      componentName: String,
      getComponentClassFunc: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponentWithRedux(
      componentName: Double,
      getComponentClassFunc: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    
    /**
      * Set default options to all screens. Useful for declaring a consistent style across the app.
      */
    def setDefaultOptions(options: Options): Unit = js.native
    
    def setLazyComponentRegistrator(lazyRegistratorFn: js.Function1[/* lazyComponentRequest */ String | Double, Unit]): Unit = js.native
    
    /**
      * Reset the app to a new layout
      */
    def setRoot(layout: LayoutRoot): js.Promise[_] = js.native
    
    def setStackRoot[P](componentId: String, layout: js.Array[Layout[P]]): js.Promise[_] = js.native
    /**
      * Sets new root component to stack.
      */
    def setStackRoot[P](componentId: String, layout: Layout[P]): js.Promise[_] = js.native
    
    /**
      * Show a screen as a modal.
      */
    def showModal[P](layout: Layout[P]): js.Promise[_] = js.native
    
    /**
      * Show overlay on top of the entire app
      */
    def showOverlay[P](layout: Layout[P]): js.Promise[_] = js.native
    
    val store: js.Any = js.native
    
    val uniqueIdProvider: js.Any = js.native
    
    /**
      * Update a mounted component's props
      */
    def updateProps(componentId: String, props: js.Object): Unit = js.native
  }
}
