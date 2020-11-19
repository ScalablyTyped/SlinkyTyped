package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountRequest extends js.Object {
  
  /**
    * The friendly name of the member account.
    */
  var AccountName: typingsSlinky.awsSdk.organizationsMod.AccountName = js.native
  
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account. You must use a valid email address to complete account creation. You can't access the root user of the account or remove an account that was created with an invalid email address.
    */
  var Email: typingsSlinky.awsSdk.organizationsMod.Email = js.native
  
  /**
    * If set to ALLOW, the new account enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide. If you don't specify this parameter, the value defaults to ALLOW, and IAM users and roles with the required permissions can access billing information for the new account.
    */
  var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.native
  
  /**
    * (Optional) The name of an IAM role that AWS Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see the following links:    Accessing and Administering the Member Accounts in Your Organization in the AWS Organizations User Guide    Steps 2 and 3 in Tutorial: Delegate Access Across AWS Accounts Using IAM Roles in the IAM User Guide    The regex pattern that is used to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
    */
  var RoleName: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.RoleName] = js.native
}
object CreateAccountRequest {
  
  @scala.inline
  def apply(AccountName: AccountName, Email: Email): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
  
  @scala.inline
  implicit class CreateAccountRequestOps[Self <: CreateAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountName(value: AccountName): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserAccessToBilling(value: IAMUserAccessToBilling): Self = this.set("IamUserAccessToBilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUserAccessToBilling: Self = this.set("IamUserAccessToBilling", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
  }
}
