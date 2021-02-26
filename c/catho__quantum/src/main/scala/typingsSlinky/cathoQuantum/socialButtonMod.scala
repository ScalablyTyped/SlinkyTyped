package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.buttonMod.ButtonProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonMod {
  
  @JSImport("@catho/quantum/SocialButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[SocialButtonProps, js.Object, js.Any]
  
  type SocialButton = ReactComponentClass[SocialButtonProps]
  
  @js.native
  trait SocialButtonProps extends ButtonProps {
    
    var provider: String = js.native
  }
  object SocialButtonProps {
    
    @scala.inline
    def apply(provider: String): SocialButtonProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialButtonProps]
    }
    
    @scala.inline
    implicit class SocialButtonPropsMutableBuilder[Self <: SocialButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
