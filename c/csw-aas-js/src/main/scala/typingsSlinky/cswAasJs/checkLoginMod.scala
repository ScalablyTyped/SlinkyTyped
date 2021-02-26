package typingsSlinky.cswAasJs

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkLoginMod {
  
  @JSImport("csw-aas-js/dist/components/authentication/CheckLogin", JSImport.Default)
  @js.native
  def default(hasChildrenError: CheckLoginProps): ReactElement = js.native
  
  @js.native
  trait CheckLoginProps extends StObject {
    
    var children: ReactElement = js.native
    
    var error: ReactElement = js.native
  }
  object CheckLoginProps {
    
    @scala.inline
    def apply(): CheckLoginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckLoginProps]
    }
    
    @scala.inline
    implicit class CheckLoginPropsMutableBuilder[Self <: CheckLoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
