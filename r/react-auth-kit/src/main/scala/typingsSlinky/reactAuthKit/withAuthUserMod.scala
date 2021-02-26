package typingsSlinky.reactAuthKit

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAuthUserMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withAuthUser", JSImport.Default)
  @js.native
  def default[P /* <: withAuthProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  @js.native
  trait withAuthProps extends StObject {
    
    var authState: js.Object | Null = js.native
  }
  object withAuthProps {
    
    @scala.inline
    def apply(): withAuthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withAuthProps]
    }
    
    @scala.inline
    implicit class withAuthPropsMutableBuilder[Self <: withAuthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStateNull: Self = StObject.set(x, "authState", null)
    }
  }
}
