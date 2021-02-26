package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBandwidthRateLimitScheduleInput extends StObject {
  
  /**
    *  An array containing bandwidth rate limit schedule intervals for a gateway. When no bandwidth rate limit intervals have been scheduled, the array is empty. 
    */
  var BandwidthRateLimitIntervals: typingsSlinky.awsSdk.storagegatewayMod.BandwidthRateLimitIntervals = js.native
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object UpdateBandwidthRateLimitScheduleInput {
  
  @scala.inline
  def apply(BandwidthRateLimitIntervals: BandwidthRateLimitIntervals, GatewayARN: GatewayARN): UpdateBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(BandwidthRateLimitIntervals = BandwidthRateLimitIntervals.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBandwidthRateLimitScheduleInput]
  }
  
  @scala.inline
  implicit class UpdateBandwidthRateLimitScheduleInputMutableBuilder[Self <: UpdateBandwidthRateLimitScheduleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthRateLimitIntervals(value: BandwidthRateLimitIntervals): Self = StObject.set(x, "BandwidthRateLimitIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthRateLimitIntervalsVarargs(value: BandwidthRateLimitInterval*): Self = StObject.set(x, "BandwidthRateLimitIntervals", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
