package typingsSlinky.reactNavigationNative

import typingsSlinky.reactNavigationNative.anon.AccessibilityRole
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkPropsMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinkProps", JSImport.Default)
  @js.native
  def default(hasToAction: Props): AccessibilityRole = js.native
  
  @js.native
  trait Props extends StObject {
    
    var action: js.UndefOr[NavigationAction] = js.native
    
    var to: String = js.native
  }
  object Props {
    
    @scala.inline
    def apply(to: String): Props = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
