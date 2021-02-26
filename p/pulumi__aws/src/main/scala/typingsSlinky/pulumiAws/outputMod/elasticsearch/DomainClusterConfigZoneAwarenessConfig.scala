package typingsSlinky.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainClusterConfigZoneAwarenessConfig extends StObject {
  
  /**
    * Number of Availability Zones for the domain to use with `zoneAwarenessEnabled`. Defaults to `2`. Valid values: `2` or `3`.
    */
  var availabilityZoneCount: js.UndefOr[Double] = js.native
}
object DomainClusterConfigZoneAwarenessConfig {
  
  @scala.inline
  def apply(): DomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfigZoneAwarenessConfig]
  }
  
  @scala.inline
  implicit class DomainClusterConfigZoneAwarenessConfigMutableBuilder[Self <: DomainClusterConfigZoneAwarenessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZoneCount(value: Double): Self = StObject.set(x, "availabilityZoneCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "availabilityZoneCount", js.undefined)
  }
}
