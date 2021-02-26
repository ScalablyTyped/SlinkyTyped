package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DedicatedIp extends StObject {
  
  /**
    * An IP address that is reserved for use by your Amazon Pinpoint account.
    */
  var Ip: typingsSlinky.awsSdk.pinpointemailMod.Ip = js.native
  
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.PoolName] = js.native
  
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
  
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: typingsSlinky.awsSdk.pinpointemailMod.WarmupStatus = js.native
}
object DedicatedIp {
  
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper, WarmupStatus: WarmupStatus): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any], WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIp]
  }
  
  @scala.inline
  implicit class DedicatedIpMutableBuilder[Self <: DedicatedIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolNameUndefined: Self = StObject.set(x, "PoolName", js.undefined)
    
    @scala.inline
    def setWarmupPercentage(value: Percentage100Wrapper): Self = StObject.set(x, "WarmupPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmupStatus(value: WarmupStatus): Self = StObject.set(x, "WarmupStatus", value.asInstanceOf[js.Any])
  }
}
