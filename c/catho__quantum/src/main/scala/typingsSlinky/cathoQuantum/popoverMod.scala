package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.cathoQuantumStrings.bottom
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.left
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.right
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.top
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@catho/quantum/Popover", JSImport.Default)
  @js.native
  class default ()
    extends Component[PopoverProps, js.Object, js.Any]
  
  type Popover = ReactComponentClass[PopoverProps]
  
  @js.native
  trait PopoverProps extends StObject {
    
    var children: js.Array[ReactElement] | ReactElement = js.native
    
    var inverted: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placement: js.UndefOr[top | right | bottom | left] = js.native
    
    var skin: js.UndefOr[neutral | primary | success | warning | error] = js.native
    
    var trigger: ReactElement = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPlacement(value: top | right | bottom | left): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTrigger(value: ReactElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
