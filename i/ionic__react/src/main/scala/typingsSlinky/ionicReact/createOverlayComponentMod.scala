package typingsSlinky.ionicReact

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactElement
import typingsSlinky.ionicReact.anon.`0`
import typingsSlinky.ionicReact.anon.`1`
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createOverlayComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createOverlayComponent", "createOverlayComponent")
  @js.native
  def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](displayName: String, controller: `0`[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent with ReactOverlayProps with `1`[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
  
  @js.native
  trait OverlayElement extends HTMLElement {
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    
    def present(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ReactOverlayProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var isOpen: Boolean = js.native
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  }
  object ReactOverlayProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ReactOverlayProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactOverlayProps]
    }
    
    @scala.inline
    implicit class ReactOverlayPropsMutableBuilder[Self <: ReactOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
