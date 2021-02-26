package typingsSlinky.contentfulManagement.anon

import typingsSlinky.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/space-membership.SpaceMembershipProps, 'sys'> */
@js.native
trait OmitSpaceMembershipPropss extends StObject {
  
  var admin: Boolean = js.native
  
  var name: String = js.native
  
  var roles: js.Array[MetaLinkProps] = js.native
}
object OmitSpaceMembershipPropss {
  
  @scala.inline
  def apply(admin: Boolean, name: String, roles: js.Array[MetaLinkProps]): OmitSpaceMembershipPropss = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSpaceMembershipPropss]
  }
  
  @scala.inline
  implicit class OmitSpaceMembershipPropssMutableBuilder[Self <: OmitSpaceMembershipPropss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
