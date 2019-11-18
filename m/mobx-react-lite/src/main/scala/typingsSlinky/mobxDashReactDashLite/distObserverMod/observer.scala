package typingsSlinky.mobxDashReactDashLite.distObserverMod

import slinky.core.ReactComponentClass
import typingsSlinky.mobxDashReactDashLite.Anon_ForwardRef
import typingsSlinky.react.reactMod.ForwardRefExoticComponent
import typingsSlinky.react.reactMod.FunctionComponent
import typingsSlinky.react.reactMod.PropsWithoutRef
import typingsSlinky.react.reactMod.RefAttributes
import typingsSlinky.react.reactMod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", "observer")
@js.native
object observer extends js.Object {
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P]): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptions with Anon_ForwardRef): ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}

