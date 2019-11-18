package typingsSlinky.mobxDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobxDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.react.reactMod.ClassicComponentClass
  import typingsSlinky.react.reactMod.ComponentClass
  import typingsSlinky.react.reactMod.ComponentState
  import typingsSlinky.react.reactMod.StatelessComponent

  // Ideal implementation:
  // export function inject
  // (
  // fn: IStoresToProps
  // ):
  // <P>(target: IReactComponent<P>) => IReactComponent<Partial<P>> & IWrappedComponent<IReactComponent<Partial<P>>>
  //
  // Or even better: (but that would require type inference to work other way around)
  // export function inject<P, I>
  // (
  // fn: IStoresToProps<any, P, I>
  // ):
  // <T extends IReactComponent<P & S>(target: T) => IReactComponent<P> & IWrappedComponent<T>
  /**
    * disposeOnUnmount
    */
  type Disposer = js.Function0[Unit]
  type IReactComponent[P] = StatelessComponent[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
  type IStoresToProps[S /* <: IValueMap */, P /* <: IValueMap */, I /* <: IValueMap */, C /* <: IValueMap */] = js.Function3[/* stores */ S, /* nextProps */ P, /* context */ C, I]
  type IValueMap = StringDictionary[js.Any]
}
