package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServiceFailoverPolicy extends StObject {
  
  /**
    * This can be set to true only if the protocol is TCP.
    *
    * The default is false.
    */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.native
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing. If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are
    * unhealthy. If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy.
    *
    * The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.native
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when
    * the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
}
object BackendServiceFailoverPolicy {
  
  @scala.inline
  def apply(): BackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceFailoverPolicy]
  }
  
  @scala.inline
  implicit class BackendServiceFailoverPolicyMutableBuilder[Self <: BackendServiceFailoverPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableConnectionDrainOnFailover(value: Boolean): Self = StObject.set(x, "disableConnectionDrainOnFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableConnectionDrainOnFailoverUndefined: Self = StObject.set(x, "disableConnectionDrainOnFailover", js.undefined)
    
    @scala.inline
    def setDropTrafficIfUnhealthy(value: Boolean): Self = StObject.set(x, "dropTrafficIfUnhealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTrafficIfUnhealthyUndefined: Self = StObject.set(x, "dropTrafficIfUnhealthy", js.undefined)
    
    @scala.inline
    def setFailoverRatio(value: Double): Self = StObject.set(x, "failoverRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverRatioUndefined: Self = StObject.set(x, "failoverRatio", js.undefined)
  }
}
