package typingsSlinky.ionicReact

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicReact.anon.Create
import typingsSlinky.ionicReact.anon.ForwardedRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createControllerComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
  @js.native
  def createControllerComponent[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType with ReactControllerProps with ForwardedRef[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
  
  @js.native
  trait OverlayBase extends HTMLElement {
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    
    def present(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ReactControllerProps extends StObject {
    
    var isOpen: Boolean = js.native
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  }
  object ReactControllerProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ReactControllerProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactControllerProps]
    }
    
    @scala.inline
    implicit class ReactControllerPropsMutableBuilder[Self <: ReactControllerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDidDismiss(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
      
      @scala.inline
      def setOnDidPresent(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
      
      @scala.inline
      def setOnWillDismiss(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
      
      @scala.inline
      def setOnWillPresent(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    }
  }
}
