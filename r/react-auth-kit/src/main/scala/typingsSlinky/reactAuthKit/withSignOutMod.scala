package typingsSlinky.reactAuthKit

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSignOutMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withSignOut", JSImport.Default)
  @js.native
  def default[P /* <: withSignOutProps */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  
  @js.native
  trait withSignOutProps extends StObject {
    
    def signOut(): Boolean = js.native
  }
  object withSignOutProps {
    
    @scala.inline
    def apply(signOut: () => Boolean): withSignOutProps = {
      val __obj = js.Dynamic.literal(signOut = js.Any.fromFunction0(signOut))
      __obj.asInstanceOf[withSignOutProps]
    }
    
    @scala.inline
    implicit class withSignOutPropsMutableBuilder[Self <: withSignOutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignOut(value: () => Boolean): Self = StObject.set(x, "signOut", js.Any.fromFunction0(value))
    }
  }
}
