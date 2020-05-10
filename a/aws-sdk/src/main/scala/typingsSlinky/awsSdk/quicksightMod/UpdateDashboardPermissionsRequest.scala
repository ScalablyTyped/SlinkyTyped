package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardPermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the dashboard whose permissions you're updating.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The permissions that you want to grant on this resource.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * The permissions that you want to revoke from this resource.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
}

object UpdateDashboardPermissionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): UpdateDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
  }
  @scala.inline
  implicit class UpdateDashboardPermissionsRequestOps[Self <: UpdateDashboardPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboardId(value: RestrictiveResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantPermissions(value: UpdateResourcePermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokePermissions(value: UpdateResourcePermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokePermissions")(js.undefined)
        ret
    }
  }
  
}

