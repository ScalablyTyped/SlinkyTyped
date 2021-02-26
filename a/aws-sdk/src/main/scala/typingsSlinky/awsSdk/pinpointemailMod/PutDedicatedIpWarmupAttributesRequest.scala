package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDedicatedIpWarmupAttributesRequest extends StObject {
  
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: typingsSlinky.awsSdk.pinpointemailMod.Ip = js.native
  
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
}
object PutDedicatedIpWarmupAttributesRequest {
  
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
  
  @scala.inline
  implicit class PutDedicatedIpWarmupAttributesRequestMutableBuilder[Self <: PutDedicatedIpWarmupAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmupPercentage(value: Percentage100Wrapper): Self = StObject.set(x, "WarmupPercentage", value.asInstanceOf[js.Any])
  }
}
