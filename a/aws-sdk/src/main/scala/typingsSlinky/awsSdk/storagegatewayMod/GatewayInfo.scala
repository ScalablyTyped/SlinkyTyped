package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayInfo extends StObject {
  
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayId] = js.native
  
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  
  /**
    * The state of the gateway. Valid Values: DISABLED | ACTIVE 
    */
  var GatewayOperationalState: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayOperationalState] = js.native
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayType] = js.native
}
object GatewayInfo {
  
  @scala.inline
  def apply(): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayInfo]
  }
  
  @scala.inline
  implicit class GatewayInfoMutableBuilder[Self <: GatewayInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = StObject.set(x, "Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceRegionUndefined: Self = StObject.set(x, "Ec2InstanceRegion", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayId(value: GatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    @scala.inline
    def setGatewayOperationalState(value: GatewayOperationalState): Self = StObject.set(x, "GatewayOperationalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayOperationalStateUndefined: Self = StObject.set(x, "GatewayOperationalState", js.undefined)
    
    @scala.inline
    def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
  }
}
