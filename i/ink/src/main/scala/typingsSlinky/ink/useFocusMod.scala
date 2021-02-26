package typingsSlinky.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusMod {
  
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  @JSImport("ink/build/hooks/use-focus", JSImport.Default)
  @js.native
  def default(): Output = js.native
  @JSImport("ink/build/hooks/use-focus", JSImport.Default)
  @js.native
  def default(hasIsActiveAutoFocus: Input): Output = js.native
  
  @js.native
  trait Input extends StObject {
    
    /**
      * Auto focus this component, if there's no active (focused) component right now.
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable this component's focus, while still maintaining its position in the list of focusable components.
      */
    var isActive: js.UndefOr[Boolean] = js.native
  }
  object Input {
    
    @scala.inline
    def apply(): Input = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    /**
      * Determines whether this component is focused or not.
      */
    var isFocused: Boolean = js.native
  }
  object Output {
    
    @scala.inline
    def apply(isFocused: Boolean): Output = {
      val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
}
