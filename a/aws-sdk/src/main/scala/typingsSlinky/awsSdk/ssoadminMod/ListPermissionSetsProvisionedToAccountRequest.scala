package typingsSlinky.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPermissionSetsProvisionedToAccountRequest extends js.Object {
  
  /**
    * The identifier of the AWS account from which to list the assignments.
    */
  var AccountId: typingsSlinky.awsSdk.ssoadminMod.AccountId = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typingsSlinky.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The maximum number of results to display for the assignment.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.MaxResults] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var ProvisioningStatus: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.ProvisioningStatus] = js.native
}
object ListPermissionSetsProvisionedToAccountRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, InstanceArn: InstanceArn): ListPermissionSetsProvisionedToAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionSetsProvisionedToAccountRequest]
  }
  
  @scala.inline
  implicit class ListPermissionSetsProvisionedToAccountRequestOps[Self <: ListPermissionSetsProvisionedToAccountRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProvisioningStatus(value: ProvisioningStatus): Self = this.set("ProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningStatus: Self = this.set("ProvisioningStatus", js.undefined)
  }
}
