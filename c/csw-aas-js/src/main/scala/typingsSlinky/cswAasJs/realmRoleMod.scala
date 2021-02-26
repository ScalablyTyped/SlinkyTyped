package typingsSlinky.cswAasJs

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realmRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/RealmRole", JSImport.Default)
  @js.native
  def default(hasRealmRoleChildrenError: RealmRoleProps): ReactElement = js.native
  
  @js.native
  trait RealmRoleProps extends StObject {
    
    var children: ReactElement = js.native
    
    var error: ReactElement = js.native
    
    var realmRole: String = js.native
  }
  object RealmRoleProps {
    
    @scala.inline
    def apply(realmRole: String): RealmRoleProps = {
      val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[RealmRoleProps]
    }
    
    @scala.inline
    implicit class RealmRolePropsMutableBuilder[Self <: RealmRoleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setRealmRole(value: String): Self = StObject.set(x, "realmRole", value.asInstanceOf[js.Any])
    }
  }
}
