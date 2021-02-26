package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.buttonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod {
  
  @JSImport("react-bootstrap/lib/ToggleButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ToggleButtonProps with ButtonProps, js.Object, js.Any]
  
  @js.native
  trait ToggleButton
    extends Component[ToggleButtonProps with ButtonProps, js.Object, js.Any]
  
  @js.native
  trait ToggleButtonProps extends HTMLProps[ToggleButton] {
    
    @JSName("value")
    var value_ToggleButtonProps: Double | String = js.native
  }
  object ToggleButtonProps {
    
    @scala.inline
    def apply(value: Double | String): ToggleButtonProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonProps]
    }
    
    @scala.inline
    implicit class ToggleButtonPropsMutableBuilder[Self <: ToggleButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
