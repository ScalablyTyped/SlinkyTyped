package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBandwidthRateLimitInput extends StObject {
  
  /**
    * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: UPLOAD | DOWNLOAD | ALL 
    */
  var BandwidthType: typingsSlinky.awsSdk.storagegatewayMod.BandwidthType = js.native
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object DeleteBandwidthRateLimitInput {
  
  @scala.inline
  def apply(BandwidthType: BandwidthType, GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(BandwidthType = BandwidthType.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
  }
  
  @scala.inline
  implicit class DeleteBandwidthRateLimitInputMutableBuilder[Self <: DeleteBandwidthRateLimitInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthType(value: BandwidthType): Self = StObject.set(x, "BandwidthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
