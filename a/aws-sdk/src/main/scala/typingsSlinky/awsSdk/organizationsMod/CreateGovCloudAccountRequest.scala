package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGovCloudAccountRequest extends js.Object {
  /**
    * The friendly name of the member account.
    */
  var AccountName: typingsSlinky.awsSdk.organizationsMod.AccountName = js.native
  /**
    * The email address of the owner to assign to the new member account in the commercial Region. This email address must not already be associated with another AWS account. You must use a valid email address to complete account creation. You can't access the root user of the account or remove an account that was created with an invalid email address. Like all request parameters for CreateGovCloudAccount, the request for the email address for the AWS GovCloud (US) account originates from the commercial Region. It does not come from the AWS GovCloud (US) Region.
    */
  var Email: typingsSlinky.awsSdk.organizationsMod.Email = js.native
  /**
    * If set to ALLOW, the new linked account in the commercial Region enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide.  If you don't specify this parameter, the value defaults to ALLOW, and IAM users and roles with the required permissions can access billing information for the new account.
    */
  var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.native
  /**
    * (Optional) The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see Accessing and Administering the Member Accounts in Your Organization in the AWS Organizations User Guide. See also steps 2 and 3 in Tutorial: Delegate Access Across AWS Accounts Using IAM Roles in the IAM User Guide.  The regex pattern that is used to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
    */
  var RoleName: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.RoleName] = js.native
}

object CreateGovCloudAccountRequest {
  @scala.inline
  def apply(AccountName: AccountName, Email: Email): CreateGovCloudAccountRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGovCloudAccountRequest]
  }
  @scala.inline
  implicit class CreateGovCloudAccountRequestOps[Self <: CreateGovCloudAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: AccountName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamUserAccessToBilling(value: IAMUserAccessToBilling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserAccessToBilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUserAccessToBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserAccessToBilling")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: RoleName): Self = {
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

