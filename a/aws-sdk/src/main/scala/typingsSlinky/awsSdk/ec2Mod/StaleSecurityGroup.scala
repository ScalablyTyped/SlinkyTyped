package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaleSecurityGroup extends StObject {
  
  /**
    * The description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * Information about the stale inbound rules in the security group.
    */
  var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.native
  
  /**
    * Information about the stale outbound rules in the security group.
    */
  var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.native
  
  /**
    * The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object StaleSecurityGroup {
  
  @scala.inline
  def apply(): StaleSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleSecurityGroup]
  }
  
  @scala.inline
  implicit class StaleSecurityGroupMutableBuilder[Self <: StaleSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setStaleIpPermissions(value: StaleIpPermissionSet): Self = StObject.set(x, "StaleIpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleIpPermissionsEgress(value: StaleIpPermissionSet): Self = StObject.set(x, "StaleIpPermissionsEgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleIpPermissionsEgressUndefined: Self = StObject.set(x, "StaleIpPermissionsEgress", js.undefined)
    
    @scala.inline
    def setStaleIpPermissionsEgressVarargs(value: StaleIpPermission*): Self = StObject.set(x, "StaleIpPermissionsEgress", js.Array(value :_*))
    
    @scala.inline
    def setStaleIpPermissionsUndefined: Self = StObject.set(x, "StaleIpPermissions", js.undefined)
    
    @scala.inline
    def setStaleIpPermissionsVarargs(value: StaleIpPermission*): Self = StObject.set(x, "StaleIpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
