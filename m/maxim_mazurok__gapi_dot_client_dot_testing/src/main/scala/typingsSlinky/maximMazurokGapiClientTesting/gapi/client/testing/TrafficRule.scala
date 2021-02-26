package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficRule extends StObject {
  
  /** Bandwidth in kbits/second. */
  var bandwidth: js.UndefOr[Double] = js.native
  
  /** Burst size in kbits. */
  var burst: js.UndefOr[Double] = js.native
  
  /** Packet delay, must be >= 0. */
  var delay: js.UndefOr[String] = js.native
  
  /** Packet duplication ratio (0.0 - 1.0). */
  var packetDuplicationRatio: js.UndefOr[Double] = js.native
  
  /** Packet loss ratio (0.0 - 1.0). */
  var packetLossRatio: js.UndefOr[Double] = js.native
}
object TrafficRule {
  
  @scala.inline
  def apply(): TrafficRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRule]
  }
  
  @scala.inline
  implicit class TrafficRuleMutableBuilder[Self <: TrafficRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    @scala.inline
    def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setPacketDuplicationRatio(value: Double): Self = StObject.set(x, "packetDuplicationRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketDuplicationRatioUndefined: Self = StObject.set(x, "packetDuplicationRatio", js.undefined)
    
    @scala.inline
    def setPacketLossRatio(value: Double): Self = StObject.set(x, "packetLossRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLossRatioUndefined: Self = StObject.set(x, "packetLossRatio", js.undefined)
  }
}
