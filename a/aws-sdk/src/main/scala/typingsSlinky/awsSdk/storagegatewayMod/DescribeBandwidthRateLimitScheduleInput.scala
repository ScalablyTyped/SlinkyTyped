package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBandwidthRateLimitScheduleInput extends StObject {
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object DescribeBandwidthRateLimitScheduleInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeBandwidthRateLimitScheduleInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBandwidthRateLimitScheduleInput]
  }
  
  @scala.inline
  implicit class DescribeBandwidthRateLimitScheduleInputMutableBuilder[Self <: DescribeBandwidthRateLimitScheduleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
