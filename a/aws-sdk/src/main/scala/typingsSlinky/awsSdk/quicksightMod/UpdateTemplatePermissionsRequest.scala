package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplatePermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * A list of resource permissions to be granted on the template. 
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * A list of resource permissions to be revoked from the template. 
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
}

object UpdateTemplatePermissionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): UpdateTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplatePermissionsRequest]
  }
  @scala.inline
  implicit class UpdateTemplatePermissionsRequestOps[Self <: UpdateTemplatePermissionsRequest] (val x: Self) extends AnyVal {
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
    def withTemplateId(value: RestrictiveResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateId")(value.asInstanceOf[js.Any])
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

