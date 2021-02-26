package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupUserIdGroupPair extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS. 
    */
  var UserId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2SecurityGroupUserIdGroupPair {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupUserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupUserIdGroupPair]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupUserIdGroupPairMutableBuilder[Self <: AwsEc2SecurityGroupUserIdGroupPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setPeeringStatus(value: NonEmptyString): Self = StObject.set(x, "PeeringStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringStatusUndefined: Self = StObject.set(x, "PeeringStatus", js.undefined)
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: NonEmptyString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
