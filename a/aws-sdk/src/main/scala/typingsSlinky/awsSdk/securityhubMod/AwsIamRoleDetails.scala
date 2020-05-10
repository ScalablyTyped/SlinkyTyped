package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamRoleDetails extends js.Object {
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role.
    */
  var MaxSessionDuration: js.UndefOr[Integer] = js.native
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.native
}

object AwsIamRoleDetails {
  @scala.inline
  def apply(): AwsIamRoleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRoleDetails]
  }
  @scala.inline
  implicit class AwsIamRoleDetailsOps[Self <: AwsIamRoleDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumeRolePolicyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeRolePolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumeRolePolicyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSessionDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSessionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSessionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSessionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(js.undefined)
        ret
    }
  }
  
}

