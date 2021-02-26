package typingsSlinky.reactMdButton

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabMod {
  
  @JSImport("@react-md/button/types/FAB", "FAB")
  @js.native
  val FAB: ForwardRefExoticComponent[FABProps with RefAttributes[HTMLSpanElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.reactMdButton.reactMdButtonStrings.`bottom-left`
    - typingsSlinky.reactMdButton.reactMdButtonStrings.`bottom-right`
    - typingsSlinky.reactMdButton.reactMdButtonStrings.`top-left`
    - typingsSlinky.reactMdButton.reactMdButtonStrings.`top-right`
  */
  type FABPosition = _FABPosition | Null
  
  @js.native
  trait FABProps extends HTMLAttributes[HTMLSpanElement] {
    
    /**
      * The position within the viewport to display the button as a floating action
      * button.
      */
    var position: js.UndefOr[FABPosition] = js.native
  }
  object FABProps {
    
    @scala.inline
    def apply(): FABProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FABProps]
    }
    
    @scala.inline
    implicit class FABPropsMutableBuilder[Self <: FABProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: FABPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait _FABPosition extends StObject
}
