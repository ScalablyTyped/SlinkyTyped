package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterStatusNatStatus extends js.Object {
  
  /** A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"] */
  var autoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"]. */
  var drainAutoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"]. */
  var drainUserAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when
    * auto-allocation of NAT IPs is *not* used.
    */
  var minExtraNatIpsNeeded: js.UndefOr[Double] = js.native
  
  /** Unique name of this NAT. */
  var name: js.UndefOr[String] = js.native
  
  /** Number of VM endpoints (i.e., Nics) that can use NAT. */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double] = js.native
  
  /** A list of fully qualified URLs of reserved IP address resources. */
  var userAllocatedNatIpResources: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133". */
  var userAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
}
object RouterStatusNatStatus {
  
  @scala.inline
  def apply(): RouterStatusNatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatusNatStatus]
  }
  
  @scala.inline
  implicit class RouterStatusNatStatusOps[Self <: RouterStatusNatStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoAllocatedNatIpsVarargs(value: String*): Self = this.set("autoAllocatedNatIps", js.Array(value :_*))
    
    @scala.inline
    def setAutoAllocatedNatIps(value: js.Array[String]): Self = this.set("autoAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAllocatedNatIps: Self = this.set("autoAllocatedNatIps", js.undefined)
    
    @scala.inline
    def setDrainAutoAllocatedNatIpsVarargs(value: String*): Self = this.set("drainAutoAllocatedNatIps", js.Array(value :_*))
    
    @scala.inline
    def setDrainAutoAllocatedNatIps(value: js.Array[String]): Self = this.set("drainAutoAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainAutoAllocatedNatIps: Self = this.set("drainAutoAllocatedNatIps", js.undefined)
    
    @scala.inline
    def setDrainUserAllocatedNatIpsVarargs(value: String*): Self = this.set("drainUserAllocatedNatIps", js.Array(value :_*))
    
    @scala.inline
    def setDrainUserAllocatedNatIps(value: js.Array[String]): Self = this.set("drainUserAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainUserAllocatedNatIps: Self = this.set("drainUserAllocatedNatIps", js.undefined)
    
    @scala.inline
    def setMinExtraNatIpsNeeded(value: Double): Self = this.set("minExtraNatIpsNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinExtraNatIpsNeeded: Self = this.set("minExtraNatIpsNeeded", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumVmEndpointsWithNatMappings(value: Double): Self = this.set("numVmEndpointsWithNatMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumVmEndpointsWithNatMappings: Self = this.set("numVmEndpointsWithNatMappings", js.undefined)
    
    @scala.inline
    def setUserAllocatedNatIpResourcesVarargs(value: String*): Self = this.set("userAllocatedNatIpResources", js.Array(value :_*))
    
    @scala.inline
    def setUserAllocatedNatIpResources(value: js.Array[String]): Self = this.set("userAllocatedNatIpResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAllocatedNatIpResources: Self = this.set("userAllocatedNatIpResources", js.undefined)
    
    @scala.inline
    def setUserAllocatedNatIpsVarargs(value: String*): Self = this.set("userAllocatedNatIps", js.Array(value :_*))
    
    @scala.inline
    def setUserAllocatedNatIps(value: js.Array[String]): Self = this.set("userAllocatedNatIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAllocatedNatIps: Self = this.set("userAllocatedNatIps", js.undefined)
  }
}
