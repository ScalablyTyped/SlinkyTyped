package typingsSlinky.nuclearJsReactAddonsChefsplate

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Container component allowing a reactor to be exposed via context.
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "Provider")
  @js.native
  val Provider: js.Any = js.native
  
  /**
    * Connects a React component to a Nuclear.js store.
    *
    * `connect()` provides its connected component with the pieces of the data
    * it needs from the store. This data is supplied via props, which are
    * configured in the passed-in `mapStateToProps` function.
    *
    * `connect()` does not modify the component passed to it; instead, it
    * returns a new, connected component class that wraps the component you
    * passed in.
    *
    * @template TInjectedPropNames Names of props injected by `mapStateToProps`.
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "connect")
  @js.native
  def connect[TInjectedPropNames /* <: String | Double | js.Symbol */](mapStateToProps: MapStateToProps[TInjectedPropNames]): ComponentConnector[TInjectedPropNames] = js.native
  
  /**
    * Provides dataBindings + reactor as props to wrapped component.
    *
    * Example:
    * ```
    * var WrappedComponent = nuclearComponent(Component, function(props) {
    *   return { counter: 'counter' };
    * );
    * ```
    *
    * Also supports the decorator pattern:
    *
    * ```js
    * @nuclearComponent((props) => {
    *   return { counter: 'counter' }
    * })
    * class BaseComponent extends React.Component {
    *   render() {
    *     const { counter, reactor } = this.props;
    *     return <div/>;
    *   }
    * }
    * ```
    *
    * @param [Component] Component to wrap
    * @param [getDataBindings] Function which returns dataBindings to listen for data change
    * @returns Returns function if using decorator pattern
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "nuclearComponent")
  @js.native
  val nuclearComponent: js.Any = js.native
  
  /**
    * Mixin expecting a context.reactor on the component
    *
    * Should be used if a higher level component has been
    * wrapped with provideReactor
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "nuclearMixin")
  @js.native
  val nuclearMixin: js.Any = js.native
  
  /**
    * Provides reactor prop to all children as React context
    *
    * Example:
    *   var WrappedComponent = provideReactor(Component, {
    *     foo: React.PropTypes.string
    *   });
    *
    * Also supports the decorator pattern:
    *   @provideReactor({
    *     foo: React.PropTypes.string
    *   })
    *   class BaseComponent extends React.Component {
    *     render() {
    *       return <div/>;
    *     }
    *   }
    *
    * @param [Component] Component to wrap
    * @param [additionalContextTypes] Additional contextTypes to add
    * @returns Returns function if using decorator pattern
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "provideReactor")
  @js.native
  val provideReactor: js.Any = js.native
  
  // Injects props and removes them from the prop requirements.
  // Will not pass through the injected props if they are passed in during
  // render. Also adds new prop requirements from TNeedsProps.
  type ComponentConnector[TInjectedPropNames /* <: String | Double | js.Symbol */] = js.Function1[
    /* component */ ReactComponentClass[js.Any], 
    ReactComponentClass[StrictOmit[js.Any, TInjectedPropNames]]
  ]
  
  // Function that returns getters, which are turned into injected props.
  type MapStateToProps[TInjectedPropNames /* <: String | Double | js.Symbol */] = js.Function1[
    /* props */ js.UndefOr[js.Any], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ propName in TInjectedPropNames ]: any}
    */ typingsSlinky.nuclearJsReactAddonsChefsplate.nuclearJsReactAddonsChefsplateStrings.MapStateToProps with TopLevel[js.Any]
  ]
  
  /**
    * The built-in Omit doesn't error out if omitted key doesn't exist on the main type.
    */
  type StrictOmit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
