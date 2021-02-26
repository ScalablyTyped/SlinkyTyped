package typingsSlinky.mobxReactLite

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReactLite.anon.DisplayName
import typingsSlinky.mobxReactLite.anon.IObserverOptionsforwardRe
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.RefForwardingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): ReactComponentClass[P] = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[C /* <: ReactComponentClass[_] */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): ReactComponentClass[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  
  @js.native
  trait IObserverOptions extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] = js.native
  }
  object IObserverOptions {
    
    @scala.inline
    def apply(): IObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverOptions]
    }
    
    @scala.inline
    implicit class IObserverOptionsMutableBuilder[Self <: IObserverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
}
