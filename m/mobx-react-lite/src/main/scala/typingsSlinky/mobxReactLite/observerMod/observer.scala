package typingsSlinky.mobxReactLite.observerMod

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReactLite.anon.DisplayName
import typingsSlinky.mobxReactLite.anon.IObserverOptionsforwardRe
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/observer", "observer")
@js.native
object observer extends js.Object {
  
  def apply[P /* <: js.Object */](baseComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): ReactComponentClass[P] = js.native
  def apply[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def apply[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def apply[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}
