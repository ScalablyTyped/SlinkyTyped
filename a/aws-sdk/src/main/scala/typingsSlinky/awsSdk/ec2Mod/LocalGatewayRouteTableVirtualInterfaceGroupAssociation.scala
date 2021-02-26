package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayRouteTableVirtualInterfaceGroupAssociation extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the local gateway route table for the virtual interface group.
    */
  var LocalGatewayRouteTableArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayId] = js.native
  
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[
    typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
  ] = js.native
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  
  /**
    * The AWS account ID that owns the local gateway virtual interface group association.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object LocalGatewayRouteTableVirtualInterfaceGroupAssociation {
  
  @scala.inline
  def apply(): LocalGatewayRouteTableVirtualInterfaceGroupAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  }
  
  @scala.inline
  implicit class LocalGatewayRouteTableVirtualInterfaceGroupAssociationMutableBuilder[Self <: LocalGatewayRouteTableVirtualInterfaceGroupAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableArn(value: ResourceArn): Self = StObject.set(x, "LocalGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableArnUndefined: Self = StObject.set(x, "LocalGatewayRouteTableArn", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
