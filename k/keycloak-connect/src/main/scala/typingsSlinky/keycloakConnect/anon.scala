package typingsSlinky.keycloakConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Grant extends StObject {
    
    var grant: js.UndefOr[typingsSlinky.keycloakConnect.mod.Grant] = js.native
  }
  object Grant {
    
    @scala.inline
    def apply(): Grant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grant]
    }
    
    @scala.inline
    implicit class GrantMutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrant(value: typingsSlinky.keycloakConnect.mod.Grant): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
    }
  }
  
  @js.native
  trait Roles extends StObject {
    
    var roles: js.UndefOr[js.Array[String]] = js.native
  }
  object Roles {
    
    @scala.inline
    def apply(): Roles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Roles]
    }
    
    @scala.inline
    implicit class RolesMutableBuilder[Self <: Roles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
}
