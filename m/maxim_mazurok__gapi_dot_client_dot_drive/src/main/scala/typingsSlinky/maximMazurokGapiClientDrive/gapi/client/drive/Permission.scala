package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import typingsSlinky.maximMazurokGapiClientDrive.anon.Inherited
import typingsSlinky.maximMazurokGapiClientDrive.anon.InheritedFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends StObject {
  
  /** Whether the permission allows the file to be discovered through search. This is only applicable for permissions of type domain or anyone. */
  var allowFileDiscovery: js.UndefOr[Boolean] = js.native
  
  /** Whether the account associated with this permission has been deleted. This field only pertains to user and group permissions. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The "pretty" name of the value of the permission. The following is a list of examples for each type of permission:
    * - user - User's full name, as defined for their Google account, such as "Joe Smith."
    * - group - Name of the Google Group, such as "The Company Administrators."
    * - domain - String domain name, such as "thecompany.com."
    * - anyone - No displayName is present.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** The domain to which this permission refers. */
  var domain: js.UndefOr[String] = js.native
  
  /** The email address of the user or group to which this permission refers. */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * The time at which this permission will expire (RFC 3339 date-time). Expiration times have the following restrictions:
    * - They can only be set on user and group permissions
    * - The time must be in the future
    * - The time cannot be more than a year in the future
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /** The ID of this permission. This is a unique identifier for the grantee, and is published in User resources as permissionId. IDs should be treated as opaque values. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#permission". */
  var kind: js.UndefOr[String] = js.native
  
  /** Details of whether the permissions on this shared drive item are inherited or directly on this item. This is an output-only field which is present only for shared drive items. */
  var permissionDetails: js.UndefOr[js.Array[Inherited]] = js.native
  
  /** A link to the user's profile photo, if available. */
  var photoLink: js.UndefOr[String] = js.native
  
  /**
    * The role granted by this permission. While new values may be supported in the future, the following are currently allowed:
    * - owner
    * - organizer
    * - fileOrganizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.native
  
  /** Deprecated - use permissionDetails instead. */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[InheritedFrom]] = js.native
  
  /**
    * The type of the grantee. Valid values are:
    * - user
    * - group
    * - domain
    * - anyone  When creating a permission, if type is user or group, you must provide an emailAddress for the user or group. When type is domain, you must provide a domain. There isn't
    * extra information required for a anyone type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** Indicates the view for this permission. Only populated for permissions that belong to a view. published is the only supported value. */
  var view: js.UndefOr[String] = js.native
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
    def setAllowFileDiscovery(value: Boolean): Self = StObject.set(x, "allowFileDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFileDiscoveryUndefined: Self = StObject.set(x, "allowFileDiscovery", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPermissionDetails(value: js.Array[Inherited]): Self = StObject.set(x, "permissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionDetailsUndefined: Self = StObject.set(x, "permissionDetails", js.undefined)
    
    @scala.inline
    def setPermissionDetailsVarargs(value: Inherited*): Self = StObject.set(x, "permissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[InheritedFrom]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionDetailsUndefined: Self = StObject.set(x, "teamDrivePermissionDetails", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: InheritedFrom*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
