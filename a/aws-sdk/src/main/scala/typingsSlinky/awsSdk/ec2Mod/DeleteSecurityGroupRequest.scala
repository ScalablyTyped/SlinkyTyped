package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecurityGroupRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the security group. Required for a nondefault VPC.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.native
  
  /**
    * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the security group ID.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
}
object DeleteSecurityGroupRequest {
  
  @scala.inline
  def apply(): DeleteSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSecurityGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteSecurityGroupRequestOps[Self <: DeleteSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setGroupId(value: SecurityGroupId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: SecurityGroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}
