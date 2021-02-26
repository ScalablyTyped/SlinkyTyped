package typingsSlinky.reactAriaMenubutton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FocusButton extends StObject {
    
    /**
      * If `true`, the widget's button will receive focus when the
      * menu closes. Default: `false`.
      */
    var focusButton: Boolean = js.native
  }
  object FocusButton {
    
    @scala.inline
    def apply(focusButton: Boolean): FocusButton = {
      val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusButton]
    }
    
    @scala.inline
    implicit class FocusButtonMutableBuilder[Self <: FocusButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusButton(value: Boolean): Self = StObject.set(x, "focusButton", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FocusMenu extends StObject {
    
    /**
      * If `true`, the menu's first item will receive focus when the
      * menu opens. Default: `false`.
      */
    var focusMenu: Boolean = js.native
  }
  object FocusMenu {
    
    @scala.inline
    def apply(focusMenu: Boolean): FocusMenu = {
      val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusMenu]
    }
    
    @scala.inline
    implicit class FocusMenuMutableBuilder[Self <: FocusMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusMenu(value: Boolean): Self = StObject.set(x, "focusMenu", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsOpen extends StObject {
    
    var isOpen: Boolean = js.native
  }
  object IsOpen {
    
    @scala.inline
    def apply(isOpen: Boolean): IsOpen = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsOpen]
    }
    
    @scala.inline
    implicit class IsOpenMutableBuilder[Self <: IsOpen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
