package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends Entity {
  
  /**
    * A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue
    * indicates there is no expiration set for this permission. Optional.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // For user type permissions, the details of the users &amp; applications for this permission. Read-only.
  var grantedTo: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // For link type permissions, the details of the users to whom permission was granted. Read-only.
  var grantedToIdentities: js.UndefOr[NullableOption[js.Array[IdentitySet]]] = js.native
  
  /**
    * This indicates whether password is set for this permission, it's only showing in response. Optional and Read-only and
    * for OneDrive Personal only.
    */
  var hasPassword: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
  var inheritedFrom: js.UndefOr[NullableOption[ItemReference]] = js.native
  
  // Details of any associated sharing invitation for this permission. Read-only.
  var invitation: js.UndefOr[NullableOption[SharingInvitation]] = js.native
  
  // Provides the link details of the current permission, if it is a link type permissions. Read-only.
  var link: js.UndefOr[NullableOption[SharingLink]] = js.native
  
  // The type of permission, e.g. read. See below for the full list of roles. Read-only.
  var roles: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // A unique token that can be used to access this shared item via the **shares** API. Read-only.
  var shareId: js.UndefOr[NullableOption[String]] = js.native
}
object Permission {
  
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setGrantedTo(value: NullableOption[IdentitySet]): Self = StObject.set(x, "grantedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedToIdentities(value: NullableOption[js.Array[IdentitySet]]): Self = StObject.set(x, "grantedToIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedToIdentitiesNull: Self = StObject.set(x, "grantedToIdentities", null)
    
    @scala.inline
    def setGrantedToIdentitiesUndefined: Self = StObject.set(x, "grantedToIdentities", js.undefined)
    
    @scala.inline
    def setGrantedToIdentitiesVarargs(value: IdentitySet*): Self = StObject.set(x, "grantedToIdentities", js.Array(value :_*))
    
    @scala.inline
    def setGrantedToNull: Self = StObject.set(x, "grantedTo", null)
    
    @scala.inline
    def setGrantedToUndefined: Self = StObject.set(x, "grantedTo", js.undefined)
    
    @scala.inline
    def setHasPassword(value: NullableOption[Boolean]): Self = StObject.set(x, "hasPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPasswordNull: Self = StObject.set(x, "hasPassword", null)
    
    @scala.inline
    def setHasPasswordUndefined: Self = StObject.set(x, "hasPassword", js.undefined)
    
    @scala.inline
    def setInheritedFrom(value: NullableOption[ItemReference]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFromNull: Self = StObject.set(x, "inheritedFrom", null)
    
    @scala.inline
    def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    @scala.inline
    def setInvitation(value: NullableOption[SharingInvitation]): Self = StObject.set(x, "invitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationNull: Self = StObject.set(x, "invitation", null)
    
    @scala.inline
    def setInvitationUndefined: Self = StObject.set(x, "invitation", js.undefined)
    
    @scala.inline
    def setLink(value: NullableOption[SharingLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNull: Self = StObject.set(x, "link", null)
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesNull: Self = StObject.set(x, "roles", null)
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setShareId(value: NullableOption[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareIdNull: Self = StObject.set(x, "shareId", null)
    
    @scala.inline
    def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
  }
}
