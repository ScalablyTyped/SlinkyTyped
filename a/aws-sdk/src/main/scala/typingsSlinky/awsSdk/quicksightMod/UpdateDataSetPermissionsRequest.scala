package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetPermissionsRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dataset whose permissions you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * The resource permissions that you want to grant to the dataset.
    */
  var GrantPermissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The resource permissions that you want to revoke from the dataset.
    */
  var RevokePermissions: js.UndefOr[ResourcePermissionList] = js.native
}

object UpdateDataSetPermissionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId): UpdateDataSetPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetPermissionsRequest]
  }
  @scala.inline
  implicit class UpdateDataSetPermissionsRequestOps[Self <: UpdateDataSetPermissionsRequest] (val x: Self) extends AnyVal {
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
    def withDataSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantPermissions(value: ResourcePermissionList): Self = {
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
    def withRevokePermissions(value: ResourcePermissionList): Self = {
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

