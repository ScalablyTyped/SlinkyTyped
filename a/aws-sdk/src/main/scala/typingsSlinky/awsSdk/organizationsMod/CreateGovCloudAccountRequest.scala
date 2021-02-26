package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGovCloudAccountRequest extends StObject {
  
  /**
    * The friendly name of the member account.
    */
  var AccountName: typingsSlinky.awsSdk.organizationsMod.AccountName = js.native
  
  /**
    * The email address of the owner to assign to the new member account in the commercial Region. This email address must not already be associated with another AWS account. You must use a valid email address to complete account creation. You can't access the root user of the account or remove an account that was created with an invalid email address. Like all request parameters for CreateGovCloudAccount, the request for the email address for the AWS GovCloud (US) account originates from the commercial Region, not from the AWS GovCloud (US) Region.
    */
  var Email: typingsSlinky.awsSdk.organizationsMod.Email = js.native
  
  /**
    * If set to ALLOW, the new linked account in the commercial Region enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide.  If you don't specify this parameter, the value defaults to ALLOW, and IAM users and roles with the required permissions can access billing information for the new account.
    */
  var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.native
  
  /**
    * (Optional) The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the AWS GovCloud (US) Region and in the commercial Region. This role trusts the management account, allowing users in the management account to assume the role, as permitted by the management account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see Accessing and Administering the Member Accounts in Your Organization in the AWS Organizations User Guide and steps 2 and 3 in Tutorial: Delegate Access Across AWS Accounts Using IAM Roles in the IAM User Guide.  The regex pattern that is used to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
    */
  var RoleName: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.RoleName] = js.native
  
  /**
    * A list of tags that you want to attach to the newly created account. These tags are attached to the commercial account associated with the GovCloud account, and not to the GovCloud account itself. To add tags to the actual GovCloud account, call the TagResource operation in the GovCloud region after the new GovCloud account exists. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging AWS Organizations resources in the AWS Organizations User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire request fails and the account is not created. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Tags] = js.native
}
object CreateGovCloudAccountRequest {
  
  @scala.inline
  def apply(AccountName: AccountName, Email: Email): CreateGovCloudAccountRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGovCloudAccountRequest]
  }
  
  @scala.inline
  implicit class CreateGovCloudAccountRequestMutableBuilder[Self <: CreateGovCloudAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: AccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserAccessToBilling(value: IAMUserAccessToBilling): Self = StObject.set(x, "IamUserAccessToBilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "IamUserAccessToBilling", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
