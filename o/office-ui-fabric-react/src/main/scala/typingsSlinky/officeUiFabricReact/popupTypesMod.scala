package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.ContainsFocus
import typingsSlinky.officeUiFabricReact.popupPopupMod.Popup
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupTypesMod {
  
  @js.native
  trait IPopupProps extends HTMLAttributes[Popup] {
    
    /**
      * Defines the element id referencing the element containing the description for the popup.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.native
    
    /**
      * Accessible label text for the popup.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      *  Defines the element id referencing the element containing label text for popup.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
      * handle escape keypresses and call this. The event will be stopped/canceled.
      */
    var onDismiss: js.UndefOr[
        js.Function1[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], 
          _
        ]
      ] = js.native
    
    /**
      * Called when the component is unmounting, and focus needs to be restored.
      * Argument passed down contains two variables, the element that the underlying
      * popup believes focus should go to * and whether or not the popup currently
      * contains focus. If this is provided, focus will not be restored automatically,
      * you'll need to call originalElement.focus()
      */
    var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.native
    
    /**
      * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
      * first mounted.
      * @defaultvalue true
      * @deprecated use restoreFocus callback instead
      */
    var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
  }
  object IPopupProps {
    
    @scala.inline
    def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    @scala.inline
    implicit class IPopupPropsMutableBuilder[Self <: IPopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setOnDismiss(
        value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]] => _
      ): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = StObject.set(x, "onRestoreFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRestoreFocusUndefined: Self = StObject.set(x, "onRestoreFocus", js.undefined)
      
      @scala.inline
      def setShouldRestoreFocus(value: Boolean): Self = StObject.set(x, "shouldRestoreFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRestoreFocusUndefined: Self = StObject.set(x, "shouldRestoreFocus", js.undefined)
    }
  }
}
