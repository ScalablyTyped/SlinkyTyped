package typingsSlinky.reactInteractive

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactInteractive.anon.As
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-interactive", JSImport.Default)
  @js.native
  class default ()
    extends Component[InteractiveProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactInteractive.anon.Active
    - typingsSlinky.reactInteractive.anon.HoverActive
  */
  trait ActiveProps extends StObject
  object ActiveProps {
    
    @scala.inline
    def Active(): typingsSlinky.reactInteractive.anon.Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactInteractive.anon.Active]
    }
    
    @scala.inline
    def HoverActive(): typingsSlinky.reactInteractive.anon.HoverActive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactInteractive.anon.HoverActive]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactInteractive.reactInteractiveStrings.mouseClick
    - typingsSlinky.reactInteractive.reactInteractiveStrings.tapClick
    - typingsSlinky.reactInteractive.reactInteractiveStrings.keyClick
  */
  trait ClickType extends StObject
  object ClickType {
    
    @scala.inline
    def keyClick: typingsSlinky.reactInteractive.reactInteractiveStrings.keyClick = "keyClick".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.keyClick]
    
    @scala.inline
    def mouseClick: typingsSlinky.reactInteractive.reactInteractiveStrings.mouseClick = "mouseClick".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.mouseClick]
    
    @scala.inline
    def tapClick: typingsSlinky.reactInteractive.reactInteractiveStrings.tapClick = "tapClick".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.tapClick]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactInteractive.reactInteractiveBooleans.`false`
    - typingsSlinky.reactInteractive.reactInteractiveStrings.tab
    - typingsSlinky.reactInteractive.reactInteractiveStrings.mouse
    - typingsSlinky.reactInteractive.reactInteractiveStrings.touch
  */
  trait Focus extends StObject
  object Focus {
    
    @scala.inline
    def `false`: typingsSlinky.reactInteractive.reactInteractiveBooleans.`false` = false.asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveBooleans.`false`]
    
    @scala.inline
    def mouse: typingsSlinky.reactInteractive.reactInteractiveStrings.mouse = "mouse".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.mouse]
    
    @scala.inline
    def tab: typingsSlinky.reactInteractive.reactInteractiveStrings.tab = "tab".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.tab]
    
    @scala.inline
    def touch: typingsSlinky.reactInteractive.reactInteractiveStrings.touch = "touch".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactInteractive.anon.Focus
    - typingsSlinky.reactInteractive.anon.FocusFromMouse
  */
  trait FocusProps extends StObject
  object FocusProps {
    
    @scala.inline
    def Focus(): typingsSlinky.reactInteractive.anon.Focus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactInteractive.anon.Focus]
    }
    
    @scala.inline
    def FocusFromMouse(): typingsSlinky.reactInteractive.anon.FocusFromMouse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactInteractive.anon.FocusFromMouse]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactInteractive.reactInteractiveStrings.normal
    - typingsSlinky.reactInteractive.reactInteractiveStrings.hover
    - typingsSlinky.reactInteractive.reactInteractiveStrings.hoverActive
    - typingsSlinky.reactInteractive.reactInteractiveStrings.touchActive
    - typingsSlinky.reactInteractive.reactInteractiveStrings.keyActive
  */
  trait IState extends StObject
  object IState {
    
    @scala.inline
    def hover: typingsSlinky.reactInteractive.reactInteractiveStrings.hover = "hover".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.hover]
    
    @scala.inline
    def hoverActive: typingsSlinky.reactInteractive.reactInteractiveStrings.hoverActive = "hoverActive".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.hoverActive]
    
    @scala.inline
    def keyActive: typingsSlinky.reactInteractive.reactInteractiveStrings.keyActive = "keyActive".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.keyActive]
    
    @scala.inline
    def normal: typingsSlinky.reactInteractive.reactInteractiveStrings.normal = "normal".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.normal]
    
    @scala.inline
    def touchActive: typingsSlinky.reactInteractive.reactInteractiveStrings.touchActive = "touchActive".asInstanceOf[typingsSlinky.reactInteractive.reactInteractiveStrings.touchActive]
  }
  
  type Interactive = ReactComponentClass[InteractiveProps]
  
  type InteractiveProps = FocusProps with ActiveProps with As
  
  @js.native
  trait State extends StObject {
    
    var focus: Focus = js.native
    
    var iState: IState = js.native
  }
  object State {
    
    @scala.inline
    def apply(focus: Focus, iState: IState): State = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], iState = iState.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIState(value: IState): Self = StObject.set(x, "iState", value.asInstanceOf[js.Any])
    }
  }
}
