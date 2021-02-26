package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hamburgerMod {
  
  @JSImport("@catho/quantum/Hamburger", JSImport.Default)
  @js.native
  class default ()
    extends Component[HamburgerProps, js.Object, js.Any]
  
  type Hamburger = ReactComponentClass[HamburgerProps]
  
  @js.native
  trait HamburgerProps extends StObject {
    
    var ariaLabelDescription: js.UndefOr[String] = js.native
    
    var inverted: js.UndefOr[Boolean] = js.native
    
    var isOpened: js.UndefOr[Boolean] = js.native
    
    var showNotification: js.UndefOr[Boolean] = js.native
  }
  object HamburgerProps {
    
    @scala.inline
    def apply(): HamburgerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HamburgerProps]
    }
    
    @scala.inline
    implicit class HamburgerPropsMutableBuilder[Self <: HamburgerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelDescription(value: String): Self = StObject.set(x, "ariaLabelDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelDescriptionUndefined: Self = StObject.set(x, "ariaLabelDescription", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenedUndefined: Self = StObject.set(x, "isOpened", js.undefined)
      
      @scala.inline
      def setShowNotification(value: Boolean): Self = StObject.set(x, "showNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNotificationUndefined: Self = StObject.set(x, "showNotification", js.undefined)
    }
  }
}
