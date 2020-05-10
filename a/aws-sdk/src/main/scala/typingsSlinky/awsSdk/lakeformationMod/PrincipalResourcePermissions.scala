package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalResourcePermissions extends js.Object {
  /**
    * The permissions to be granted or revoked on the resource.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  /**
    * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The Data Lake principal to be granted or revoked permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  /**
    * The resource where permissions are to be granted or revoked.
    */
  var Resource: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.Resource] = js.native
}

object PrincipalResourcePermissions {
  @scala.inline
  def apply(): PrincipalResourcePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalResourcePermissions]
  }
  @scala.inline
  implicit class PrincipalResourcePermissionsOps[Self <: PrincipalResourcePermissions] (val x: Self) extends AnyVal {
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
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(js.undefined)
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
    @scala.inline
    def withPrincipal(value: DataLakePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
  }
  
}

