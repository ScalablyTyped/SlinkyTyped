package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyMountTargetSecurityGroupsRequest extends StObject {
  
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typingsSlinky.awsSdk.efsMod.MountTargetId = js.native
  
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.efsMod.SecurityGroups] = js.native
}
object ModifyMountTargetSecurityGroupsRequest {
  
  @scala.inline
  def apply(MountTargetId: MountTargetId): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
  
  @scala.inline
  implicit class ModifyMountTargetSecurityGroupsRequestMutableBuilder[Self <: ModifyMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
