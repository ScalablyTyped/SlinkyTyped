package typingsSlinky.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantPermissionsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation resources. 
    */
  var Permissions: PermissionList = js.native
  
  /**
    * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may only be a subset of the permissions granted in the Privileges.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  
  /**
    * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and they are defined by their principal type and their ARN. Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that same ARN, the resource maintains the permissions already granted. 
    */
  var Principal: DataLakePrincipal = js.native
  
  /**
    * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog, databases, and tables.
    */
  var Resource: typingsSlinky.awsSdk.lakeformationMod.Resource = js.native
}
object GrantPermissionsRequest {
  
  @scala.inline
  def apply(Permissions: PermissionList, Principal: DataLakePrincipal, Resource: Resource): GrantPermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantPermissionsRequest]
  }
  
  @scala.inline
  implicit class GrantPermissionsRequestMutableBuilder[Self <: GrantPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissionsWithGrantOption(value: PermissionList): Self = StObject.set(x, "PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsWithGrantOptionUndefined: Self = StObject.set(x, "PermissionsWithGrantOption", js.undefined)
    
    @scala.inline
    def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = StObject.set(x, "PermissionsWithGrantOption", js.Array(value :_*))
    
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
