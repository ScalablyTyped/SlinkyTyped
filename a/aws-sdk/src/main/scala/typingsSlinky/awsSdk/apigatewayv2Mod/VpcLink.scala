package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcLink extends StObject {
  
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the VPC link.
    */
  var Name: StringWithLengthBetween1And128 = js.native
  
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: SecurityGroupIdList = js.native
  
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: SubnetIdList = js.native
  
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: Id = js.native
  
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.native
  
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.native
}
object VpcLink {
  
  @scala.inline
  def apply(
    Name: StringWithLengthBetween1And128,
    SecurityGroupIds: SecurityGroupIdList,
    SubnetIds: SubnetIdList,
    VpcLinkId: Id
  ): VpcLink = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcLink]
  }
  
  @scala.inline
  implicit class VpcLinkMutableBuilder[Self <: VpcLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setVpcLinkId(value: Id): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkStatus(value: VpcLinkStatus): Self = StObject.set(x, "VpcLinkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "VpcLinkStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkStatusMessageUndefined: Self = StObject.set(x, "VpcLinkStatusMessage", js.undefined)
    
    @scala.inline
    def setVpcLinkStatusUndefined: Self = StObject.set(x, "VpcLinkStatus", js.undefined)
    
    @scala.inline
    def setVpcLinkVersion(value: VpcLinkVersion): Self = StObject.set(x, "VpcLinkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkVersionUndefined: Self = StObject.set(x, "VpcLinkVersion", js.undefined)
  }
}
