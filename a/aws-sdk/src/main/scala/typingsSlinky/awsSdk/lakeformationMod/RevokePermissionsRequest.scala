package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokePermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The permissions revoked to the principal on the resource. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  var Permissions: PermissionList = js.native
  /**
    * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions to other principals.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The principal to be revoked permissions on the resource.
    */
  var Principal: DataLakePrincipal = js.native
  /**
    * The resource to which permissions are to be revoked.
    */
  var Resource: typingsSlinky.awsSdk.lakeformationMod.Resource = js.native
}

object RevokePermissionsRequest {
  @scala.inline
  def apply(Permissions: PermissionList, Principal: DataLakePrincipal, Resource: Resource): RevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokePermissionsRequest]
  }
  @scala.inline
  implicit class RevokePermissionsRequestOps[Self <: RevokePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(value: PermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipal(value: DataLakePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionsWithGrantOption(value: PermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsWithGrantOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsWithGrantOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsWithGrantOption")(js.undefined)
        ret
    }
  }
  
}

