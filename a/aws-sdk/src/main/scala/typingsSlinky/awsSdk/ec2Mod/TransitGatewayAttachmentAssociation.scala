package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayAttachmentAssociation extends StObject {
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.native
  
  /**
    * The ID of the route table for the transit gateway.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}
object TransitGatewayAttachmentAssociation {
  
  @scala.inline
  def apply(): TransitGatewayAttachmentAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentAssociation]
  }
  
  @scala.inline
  implicit class TransitGatewayAttachmentAssociationMutableBuilder[Self <: TransitGatewayAttachmentAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: TransitGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
